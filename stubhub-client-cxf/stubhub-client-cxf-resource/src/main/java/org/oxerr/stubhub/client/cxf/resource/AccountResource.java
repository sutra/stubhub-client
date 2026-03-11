package org.oxerr.stubhub.client.cxf.resource;

import java.util.List;
import java.util.UUID;

import org.oxerr.stubhub.client.model.SellerAccountResponse;
import org.oxerr.stubhub.client.model.SellerUserResponse;

import jakarta.ws.rs.Consumes;
import jakarta.ws.rs.GET;
import jakarta.ws.rs.Path;
import jakarta.ws.rs.Produces;
import jakarta.ws.rs.core.MediaType;

@Path("/")
@Produces(MediaType.APPLICATION_JSON)
@Consumes(MediaType.APPLICATION_JSON)
public interface AccountResource {

	/**
	 * Retrieve available accounts for the user.
	 */
	@GET
	@Path("/accounts")
	List<SellerAccountResponse> get();

	/**
	 * Get information for POS users using IDs.
	 */
	@GET
	@Path("/posusers")
	List<SellerUserResponse> posusers(List<UUID> ids);

}
