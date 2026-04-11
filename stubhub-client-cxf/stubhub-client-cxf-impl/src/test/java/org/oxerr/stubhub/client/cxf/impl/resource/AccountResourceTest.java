package org.oxerr.stubhub.client.cxf.impl.resource;

import static org.junit.jupiter.api.Assertions.assertNotNull;
import static org.junit.jupiter.api.Assertions.assertTrue;

import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.Test;
import org.oxerr.stubhub.client.cxf.impl.CXFStubHubClient;
import org.oxerr.stubhub.client.cxf.impl.CXFStubHubClients;
import org.oxerr.stubhub.client.cxf.resource.AccountResource;
import org.oxerr.stubhub.client.model.SellerAccountResponse;

class AccountResourceTest {

	private final CXFStubHubClient client = CXFStubHubClients.getClient();

	private final AccountResource accountResource = client.getAccountResource();

	@Disabled("Requires a valid api key.")
	@Test
	void testGet() {
		SellerAccountResponse sa = accountResource.get().get(0);
		assertNotNull(sa.getSellerAccountId());
		assertTrue(sa.getSellerAccountName().startsWith("sandbox."));
	}

}
