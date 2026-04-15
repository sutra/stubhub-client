package org.oxerr.stubhub.client.cxf.impl.invoice;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.Test;
import org.oxerr.stubhub.client.cxf.impl.CXFStubHubClient;
import org.oxerr.stubhub.client.cxf.impl.CXFStubHubClients;

class InvoiceTest {

	private static final Logger log = LogManager.getFormatterLogger();

	private final CXFStubHubClient client = CXFStubHubClients.getClient();

	@Disabled("Requires authentication")
	@Test
	void testGetInvoice() {
		var invoices = client.invoice().resource().getInvoicesByMarketplaceSaleId("1");
		invoices.forEach(s -> {
			log.info("Sale: %d", s.getId());
		});
	}

}
