package org.oxerr.stubhub.client.cxf.impl;

import java.util.List;

import org.apache.cxf.jaxrs.client.JAXRSClientFactory;
import org.oxerr.stubhub.client.StubHubClient;
import org.oxerr.stubhub.client.cxf.impl.filter.BearerAuthFilter;
import org.oxerr.stubhub.client.cxf.impl.inventory.CXFInventoryServce;
import org.oxerr.stubhub.client.cxf.resource.AccountResource;
import org.oxerr.stubhub.client.cxf.resource.CurrencyConversionOverrideResource;
import org.oxerr.stubhub.client.cxf.resource.DealResource;
import org.oxerr.stubhub.client.cxf.resource.EventResource;
import org.oxerr.stubhub.client.cxf.resource.HealthCheckResource;
import org.oxerr.stubhub.client.cxf.resource.HoldResource;
import org.oxerr.stubhub.client.cxf.resource.InventoryResource;

import com.fasterxml.jackson.annotation.JsonInclude.Include;
import com.fasterxml.jackson.databind.DeserializationFeature;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.databind.SerializationFeature;
import com.fasterxml.jackson.datatype.jsr310.JavaTimeModule;
import com.fasterxml.jackson.jakarta.rs.json.JacksonJsonProvider;

public class CXFStubHubClient implements StubHubClient {

	private final String baseAddress;

	private final List<?> providers;

	private final AccountResource accountResource;

	private final CurrencyConversionOverrideResource currencyConversionOverrideResource;

	private final DealResource dealResource;

	private final EventResource eventResource;

	private final HealthCheckResource healthCheckResource;

	private final HoldResource holdResource;

	private final CXFInventoryServce inventoryService;

	public CXFStubHubClient(String apiKey) {
		this.baseAddress = "https://pointofsaleapi.stubhub.net";

		JacksonJsonProvider jacksonJsonProvider = createJacksonJsonProvider();
		BearerAuthFilter authFilter = new BearerAuthFilter(apiKey);
		this.providers = List.of(
			jacksonJsonProvider,
			authFilter
		);

		accountResource = createProxy(AccountResource.class);
		currencyConversionOverrideResource = createProxy(CurrencyConversionOverrideResource.class);
		dealResource = createProxy(DealResource.class);
		eventResource = createProxy(EventResource.class);
		healthCheckResource = createProxy(HealthCheckResource.class);
		holdResource = createProxy(HoldResource.class);
		inventoryService = new CXFInventoryServce(createProxy(InventoryResource.class));
	}

	public AccountResource getAccountResource() {
		return accountResource;
	}

	public CurrencyConversionOverrideResource getCurrencyConversionOverrideResource() {
		return currencyConversionOverrideResource;
	}

	public DealResource getDealResource() {
		return dealResource;
	}

	public EventResource getEventResource() {
		return eventResource;
	}

	public HealthCheckResource getHealthCheckResource() {
		return healthCheckResource;
	}

	public HoldResource getHoldResource() {
		return holdResource;
	}

	protected <T> T createProxy(Class<T> cls) {
		return JAXRSClientFactory.create(
			baseAddress,
			cls,
			providers
		);
	}

	protected JacksonJsonProvider createJacksonJsonProvider() {
		JacksonJsonProvider provider = new JacksonJsonProvider();
		provider.setMapper(createObjectMapper());
		return provider;
	}

	protected ObjectMapper createObjectMapper() {
		return new ObjectMapper()
			.registerModule(new JavaTimeModule())
			.setDefaultPropertyInclusion(Include.NON_ABSENT)
			.configure(SerializationFeature.WRITE_DATES_AS_TIMESTAMPS, false)
			.configure(DeserializationFeature.READ_DATE_TIMESTAMPS_AS_NANOSECONDS, false)
			.configure(DeserializationFeature.ADJUST_DATES_TO_CONTEXT_TIME_ZONE, false)
			.configure(DeserializationFeature.FAIL_ON_UNKNOWN_PROPERTIES, false);
	}

	@Override
	public CXFInventoryServce inventory() {
		return inventoryService;
	}

}
