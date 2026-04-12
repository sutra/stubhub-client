package org.oxerr.stubhub.client.cxf.impl.purchase;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.junit.jupiter.api.Test;
import org.oxerr.stubhub.client.cxf.impl.CXFStubHubClient;
import org.oxerr.stubhub.client.cxf.impl.CXFStubHubClients;

class PurchaseExportTest {

	private static final Logger log = LogManager.getFormatterLogger();

	private final CXFStubHubClient client = CXFStubHubClients.getClient();

	@Test
	void testGetPurchases() {
		client.purchase().streamPurchases().forEach(o -> {
			log.info("order: %s", o);
		});
	}

}
