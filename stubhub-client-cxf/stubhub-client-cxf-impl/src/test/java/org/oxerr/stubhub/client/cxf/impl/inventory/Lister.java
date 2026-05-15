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
import org.oxerr.stubhub.client.model.ApiMarketplace;
import org.oxerr.stubhub.client.model.ApiPosBroadcastState;
import org.oxerr.stubhub.client.model.InventoryBroadcastUpdateRequest;
import org.oxerr.stubhub.client.model.InventoryUpdateRequest;
import org.oxerr.stubhub.client.model.ListingResponse;

/**
 * List all listings.
 */
class Lister {

	private static final Logger log = LogManager.getFormatterLogger();

	private final CXFStubHubClient client = CXFStubHubClients.getClient();

	private final CXFInventoryService inventoryService = client.inventory();

	@Disabled("Run this test to list all listings.")
	@Test
	void testList() {
		StopWatch watch = StopWatch.createStarted();
		try {
			listAll();
		} finally {
			watch.stop();
			log.info("Delisting completed in %d seconds.", watch.getTime(TimeUnit.SECONDS));
		}
	}

	void listAll() {
		client.inventory().streamInventories()
			.filter(listingResponse -> listingResponse.getEvent() != null && listingResponse
				.getListingStatusByMarketplace().get(0).getPosBroadcastState() != ApiPosBroadcastState.LIST)
			.forEach(this::list);
	}

	void list(ListingResponse listingResponse) {
		log.info("Listing listing %,d.", listingResponse.getId());
		log.info("Listing listing %,d: eventId=%,d.", listingResponse.getId(), listingResponse.getEvent().getId());
		var updateRequest = updateRequest();
		ListingResponse updatedListingResponse = inventoryService.resource()
			.updateInventory(listingResponse.getId(), updateRequest);
		log.info("Listing listing %,d completed. Current posBroadcastState: %s.",
			updatedListingResponse.getId(),
			updatedListingResponse.getListingStatusByMarketplace().get(0).getPosBroadcastState());
	}

	public static InventoryUpdateRequest updateRequest() {
		InventoryUpdateRequest inventoryUpdateRequest = new InventoryUpdateRequest();
		inventoryUpdateRequest.setBroadcastStatuses(List.of(broadcastUpdateRequest()));
		return inventoryUpdateRequest;
	}

	public static InventoryBroadcastUpdateRequest broadcastUpdateRequest() {
		var broadcastUpdateRequest =  new InventoryBroadcastUpdateRequest();
		broadcastUpdateRequest.setMarketplace(ApiMarketplace.STUB_HUB);
		broadcastUpdateRequest.setPosBroadcastState(ApiPosBroadcastState.LIST);
		return broadcastUpdateRequest;
	}

}
