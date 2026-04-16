package org.oxerr.stubhub.client.model;

import java.util.List;

public class InventoryExportLeanResponse {

	private Long paginationToken;

	private Integer numberOfItems;

	private List<ListingLeanResponse> inventory;

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

	public List<ListingLeanResponse> getInventory() {
		return inventory;
	}

	public void setInventory(List<ListingLeanResponse> inventory) {
		this.inventory = inventory;
	}

}
