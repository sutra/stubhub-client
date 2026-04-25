package org.oxerr.stubhub.client.cxf.impl;

import java.io.IOException;
import java.io.InputStream;
import java.util.Properties;
import java.util.UUID;

import org.apache.cxf.transports.http.configuration.HTTPClientPolicy;

public final class CXFStubHubClients {

	public static CXFStubHubClient getClient() {
		enableLogging();

		Properties props = getProps();
		UUID accountId = UUID.fromString(props.getProperty("accountId"));
		String apiKey = props.getProperty("token");

		return new CXFStubHubClient(accountId, apiKey, createPolicy());
	}

	public static Properties getProps() {
		Properties props = new Properties();
		String name = "/stubhub.properties";
		try (InputStream in = CXFStubHubClient.class.getResourceAsStream(name)) {
			if (in != null) {
				props.load(in);
			} else {
				throw new IllegalArgumentException(String.format("No resource found: %s", name));
			}
		} catch (IOException e) {
			throw new IllegalArgumentException("Read " + name + " failed.");
		}
		return props;
	}

	private static HTTPClientPolicy createPolicy() {
		HTTPClientPolicy policy = new HTTPClientPolicy();
		policy.setConnectionTimeout(120_000);
		policy.setReceiveTimeout(300_000);
		policy.setAllowChunking(true);
		return policy;
	}

	private static void enableLogging() {
		System.setProperty("java.util.logging.manager", "org.apache.logging.log4j.jul.LogManager");
		System.setProperty("com.sun.xml.ws.transport.http.client.HttpTransportPipe.dump", "true");
		System.setProperty("com.sun.xml.internal.ws.transport.http.client.HttpTransportPipe.dump", "true");
		System.setProperty("com.sun.xml.ws.transport.http.HttpAdapter.dump", "true");
		System.setProperty("com.sun.xml.internal.ws.transport.http.HttpAdapter.dump", "true");
	}

}
