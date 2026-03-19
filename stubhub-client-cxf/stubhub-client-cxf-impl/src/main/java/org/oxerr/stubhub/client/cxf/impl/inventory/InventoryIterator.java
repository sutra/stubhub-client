package org.oxerr.stubhub.client.cxf.impl.inventory;

import java.util.Collections;
import java.util.Iterator;

import org.oxerr.stubhub.client.cxf.resource.InventoryResource;
import org.oxerr.stubhub.client.inventory.InventorySearchCriteria;
import org.oxerr.stubhub.client.model.InventoryExportResponse;
import org.oxerr.stubhub.client.model.ListingResponse;

public class InventoryIterator implements Iterator<ListingResponse> {

	private final InventorySearchCriteria criteria;

	private final InventoryResource inventoryResource;

	private final int maxPageSize;

	private Iterator<ListingResponse> current = Collections.emptyIterator();

	private Long cursor;

	private boolean finished;

	public InventoryIterator(InventorySearchCriteria criteria, InventoryResource inventoryResource) {
		this.criteria = criteria;
		this.inventoryResource = inventoryResource;
		this.maxPageSize = criteria.getMaxPageSize() != null ? criteria.getMaxPageSize().intValue() : 500;
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

			finished = page.getNumberOfItems().intValue() < maxPageSize;
		}

	}

	private InventoryExportResponse fetchPage(long cursor) {
		return inventoryResource.search(
			criteria.getEventIds(),
			criteria.getCategoryIds(),
			criteria.getIncludeTags(),
			criteria.getExcludeTags(),
			criteria.getPurchaseStartDate(),
			criteria.getPurchaseEndDate(),
			criteria.getMaxPageSize(),
			cursor,
			criteria.getIncludePastEvents(),
			criteria.getIncludeBuyerCommissionsPerTicket(),
			criteria.getEventMappingId(),
			criteria.getVendorName(),
			criteria.getEventSearchText(),
			criteria.getTagKey(),
			criteria.getTagValue()
		);
	}
}
