package org.oxerr.stubhub.client.model;

import java.util.List;

public class BulkInventoryTagsDeleteRequest {

	private List<String> names;

	private Long inventoryId;

	public List<String> getNames() {
		return names;
	}

	public void setNames(List<String> names) {
		this.names = names;
	}

	public Long getInventoryId() {
		return inventoryId;
	}

	public void setInventoryId(Long inventoryId) {
		this.inventoryId = inventoryId;
	}

}
