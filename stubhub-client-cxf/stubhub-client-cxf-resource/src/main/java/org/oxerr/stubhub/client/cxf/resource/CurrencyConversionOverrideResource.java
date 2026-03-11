package org.oxerr.stubhub.client.cxf.resource;

import java.util.List;

import org.oxerr.stubhub.client.model.CurrencyConversionOverrideRequest;
import org.oxerr.stubhub.client.model.CurrencyConversionOverrideResponse;

import jakarta.ws.rs.Consumes;
import jakarta.ws.rs.DELETE;
import jakarta.ws.rs.GET;
import jakarta.ws.rs.PUT;
import jakarta.ws.rs.Path;
import jakarta.ws.rs.PathParam;
import jakarta.ws.rs.Produces;
import jakarta.ws.rs.core.MediaType;

@Path("/currencyConversionOverride")
@Produces(MediaType.APPLICATION_JSON)
@Consumes(MediaType.APPLICATION_JSON)
public interface CurrencyConversionOverrideResource {

	/**
	 * Insert or update a currency conversion override.
	 */
	@PUT
	CurrencyConversionOverrideResponse put(CurrencyConversionOverrideRequest request);

	/**
	 * Get all currency conversion overrides.
	 */
	@GET
	List<CurrencyConversionOverrideResponse> get();

	/**
	 * Delete a currency conversion override.
	 */
	@DELETE
	@Path("/{currencyConversionOverrideId}")
	void delete(@PathParam("currencyConversionOverrideId") Long currencyConversionOverrideId);

}
