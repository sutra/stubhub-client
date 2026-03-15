package org.oxerr.stubhub.client.model;

public class InventoryTicketExternalIdUpdateRequest {

	private Long ticketId;

	private String ticketExternalId;

	public Long getTicketId() {
		return ticketId;
	}

	public void setTicketId(Long ticketId) {
		this.ticketId = ticketId;
	}

	public String getTicketExternalId() {
		return ticketExternalId;
	}

	public void setTicketExternalId(String ticketExternalId) {
		this.ticketExternalId = ticketExternalId;
	}

}
