package org.oxerr.stubhub.client.cxf.impl.inventory;

import java.util.List;
import java.util.UUID;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicInteger;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.Test;
import org.oxerr.stubhub.client.cxf.impl.CXFStubHubClient;
import org.oxerr.stubhub.client.cxf.impl.CXFStubHubClients;
import org.oxerr.stubhub.client.inventory.InventoryExportCriteria;
import org.oxerr.stubhub.client.model.ApiMarketplace;
import org.oxerr.stubhub.client.model.ApiPosBroadcastState;
import org.oxerr.stubhub.client.model.BulkInventoryRequest;
import org.oxerr.stubhub.client.model.BulkInventoryUpdateRequest;
import org.oxerr.stubhub.client.model.InventoryBroadcastUpdateRequest;
import org.oxerr.stubhub.client.model.ListingResponse;

/**
 * Delist all listings.
 */
class Delister {

	private static final Logger log = LogManager.getFormatterLogger();

	private final CXFStubHubClient client = CXFStubHubClients.getClient();

	private final CXFInventoryService inventoryService = client.inventory();

	private final ThreadPoolExecutor executor = new ThreadPoolExecutor(10, 10, 0L, TimeUnit.MILLISECONDS, new LinkedBlockingQueue<>());

	@BeforeAll
	static void setUpBeforeClass() {
		CXFStubHubClients.enableLogging();
	}

	@AfterEach
	void tearDown() throws Exception {
		executor.awaitTermination(10, TimeUnit.MINUTES);
	}

	@Disabled("Run this test to delist all listings.")
	@Test
	void testDelist() {
		AtomicInteger totalCounter = new AtomicInteger();
		AtomicInteger listCounter = new AtomicInteger();

		InventoryExportCriteria criteria = new InventoryExportCriteria();
		criteria.setPageSize(5000);

		client.inventory().streamInventories(criteria).forEach(inventory -> {
			var i = totalCounter.incrementAndGet();

			var state = inventory.getListingStatusByMarketplace().get(0).getPosBroadcastState();

			if (state == ApiPosBroadcastState.LIST) {
				listCounter.incrementAndGet();
				log.info("[%,d] inventory: %s, posBroadcastState: %s", i, inventory.getId(), state);
				executor.execute(() -> {
					delist(inventory);
				});
			} else {
				log.debug("[%,d] inventory: %s, posBroadcastState: %s", i, inventory.getId(), state);
			}
		});

		log.info("total inventory count: %,d, list inventory count: %,d", totalCounter.get(), listCounter.get());
	}

	private void delist(ListingResponse inventory) {
		BulkInventoryRequest bulkInventoryRequest = new BulkInventoryRequest(UUID.randomUUID());
		bulkInventoryRequest.setUpdateRequests(List.of(updateRequest(inventory)));
		inventoryService.resource().bulkUpdate(bulkInventoryRequest);
	}

	private BulkInventoryUpdateRequest updateRequest(ListingResponse inventory) {
		BulkInventoryUpdateRequest bulkUpdateRequest = new BulkInventoryUpdateRequest(inventory.getId());
		bulkUpdateRequest.setBroadcastStatuses(List.of(broadcastUpdateRequest()));
		return bulkUpdateRequest;
	}


	private InventoryBroadcastUpdateRequest broadcastUpdateRequest() {
		var broadcastUpdateRequest =  new InventoryBroadcastUpdateRequest();
		broadcastUpdateRequest.setMarketplace(ApiMarketplace.STUB_HUB);
		broadcastUpdateRequest.setPosBroadcastState(ApiPosBroadcastState.DELIST);
		return broadcastUpdateRequest;
	}

}
