package org.oxerr.stubhub.client.cxf.impl.inventory;

import java.math.BigDecimal;
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
import org.oxerr.stubhub.client.model.ApiPosBroadcastState;

/**
 * Check the price of all listings and delist them if necessary. This is a
 * safety measure to prevent tickets from being sold at a very low price due to
 * a bug in the pricing algorithm.
 */
class PriceChecker {

	private static final Logger log = LogManager.getFormatterLogger();

	private final CXFStubHubClient client = CXFStubHubClients.getClient();

	private final ThreadPoolExecutor executor = new ThreadPoolExecutor(10, 10, 0L, TimeUnit.MILLISECONDS, new LinkedBlockingQueue<>());

	@BeforeAll
	static void setUpBeforeClass() {
		CXFStubHubClients.enableLogging();
	}

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
		AtomicInteger totalCounter = new AtomicInteger();
		AtomicInteger listCounter = new AtomicInteger();

		InventoryExportCriteria criteria = new InventoryExportCriteria();
		criteria.setPageSize(5000);

		client.inventory().streamInventories(criteria).forEach(inventory -> {
			var i = totalCounter.incrementAndGet();

			var state = inventory.getListingStatusByMarketplace().get(0).getPosBroadcastState();

			if (state == ApiPosBroadcastState.LIST) {
				listCounter.incrementAndGet();

				if (inventory.getUnitCost().compareTo(BigDecimal.ZERO) <= 0 || inventory.getUnitCost().compareTo(inventory.getFaceValue()) <= 0) {
					log.warn("[%,d] Inventory: %s(%s), unitCost: %,.2f, faceValue: %,.2f, isBroadcast: %s, posBroadcastState: %s",
						i, inventory.getId(), inventory.getExternalId(),
						inventory.getUnitCost(), inventory.getFaceValue(),
						inventory.getIsBroadcast(),
						state);
				}
			} else {
				log.debug("[%,d] inventory: %s(%s), unitCost: %,.2f, faceValue: %,.2f, isBroadcast: %s, posBroadcastState: %s", i,
					inventory.getId(), inventory.getExternalId(),
					inventory.getUnitCost(), inventory.getFaceValue(),
					inventory.getIsBroadcast(),
					state);
			}
		});

		log.info("total inventory count: %,d, list inventory count: %,d", totalCounter.get(), listCounter.get());
	}

}
