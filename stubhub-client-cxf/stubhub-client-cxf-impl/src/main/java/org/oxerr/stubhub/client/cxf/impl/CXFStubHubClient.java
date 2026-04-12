package org.oxerr.stubhub.client.cxf.impl;

import java.util.List;
import java.util.UUID;
import java.util.function.Consumer;

import org.apache.cxf.jaxrs.client.ClientConfiguration;
import org.apache.cxf.transport.http.HTTPConduit;
import org.apache.cxf.transports.http.configuration.HTTPClientPolicy;
import org.oxerr.stubhub.client.StubHubClient;
import org.oxerr.stubhub.client.cxf.impl.event.CXFEventService;
import org.oxerr.stubhub.client.cxf.impl.filter.BearerAuthFilter;
import org.oxerr.stubhub.client.cxf.impl.inventory.CXFInventoryService;
import org.oxerr.stubhub.client.cxf.impl.purchase.CXFPurchaseService;
import org.oxerr.stubhub.client.cxf.resource.AccountResource;
import org.oxerr.stubhub.client.cxf.resource.CurrencyConversionOverrideResource;
import org.oxerr.stubhub.client.cxf.resource.DealResource;
import org.oxerr.stubhub.client.cxf.resource.EventResource;
import org.oxerr.stubhub.client.cxf.resource.HealthCheckResource;
import org.oxerr.stubhub.client.cxf.resource.HoldResource;
import org.oxerr.stubhub.client.cxf.resource.InventoryResource;
import org.oxerr.stubhub.client.cxf.resource.PurchaseResource;

import com.fasterxml.jackson.annotation.JsonInclude.Include;
import com.fasterxml.jackson.databind.DeserializationFeature;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.databind.SerializationFeature;
import com.fasterxml.jackson.datatype.jsr310.JavaTimeModule;
import com.fasterxml.jackson.jakarta.rs.json.JacksonJsonProvider;

import jakarta.annotation.Nullable;

public class CXFStubHubClient implements StubHubClient {

	private final AccountResource accountResource;

	private final CurrencyConversionOverrideResource currencyConversionOverrideResource;

	private final DealResource dealResource;

	private final HealthCheckResource healthCheckResource;

	private final HoldResource holdResource;

	private final CXFEventService eventService;

	private final CXFInventoryService inventoryService;

	private final CXFPurchaseService purchaseService;

	public CXFStubHubClient(UUID accountId, String token) {
		this(accountId, token, null, config -> {});
	}

	public CXFStubHubClient(
		UUID accountId,
		String token,
		@Nullable HTTPClientPolicy policy
	) {
		this(accountId, token, policy, config -> {});
	}

	public CXFStubHubClient(
		UUID accountId,
		String token,
		@Nullable HTTPClientPolicy policy,
		Consumer<ClientConfiguration> configurer
	) {
		var baseAddress = "https://pointofsaleapi.stubhub.net";

		Consumer<ClientConfiguration> internalConfigurer = config -> {
			if (policy != null) {
				HTTPConduit conduit = (HTTPConduit) config.getConduit();
				conduit.setClient(policy);
			}
			configurer.accept(config);
		};

		JacksonJsonProvider jacksonJsonProvider = createJacksonJsonProvider();
		BearerAuthFilter authFilter = new BearerAuthFilter(accountId, token);
		List<?> providers = List.of(
			jacksonJsonProvider,
			authFilter
		);

		var f = new ClientFactory(baseAddress, providers, internalConfigurer);

		accountResource = f.create(AccountResource.class);
		currencyConversionOverrideResource = f.create(CurrencyConversionOverrideResource.class);
		dealResource = f.create(DealResource.class);
		healthCheckResource = f.create(HealthCheckResource.class);
		holdResource = f.create(HoldResource.class);
		eventService = new CXFEventService(f.create(EventResource.class));
		inventoryService = new CXFInventoryService(f.create(InventoryResource.class));
		purchaseService = new CXFPurchaseService(f.create(PurchaseResource.class));
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

	public HealthCheckResource getHealthCheckResource() {
		return healthCheckResource;
	}

	public HoldResource getHoldResource() {
		return holdResource;
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
	public CXFEventService event() {
		return eventService;
	}

	@Override
	public CXFInventoryService inventory() {
		return inventoryService;
	}

	@Override
	public CXFPurchaseService purchase() {
		return purchaseService;
	}

}
