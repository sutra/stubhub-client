package org.oxerr.stubhub.client.cxf.resource;

import java.time.OffsetDateTime;
import java.util.List;
import java.util.UUID;

import org.oxerr.stubhub.client.model.BulkInventoryRequest;
import org.oxerr.stubhub.client.model.BulkProcessingResultSummaryResponse;
import org.oxerr.stubhub.client.model.InventoryCreateRequest;
import org.oxerr.stubhub.client.model.InventoryExportResponse;
import org.oxerr.stubhub.client.model.InventoryUpdateRequest;
import org.oxerr.stubhub.client.model.ListingResponse;
import org.oxerr.stubhub.client.model.SearchListingsResponse;
import org.oxerr.stubhub.client.model.SeekListingsRequest;

import jakarta.ws.rs.Consumes;
import jakarta.ws.rs.DELETE;
import jakarta.ws.rs.GET;
import jakarta.ws.rs.PATCH;
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
	 *
	 * <p><b>201</b> - Created
	 * <p><b>400</b> - Bad Request
	 * <p><b>403</b> - Forbidden
	 * @param inventoryCreateRequest  (optional)
	 * @return the created inventory.
	 */
	@POST
	ListingResponse createInventory(InventoryCreateRequest inventoryCreateRequest);

	/**
	 * Get inventory by ID.
	 *
	 * <p><b>200</b> - Success
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
	 * Delete Inventory by ID (Inventory must not be connected to any purchase orders)
	 *
	 * <p><b>200</b> - Success
	 * @param inventoryId The ID of the inventory to return (required)
	 * @return the deleted inventory for the given ID.
	 */
	@DELETE
	@Path("/{inventoryId}")
	List<ListingResponse> deleteInventory(@PathParam("inventoryId") Long inventoryId);

	/**
	 * Update listing prices, barcodes, and price settings.
	 * 
	 * <p><b>400</b> - Bad Request
	 * <p><b>200</b> - Success
	 * @param inventoryId  (required)
	 * @param inventoryUpdateRequest  (optional)
	 * @return the updated inventory for the given ID.
	 */
	@PATCH
	@Path("/{inventoryId}")
	ListingResponse updateInventory(
		@PathParam("inventoryId") Long inventoryId,
		InventoryUpdateRequest inventoryUpdateRequest
	);

	/**
	 * Search inventory.
	 *
	 * <p><b>200</b> - Success
	 * @param eventIds Viagogo Event IDs to include (optional)
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

	/**
	 * Seek inventory
	 *
	 * <p><b>200</b> - Success
	 * @param inventoryIds Inventory or Listing IDs to query and return (optional)
	 * @param includeBuyerCommissionsPerTicket To include buyerCommissionsArray per Ticket. Default is false (optional)
	 * @param seekListingsRequest (optional)
	 * @return inventories.
	 */
	@GET
	@Path("/seek")
	List<SearchListingsResponse> seek(
		@QueryParam("inventoryIds") List<Long> inventoryIds,
		@QueryParam("includeBuyerCommissionsPerTicket")
		Boolean includeBuyerCommissionsPerTicket,
		SeekListingsRequest seekListingsRequest
	);

	/**
	 * Exports inventory for exchange integration. The results from this method
	 * are sorted by reverse mutation date order.
	 *
	 * <p><b>200</b> - Success
	 * @param updatedDateSince The beginning update date to be used for looking
	 * up inventory. Must be in format yyyy-MM-ddTHH:mm:ss. (optional)
	 * @param pageSize The number of results per page. (optional)
	 * Default page size is 100. Max page size is 5000. (optional)
	 * @param paginationToken Token used to paginate result set. (optional)
	 * @param includePastEvents To include inventory from past events in the
	 * results. Default is false. (optional)
	 * @param includeBuyerCommissionsPerTicket o include buyerCommissionsArray
	 * per Ticket. Default is false. (optional)
	 * @param createDateFrom The beginning create date to be used for looking
	 * up inventory. Must be in format yyyy-MM-ddTHH:mm:ss. (optional)
	 * @param createDateTo The ending create date to be used for looking up
	 * inventory. Must be in format yyyy-MM-ddTHH:mm:ss. (optional)
	 * @param updatedDateTo The ending update date to be used for looking up
	 * inventory. Must be in format yyyy-MM-ddTHH:mm:ss. (optional)
	 * @return inventories.
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
	 *
	 * <p><b>400</b> - Bad Request
	 * <p><b>200</b> - Success
	 * @param bulkInventoryRequest  (optional)
	 * @return the bulk processing result summary response which contains
	 * the bulk processing id to track the status of the bulk update request.
	 */
	@POST
	@Path("/bulk")
	BulkProcessingResultSummaryResponse bulkUpdate(
		BulkInventoryRequest bulkInventoryRequest
	);

	/**
	 * Get Bulk Update Listings Status.
	 *
	 * <p><b>200</b> - Success
	 * @param bulkProcessingId (required)
	 * @return the bulk processing result summary response which contains the status of
	 * the bulk update request and the result of the bulk update when the processing is completed.
	 */
	@GET
	@Path("/bulk/{bulkProcessingId}")
	BulkProcessingResultSummaryResponse getBulkUpdateStatus(
		@PathParam("bulkProcessingId") UUID bulkProcessingId
	);

	/**
	 * Get inventory by External ID.
	 *
	 * <p><b>200</b> - Success
	 * @param externalId The external ID of the inventory to look up (required)
	 * @param includeBuyerCommissionsPerTicket To include buyerCommissionsArray per Ticket. Default is false (optional)
	 * @return the inventory for the given External ID.
	 */
	@GET
	@Path("/external/{externalId}")
	ListingResponse getByExternalId(
		@PathParam("externalId") String externalId,
		@QueryParam("includeBuyerCommissionsPerTicket") Boolean includeBuyerCommissionsPerTicket
	);

	/**
	 * Get multiple inventories by External ID.
	 *
	 * <p><b>200</b> - Success
	 * @param externalId The external ID of the inventories to look up (required)
	 * @param includeBuyerCommissionsPerTicket To include buyerCommissionsArray per Ticket. Default is false (optional)
	 * @return the inventories for the given External ID.
	 */
	@GET
	@Path("/externals/{externalId}")
	List<ListingResponse> getByExternalIds(
		@PathParam("externalId") String externalId,
		@QueryParam("includeBuyerCommissionsPerTicket") Boolean includeBuyerCommissionsPerTicket
	);

}
