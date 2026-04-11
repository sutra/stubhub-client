package org.oxerr.stubhub.client.cxf.impl.resource;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.Test;
import org.oxerr.stubhub.client.cxf.impl.CXFStubHubClients;
import org.oxerr.stubhub.client.cxf.impl.inventory.CXFInventoryService;
import org.oxerr.stubhub.client.cxf.resource.InventoryResource;
import org.oxerr.stubhub.client.model.ListingResponse;

class InventoryResourceTest {

	private final Logger log = LogManager.getLogger();

	private final CXFInventoryService inventoryService = CXFStubHubClients.getClient().inventory();

	private final InventoryResource inventoryResource = inventoryService.resource();

	@Disabled("InternalServerError HTTP 500 Internal Server Error")
	@Test
	void testGetByExternalId() {
		inventoryService.streamInventories().forEach(e -> {
			ListingResponse listing = inventoryResource.getByExternalId(e.getExternalId(), true);
			log.info("listing: {}", listing);
		});
	}

}
