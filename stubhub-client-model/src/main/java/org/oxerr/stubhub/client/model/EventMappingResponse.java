package org.oxerr.stubhub.client.model;

import java.time.LocalDateTime;
import java.time.OffsetDateTime;
import java.util.UUID;

public class EventMappingResponse {

	private UUID eventMappingId;

	private String eventName;

	private LocalDateTime eventDate;

	private OffsetDateTime eventDateUtc;

	private String venueName;

	private Boolean isEventDateConfirmed;

	private String eventNote;

	private String city;

	private String stateProvince;

	private String countryCode;

	private String posEventIds;

	public UUID getEventMappingId() {
		return eventMappingId;
	}

	public void setEventMappingId(UUID eventMappingId) {
		this.eventMappingId = eventMappingId;
	}

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

	public OffsetDateTime getEventDateUtc() {
		return eventDateUtc;
	}

	public void setEventDateUtc(OffsetDateTime eventDateUtc) {
		this.eventDateUtc = eventDateUtc;
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

	public String getPosEventIds() {
		return posEventIds;
	}

	public void setPosEventIds(String posEventIds) {
		this.posEventIds = posEventIds;
	}

}
