package org.oxerr.stubhub.client.model;

import java.time.LocalDateTime;

public class AdminHoldResponse {

	private LocalDateTime expirationDate;

	private String notes;

	public LocalDateTime getExpirationDate() {
		return expirationDate;
	}

	public void setExpirationDate(LocalDateTime expirationDate) {
		this.expirationDate = expirationDate;
	}

	public String getNotes() {
		return notes;
	}

	public void setNotes(String notes) {
		this.notes = notes;
	}

}
