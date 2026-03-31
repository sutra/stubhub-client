package org.oxerr.stubhub.client.cxf.impl.filter;

import java.io.IOException;
import java.util.UUID;

import jakarta.ws.rs.client.ClientRequestContext;
import jakarta.ws.rs.client.ClientRequestFilter;

public class BearerAuthFilter implements ClientRequestFilter {

	private final UUID accountId;

	/**
	 * JWT Authorization header using the Bearer scheme. Example: "Authorization: Bearer {token}"
	 */
	private final String token;

	public BearerAuthFilter(UUID accountId, String token) {
		this.accountId = accountId;
		this.token = token;
	}

	@Override
	public void filter(ClientRequestContext requestContext) throws IOException {
		var headers = requestContext.getHeaders();
		headers.add("Account-Id", accountId);
		headers.add("Authorization", "Bearer " + token);
	}

}
