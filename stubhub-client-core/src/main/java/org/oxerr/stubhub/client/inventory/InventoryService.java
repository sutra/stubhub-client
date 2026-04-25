package org.oxerr.stubhub.client.inventory;

import java.util.Iterator;
import java.util.Spliterators;
import java.util.stream.Stream;
import java.util.stream.StreamSupport;

import org.oxerr.stubhub.client.model.ListingResponse;

import io.github.resilience4j.retry.Retry;

public interface InventoryService {

	default Iterator<ListingResponse> iterateInventories(InventorySearchCriteria criteria) {
		return iterateInventories(criteria, null);
	}

	Iterator<ListingResponse> iterateInventories(InventorySearchCriteria criteria, Retry retry);

	default Stream<ListingResponse> streamInventories(InventorySearchCriteria criteria) {
		var i = iterateInventories(criteria);
		return StreamSupport.stream(Spliterators.spliteratorUnknownSize(i, 0), false);
	}

	default Iterator<ListingResponse> iterateInventories() {
		return iterateInventories(new InventoryExportCriteria());
	}

	default Iterator<ListingResponse> iterateInventories(InventoryExportCriteria criteria) {
		return iterateInventories(criteria, null);
	}

	Iterator<ListingResponse> iterateInventories(InventoryExportCriteria criteria, Retry retry);

	default Stream<ListingResponse> streamInventories() {
		return streamInventories(new InventoryExportCriteria());
	}

	default Stream<ListingResponse> streamInventories(InventoryExportCriteria criteria) {
		var i = iterateInventories(criteria);
		return StreamSupport.stream(Spliterators.spliteratorUnknownSize(i, 0), false);
	}

}
