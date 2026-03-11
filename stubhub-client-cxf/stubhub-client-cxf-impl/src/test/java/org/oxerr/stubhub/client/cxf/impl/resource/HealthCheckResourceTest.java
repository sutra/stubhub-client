package org.oxerr.stubhub.client.cxf.impl.resource;

import org.junit.jupiter.api.Test;
import org.oxerr.stubhub.client.cxf.impl.CXFStubHubClient;
import org.oxerr.stubhub.client.cxf.impl.CXFStubHubClients;
import org.oxerr.stubhub.client.cxf.resource.HealthCheckResource;

class HealthCheckResourceTest {

	private final CXFStubHubClient client = CXFStubHubClients.getClient();

	private HealthCheckResource healthCheckResource = client.getHealthCheckResource();

	@Test
	void testGet() {
		healthCheckResource.simple();
	}

}
