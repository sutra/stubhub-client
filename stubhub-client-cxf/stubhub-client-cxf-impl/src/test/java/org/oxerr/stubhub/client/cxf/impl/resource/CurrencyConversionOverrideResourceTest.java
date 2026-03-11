package org.oxerr.stubhub.client.cxf.impl.resource;

import static org.junit.jupiter.api.Assertions.assertNotNull;

import java.math.BigDecimal;
import java.time.LocalDateTime;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.Test;
import org.oxerr.stubhub.client.cxf.impl.CXFStubHubClient;
import org.oxerr.stubhub.client.cxf.impl.CXFStubHubClients;
import org.oxerr.stubhub.client.cxf.resource.CurrencyConversionOverrideResource;
import org.oxerr.stubhub.client.model.CurrencyConversionOverrideRequest;

class CurrencyConversionOverrideResourceTest {

	private final CXFStubHubClient client = CXFStubHubClients.getClient();

	private final CurrencyConversionOverrideResource currencyConversionOverrideResource = client
		.getCurrencyConversionOverrideResource();

	@Disabled("This test modifies server data.")
	@Test
	void testPut() {
		var request = new CurrencyConversionOverrideRequest();
		request.setConversionRateDate(LocalDateTime.now());
		request.setFromCurrency("USD");
		request.setToCurrency("CAD");
		request.setPaymentMethodNameRegex(".*");
		request.setConversionRate(new BigDecimal("1.25"));
		var response = currencyConversionOverrideResource.put(request);
		assertNotNull(response);
	}

	@Test
	void testGet() {
		var currencyConversionOverrideResources = currencyConversionOverrideResource.get();
		assertNotNull(currencyConversionOverrideResources);
	}

	@Test
	void testDelete() {
		Assertions.assertDoesNotThrow(() -> currencyConversionOverrideResource.delete(2L));
	}

}
