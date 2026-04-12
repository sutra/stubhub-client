package org.oxerr.stubhub.client.cxf.impl.inventory;

import java.util.List;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.Test;
import org.oxerr.stubhub.client.cxf.impl.CXFStubHubClient;
import org.oxerr.stubhub.client.cxf.impl.CXFStubHubClients;
import org.oxerr.stubhub.client.model.ApiMarketplace;
import org.oxerr.stubhub.client.model.InventoryPriceUpdateRequest;
import org.oxerr.stubhub.client.model.InventoryUpdateRequest;
import org.oxerr.stubhub.client.model.ListingResponse;

class UpdateInventoryTest {

	private static final Logger log = LogManager.getFormatterLogger();

	private final CXFStubHubClient client = CXFStubHubClients.getClient();

	@Disabled("Requires authentication")
	@Test
	void testUpdateInventory() {
		long inventoryId = 901619532L;
		ListingResponse listing = client.inventory().resource().getInventory(inventoryId, false).get(0);
		log.info("listing: %s", listing);

		var request = createInventoryUpdateRequest(listing);
		log.info("request: %s", request);
		var response = client.inventory().resource().updateInventory(inventoryId, request);

		log.info("response: %s", response);
	}

	private InventoryUpdateRequest createInventoryUpdateRequest(ListingResponse inventory) {
		var request = new InventoryUpdateRequest();
		request.setPrices(List.of(createInventoryPriceUpdateRequest(inventory)));
		return request;
	}

	private InventoryPriceUpdateRequest createInventoryPriceUpdateRequest(ListingResponse inventory) {
		var request = new InventoryPriceUpdateRequest();

		request.setMarketplace(ApiMarketplace.STUB_HUB);

		// Payload: {"code":"bad_request","message":null,"errors":{"Prices[0]":["Can only update one of the following AllInPrice or ListPrice or MarketplaceMarkup"]}}
		// request.setAllInPrice(inventory.getUnitCost());

		request.setListPrice(inventory.getUnitCost());

		return request;
	}

}
