package org.oxerr.stubhub.client.cxf.impl.inventory;

import static org.junit.jupiter.api.Assertions.assertNotNull;

import java.util.List;
import java.util.concurrent.atomic.AtomicInteger;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.Test;
import org.oxerr.stubhub.client.cxf.impl.CXFStubHubClient;
import org.oxerr.stubhub.client.cxf.impl.CXFStubHubClients;
import org.oxerr.stubhub.client.inventory.InventorySearchCriteria;
import org.oxerr.stubhub.client.inventory.InventoryService;

class CXFInventoryServceTest {

	private static final Logger log = LogManager.getLogger();

	private final CXFStubHubClient client = CXFStubHubClients.getClient();

	private final InventoryService inventoryService = client.inventory();

	@BeforeAll
	static void setUpBeforeClass() {
		System.setProperty("java.util.logging.manager", "org.apache.logging.log4j.jul.LogManager");
		System.setProperty("com.sun.xml.ws.transport.http.client.HttpTransportPipe.dump", "true");
		System.setProperty("com.sun.xml.internal.ws.transport.http.client.HttpTransportPipe.dump", "true");
		System.setProperty("com.sun.xml.ws.transport.http.HttpAdapter.dump", "true");
		System.setProperty("com.sun.xml.internal.ws.transport.http.HttpAdapter.dump", "true");

	}

	@Test
	void testSearch() {
		var inventorySearchCriteria = new InventorySearchCriteria();
		inventorySearchCriteria.setMaxPageSize(10);
		var r = inventoryService.iterateInventories(inventorySearchCriteria);
		assertNotNull(r);
		AtomicInteger counter = new AtomicInteger();
		while (r.hasNext()) {
			var listing = r.next();
			counter.incrementAndGet();
			log.info("listing: {} {}", counter.get(), listing);
		}
	}

	@Disabled("NotFound HTTP 404 Not Found")
	@Test
	void testSeek() {
		var r = client.inventory().resource().seek(List.of(1L), Boolean.FALSE);
		assertNotNull(r);
	}

}
