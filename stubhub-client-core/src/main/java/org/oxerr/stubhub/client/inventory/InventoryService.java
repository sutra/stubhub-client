package org.oxerr.stubhub.client.inventory;

import java.util.Iterator;
import java.util.Spliterators;
import java.util.stream.Stream;
import java.util.stream.StreamSupport;

import org.oxerr.stubhub.client.model.ListingResponse;

public interface InventoryService {

	default Iterator<ListingResponse> iterateInventories() {
		return iterateInventories(new InventorySearchCriteria());
	}

	Iterator<ListingResponse> iterateInventories(InventorySearchCriteria criteria);

	default Stream<ListingResponse> streamInventories() {
		return streamInventories(new InventorySearchCriteria());
	}

	default Stream<ListingResponse> streamInventories(InventorySearchCriteria criteria) {
		var i = iterateInventories(criteria);
		return StreamSupport.stream(Spliterators.spliteratorUnknownSize(i, 0), false);
	}

}
