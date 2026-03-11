package org.oxerr.stubhub.client.model;

import java.time.OffsetDateTime;

public class AdminHoldResponse {

	private OffsetDateTime expirationDate;

	private String notes;

	public OffsetDateTime getExpirationDate() {
		return expirationDate;
	}

	public void setExpirationDate(OffsetDateTime expirationDate) {
		this.expirationDate = expirationDate;
	}

	public String getNotes() {
		return notes;
	}

	public void setNotes(String notes) {
		this.notes = notes;
	}

}
