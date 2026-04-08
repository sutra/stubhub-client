package org.oxerr.stubhub.client.model;

public class MarketplaceSeatingOverrideUpdateRequest {

	private ApiMarketplace marketplace;

	/**
	 * Section override info
	 */
	private String section;

	/**
	 * Row override info
	 */
	private String row;

	/**
	 * Seat override info. May contain mulitple seats as a comma separated list.
	 */
	private String seats;

	public ApiMarketplace getMarketplace() {
		return marketplace;
	}

	public void setMarketplace(ApiMarketplace marketplace) {
		this.marketplace = marketplace;
	}

	public String getSection() {
		return section;
	}

	public void setSection(String section) {
		this.section = section;
	}

	public String getRow() {
		return row;
	}

	public void setRow(String row) {
		this.row = row;
	}

	public String getSeats() {
		return seats;
	}

	public void setSeats(String seats) {
		this.seats = seats;
	}

}
