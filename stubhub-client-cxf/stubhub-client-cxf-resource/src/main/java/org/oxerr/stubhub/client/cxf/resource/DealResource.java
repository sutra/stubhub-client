package org.oxerr.stubhub.client.cxf.resource;

import java.util.UUID;

import org.oxerr.stubhub.client.model.DealConfigResponse;
import org.oxerr.stubhub.client.model.DealCreateRequest;
import org.oxerr.stubhub.client.model.DealResponse;
import org.oxerr.stubhub.client.model.DealUpdateRequest;

import jakarta.ws.rs.Consumes;
import jakarta.ws.rs.DELETE;
import jakarta.ws.rs.GET;
import jakarta.ws.rs.POST;
import jakarta.ws.rs.PUT;
import jakarta.ws.rs.Path;
import jakarta.ws.rs.PathParam;
import jakarta.ws.rs.Produces;
import jakarta.ws.rs.core.MediaType;

@Path("/deals")
@Produces(MediaType.APPLICATION_JSON)
@Consumes(MediaType.APPLICATION_JSON)
public interface DealResource {

	/**
	 * Get deal by ID.
	 */
	@GET
	@Path("/{dealId}")
	DealResponse getDeal(@PathParam("dealId") UUID dealId);

	/**
	 * Update a deal.
	 */
	@PUT
	@Path("/{dealId}")
	DealResponse updateDeal(@PathParam("dealId") UUID dealId, DealUpdateRequest deal);

	/**
	 * Delete a deal.
	 */
	@DELETE
	@Path("/{dealId}")
	boolean deleteDeal(@PathParam("dealId") UUID dealId);

	/**
	 * Get deal config by ID.
	 */
	@GET
	@Path("/config/{dealConfigId}")
	DealConfigResponse getDealConfig(@PathParam("dealConfigId") UUID dealId);

	/**
	 * Delete a deal config.
	 */
	@DELETE
	@Path("/config/{dealConfigId}")
	boolean deleteDealConfig(@PathParam("dealConfigId") UUID dealConfigId);

	/**
	 * Create a deal.
	 */
	@POST
	DealResponse createDeal(DealCreateRequest deal);

}
