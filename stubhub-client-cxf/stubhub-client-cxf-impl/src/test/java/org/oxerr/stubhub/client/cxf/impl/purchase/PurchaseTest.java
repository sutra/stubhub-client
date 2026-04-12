package org.oxerr.stubhub.client.cxf.impl.purchase;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.Test;
import org.oxerr.stubhub.client.cxf.impl.CXFStubHubClient;
import org.oxerr.stubhub.client.cxf.impl.CXFStubHubClients;

class PurchaseTest {

	private static final Logger log = LogManager.getFormatterLogger();

	private final CXFStubHubClient client = CXFStubHubClients.getClient();

	@Disabled("Need to be tested with a real purchase order id.")
	@Test
	void testGetPurchaseOrder() {
		Long purchaseOrderId = 1L;
		var order = client.purchase().resource().getPurchaseOrder(purchaseOrderId, true);
		log.info("order: %s", order);
	}

}
