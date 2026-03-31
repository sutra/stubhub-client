package org.oxerr.stubhub.client.model;

public class InventoryBarcodeUpdateRequest {

	private Long ticketId;

	private String barcode;

	public Long getTicketId() {
		return ticketId;
	}

	public void setTicketId(Long ticketId) {
		this.ticketId = ticketId;
	}

	public String getBarcode() {
		return barcode;
	}

	public void setBarcode(String barcode) {
		this.barcode = barcode;
	}

}
