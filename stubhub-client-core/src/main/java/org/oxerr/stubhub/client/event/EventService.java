package org.oxerr.stubhub.client.event;

import java.util.List;

import org.oxerr.stubhub.client.model.ListingResponse;

public interface EventService {

	default List<ListingResponse> getInventories(Integer eventId) {
		return getInventories(new InventoryCriteria(eventId));
	}

	List<ListingResponse> getInventories(InventoryCriteria criteria);

}
