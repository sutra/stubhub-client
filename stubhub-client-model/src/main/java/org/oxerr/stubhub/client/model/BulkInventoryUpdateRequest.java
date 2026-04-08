package org.oxerr.stubhub.client.model;

public class BulkInventoryUpdateRequest extends InventoryUpdateRequest {

	private Long inventoryId;

	public BulkInventoryUpdateRequest() {
	}

	public BulkInventoryUpdateRequest(Long inventoryId) {
		this.inventoryId = inventoryId;
	}

	public Long getInventoryId() {
		return inventoryId;
	}

	public void setInventoryId(Long inventoryId) {
		this.inventoryId = inventoryId;
	}

}
