package org.oxerr.stubhub.client.cxf.impl.util;

import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.function.Supplier;

import org.apache.commons.lang3.time.StopWatch;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import io.github.resilience4j.retry.Retry;
import io.github.resilience4j.retry.RetryConfig;
import jakarta.ws.rs.InternalServerErrorException;
import jakarta.ws.rs.client.ResponseProcessingException;

public abstract class PageIterator<T> implements Iterator<T> {

	private final Logger log = LogManager.getFormatterLogger();

	private final int pageSize;
	private final Retry retry;

	private Long paginationToken;
	private Iterator<T> current = Collections.emptyIterator();
	private boolean finished;
	private int loadedPageCount;
	private StopWatch stopWatch = new StopWatch();

	protected PageIterator(int pageSize) {
		this(pageSize, defaultRetry());
	}

	protected PageIterator(int pageSize, Retry retry) {
		this.pageSize = pageSize;
		this.retry = retry == null ? defaultRetry() : retry;
	}

	private static Retry defaultRetry() {
		RetryConfig config = RetryConfig.custom()
			.maxAttempts(3)
			.retryExceptions(
				ResponseProcessingException.class,
				InternalServerErrorException.class
			)
			.failAfterMaxAttempts(true)
			.build();
		return Retry.of("pageIteratorFetchPage", config);
	}

	@Override
	public boolean hasNext() {
		loadIfNeeded();
		return current.hasNext();
	}

	@Override
	public T next() {
		loadIfNeeded();
		return current.next();
	}

	private void loadIfNeeded() {
		if (!finished && !current.hasNext()) {
			if (!stopWatch.isStarted()) {
				stopWatch.start();
			}

			long startTime = System.nanoTime();
			Page<T> page = fetchPageWithRetry(this.paginationToken);
			long elapsedNanos = System.nanoTime() - startTime;

			paginationToken = page.getPaginationToken();
			current = page.getItems().iterator();
			finished = page.getNumberOfItems() < pageSize;
			loadedPageCount++;

			log.debug(
				"loaded page: cursor=%,d, numberOfItems=%,d, timeUsed=%,d ms,"
					+ " loadedPageCount=%,d, elapsed=%s, avgTimePerPage=%,d ms",
				paginationToken, page.getNumberOfItems(),
				elapsedNanos / 1_000_000, loadedPageCount, stopWatch,
				stopWatch.getTime() / loadedPageCount);
		}

	}

	private Page<T> fetchPageWithRetry(Long paginationToken) {
		Supplier<Page<T>> supplier = () -> fetchPage(paginationToken);
		Supplier<Page<T>> decorated = Retry.decorateSupplier(retry, supplier);

		try {
			return decorated.get();
		} catch (ResponseProcessingException e) {
			log.warn("failed to fetch page after retries: cursor={}", paginationToken, e);
			throw e;
		}
	}

	protected abstract Page<T> fetchPage(Long paginationToken);

	public interface Page<T> {

		Long getPaginationToken();

		Integer getNumberOfItems();

		List<T> getItems();

	}

	public class PageImpl implements Page<T> {

		private Long paginationToken;

		private Integer numberOfItems;

		private List<T> items;

		public PageImpl(Long paginationToken, Integer numberOfItems, List<T> items) {
			this.paginationToken = paginationToken;
			this.numberOfItems = numberOfItems != null ? numberOfItems : 0;
			this.items = items != null ? items : Collections.emptyList();
		}

		@Override
		public Long getPaginationToken() {
			return paginationToken;
		}

		@Override
		public Integer getNumberOfItems() {
			return numberOfItems;
		}

		@Override
		public List<T> getItems() {
			return items;
		}

	}
}
