package org.oxerr.stubhub.client.model;

public class ListingNoteResponse {

	private Integer id;

	private String note;

	private String untranslatedNote;

	private String type;

	private Integer stubhubListingNoteId;

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getNote() {
		return note;
	}

	public void setNote(String note) {
		this.note = note;
	}

	public String getUntranslatedNote() {
		return untranslatedNote;
	}

	public void setUntranslatedNote(String untranslatedNote) {
		this.untranslatedNote = untranslatedNote;
	}

	public String getType() {
		return type;
	}

	public void setType(String type) {
		this.type = type;
	}

	public Integer getStubhubListingNoteId() {
		return stubhubListingNoteId;
	}

	public void setStubhubListingNoteId(Integer stubhubListingNoteId) {
		this.stubhubListingNoteId = stubhubListingNoteId;
	}

}
