package org.oxerr.stubhub.client.cxf.impl.inventory;

import static org.junit.jupiter.api.Assertions.assertNotNull;

import java.time.LocalDateTime;
import java.util.List;
import java.util.UUID;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.stream.Stream;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.Test;
import org.oxerr.stubhub.client.cxf.impl.CXFStubHubClient;
import org.oxerr.stubhub.client.cxf.impl.CXFStubHubClients;
import org.oxerr.stubhub.client.inventory.InventorySearchCriteria;
import org.oxerr.stubhub.client.model.BulkInventoryCreateRequest;
import org.oxerr.stubhub.client.model.BulkInventoryRequest;
import org.oxerr.stubhub.client.model.EventMappingRequest;
import org.oxerr.stubhub.client.model.ListingResponse;
import org.oxerr.stubhub.client.model.PurchaseSeatingRequest;

class CXFInventoryServceTest {

	private static final Logger log = LogManager.getLogger();

	private final CXFStubHubClient client = CXFStubHubClients.getClient();

	private final CXFInventoryServce inventoryService = client.inventory();

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
		AtomicInteger counter = new AtomicInteger();
		Stream<ListingResponse> s = inventoryService.streamInventories(inventorySearchCriteria);
		assertNotNull(s);
		s.forEach(listing -> {
			counter.incrementAndGet();
			log.info("listing: {} {}", counter.get(), listing);
		});
	}

	@Disabled("NotFound HTTP 404 Not Found")
	@Test
	void testSeek() {
		var r = client.inventory().resource().seek(List.of(1L), Boolean.FALSE);
		assertNotNull(r);
	}

	@Test
	void testBulkUpdate() {
		BulkInventoryRequest out = new BulkInventoryRequest();
		out.setBulkProcessingId(new UUID(0L, 1));
		out.setCreateRequests(createRequests());
		var in = inventoryService.resource().bulkUpdate(out);
		log.info("successful: {}", in::getSuccessful);

		var status = inventoryService.resource().getBulkUpdate(out.getBulkProcessingId());
		log.info("successful: {}", status::getSuccessful);
	}

	private List<BulkInventoryCreateRequest> createRequests() {
		BulkInventoryCreateRequest r = createRequest();
		return List.of(r);
	}

	private BulkInventoryCreateRequest createRequest() {
		BulkInventoryCreateRequest r = new BulkInventoryCreateRequest();
		r.setCurrencyCode("USD");
		r.setSeating(seating());
		r.setDeliveryType("InApp");
		r.setEventMapping(eventMapping());
		r.setTicketCount(1);
		r.setExternalId("1");
		return r;
	}

	private EventMappingRequest eventMapping() {
		EventMappingRequest r = new EventMappingRequest();
		r.setEventName("Caribeno Champs Classic");
		r.setEventDate(LocalDateTime.parse("2028-03-07T18:30:00"));
		r.setVenueName("Barclays Center,Brooklyn");
		r.setCity("Brooklyn");
		r.setStateProvince("XX");
		r.setCountryCode("USA");
		return r;
	}

	private PurchaseSeatingRequest seating() {
		PurchaseSeatingRequest seating = new PurchaseSeatingRequest();
		seating.setSection("101");
		seating.setRow("1");
		return seating;
	}

}
