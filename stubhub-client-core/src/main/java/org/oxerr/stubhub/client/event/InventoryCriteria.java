package org.oxerr.stubhub.client.event;

public class InventoryCriteria {

	private Integer eventId;

	private String section;

	private String row;

	private String seat;

	private Boolean includeBuyerCommissionsPerTicket;

	private Boolean includePastEvents;

	public InventoryCriteria() {
	}

	public InventoryCriteria(Integer eventId) {
		this.eventId = eventId;
	}

	public Integer getEventId() {
		return eventId;
	}

	public void setEventId(Integer eventId) {
		this.eventId = eventId;
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

	public String getSeat() {
		return seat;
	}

	public void setSeat(String seat) {
		this.seat = seat;
	}

	public Boolean getIncludeBuyerCommissionsPerTicket() {
		return includeBuyerCommissionsPerTicket;
	}

	public void setIncludeBuyerCommissionsPerTicket(Boolean includeBuyerCommissionsPerTicket) {
		this.includeBuyerCommissionsPerTicket = includeBuyerCommissionsPerTicket;
	}

	public Boolean getIncludePastEvents() {
		return includePastEvents;
	}

	public void setIncludePastEvents(Boolean includePastEvents) {
		this.includePastEvents = includePastEvents;
	}

}
