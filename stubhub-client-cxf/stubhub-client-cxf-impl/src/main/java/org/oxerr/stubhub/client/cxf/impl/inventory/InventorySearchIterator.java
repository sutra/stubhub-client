package org.oxerr.stubhub.client.cxf.impl.inventory;

import org.oxerr.stubhub.client.cxf.resource.InventoryResource;
import org.oxerr.stubhub.client.inventory.InventorySearchCriteria;
import org.oxerr.stubhub.client.model.InventoryExportResponse;

public class InventorySearchIterator extends InventoryIterator {

	private final InventorySearchCriteria criteria;

	private final InventoryResource inventoryResource;

	public InventorySearchIterator(InventorySearchCriteria criteria, InventoryResource inventoryResource) {
		super(criteria.getMaxPageSize() != null ? criteria.getMaxPageSize().intValue() : 500);
		this.criteria = criteria;
		this.inventoryResource = inventoryResource;
	}

	protected InventoryExportResponse fetchExportResponse(Long paginationToken) {
		return inventoryResource.search(
			criteria.getEventIds(),
			criteria.getCategoryIds(),
			criteria.getIncludeTags(),
			criteria.getExcludeTags(),
			criteria.getPurchaseStartDate(),
			criteria.getPurchaseEndDate(),
			criteria.getMaxPageSize(),
			paginationToken,
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
