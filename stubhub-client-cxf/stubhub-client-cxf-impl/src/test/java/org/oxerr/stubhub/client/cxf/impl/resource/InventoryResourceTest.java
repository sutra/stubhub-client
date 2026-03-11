package org.oxerr.stubhub.client.cxf.impl.resource;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotNull;

import java.util.List;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.Test;
import org.oxerr.stubhub.client.cxf.impl.CXFStubHubClient;
import org.oxerr.stubhub.client.cxf.impl.CXFStubHubClients;
import org.oxerr.stubhub.client.cxf.resource.InventoryResource;

class InventoryResourceTest {

	private static final Logger log = LogManager
		.getLogger();

	private final CXFStubHubClient client = CXFStubHubClients.getClient();

	private final InventoryResource inventoryResource = client.getInventoryResource();

	@Test
	void testSearch() {
		var r = inventoryResource.search(
			null,
			null,
			null,
			null,
			null,
			null,
			null,
			null,
			null,
			null,
			null,
			null,
			null,
			null,
			null
		);
		assertNotNull(r);
		assertEquals(84, r.getInventory().size());
		r.getInventory().forEach(lr -> {
			log.info("Listing: {}", lr.getEvent().getDate());
		});
	}

	@Disabled("NotFound HTTP 404 Not Found")
	@Test
	void testSeek() {
		var r = inventoryResource.seek(List.of(1L), Boolean.FALSE);
		assertNotNull(r);
	}

}
