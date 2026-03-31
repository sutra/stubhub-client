package org.oxerr.stubhub.client.model;

import java.time.LocalDateTime;

public class EventResponse {

	private Integer id;

	private String name;

	private LocalDateTime date;

	private String venue;

	private Boolean dateConfirmed;

	private Boolean timeConfirmed;

	private String posEventIds;

	private String eventStatus;

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public LocalDateTime getDate() {
		return date;
	}

	public void setDate(LocalDateTime date) {
		this.date = date;
	}

	public String getVenue() {
		return venue;
	}

	public void setVenue(String venue) {
		this.venue = venue;
	}

	public Boolean getDateConfirmed() {
		return dateConfirmed;
	}

	public void setDateConfirmed(Boolean dateConfirmed) {
		this.dateConfirmed = dateConfirmed;
	}

	public Boolean getTimeConfirmed() {
		return timeConfirmed;
	}

	public void setTimeConfirmed(Boolean timeConfirmed) {
		this.timeConfirmed = timeConfirmed;
	}

	public String getPosEventIds() {
		return posEventIds;
	}

	public void setPosEventIds(String posEventIds) {
		this.posEventIds = posEventIds;
	}

	public String getEventStatus() {
		return eventStatus;
	}

	public void setEventStatus(String eventStatus) {
		this.eventStatus = eventStatus;
	}

}
