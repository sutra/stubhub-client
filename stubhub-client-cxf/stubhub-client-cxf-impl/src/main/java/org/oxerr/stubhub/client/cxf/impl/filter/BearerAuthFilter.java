package org.oxerr.stubhub.client.cxf.impl.filter;

import jakarta.ws.rs.client.ClientRequestContext;
import jakarta.ws.rs.client.ClientRequestFilter;
import java.io.IOException;

public class BearerAuthFilter implements ClientRequestFilter {

	private final String apiKey;

	public BearerAuthFilter(String apiKey) {
		this.apiKey = apiKey;
	}

	@Override
	public void filter(ClientRequestContext requestContext) throws IOException {
		requestContext.getHeaders().add("Authorization", "Bearer " + apiKey);
	}

}
