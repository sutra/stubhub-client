package org.oxerr.stubhub.client.model;

import java.util.List;
import java.util.UUID;

public class BulkInventoryRequest {

	private UUID bulkProcessingId;

	private List<BulkInventoryCreateRequest> createRequests;

	private List<BulkInventoryUpdateRequest> updateRequests;

	private List<BulkInventoryDeleteRequest> deleteRequests;

	private List<BulkInventoryTagsCreateRequest> inventoryTagsCreateRequests;

	private List<BulkInventoryTagsUpdateRequest> inventoryTagsUpdateRequests;

	private List<BulkInventoryTagsDeleteRequest> inventoryTagsDeleteRequests;

	private List<BulkInventoryTagValuesCreateRequest> inventoryTagValuesCreateRequests;

	private List<BulkInventoryTagValuesDeleteRequest> inventoryTagValuesDeleteRequests;

	private List<BulkInventoryListingNotesCreateRequest> inventoryListingNotesCreateRequests;

	private List<BulkInventoryListingNotesDeleteRequest> inventoryListingNotesDeleteRequests;

	private Integer totalRequests;

	public BulkInventoryRequest() {
	}

	public BulkInventoryRequest(UUID bulkProcessingId) {
		this.bulkProcessingId = bulkProcessingId;
	}

	public UUID getBulkProcessingId() {
		return bulkProcessingId;
	}

	public void setBulkProcessingId(UUID bulkProcessingId) {
		this.bulkProcessingId = bulkProcessingId;
	}

	public List<BulkInventoryCreateRequest> getCreateRequests() {
		return createRequests;
	}

	public void setCreateRequests(List<BulkInventoryCreateRequest> createRequests) {
		this.createRequests = createRequests;
	}

	public List<BulkInventoryUpdateRequest> getUpdateRequests() {
		return updateRequests;
	}

	public void setUpdateRequests(List<BulkInventoryUpdateRequest> updateRequests) {
		this.updateRequests = updateRequests;
	}

	public List<BulkInventoryDeleteRequest> getDeleteRequests() {
		return deleteRequests;
	}

	public void setDeleteRequests(List<BulkInventoryDeleteRequest> deleteRequests) {
		this.deleteRequests = deleteRequests;
	}

	public List<BulkInventoryTagsCreateRequest> getInventoryTagsCreateRequests() {
		return inventoryTagsCreateRequests;
	}

	public void setInventoryTagsCreateRequests(List<BulkInventoryTagsCreateRequest> inventoryTagsCreateRequests) {
		this.inventoryTagsCreateRequests = inventoryTagsCreateRequests;
	}

	public List<BulkInventoryTagsUpdateRequest> getInventoryTagsUpdateRequests() {
		return inventoryTagsUpdateRequests;
	}

	public void setInventoryTagsUpdateRequests(List<BulkInventoryTagsUpdateRequest> inventoryTagsUpdateRequests) {
		this.inventoryTagsUpdateRequests = inventoryTagsUpdateRequests;
	}

	public List<BulkInventoryTagsDeleteRequest> getInventoryTagsDeleteRequests() {
		return inventoryTagsDeleteRequests;
	}

	public void setInventoryTagsDeleteRequests(List<BulkInventoryTagsDeleteRequest> inventoryTagsDeleteRequests) {
		this.inventoryTagsDeleteRequests = inventoryTagsDeleteRequests;
	}

	public List<BulkInventoryTagValuesCreateRequest> getInventoryTagValuesCreateRequests() {
		return inventoryTagValuesCreateRequests;
	}

	public void setInventoryTagValuesCreateRequests(
			List<BulkInventoryTagValuesCreateRequest> inventoryTagValuesCreateRequests) {
		this.inventoryTagValuesCreateRequests = inventoryTagValuesCreateRequests;
	}

	public List<BulkInventoryTagValuesDeleteRequest> getInventoryTagValuesDeleteRequests() {
		return inventoryTagValuesDeleteRequests;
	}

	public void setInventoryTagValuesDeleteRequests(
			List<BulkInventoryTagValuesDeleteRequest> inventoryTagValuesDeleteRequests) {
		this.inventoryTagValuesDeleteRequests = inventoryTagValuesDeleteRequests;
	}

	public List<BulkInventoryListingNotesCreateRequest> getInventoryListingNotesCreateRequests() {
		return inventoryListingNotesCreateRequests;
	}

	public void setInventoryListingNotesCreateRequests(
			List<BulkInventoryListingNotesCreateRequest> inventoryListingNotesCreateRequests) {
		this.inventoryListingNotesCreateRequests = inventoryListingNotesCreateRequests;
	}

	public List<BulkInventoryListingNotesDeleteRequest> getInventoryListingNotesDeleteRequests() {
		return inventoryListingNotesDeleteRequests;
	}

	public void setInventoryListingNotesDeleteRequests(
			List<BulkInventoryListingNotesDeleteRequest> inventoryListingNotesDeleteRequests) {
		this.inventoryListingNotesDeleteRequests = inventoryListingNotesDeleteRequests;
	}

	public Integer getTotalRequests() {
		return totalRequests;
	}

	public void setTotalRequests(Integer totalRequests) {
		this.totalRequests = totalRequests;
	}

}
