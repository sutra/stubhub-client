package org.oxerr.stubhub.client.cxf.resource;

import java.time.OffsetDateTime;

import org.oxerr.stubhub.client.model.PurchaseResponse;
import org.oxerr.stubhub.client.model.PurchaseExportResponse;

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
	 *
	 * <p><b>200</b> - Success
	 * @param purchaseOrderId  (required)
	 * @param includeBuyerCommissionsPerTicket To include buyerCommissionsArray per Ticket. Default is false (optional)
	 * @return the purchase order for the given ID.
	 */
	@GET
	@Path("/{purchaseOrderId}")
	PurchaseResponse getPurchaseOrder(
		@PathParam("purchaseOrderId") Long purchaseOrderId,
		@QueryParam("includeBuyerCommissionsPerTicket") Boolean includeBuyerCommissionsPerTicket
	);

	/**
	 * Get purchase orders.
	 *
	 * <p><b>400</b> - Bad Request
	 * <p><b>200</b> - Success
	 * @param paginationToken  (optional)
	 * @param maxPageSize  (optional)
	 * @param includeBuyerCommissionsPerTicket To include buyerCommissionsArray per Ticket. Default is false (optional)
	 * @param updatedDateSince The beginning update date to be used for looking up inventory. Must be in format yyyy-MM-ddTHH:mm:ss. (optional)
	 * @param onlyDeleted To include only deleted purchase orders. Default is false (optional)
	 * @param deletedState Optional param to filter for a specific deleted state, Cancelled or Void. (optional)
	 * @param createDateFrom The beginning create date to be used for looking up inventory. Must be in format yyyy-MM-ddTHH:mm:ss. (optional)
	 * @param createDateTo The ending create date to be used for looking up inventory. Must be in format yyyy-MM-ddTHH:mm:ss. (optional)
	 * @param updatedDateTo The ending update date to be used for looking up inventory. Must be in format yyyy-MM-ddTHH:mm:ss. (optional)
	 * @return the purchase orders matching the given criteria.
	 */
	@GET
	PurchaseExportResponse getPurchases(
		@QueryParam("paginationToken") Long paginationToken,
		@QueryParam("maxPageSize") Integer maxPageSize,
		@QueryParam("includeBuyerCommissionsPerTicket") Boolean includeBuyerCommissionsPerTicket,
		@QueryParam("updatedDateSince") OffsetDateTime updatedDateSince,
		@QueryParam("onlyDeleted") Boolean onlyDeleted,
		@QueryParam("deletedState") String deletedState,
		@QueryParam("createDateFrom") OffsetDateTime createDateFrom,
		@QueryParam("createDateTo") OffsetDateTime createDateTo,
		@QueryParam("updatedDateTo") OffsetDateTime updatedDateTo
	);

}
