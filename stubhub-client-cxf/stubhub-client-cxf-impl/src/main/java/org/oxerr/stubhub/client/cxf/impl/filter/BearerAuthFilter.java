package org.oxerr.stubhub.client.cxf.impl.filter;

import java.io.IOException;
import java.util.UUID;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import jakarta.ws.rs.client.ClientRequestContext;
import jakarta.ws.rs.client.ClientRequestFilter;

public class BearerAuthFilter implements ClientRequestFilter {

	private final Logger log = LogManager.getLogger();

	private final UUID accountId;

	private final String apiKey;

	public BearerAuthFilter(UUID accountId, String apiKey) {
		this.accountId = accountId;
		this.apiKey = apiKey;
	}

	@Override
	public void filter(ClientRequestContext requestContext) throws IOException {
		var headers = requestContext.getHeaders();
		headers.add("Account-Id", accountId);
		headers.add("Authorization", "Bearer " + apiKey);

		log.trace("Added headers: Account-Id={}, Authorization=Bearer {}", accountId, apiKey);

	}

}
