package org.oxerr.stubhub.client.cxf.impl.inventory;

import java.util.Arrays;
import java.util.List;
import java.util.UUID;

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
import org.oxerr.stubhub.client.model.ListingResponse;

/**
 * Delist listings of one event.
 */
class DelisterByEvent {

	private static final Logger log = LogManager.getFormatterLogger();

	private final CXFStubHubClient client = CXFStubHubClients.getClient();

	private final CXFInventoryService inventoryService = client.inventory();

	@Disabled("Run this test to delist listings.")
	@Test
	void testDelistByStubHubEventId() {
		int eventId = 160286157;
		client.event().getInventories(eventId).forEach(listingResponse -> {
			if (listingResponse.getListingStatusByMarketplace().get(0).getPosBroadcastState() == ApiPosBroadcastState.LIST) {
				log.info("Delist %,d", listingResponse.getId());
				delist(Arrays.asList(listingResponse));
			}
		});
	}

	private void delist(List<ListingResponse> listings) {
		BulkInventoryRequest bulkInventoryRequest = new BulkInventoryRequest(UUID.randomUUID());
		bulkInventoryRequest.setUpdateRequests(listings.stream().map(this::updateRequest).toList());
		inventoryService.resource().bulkUpdate(bulkInventoryRequest);
	}

	private BulkInventoryUpdateRequest updateRequest(ListingResponse listing) {
		BulkInventoryUpdateRequest bulkUpdateRequest = new BulkInventoryUpdateRequest(listing.getId());
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
