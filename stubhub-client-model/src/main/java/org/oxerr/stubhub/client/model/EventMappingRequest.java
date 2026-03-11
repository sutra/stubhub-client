package org.oxerr.stubhub.client.model;

public class EventMappingRequest {

	private String eventName;

	private String eventDate;

	private String venueName;

	private Boolean isEventDateConfirmed;

	private String eventNote;

	private String city;

	private String stateProvince;

	private String countryCode;

	public String getEventName() {
		return eventName;
	}

	public void setEventName(String eventName) {
		this.eventName = eventName;
	}

	public String getEventDate() {
		return eventDate;
	}

	public void setEventDate(String eventDate) {
		this.eventDate = eventDate;
	}

	public String getVenueName() {
		return venueName;
	}

	public void setVenueName(String venueName) {
		this.venueName = venueName;
	}

	public Boolean getIsEventDateConfirmed() {
		return isEventDateConfirmed;
	}

	public void setIsEventDateConfirmed(Boolean isEventDateConfirmed) {
		this.isEventDateConfirmed = isEventDateConfirmed;
	}

	public String getEventNote() {
		return eventNote;
	}

	public void setEventNote(String eventNote) {
		this.eventNote = eventNote;
	}

	public String getCity() {
		return city;
	}

	public void setCity(String city) {
		this.city = city;
	}

	public String getStateProvince() {
		return stateProvince;
	}

	public void setStateProvince(String stateProvince) {
		this.stateProvince = stateProvince;
	}

	public String getCountryCode() {
		return countryCode;
	}

	public void setCountryCode(String countryCode) {
		this.countryCode = countryCode;
	}

}
