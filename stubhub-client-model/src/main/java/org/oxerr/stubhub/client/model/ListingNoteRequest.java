package org.oxerr.stubhub.client.model;

public class ListingNoteRequest {

	private String note;

	/**
	 * When true, indicates this listing note should be deleted from the ticket
	 * group. The Note text must match an existing note exactly to identify
	 * which note to delete. All notes with matching text will be deleted.
	 */
	private Boolean isDelete;

	public String getNote() {
		return note;
	}

	public void setNote(String note) {
		this.note = note;
	}

	public Boolean getIsDelete() {
		return isDelete;
	}

	public void setIsDelete(Boolean isDelete) {
		this.isDelete = isDelete;
	}

}
