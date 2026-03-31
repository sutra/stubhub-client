package org.oxerr.stubhub.client.cxf.impl;

import java.io.IOException;
import java.io.InputStream;
import java.util.Properties;
import java.util.UUID;

public final class CXFStubHubClients {

	public static CXFStubHubClient getClient() {
		Properties props = getProps();
		UUID accountId = UUID.fromString(props.getProperty("accountId"));
		String apiKey = props.getProperty("apiKey");

		return new CXFStubHubClient(accountId, apiKey);
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

}
