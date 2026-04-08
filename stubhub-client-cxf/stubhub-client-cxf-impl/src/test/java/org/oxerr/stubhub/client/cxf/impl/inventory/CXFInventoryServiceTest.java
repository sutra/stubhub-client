package org.oxerr.stubhub.client.cxf.impl.inventory;

import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertNotNull;

import java.math.BigDecimal;
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
import org.oxerr.stubhub.client.inventory.InventoryExportCriteria;
import org.oxerr.stubhub.client.inventory.InventorySearchCriteria;
import org.oxerr.stubhub.client.model.ApiDeliveryType;
import org.oxerr.stubhub.client.model.ApiMarketplace;
import org.oxerr.stubhub.client.model.ApiMarketplaceBroadcastState;
import org.oxerr.stubhub.client.model.ApiPosBroadcastState;
import org.oxerr.stubhub.client.model.BulkInventoryCreateRequest;
import org.oxerr.stubhub.client.model.BulkInventoryDeleteRequest;
import org.oxerr.stubhub.client.model.BulkInventoryRequest;
import org.oxerr.stubhub.client.model.BulkInventoryUpdateRequest;
import org.oxerr.stubhub.client.model.EventMappingRequest;
import org.oxerr.stubhub.client.model.InventoryBroadcastUpdateRequest;
import org.oxerr.stubhub.client.model.InventoryPriceUpdateRequest;
import org.oxerr.stubhub.client.model.InventoryUpdateRequest;
import org.oxerr.stubhub.client.model.ListingResponse;
import org.oxerr.stubhub.client.model.PurchaseSeatingRequest;

class CXFInventoryServiceTest {

	private static final Logger log = LogManager.getLogger();

	private final CXFStubHubClient client = CXFStubHubClients.getClient();

	private final CXFInventoryService inventoryService = client.inventory();

	@BeforeAll
	static void setUpBeforeClass() {
		CXFStubHubClients.enableLogging();
	}

	@Disabled("Update broadcast with update inventory")
	@Test
	void testUpdateBroadcast() {
		long inventoryId = 895113502L;

		// bulk update
		var res = inventoryService.resource().updateInventory(inventoryId, updateRequest());

		log.info("res: {}", res);

		// check inventory
		var inventory = inventoryService.resource().getInventory(inventoryId, Boolean.TRUE);
		assertNotNull(inventory);
		log.info("inventory: {}", inventory);
		log.info("inventory[0].isBroadcast(): {}", inventory.get(0).getIsBroadcast());
		var status = inventory.get(0).getListingStatusByMarketplace().get(0);
		log.info("marketplace: {}, broadcast: {}", status.getMarketplaceName(), status.getMarketplaceBroadcastState());
	}

	@Disabled("Update broadcast with bulk update")
	@Test
	void testBulkUpdateBroadcast() {
		long inventoryId = 895113502L;

		BulkInventoryRequest req = bulkRequest(inventoryId);

		// bulk update
		var res = inventoryService.resource().bulkUpdate(req);

		log.info("successful: {}", res::getSuccessful);
		assertFalse(res.getSuccessful().booleanValue());

		// get bulk update status
		inventoryService.resource().getBulkUpdateStatus(req.getBulkProcessingId());

		// check inventory
		var inventory = inventoryService.resource().getInventory(inventoryId, Boolean.TRUE);
		assertNotNull(inventory);
		log.info("inventory: {}", inventory);
		log.info("inventory[0].isBroadcast(): {}", inventory.get(0).getIsBroadcast());
		var status = inventory.get(0).getListingStatusByMarketplace().get(0);
		log.info("marketplace: {}, broadcast: {}", status.getMarketplaceName(), status.getMarketplaceBroadcastState());
	}

	private BulkInventoryRequest bulkRequest(long inventoryId) {
		BulkInventoryRequest req = new BulkInventoryRequest();
		req.setBulkProcessingId(new UUID(0L, 2));
		req.setUpdateRequests(List.of(bulkUpdateRequest(inventoryId)));
		return req;
	}

