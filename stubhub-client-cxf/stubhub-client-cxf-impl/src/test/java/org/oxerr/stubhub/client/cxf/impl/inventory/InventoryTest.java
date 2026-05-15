package org.oxerr.stubhub.client.cxf.impl.inventory;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.Test;
import org.oxerr.stubhub.client.cxf.impl.CXFStubHubClient;
import org.oxerr.stubhub.client.cxf.impl.CXFStubHubClients;

class InventoryTest {

	private static final Logger log = LogManager.getFormatterLogger();

	private final CXFStubHubClient client = CXFStubHubClients.getClient();

	@Disabled("Requires authentication")
	@Test
	void testGetInventory() {
		long inventoryId = 1L;
		var inventories = client.inventory().resource().getInventory(inventoryId, false);
		log.info("inventories: %s", inventories);
		inventories.forEach(inventory -> {
			inventory.getListingStatusByMarketplace().forEach(marketplaceListingStatus -> {
				log.info("marketplaceListingStatus: %s", marketplaceListingStatus);
			});
		});
	}

	/**
	 * List one listing. Run this test to list one listing.
	 */
	@Disabled("Requires authentication")
	@Test
	void testList() {
		long inventoryId = 1L;
		client.inventory().resource().updateInventory(inventoryId, Lister.updateRequest());
	}

}
