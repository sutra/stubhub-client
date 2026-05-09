package org.oxerr.stubhub.client.cxf.impl.invoice;

import java.util.Comparator;
import java.util.concurrent.atomic.AtomicInteger;

import org.apache.commons.lang3.StringUtils;
import org.apache.logging.log4j.Level;
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
				int count = counter.incrementAndGet();
				Level level = s.getCreatedDate().isAfter(s.getEvent().getDate()) ? Level.WARN : Level.INFO;
				log.log(level,
					"Invoice %s: %s(%s) %s %s(%s) eventId=%s eventName=%s %,.2f - %,.2f = %,.2f",
					StringUtils.leftPad(String.valueOf(count), 4, '0'),
					s.getId(), s.getMarketplaceSaleId(),
					StringUtils.rightPad(s.getMarketplaceState().getFullfilmentState(), 9),
					s.getSaleDate(), s.getEvent().getDate(),
					s.getEvent().getId(), s.getEventMapping().getEventName(),
					s.getTotalNetProceeds(), s.getTotalCost(),
					s.getTotalNetProceeds().subtract(s.getTotalCost())
				);
			});
	}

}
