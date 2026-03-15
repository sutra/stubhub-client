package org.oxerr.stubhub.client.inventory;

import java.util.Iterator;

import org.oxerr.stubhub.client.model.ListingResponse;

public interface InventoryService {

	/**
	 * Iterate inventories.
	 */
	default Iterator<ListingResponse> iterateInventories() {
		return iterateInventories(new InventorySearchCriteria());
	}

	Iterator<ListingResponse> iterateInventories(InventorySearchCriteria criteria);
}
