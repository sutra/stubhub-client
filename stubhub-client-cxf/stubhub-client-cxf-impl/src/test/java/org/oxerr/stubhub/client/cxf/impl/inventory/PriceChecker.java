package org.oxerr.stubhub.client.cxf.impl.inventory;

import java.math.BigDecimal;
import java.util.List;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicInteger;

import org.apache.commons.lang3.time.StopWatch;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.Test;
import org.oxerr.stubhub.client.cxf.impl.CXFStubHubClient;
import org.oxerr.stubhub.client.cxf.impl.CXFStubHubClients;
import org.oxerr.stubhub.client.inventory.InventoryExportCriteria;
import org.oxerr.stubhub.client.model.ApiMarketplace;
import org.oxerr.stubhub.client.model.ApiPosBroadcastState;
import org.oxerr.stubhub.client.model.InventoryPriceUpdateRequest;
import org.oxerr.stubhub.client.model.InventoryUpdateRequest;
import org.oxerr.stubhub.client.model.ListingResponse;
import org.oxerr.stubhub.client.model.MarketplaceListingStatus;
import org.oxerr.stubhub.client.model.MarketplacePricingInfo;

/**
 * Check the price of all listings and delist them if necessary. This is a
 * safety measure to prevent tickets from being sold at a very low price due to
 * a bug in the pricing algorithm.
 */
class PriceChecker {

	private static final Logger log = LogManager.getFormatterLogger();

	private final CXFStubHubClient client = CXFStubHubClients.getClient();

	private final ThreadPoolExecutor executor = new ThreadPoolExecutor(10, 10, 0L, TimeUnit.MILLISECONDS, new LinkedBlockingQueue<>());

	private final StopWatch watch = StopWatch.create();

	private final AtomicInteger totalCounter = new AtomicInteger();
	private final AtomicInteger listCounter  = new AtomicInteger();
	private final AtomicInteger warnCounter  = new AtomicInteger();

	@AfterEach
	void tearDown() throws Exception {
		// Shutdown executor and wait for tasks to complete before exiting.
		executor.shutdown();
		if (!executor.awaitTermination(10, TimeUnit.MINUTES)) {
			log.warn("Some delist tasks did not complete within the timeout.");
			executor.shutdownNow();
			if (!executor.awaitTermination(1, TimeUnit.MINUTES)) {
				log.error("Executor did not terminate.");
			}
		}
	}

	@Disabled("Run this test to check all listings.")
	@Test
	void testCheckPrice() {
		watch.start();

		InventoryExportCriteria criteria = new InventoryExportCriteria();
		criteria.setPageSize(5000);

		client.inventory().streamInventories(criteria).forEach(this::check);

		log.info("[%s] total inventory count: %,d, list inventory count: %,d, warn inventory count: %,d",
			watch, totalCounter.get(), listCounter.get(), warnCounter.get());
	}

	private void check(ListingResponse inventory) {
		var index = totalCounter.incrementAndGet();
		var faceValue = inventory.getFaceValue();
		var unitCost = inventory.getUnitCost();

		var state = inventory.getListingStatusByMarketplace().stream().findFirst()
			.map(MarketplaceListingStatus::getPosBroadcastState)
			.orElse(ApiPosBroadcastState.DELIST);

		if (state == ApiPosBroadcastState.LIST) {
			listCounter.incrementAndGet();

			MarketplacePricingInfo mpi = inventory.getListingPricesByMarketplace().get(0);
			var listPrice = mpi.getListPrice();
			var allInPrice = mpi.getAllInPrice();

			if (unitCost.compareTo(BigDecimal.ZERO) <= 0 || listPrice.compareTo(unitCost) <= 0) {
				var warn = warnCounter.incrementAndGet();

				log.warn("[%s][%,d] Inventory: %d(%s), faceValue: %,.2f, unitCost: %,.2f, listPrice: %,.2f, allInPrice: %,.2f, isBroadcast: %s, posBroadcastState: %s, warning count: %,d",
					watch, index, inventory.getId(), inventory.getExternalId(),
					faceValue, unitCost, listPrice, allInPrice,
					inventory.getIsBroadcast(), state, warn);

				updatePrices(inventory);
			}
		} else {
			log.debug("[%s][%,d] Inventory: %d(%s), faceValue: %,.2f, unitCost: %,.2f, isBroadcast: %s, posBroadcastState: %s, warning count: %,d",
				watch, index, inventory.getId(), inventory.getExternalId(),
				faceValue, unitCost,
				inventory.getIsBroadcast(), state, warnCounter.get());
		}
	}

	private void updatePrices(ListingResponse inventory) {
		client.inventory().resource().updateInventory(inventory.getId(), createInventoryUpdateRequest(inventory));
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
