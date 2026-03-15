package org.oxerr.stubhub.client.cxf.impl.inventory;

import org.oxerr.stubhub.client.cxf.resource.InventoryResource;
import org.oxerr.stubhub.client.inventory.InventorySearchCriteria;
import org.oxerr.stubhub.client.inventory.InventoryService;

public class CXFInventoryServce implements InventoryService {

	private final InventoryResource inventoryResource;

	public CXFInventoryServce(InventoryResource inventoryResource) {
		this.inventoryResource = inventoryResource;
	}

	public InventoryResource resource() {
		return inventoryResource;
	}

	@Override
	public InventoryIterator iterateInventories(InventorySearchCriteria criteria) {
		return new InventoryIterator(criteria, inventoryResource);
	}

}
