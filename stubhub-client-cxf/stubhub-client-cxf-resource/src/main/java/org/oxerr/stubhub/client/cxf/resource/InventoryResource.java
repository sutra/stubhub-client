package org.oxerr.stubhub.client.cxf.resource;

import java.time.OffsetDateTime;
import java.util.List;
import java.util.UUID;

import org.oxerr.stubhub.client.model.BulkInventoryRequest;
import org.oxerr.stubhub.client.model.BulkProcessingResultSummaryResponse;
import org.oxerr.stubhub.client.model.InventoryCreateRequest;
import org.oxerr.stubhub.client.model.InventoryExportResponse;
import org.oxerr.stubhub.client.model.ListingResponse;
import org.oxerr.stubhub.client.model.SearchListingsResponse;

import jakarta.ws.rs.Consumes;
import jakarta.ws.rs.GET;
import jakarta.ws.rs.POST;
import jakarta.ws.rs.Path;
import jakarta.ws.rs.PathParam;
import jakarta.ws.rs.Produces;
import jakarta.ws.rs.QueryParam;
import jakarta.ws.rs.core.MediaType;

@Path("/inventory")
@Produces(MediaType.APPLICATION_JSON)
@Consumes(MediaType.APPLICATION_JSON)
public interface InventoryResource {

	/**
	 * Create inventory.
	 */
	@POST
	ListingResponse createInventory(InventoryCreateRequest listing);

	/**
	 * Get inventory by ID.
	 *
	 * @param inventoryId The ID of the inventory to return (required)
	 * @param includeBuyerCommissionsPerTicket To include buyerCommissionsArray per Ticket. Default is false (optional)
	 * @return the inventory for the given ID.
	 */
	@GET
	@Path("/{inventoryId}")
	List<ListingResponse> getInventory(
		@PathParam("inventoryId") Long inventoryId,
		@QueryParam("includeBuyerCommissionsPerTicket") Boolean includeBuyerCommissionsPerTicket
	);

	/**
	 * Search inventory.
	 *
	 * @param eventIds Viagogo Event Ids to include (optional)
	 * @param categoryIds Viagogo Event Categories to include (optional)
	 * @param includeTags Tags to include (optional)
	 * @param excludeTags Tags to exclude (optional)
	 * @param purchaseStartDate Inclusive starting purchase order date.
	 * The quantity of tickets considered for the listings will only consider
	 * tickets associated to valid purchase. (optional)
	 * @param purchaseEndDate Inclusive ending purchase order date.
	 * The quantity of tickets considered for the listings will only consider
	 * tickets associated to valid purchase. (optional)
	 * @param maxPageSize The max number of items returned per api call
	 * (default 500; min 1; max 5000) (optional)
	 * @param paginationToken Values used to continue iteration for
	 * an equivalent query where last left off (optional)
	 * @param includePastEvents To include inventory from past events in the
	 * results. Default is false (optional)
	 * @param includeBuyerCommissionsPerTicket To include buyerCommissionsArray
	 * per Ticket. Default is false (optional)
	 * @param eventMappingId  (optional)
	 * @param vendorName any purchase that match the vendor name (optional)
	 * @param eventSearchText search event name or venue name or performer name
	 * by this search text (optional)
	 * @param tagKey Tag key name (optional)
	 * @param tagValue Tag value name (optional)
	 * @return inventories.
	 */
	@GET
	@Path("/search")
	InventoryExportResponse search(
		@QueryParam("eventIds") List<Integer> eventIds,
		@QueryParam("categoryIds") List<Integer> categoryIds,
		@QueryParam("includeTags") List<String> includeTags,
		@QueryParam("excludeTags") List<String> excludeTags,
		@QueryParam("purchaseStartDate") OffsetDateTime purchaseStartDate,
		@QueryParam("purchaseEndDate") OffsetDateTime purchaseEndDate,
		@QueryParam("maxPageSize") Integer maxPageSize,
		@QueryParam("paginationToken") Long paginationToken,
		@QueryParam("includePastEvents") Boolean includePastEvents,
		@QueryParam("includeBuyerCommissionsPerTicket")
		Boolean includeBuyerCommissionsPerTicket,
		@QueryParam("eventMappingId") UUID eventMappingId,
		@QueryParam("vendorName") String vendorName,
		@QueryParam("eventSearchText") String eventSearchText,
		@QueryParam("tagKey") String tagKey,
		@QueryParam("tagValue") String tagValue
	);

	@GET
	@Path("/seek")
	List<SearchListingsResponse> seek(
		@QueryParam("inventoryIds") List<Long> inventoryIds,
		@QueryParam("includeBuyerCommissionsPerTicket")
		Boolean includeBuyerCommissionsPerTicket
	);

	/**
	 * Exports inventory for exchange integration. The results from this method
	 * are sorted by reverse mutation date order.
	 * 
	 * @param updatedDateSince The beginning update date to be used for looking
	 * up inventory. Must be in format yyyy-MM-ddTHH:mm:ss.
	 * @param pageSize The number of results per page.
	 * Default page size is 100. Max page size is 5000.
	 * @param paginationToken Token used to paginate result set.
	 * @param includePastEvents To include inventory from past events in the
	 * results. Default is false.
	 * @param includeBuyerCommissionsPerTicket o include buyerCommissionsArray
	 * per Ticket. Default is false.
	 * @param createDateFrom The beginning create date to be used for looking
	 * up inventory. Must be in format yyyy-MM-ddTHH:mm:ss.
	 * @param createDateTo The ending create date to be used for looking up
	 * inventory. Must be in format yyyy-MM-ddTHH:mm:ss.
	 * @param updatedDateTo The ending update date to be used for looking up
	 * inventory. Must be in format yyyy-MM-ddTHH:mm:ss.
	 */
	@GET
	@Path("/export")
	InventoryExportResponse export(
		@QueryParam("updatedDateSince") OffsetDateTime updatedDateSince,
		@QueryParam("pageSize") Integer pageSize,
		@QueryParam("paginationToken") Long paginationToken,
		@QueryParam("includePastEvents") Boolean includePastEvents,
		@QueryParam("includeBuyerCommissionsPerTicket") Boolean includeBuyerCommissionsPerTicket,
		@QueryParam("createDateFrom") OffsetDateTime createDateFrom,
		@QueryParam("createDateTo") OffsetDateTime createDateTo,
		@QueryParam("updatedDateTo") OffsetDateTime updatedDateTo
	);

	/**
	 * Bulk Update Listings.
	 */
	@POST
	@Path("/bulk")
	BulkProcessingResultSummaryResponse bulkUpdate(
		BulkInventoryRequest bulkInventoryRequest
	);

	/**
	 * Get Bulk Update Listings Status.
	 */
	@GET
	@Path("/bulk/{bulkProcessingId}")
	BulkProcessingResultSummaryResponse getBulkUpdateStatus(
		@PathParam("bulkProcessingId") UUID bulkProcessingId
	);

	/**
	 * Get inventory by External ID.
	 */
	@GET
	@Path("/external/{externalId}")
	ListingResponse getByExternalId(
		@PathParam("externalId") String externalId,
		@QueryParam("includeBuyerCommissionsPerTicket") Boolean includeBuyerCommissionsPerTicket
	);

	/**
	 * Get multiple inventories by External ID.
	 */
	@GET
	@Path("/externals/{externalId}")
	List<ListingResponse> getByExternalIds(
		@PathParam("externalId") String externalId,
		@QueryParam("includeBuyerCommissionsPerTicket") Boolean includeBuyerCommissionsPerTicket
	);

}
