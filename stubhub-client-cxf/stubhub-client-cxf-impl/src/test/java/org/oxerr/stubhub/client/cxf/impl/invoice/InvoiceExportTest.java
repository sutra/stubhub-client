package org.oxerr.stubhub.client.cxf.impl.invoice;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.Test;
import org.oxerr.stubhub.client.cxf.impl.CXFStubHubClient;
import org.oxerr.stubhub.client.cxf.impl.CXFStubHubClients;

class InvoiceExportTest {

	private static final Logger log = LogManager.getFormatterLogger();

	private final CXFStubHubClient client = CXFStubHubClients.getClient();

	@Disabled("Requires authentication")
	@Test
	void testExport() {
		client.invoice().streamInvoices().forEach(s -> {
			log.info("Invoice: %s %s %,.2f %,.2f", s.getSaleDate(), s.getId(),
				s.getTotalNetProceeds(), s.getTotalCost());
		});
	}

}
