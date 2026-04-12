package org.oxerr.stubhub.client.model;

import org.apache.commons.lang3.builder.EqualsBuilder;
import org.apache.commons.lang3.builder.HashCodeBuilder;
import org.apache.commons.lang3.builder.ToStringBuilder;

public class ListingNoteRequest {

	private String note;

	/**
	 * When true, indicates this listing note should be deleted from the ticket
	 * group. The Note text must match an existing note exactly to identify
	 * which note to delete. All notes with matching text will be deleted.
	 */
	private Boolean isDelete;

	public ListingNoteRequest() {
	}

	public ListingNoteRequest(String note) {
		this.note = note;
	}

	public ListingNoteRequest(String note, Boolean isDelete) {
		this.note = note;
		this.isDelete = isDelete;
	}

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

	@Override
	public boolean equals(Object obj) {
		return EqualsBuilder.reflectionEquals(this, obj);
	}

	@Override
	public int hashCode() {
		return HashCodeBuilder.reflectionHashCode(this);
	}

	@Override
	public String toString() {
		return new ToStringBuilder(this).
			append("note", note).
			append("isDelete", isDelete).
			toString();
	}

}
