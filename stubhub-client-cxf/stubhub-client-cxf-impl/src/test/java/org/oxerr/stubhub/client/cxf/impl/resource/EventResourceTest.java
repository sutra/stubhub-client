package org.oxerr.stubhub.client.cxf.impl.resource;

import static org.junit.jupiter.api.Assertions.assertNotNull;

import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.Test;
import org.oxerr.stubhub.client.cxf.impl.CXFStubHubClient;
import org.oxerr.stubhub.client.cxf.impl.CXFStubHubClients;
import org.oxerr.stubhub.client.cxf.resource.EventResource;

class EventResourceTest {

	private final CXFStubHubClient client = CXFStubHubClients.getClient();

	private EventResource eventResource = client.event().resource();

	@Disabled("Requires authentication")
	@Test
	void testGet() {
		var eventInfo = eventResource.get(1, null);
		assertNotNull(eventInfo);
	}

}
