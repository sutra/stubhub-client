package org.oxerr.stubhub.client.cxf.impl.invoice;

import java.util.Comparator;
import java.util.concurrent.atomic.AtomicInteger;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.Test;
import org.oxerr.stubhub.client.cxf.impl.CXFStubHubClient;
import org.oxerr.stubhub.client.cxf.impl.CXFStubHubClients;
import org.oxerr.stubhub.client.model.SaleResponse;

class InvoiceExportTest {

	private static final Logger log = LogManager.getFormatterLogger();

	private final CXFStubHubClient client = CXFStubHubClients.getClient();

	@Disabled("Requires authentication")
	@Test
	void testExport() {
		AtomicInteger counter = new AtomicInteger();
		client.invoice()
			.streamInvoices()
			.sorted(Comparator.comparing(SaleResponse::getCreatedDate))
			.forEach(s -> {
				log.info("Invoice %d: %s(%s) %s %,.2f - %,.2f = %,.2f",
					counter.incrementAndGet(),
					s.getSaleDate(), s.getEvent().getDate(),
					s.getId(),
					s.getTotalNetProceeds(), s.getTotalCost(),
					s.getTotalNetProceeds().subtract(s.getTotalCost()));
			});
	}

}
