package org.oxerr.stubhub.client.cxf.impl.util;

import java.util.Collections;
import java.util.Iterator;
import java.util.List;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public abstract class PageIterator<T> implements Iterator<T> {

	private final Logger log = LogManager.getLogger();

	private final int pageSize;

	private Long paginationToken;
	private Iterator<T> current = Collections.emptyIterator();
	private boolean finished;
	private int loadedPageCount;

	protected PageIterator(int pageSize) {
		this.pageSize = pageSize;
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
			Page<T> page = fetchPage(this.paginationToken);
			paginationToken = page.getPaginationToken();
			current = page.getItems().iterator();
			finished = page.getNumberOfItems() < pageSize;
			loadedPageCount++;
			log.trace("loaded page: loadedPageCount={}, cursor={}, numberOfItems={}, finished={}",
				loadedPageCount, paginationToken, page.getNumberOfItems(), finished);
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
