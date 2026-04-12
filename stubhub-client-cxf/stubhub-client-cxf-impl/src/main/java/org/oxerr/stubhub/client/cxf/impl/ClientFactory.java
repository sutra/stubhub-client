package org.oxerr.stubhub.client.cxf.impl;

import java.util.List;
import java.util.function.Consumer;

import org.apache.cxf.jaxrs.client.ClientConfiguration;
import org.apache.cxf.jaxrs.client.JAXRSClientFactory;
import org.apache.cxf.jaxrs.client.WebClient;

public class ClientFactory {

	private final String baseAddress;
	private final List<?> providers;
	private final Consumer<ClientConfiguration> configurer;

	public ClientFactory(
		String baseAddress,
		List<?> providers,
		Consumer<ClientConfiguration> configurer
	) {
		this.baseAddress = baseAddress;
		this.providers = providers;
		this.configurer = configurer;
	}

	public <T> T create(Class<T> cls) {
		T client = JAXRSClientFactory.create(baseAddress, cls, providers);
		ClientConfiguration config = WebClient.getConfig(client);
		configurer.accept(config);
		return client;
	}

}
