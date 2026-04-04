package org.oxerr.stubhub.client.model;

import java.time.LocalDateTime;

public class InventoryAdminHoldRequest {

	/**
	 * DateTime in UTC that the admin hold will expire.
	 * Must be YYYY-MM-ddTHH:mm:ss format (e.g. 2000-01-01T12:00:00)
	 */
	private LocalDateTime expirationDate;

	/**
	 * Admin notes with 4000 characters limit.
	 */
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
