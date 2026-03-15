package org.oxerr.stubhub.client.model;

import java.util.List;

public class BulkInventoryTagValuesDeleteRequest {

	private List<String> values;

	private Long inventoryId;

	private String tagName;

	public List<String> getValues() {
		return values;
	}

	public void setValues(List<String> values) {
		this.values = values;
	}

	public Long getInventoryId() {
		return inventoryId;
	}

	public void setInventoryId(Long inventoryId) {
		this.inventoryId = inventoryId;
	}

	public String getTagName() {
		return tagName;
	}

	public void setTagName(String tagName) {
		this.tagName = tagName;
	}

}
