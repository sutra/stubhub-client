package org.oxerr.stubhub.client.cxf.resource;

import org.oxerr.stubhub.client.model.HoldRequest;
import org.oxerr.stubhub.client.model.HoldResponse;

import jakarta.ws.rs.Consumes;
import jakarta.ws.rs.DELETE;
import jakarta.ws.rs.GET;
import jakarta.ws.rs.PATCH;
import jakarta.ws.rs.POST;
import jakarta.ws.rs.Path;
import jakarta.ws.rs.PathParam;
import jakarta.ws.rs.Produces;
import jakarta.ws.rs.core.MediaType;

@Path("/holds")
@Produces(MediaType.APPLICATION_JSON)
@Consumes(MediaType.APPLICATION_JSON)
public interface HoldResource {

	/**
	 * Retrieves hold by hold ID.
	 * 
	 * @param holdId The id of the hold.
	 */
	@GET
	@Path("/{holdId}")
	HoldResponse getHoldByHoldId(@PathParam("holdId") Long holdId);

	/**
	 * Update a hold.
	 */
	@PATCH
	@Path("/{holdId}")
	HoldResponse updateHold(@PathParam("holdId") Long holdId, HoldRequest hold);

	/**
	 * Delete hold.
	 * 
	 * @param holdId The hold ID to be deleted.
	 */
	@DELETE
	@Path("/{holdId}")
	void deleteHold(@PathParam("holdId") Long holdId);

	/**
	 * Retrieves holds.
	 */
	@GET
	HoldResponse[] getHolds();

	/**
	 * Create hold.
	 * @param hold the hold to be created.
	 */
	@POST
	HoldResponse createHold(HoldRequest hold);
	
	/**
	 * Retrieves a hold by the marketplaceName and marketplaceSaleId.
	 * 
	 * @param marketplaceSaleId The marketplaceSaleId of the hold.
	 * @param marketplace The name of the market place.
	 */
	@GET
	@Path("/holds/{marketplaceSaleId}/{marketplace}")
	HoldResponse getHoldByMarketplaceSaleIdAndMarketplace(
		@PathParam("marketplaceSaleId") String marketplaceSaleId,
		@PathParam("marketplace") String marketplace
	);

}
