package org.oxerr.stubhub.client.cxf.impl.inventory;

import java.util.Iterator;

import org.oxerr.stubhub.client.cxf.resource.InventoryResource;
import org.oxerr.stubhub.client.inventory.InventoryExportCriteria;
import org.oxerr.stubhub.client.inventory.InventorySearchCriteria;
import org.oxerr.stubhub.client.inventory.InventoryService;
import org.oxerr.stubhub.client.model.ListingResponse;

public class CXFInventoryService implements InventoryService {

	private final InventoryResource inventoryResource;

	public CXFInventoryService(InventoryResource inventoryResource) {
		this.inventoryResource = inventoryResource;
	}

	public InventoryResource resource() {
		return inventoryResource;
	}

	@Override
	public InventorySearchIterator iterateInventories(InventorySearchCriteria criteria) {
		return new InventorySearchIterator(criteria, inventoryResource);
	}

	@Override
	public Iterator<ListingResponse> iterateInventories(InventoryExportCriteria criteria) {
		return new InventoryExportIterator(criteria, inventoryResource);
	}

}
