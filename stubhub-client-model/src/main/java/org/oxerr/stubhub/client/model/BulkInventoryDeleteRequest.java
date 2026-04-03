package org.oxerr.stubhub.client.model;

public class BulkInventoryDeleteRequest {

	private Long inventoryId;

	public BulkInventoryDeleteRequest() {
	}

	public BulkInventoryDeleteRequest(Long inventoryId) {
		this.inventoryId = inventoryId;
	}

	public Long getInventoryId() {
		return inventoryId;
	}

	public void setInventoryId(Long inventoryId) {
		this.inventoryId = inventoryId;
	}

}
