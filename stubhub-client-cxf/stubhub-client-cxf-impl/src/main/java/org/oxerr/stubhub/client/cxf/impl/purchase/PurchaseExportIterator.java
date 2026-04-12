package org.oxerr.stubhub.client.cxf.impl.purchase;

import org.oxerr.stubhub.client.cxf.impl.util.PageIterator;
import org.oxerr.stubhub.client.cxf.resource.PurchaseResource;
import org.oxerr.stubhub.client.model.PurchaseResponse;
import org.oxerr.stubhub.client.purchase.PurchaseExportCriteria;

public class PurchaseExportIterator extends PageIterator<PurchaseResponse> {

	private final PurchaseExportCriteria criteria;

	private final PurchaseResource purchaseResource;

	protected PurchaseExportIterator(PurchaseExportCriteria criteria, PurchaseResource purchaseResource) {
		super(criteria.getMaxPageSize() != null ? criteria.getMaxPageSize().intValue() : 100);
		this.criteria = criteria;
		this.purchaseResource = purchaseResource;
	}

	@Override
	protected Page<PurchaseResponse> fetchPage(Long paginationToken) {
		var r = purchaseResource.getPurchases(
			paginationToken,
			criteria.getMaxPageSize(),
			criteria.getIncludeBuyerCommissionsPerTicket(),
			criteria.getUpdatedDateSince(),
			criteria.getOnlyDeleted(),
			criteria.getDeletedState(),
			criteria.getCreateDateFrom(),
			criteria.getCreateDateTo(),
			criteria.getUpdatedDateTo()
		);
		return new PageImpl(r.getPaginationToken(), r.getNumberOfItems(), r.getPurchases());
	}

}
