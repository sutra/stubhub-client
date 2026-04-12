package org.oxerr.stubhub.client.cxf.impl.inventory;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.Test;
import org.oxerr.stubhub.client.cxf.impl.CXFStubHubClient;
import org.oxerr.stubhub.client.cxf.impl.CXFStubHubClients;
import org.oxerr.stubhub.client.model.ListingResponse;

class UpdateInventoryTest {

	private static final Logger log = LogManager.getFormatterLogger();

	private final CXFStubHubClient client = CXFStubHubClients.getClient();

	@Disabled("Requires authentication")
	@Test
	void testUpdateInventory() {
		long inventoryId = 939796293L;
		ListingResponse listing = client.inventory().resource().getInventory(inventoryId, false).get(0);
		log.info("listing: %s", listing);
	}

}
