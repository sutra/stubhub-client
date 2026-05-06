package org.oxerr.stubhub.client.cxf.impl.inventory;

import java.util.List;
import java.util.UUID;
import java.util.concurrent.TimeUnit;

import org.apache.commons.lang3.time.StopWatch;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.Test;
import org.oxerr.stubhub.client.cxf.impl.CXFStubHubClient;
import org.oxerr.stubhub.client.cxf.impl.CXFStubHubClients;
import org.oxerr.stubhub.client.model.ApiMarketplace;
import org.oxerr.stubhub.client.model.ApiPosBroadcastState;
import org.oxerr.stubhub.client.model.BulkInventoryRequest;
import org.oxerr.stubhub.client.model.BulkInventoryUpdateRequest;
import org.oxerr.stubhub.client.model.InventoryBroadcastUpdateRequest;
import org.oxerr.stubhub.client.model.InventoryExportLeanResponse;
import org.oxerr.stubhub.client.model.ListingLeanResponse;

/**
 * Delist all listings.
 */
class Delister {

	private static final Logger log = LogManager.getFormatterLogger();

	private static final int MAX_BULK_ITEMS = 250;

	private final CXFStubHubClient client = CXFStubHubClients.getClient();

	private final CXFInventoryService inventoryService = client.inventory();

	@Disabled("Run this test to delist all listings.")
	@Test
	void testDelist() {
		StopWatch watch = StopWatch.createStarted();
		try {
			delistAll();
		} finally {
			watch.stop();
			log.info("Delisting completed in %d seconds.", watch.getTime(TimeUnit.SECONDS));
		}
	}

	void delistAll() {
		InventoryExportLeanResponse r = client.inventory().resource().exportLean();
		log.info("Total inventory count: %,d", r.getNumberOfItems());

		List<ListingLeanResponse> listings = r.getInventory();
		int total = listings.size();
		for (int i = 0; i < total; i += MAX_BULK_ITEMS) {
			int end = Math.min(i + MAX_BULK_ITEMS, listings.size());
			log.info("Delisting batch %,d - %,d of %,d", i + 1, end, total);
			List<ListingLeanResponse> batch = listings.subList(i, end);
			delist(batch);
		}
	}

	private void delist(List<ListingLeanResponse> listings) {
		BulkInventoryRequest bulkInventoryRequest = new BulkInventoryRequest(UUID.randomUUID());
		bulkInventoryRequest.setUpdateRequests(listings.stream().map(this::updateRequest).toList());
		inventoryService.resource().bulkUpdate(bulkInventoryRequest);
	}

	private BulkInventoryUpdateRequest updateRequest(ListingLeanResponse listing) {
		BulkInventoryUpdateRequest bulkUpdateRequest = new BulkInventoryUpdateRequest(listing.getListingId());
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
