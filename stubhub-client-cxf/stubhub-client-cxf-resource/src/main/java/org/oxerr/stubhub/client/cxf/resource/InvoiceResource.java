package org.oxerr.stubhub.client.cxf.resource;

import java.time.OffsetDateTime;
import java.util.List;

import org.oxerr.stubhub.client.model.InvoiceExportResponse;
import org.oxerr.stubhub.client.model.SaleResponse;

import jakarta.ws.rs.Consumes;
import jakarta.ws.rs.GET;
import jakarta.ws.rs.Path;
import jakarta.ws.rs.PathParam;
import jakarta.ws.rs.Produces;
import jakarta.ws.rs.QueryParam;
import jakarta.ws.rs.core.MediaType;

@Path("/invoices")
@Produces(MediaType.APPLICATION_JSON)
@Consumes(MediaType.APPLICATION_JSON)
public interface InvoiceResource {

	/**
	 * Retrieves invoices by the marketplaceSaleId across all marketplaces
	 *
	 * <p><b>200</b> - Success
	 * @param marketplaceSaleId The sale id of the marketplace (required)
	 * @return invoices by the marketplaceSaleId across all marketplaces
	 */
	@GET
	@Path("/marketplace/{marketplaceSaleId}")
	List<SaleResponse> getInvoicesByMarketplaceSaleId(
		@PathParam("marketplaceSaleId") String marketplaceSaleId
	);

	/**
	 * Retrieves an invoice by the invoice id
	 *
	 * <p><b>400</b> - Bad Request
	 * <p><b>200</b> - Success
	 * @param invoiceId The id of the invoice (required)
	 * @param includeMarketplaceOriginalSeating To include the original requested seating from Marketplace (optional)
	 * @param includeBuyerCommissionsPerTicket To include buyerCommissionsArray per Ticket. Default is false (optional)
	 * @return an invoice by the invoice id
	 */
	@GET
	@Path("/{invoiceId}")
	SaleResponse getInvoiceById(
		@PathParam("invoiceId") Long invoiceId,
		@QueryParam("includeMarketplaceOriginalSeating") Boolean includeMarketplaceOriginalSeating,
		@QueryParam("includeBuyerCommissionsPerTicket") Boolean includeBuyerCommissionsPerTicket
	);

	/**
	 * Get all invoices with pagination. Can filter off of update date from/to and create date from/to. If none is provided, the default pagination token &#x3D; 0 will be used.
	 *
	 * <p><b>400</b> - Bad Request
	 * <p><b>200</b> - Success
	 * @param updateDateSince The beginning update date to be used for looking up invoices. Must be in the format yyyy-MM-ddTHH:mm:ss. (optional)
	 * @param updateDateTo The ending update date to be used for looking up invoices. Must be in the format yyyy-MM-ddTHH:mm:ss. (optional)
	 * @param updateDatePaginationToken Pagination token based off of update date. Cannot set updateDatePaginationToken and createDatePaginationToken both at the same time. (optional)
	 * @param createdDateFrom The beginning create date to be used for looking up invoices. Must be in the format yyyy-MM-ddTHH:mm:ss (optional)
	 * @param createdDateTo The end create date to be used for looking up invoices. Must be in the format yyyy-MM-ddTHH:mm:ss (optional)
	 * @param createdDatePaginationToken Pagination token based off of create date. Cannot set updateDatePaginationToken and createDatePaginationToken both at the same time. Can safely set createdDatePaginationToken to same value as createdDate to trigger order by create date. (optional)
	 * @param maxPageSize The maximum number of result per page. Default is 100 and Max Page Size is 5000. (optional)
	 * @param includeWastedSales To include wasted sales. Default is false (optional)
	 * @return invoices.
	 */
	@GET
	@Path("/export")
	InvoiceExportResponse export(
		@QueryParam("updateDateSince") OffsetDateTime updateDateSince,
		@QueryParam("updateDateTo") OffsetDateTime updateDateTo,
		@QueryParam("updateDatePaginationToken") Long updateDatePaginationToken,
		@QueryParam("createdDateFrom") OffsetDateTime createdDateFrom,
		@QueryParam("createdDateTo") OffsetDateTime createdDateTo,
		@QueryParam("createdDatePaginationToken") OffsetDateTime createdDatePaginationToken,
		@QueryParam("maxPageSize") Integer maxPageSize,
		@QueryParam("includeWastedSales") Boolean includeWastedSales
	);

}
