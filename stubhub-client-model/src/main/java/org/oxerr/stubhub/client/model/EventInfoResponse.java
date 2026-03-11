package org.oxerr.stubhub.client.model;

import java.util.List;

public class EventInfoResponse {

	private EventResponse event;

	private EventMappingResponse eventMapping;

	private VenueResponse venue;

	private PerformerResponse performer;

	private List<TagResponse> tags;

	public EventResponse getEvent() {
		return event;
	}

	public void setEvent(EventResponse event) {
		this.event = event;
	}

	public EventMappingResponse getEventMapping() {
		return eventMapping;
	}

	public void setEventMapping(EventMappingResponse eventMapping) {
		this.eventMapping = eventMapping;
	}

	public VenueResponse getVenue() {
		return venue;
	}

	public void setVenue(VenueResponse venue) {
		this.venue = venue;
	}

	public PerformerResponse getPerformer() {
		return performer;
	}

	public void setPerformer(PerformerResponse performer) {
		this.performer = performer;
	}

	public List<TagResponse> getTags() {
		return tags;
	}

	public void setTags(List<TagResponse> tags) {
		this.tags = tags;
	}

}
