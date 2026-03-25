package org.oxerr.stubhub.client.cxf.impl.inventory;

import java.util.Collections;
import java.util.Iterator;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.oxerr.stubhub.client.model.InventoryExportResponse;
import org.oxerr.stubhub.client.model.ListingResponse;

public abstract class InventoryIterator implements Iterator<ListingResponse> {

	private final Logger log = LogManager.getLogger();

	private final int pageSize;

	private Iterator<ListingResponse> current = Collections.emptyIterator();

	private Long cursor;

	private boolean finished;

	private int loadedPageCount;

	protected InventoryIterator(int pageSize) {
		this.pageSize = pageSize;
	}

	@Override
	public boolean hasNext() {
		loadIfNeeded();
		return current.hasNext();
	}

	@Override
	public ListingResponse next() {
		loadIfNeeded();
		return current.next();
	}

	private void loadIfNeeded() {
		if (!finished && !current.hasNext()) {
			InventoryExportResponse page = fetchPage(cursor);

			current = page.getInventory().iterator();
			cursor = page.getPaginationToken();

			finished = page.getNumberOfItems().intValue() < pageSize;

			loadedPageCount++;

			log.trace("loaded page: loadedPageCount={}, cursor={}, numberOfItems={}, finished={}",
				loadedPageCount, cursor, page.getNumberOfItems(), finished);
		}

	}

	protected abstract InventoryExportResponse fetchPage(Long cursor2);

}