	private BulkInventoryUpdateRequest bulkUpdateRequest(long inventoryId) {
		BulkInventoryUpdateRequest updateRequest = new BulkInventoryUpdateRequest();
		updateRequest.setInventoryId(inventoryId);
		updateRequest.setPrices(List.of(inventoryPriceUpdateRequest()));
		updateRequest.setBroadcastStatuses(List.of(broadcastUpdateRequest()));
		return updateRequest;
	}

	private InventoryUpdateRequest updateRequest() {
		InventoryUpdateRequest updateRequest = new InventoryUpdateRequest();
		updateRequest.setPrices(List.of(inventoryPriceUpdateRequest()));
		updateRequest.setBroadcastStatuses(List.of(broadcastUpdateRequest()));
		return updateRequest;
	}

	private InventoryPriceUpdateRequest inventoryPriceUpdateRequest() {
		InventoryPriceUpdateRequest inventoryPriceUpdateRequest = new InventoryPriceUpdateRequest();
		inventoryPriceUpdateRequest.setListPrice(new BigDecimal("10000"));
		inventoryPriceUpdateRequest.setMarketplace(ApiMarketplace.STUB_HUB);
		return inventoryPriceUpdateRequest;
	}

	private InventoryBroadcastUpdateRequest broadcastUpdateRequest() {
		var broadcastUpdateRequest =  new InventoryBroadcastUpdateRequest();
		broadcastUpdateRequest.setMarketplace(ApiMarketplace.STUB_HUB);
		broadcastUpdateRequest.setMarketplaceBroadcastState(ApiMarketplaceBroadcastState.LISTED);
		broadcastUpdateRequest.setPosBroadcastState(ApiPosBroadcastState.LIST);
		return broadcastUpdateRequest;
	}

	@Disabled("HTTP 429 Too Many Requests")
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
		var r = client.inventory().resource().seek(List.of(1L), Boolean.FALSE, null);
		assertNotNull(r);
	}

	@Disabled("Maybe cause: HTTP 429 Too Many Requests")
	@Test
	void testExport() {
		InventoryExportCriteria criteria = new InventoryExportCriteria();
		criteria.setPageSize(5000);
		var count = client.inventory().streamInventories(criteria).count();
		assertNotNull(count);
		log.info("count: {}", count);
	}

	@Disabled("Create inventory")
	@Test
	void testBulkUpdate() {
		BulkInventoryRequest out = new BulkInventoryRequest();
		out.setBulkProcessingId(new UUID(0L, 1));
		out.setCreateRequests(createRequests());
		out.setDeleteRequests(deleteRequests());
		var in = inventoryService.resource().bulkUpdate(out);
		log.info("successful: {}", in::getSuccessful);
		assertFalse(in.getSuccessful().booleanValue());
	}

	private List<BulkInventoryCreateRequest> createRequests() {
		BulkInventoryCreateRequest r = createRequest();
		return List.of(r);
	}

	private BulkInventoryCreateRequest createRequest() {
		BulkInventoryCreateRequest r = new BulkInventoryCreateRequest();
		r.setCurrencyCode("USD");
		r.setSeating(seating());
		r.setDeliveryType(ApiDeliveryType.IN_APP);
		r.setEventMapping(eventMapping());
		r.setTicketCount(1);
		r.setExternalId("1");
		return r;
	}

	private List<BulkInventoryDeleteRequest> deleteRequests() {
		BulkInventoryDeleteRequest r = deleteRequest();
		return List.of(r);
	}

	private BulkInventoryDeleteRequest deleteRequest() {
		BulkInventoryDeleteRequest r = new BulkInventoryDeleteRequest();
		r.setInventoryId(894641888L);
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

	@Disabled("NotFound HTTP 404 Not Found")
	@Test
	void testGetBulkUpdateStatus() {
		UUID bulkProcessingId = UUID.fromString("00000000-0000-0000-0500-6463f1c82af1");
		var status = inventoryService.resource().getBulkUpdateStatus(bulkProcessingId);
		log.info("successful: {}", status::getSuccessful);
		assertFalse(status.getSuccessful().booleanValue());
	}

}
