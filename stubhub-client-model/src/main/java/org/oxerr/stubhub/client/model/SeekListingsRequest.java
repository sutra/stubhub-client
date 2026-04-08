package org.oxerr.stubhub.client.model;

import java.util.List;

public class SeekListingsRequest {

	private List<Long> inventoryIds;

	public SeekListingsRequest() {
	}

	public SeekListingsRequest(List<Long> inventoryIds) {
		this.inventoryIds = inventoryIds;
	}

	public List<Long> getInventoryIds() {
		return inventoryIds;
	}

	public void setInventoryIds(List<Long> inventoryIds) {
		this.inventoryIds = inventoryIds;
	}

}
