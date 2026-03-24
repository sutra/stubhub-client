package org.oxerr.stubhub.client.inventory;

import java.util.Iterator;
import java.util.Spliterators;
import java.util.stream.Stream;
import java.util.stream.StreamSupport;

import org.oxerr.stubhub.client.model.ListingResponse;

public interface InventoryService {

	Iterator<ListingResponse> iterateInventories(InventorySearchCriteria criteria);

	default Stream<ListingResponse> streamInventories(InventorySearchCriteria criteria) {
		var i = iterateInventories(criteria);
		return StreamSupport.stream(Spliterators.spliteratorUnknownSize(i, 0), false);
	}

	default Iterator<ListingResponse> iterateInventories() {
		return iterateInventories(new InventoryExportCriteria());
	}

	Iterator<ListingResponse> iterateInventories(InventoryExportCriteria criteria);

	default Stream<ListingResponse> streamInventories() {
		return streamInventories(new InventoryExportCriteria());
	}

	default Stream<ListingResponse> streamInventories(InventoryExportCriteria criteria) {
		var i = iterateInventories(criteria);
		return StreamSupport.stream(Spliterators.spliteratorUnknownSize(i, 0), false);
	}

}
