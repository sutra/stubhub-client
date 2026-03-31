package org.oxerr.stubhub.client.model;

import java.util.List;

public class InventoryExportResponse {

	private Long paginationToken;

	private Integer numberOfItems;

	private List<ListingResponse> inventory;

	private List<Long> deletedInventoryIds;

	public Long getPaginationToken() {
		return paginationToken;
	}

	public void setPaginationToken(Long paginationToken) {
		this.paginationToken = paginationToken;
	}

	public Integer getNumberOfItems() {
		return numberOfItems;
	}

	public void setNumberOfItems(Integer numberOfItems) {
		this.numberOfItems = numberOfItems;
	}

	public List<ListingResponse> getInventory() {
		return inventory;
	}

	public void setInventory(List<ListingResponse> inventory) {
		this.inventory = inventory;
	}

	public List<Long> getDeletedInventoryIds() {
		return deletedInventoryIds;
	}

	public void setDeletedInventoryIds(List<Long> deletedInventoryIds) {
		this.deletedInventoryIds = deletedInventoryIds;
	}

}
