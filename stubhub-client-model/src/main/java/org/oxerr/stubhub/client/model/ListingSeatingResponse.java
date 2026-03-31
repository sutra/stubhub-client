package org.oxerr.stubhub.client.model;

public class ListingSeatingResponse {

	private String section;

	private String row;

	private String piggybackRow;

	private String seatFrom;

	private String seatTo;

	private String maxDisplaySeatFrom;

	private String maxDisplaySeatTo;

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

	public String getPiggybackRow() {
		return piggybackRow;
	}

	public void setPiggybackRow(String piggybackRow) {
		this.piggybackRow = piggybackRow;
	}

	public String getSeatFrom() {
		return seatFrom;
	}

	public void setSeatFrom(String seatFrom) {
		this.seatFrom = seatFrom;
	}

	public String getSeatTo() {
		return seatTo;
	}

	public void setSeatTo(String seatTo) {
		this.seatTo = seatTo;
	}

	public String getMaxDisplaySeatFrom() {
		return maxDisplaySeatFrom;
	}

	public void setMaxDisplaySeatFrom(String maxDisplaySeatFrom) {
		this.maxDisplaySeatFrom = maxDisplaySeatFrom;
	}

	public String getMaxDisplaySeatTo() {
		return maxDisplaySeatTo;
	}

	public void setMaxDisplaySeatTo(String maxDisplaySeatTo) {
		this.maxDisplaySeatTo = maxDisplaySeatTo;
	}

}
