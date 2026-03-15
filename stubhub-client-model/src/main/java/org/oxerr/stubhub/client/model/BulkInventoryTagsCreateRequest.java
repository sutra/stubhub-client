package org.oxerr.stubhub.client.model;

import java.util.List;

public class BulkInventoryTagsCreateRequest {

	private List<TagRequest> tags;

	private Long inventoryId;

	public List<TagRequest> getTags() {
		return tags;
	}

	public void setTags(List<TagRequest> tags) {
		this.tags = tags;
	}

	public Long getInventoryId() {
		return inventoryId;
	}

	public void setInventoryId(Long inventoryId) {
		this.inventoryId = inventoryId;
	}

}
