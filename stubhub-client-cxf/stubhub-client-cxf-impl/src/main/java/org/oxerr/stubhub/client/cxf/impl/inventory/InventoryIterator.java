package org.oxerr.stubhub.client.cxf.impl.inventory;

import java.util.Iterator;

import org.oxerr.stubhub.client.cxf.resource.InventoryResource;
import org.oxerr.stubhub.client.inventory.InventorySearchCriteria;
import org.oxerr.stubhub.client.model.InventoryExportResponse;
import org.oxerr.stubhub.client.model.ListingResponse;

public class InventoryIterator implements Iterator<ListingResponse> {

	private final InventorySearchCriteria criteria;

	private final InventoryResource inventoryResource;

	private int maxPageSize;

	private InventoryExportResponse inventoryExportResponse;

	private Iterator<ListingResponse> listingIterator;

	public InventoryIterator(InventorySearchCriteria criteria, InventoryResource inventoryResource) {
		this.criteria = criteria;
		this.inventoryResource = inventoryResource;
		this.maxPageSize = criteria.getMaxPageSize() != null ? criteria.getMaxPageSize().intValue() : 500;
	}

	@Override
	public boolean hasNext() {
		boolean hasNext = listingIterator != null && listingIterator.hasNext();
		if (!hasNext && (inventoryExportResponse == null || inventoryExportResponse.getNumberOfItems().intValue() == maxPageSize)) {
			inventoryExportResponse = inventoryResource.search(
				criteria.getEventIds(),
				criteria.getCategoryIds(),
				criteria.getIncludeTags(),
				criteria.getExcludeTags(),
				criteria.getPurchaseStartDate(),
				criteria.getPurchaseEndDate(),
				criteria.getMaxPageSize(),
				criteria.getPaginationToken(),
				criteria.getIncludePastEvents(),
				criteria.getIncludeBuyerCommissionsPerTicket(),
				criteria.getEventMappingId(),
				criteria.getVendorName(),
				criteria.getEventSearchText(),
				criteria.getTagKey(),
				criteria.getTagValue()
			);
			criteria.setPaginationToken(inventoryExportResponse.getPaginationToken());
			listingIterator = inventoryExportResponse.getInventory().iterator();
			hasNext = listingIterator.hasNext();
		}
		return hasNext;
	}

	@Override
	public ListingResponse next() {
		return listingIterator.next();
	}

}
