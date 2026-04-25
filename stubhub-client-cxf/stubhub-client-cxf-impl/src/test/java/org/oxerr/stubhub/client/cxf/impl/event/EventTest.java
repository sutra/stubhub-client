package org.oxerr.stubhub.client.cxf.impl.event;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.Test;
import org.oxerr.stubhub.client.cxf.impl.CXFStubHubClient;
import org.oxerr.stubhub.client.cxf.impl.CXFStubHubClients;
import org.oxerr.stubhub.client.event.InventoryCriteria;

class EventTest {

	private static final Logger log = LogManager.getFormatterLogger();

	private final CXFStubHubClient client = CXFStubHubClients.getClient();

	@Disabled("Requires authentication")
	@Test
	void testGetInvoice() {
		InventoryCriteria c = new InventoryCriteria();
		c.setEventId(1);

		var inventories = client.event().getInventories(160531091);
		log.info("inventories.size: {}", inventories.size());

		inventories.forEach(inventory -> {
			log.info("inventory: %d", inventory.getId());
			client.inventory().resource().deleteInventory(inventory.getId());
		});
	}

}
