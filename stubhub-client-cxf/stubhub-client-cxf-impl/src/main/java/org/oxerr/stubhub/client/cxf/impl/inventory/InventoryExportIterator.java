package org.oxerr.stubhub.client.cxf.impl.inventory;

import org.oxerr.stubhub.client.cxf.resource.InventoryResource;
import org.oxerr.stubhub.client.inventory.InventoryExportCriteria;
import org.oxerr.stubhub.client.model.InventoryExportResponse;

import io.github.resilience4j.retry.Retry;

public class InventoryExportIterator extends InventoryIterator {

	private final InventoryExportCriteria criteria;

	private final InventoryResource inventoryResource;

	public InventoryExportIterator(InventoryExportCriteria criteria, InventoryResource inventoryResource) {
		super(criteria.getPageSize() != null ? criteria.getPageSize().intValue() : 100);
		this.criteria = criteria;
		this.inventoryResource = inventoryResource;
	}

	public InventoryExportIterator(InventoryExportCriteria criteria, InventoryResource inventoryResource, Retry retry) {
		super(criteria.getPageSize() != null ? criteria.getPageSize().intValue() : 100, retry);
		this.criteria = criteria;
		this.inventoryResource = inventoryResource;
	}

	protected InventoryExportResponse fetchExportResponse(Long paginationToken) {
		return inventoryResource.export(
			criteria.getUpdatedDateSince(),
			criteria.getPageSize(),
			paginationToken,
			criteria.getIncludePastEvents(),
			criteria.getIncludeBuyerCommissionsPerTicket(),
			criteria.getCreateDateFrom(),
			criteria.getCreateDateTo(),
			criteria.getUpdatedDateTo()
		);
	}
}
