package org.oxerr.stubhub.client.cxf.impl.inventory;

import org.oxerr.stubhub.client.cxf.impl.util.PageIterator;
import org.oxerr.stubhub.client.model.InventoryExportResponse;
import org.oxerr.stubhub.client.model.ListingResponse;

public abstract class InventoryIterator extends PageIterator<ListingResponse> {

	protected InventoryIterator(int pageSize) {
		super(pageSize);
	}

	@Override
	protected Page<ListingResponse> fetchPage(Long paginationToken) {
		var r = fetchExportResponse(paginationToken);
		return new PageImpl(r.getPaginationToken(), r.getNumberOfItems(), r.getInventory());
	}

	protected abstract InventoryExportResponse fetchExportResponse(Long paginationToken);

}
