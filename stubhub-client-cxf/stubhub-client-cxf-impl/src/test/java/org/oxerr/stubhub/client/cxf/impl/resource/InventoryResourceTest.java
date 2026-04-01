package org.oxerr.stubhub.client.cxf.impl.resource;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.junit.jupiter.api.Test;
import org.oxerr.stubhub.client.cxf.impl.CXFStubHubClients;
import org.oxerr.stubhub.client.cxf.impl.inventory.CXFInventoryServce;
import org.oxerr.stubhub.client.cxf.resource.InventoryResource;
import org.oxerr.stubhub.client.model.ListingResponse;

class InventoryResourceTest {

	private final Logger log = LogManager.getLogger();

	private final CXFInventoryServce inventoryService = CXFStubHubClients.getClient().inventory();

	private final InventoryResource inventoryResource = inventoryService.resource();

	@Test
	void testGetByExternalId() {
		inventoryService.streamInventories().forEach(e -> {
			ListingResponse listing = inventoryResource.getByExternalId(e.getExternalId(), true);
			log.info("listing: {}", listing);
		});
	}

}
