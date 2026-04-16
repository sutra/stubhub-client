package org.oxerr.stubhub.client.cxf.impl.inventory;

import java.util.List;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.Test;
import org.oxerr.stubhub.client.cxf.impl.CXFStubHubClient;
import org.oxerr.stubhub.client.cxf.impl.CXFStubHubClients;
import org.oxerr.stubhub.client.model.ListingLeanResponse;

class ExportLeanTest {

	private static final Logger log = LogManager.getFormatterLogger();

	private final CXFStubHubClient client = CXFStubHubClients.getClient();

	@Disabled("Requires authentication")
	@Test
	void testExportLean() {
		int i = 0;
		List<ListingLeanResponse> listings = client.inventory().resource()
			.exportLean().getInventory();
		for (var l : listings) {
			log.info("[%,d] id: %s(%s), quantity: %d, cost: %,2f, price: %,2f",
				++i,
				l.getListingId(), l.getExternalId(),
				l.getQuantity(),
				l.getCost(), l.getPrice());
		}
	}
}
