package org.oxerr.stubhub.client.model;

public class SectionMappingRequest {

	private String section;

	private String row;

	private Integer eventId;

	private Integer venueId;

	private Integer venueConfigId;

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

	public Integer getEventId() {
		return eventId;
	}

	public void setEventId(Integer eventId) {
		this.eventId = eventId;
	}

	public Integer getVenueId() {
		return venueId;
	}

	public void setVenueId(Integer venueId) {
		this.venueId = venueId;
	}

	public Integer getVenueConfigId() {
		return venueConfigId;
	}

	public void setVenueConfigId(Integer venueConfigId) {
		this.venueConfigId = venueConfigId;
	}

}
