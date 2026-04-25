package org.oxerr.stubhub.client.cxf.impl.inventory;

import org.oxerr.stubhub.client.cxf.impl.util.PageIterator;
import org.oxerr.stubhub.client.model.InventoryExportResponse;
import org.oxerr.stubhub.client.model.ListingResponse;

import io.github.resilience4j.retry.Retry;

public abstract class InventoryIterator extends PageIterator<ListingResponse> {

	protected InventoryIterator(int pageSize) {
		super(pageSize);
	}

	protected InventoryIterator(int pageSize, Retry retry) {
		super(pageSize, retry);
	}

	@Override
	protected Page<ListingResponse> fetchPage(Long paginationToken) {
		var r = fetchExportResponse(paginationToken);
		return new PageImpl(r.getPaginationToken(), r.getNumberOfItems(), r.getInventory());
	}

	protected abstract InventoryExportResponse fetchExportResponse(Long paginationToken);

}
