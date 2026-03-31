package org.oxerr.stubhub.client.cxf.impl.inventory;

import org.oxerr.stubhub.client.cxf.resource.InventoryResource;
import org.oxerr.stubhub.client.inventory.InventoryExportCriteria;
import org.oxerr.stubhub.client.model.InventoryExportResponse;

public class InventoryExportIterator extends InventoryIterator {

	private final InventoryExportCriteria criteria;

	private final InventoryResource inventoryResource;

	public InventoryExportIterator(InventoryExportCriteria criteria, InventoryResource inventoryResource) {
		super(criteria.getPageSize() != null ? criteria.getPageSize().intValue() : 100);
		this.criteria = criteria;
		this.inventoryResource = inventoryResource;
	}

	protected InventoryExportResponse fetchPage(Long cursor) {
		return inventoryResource.export(
			criteria.getUpdatedDateSince(),
			criteria.getPageSize(),
			cursor,
			criteria.getIncludePastEvents(),
			criteria.getIncludeBuyerCommissionsPerTicket(),
			criteria.getCreateDateFrom(),
			criteria.getCreateDateTo(),
			criteria.getUpdatedDateTo()
		);
	}
}
