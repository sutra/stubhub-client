package org.oxerr.stubhub.client.model;

import java.util.List;

public class BulkInventoryListingNotesDeleteRequest {

	private List<String> notes;

	private Long inventoryId;

	public List<String> getNotes() {
		return notes;
	}

	public void setNotes(List<String> notes) {
		this.notes = notes;
	}

	public Long getInventoryId() {
		return inventoryId;
	}

	public void setInventoryId(Long inventoryId) {
		this.inventoryId = inventoryId;
	}

}
