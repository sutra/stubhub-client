package org.oxerr.stubhub.client.cxf.impl.event;

import java.util.List;

import org.oxerr.stubhub.client.cxf.resource.EventResource;
import org.oxerr.stubhub.client.event.EventService;
import org.oxerr.stubhub.client.event.InventoryCriteria;
import org.oxerr.stubhub.client.model.ListingResponse;

public class CXFEventService implements EventService {

	private final EventResource eventResource;

	public CXFEventService(EventResource eventResource) {
		this.eventResource = eventResource;
	}

	public EventResource resource() {
		return eventResource;
	}

	@Override
	public List<ListingResponse> getInventories(InventoryCriteria criteria) {
		return eventResource.getInventories(
			criteria.getEventId(),
			criteria.getSection(),
			criteria.getRow(),
			criteria.getSeat(),
			criteria.getIncludeBuyerCommissionsPerTicket(),
			criteria.getIncludePastEvents()
		);
	}

}
