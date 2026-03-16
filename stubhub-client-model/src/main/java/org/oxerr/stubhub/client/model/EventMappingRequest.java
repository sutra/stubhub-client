package org.oxerr.stubhub.client.model;

import java.time.LocalDateTime;

public class EventMappingRequest {

	private String eventName;

	/**
	 * Date and Time that the event start.
	 * Must be YYYY-MM-ddTHH:mm:ss format (e.g. 2000-01-01T12:00:00)
	 */
	private LocalDateTime eventDate;

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

	public LocalDateTime getEventDate() {
		return eventDate;
	}

	public void setEventDate(LocalDateTime eventDate) {
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
