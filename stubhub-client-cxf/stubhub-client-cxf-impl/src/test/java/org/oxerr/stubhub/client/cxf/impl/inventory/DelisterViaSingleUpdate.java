package org.oxerr.stubhub.client.cxf.impl.inventory;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.apache.commons.lang3.time.StopWatch;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.Test;
import org.oxerr.stubhub.client.cxf.impl.CXFStubHubClient;
import org.oxerr.stubhub.client.cxf.impl.CXFStubHubClients;
import org.oxerr.stubhub.client.cxf.resource.InventoryResource;
import org.oxerr.stubhub.client.model.ApiMarketplace;
import org.oxerr.stubhub.client.model.ApiPosBroadcastState;
import org.oxerr.stubhub.client.model.InventoryBroadcastUpdateRequest;
import org.oxerr.stubhub.client.model.InventoryExportLeanResponse;
import org.oxerr.stubhub.client.model.InventoryUpdateRequest;
import org.oxerr.stubhub.client.model.ListingLeanResponse;

/**
 * Delist all listings via the
 * {@link InventoryResource#updateInventory(Long, InventoryUpdateRequest)} API method.
 */
class DelisterViaSingleUpdate {

	private static final Logger log = LogManager.getFormatterLogger();

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
		listings.forEach(this::delist);
	}

	private void delist(ListingLeanResponse listing) {
		log.info("Delisting id: %s(%s), quantity: %d, cost: %,2f, price: %,2f",
			listing.getListingId(), listing.getExternalId(),
			listing.getQuantity(),
			listing.getCost(), listing.getPrice());
		InventoryUpdateRequest inventoryUpdateRequest = updateRequest();
		inventoryService.resource().updateInventory(listing.getListingId(), inventoryUpdateRequest);
	}

	private InventoryUpdateRequest updateRequest() {
		InventoryUpdateRequest inventoryUpdateRequest = new InventoryUpdateRequest();
		inventoryUpdateRequest.setBroadcastStatuses(List.of(broadcastUpdateRequest()));
		return inventoryUpdateRequest;
	}

	private InventoryBroadcastUpdateRequest broadcastUpdateRequest() {
		var broadcastUpdateRequest =  new InventoryBroadcastUpdateRequest();
		broadcastUpdateRequest.setMarketplace(ApiMarketplace.STUB_HUB);
		broadcastUpdateRequest.setPosBroadcastState(ApiPosBroadcastState.DELIST);
		return broadcastUpdateRequest;
	}

}
