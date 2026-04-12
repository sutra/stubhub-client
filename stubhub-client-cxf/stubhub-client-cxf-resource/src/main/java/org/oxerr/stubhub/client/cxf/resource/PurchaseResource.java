package org.oxerr.stubhub.client.cxf.resource;

import org.oxerr.stubhub.client.model.PurchaseResponse;

import jakarta.ws.rs.Consumes;
import jakarta.ws.rs.GET;
import jakarta.ws.rs.Path;
import jakarta.ws.rs.PathParam;
import jakarta.ws.rs.Produces;
import jakarta.ws.rs.QueryParam;
import jakarta.ws.rs.core.MediaType;

@Path("/purchases")
@Produces(MediaType.APPLICATION_JSON)
@Consumes(MediaType.APPLICATION_JSON)
public interface PurchaseResource {

	/**
	 * Get a purchase order.
	 */
	@GET
	@Path("/{purchaseOrderId}")
	PurchaseResponse getPurchaseOrder(
		@PathParam("purchaseOrderId") Long purchaseOrderId,
		@QueryParam("includeBuyerCommissionsPerTicket") Boolean includeBuyerCommissionsPerTicket
	);

}
