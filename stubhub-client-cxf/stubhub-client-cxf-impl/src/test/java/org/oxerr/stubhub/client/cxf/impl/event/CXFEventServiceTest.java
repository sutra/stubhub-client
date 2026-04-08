package org.oxerr.stubhub.client.cxf.impl.event;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;
import org.oxerr.stubhub.client.cxf.impl.CXFStubHubClient;
import org.oxerr.stubhub.client.cxf.impl.CXFStubHubClients;

class CXFEventServiceTest {

	private static final Logger log = LogManager.getLogger();

	private final CXFStubHubClient client = CXFStubHubClients.getClient();

	private final CXFEventService eventService = client.event();

	@BeforeAll
	static void setUpBeforeClass() {
		CXFStubHubClients.enableLogging();
	}

	@Test
	void testGetInventories() {
		log.info("Testing getInventories()...");
		var inventories = eventService.getInventories(159450682);
		log.info("inventories: {}", inventories::size);
	}

}
