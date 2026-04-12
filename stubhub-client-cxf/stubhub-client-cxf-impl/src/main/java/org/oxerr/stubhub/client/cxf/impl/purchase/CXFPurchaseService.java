package org.oxerr.stubhub.client.cxf.impl.purchase;

import org.oxerr.stubhub.client.cxf.resource.PurchaseResource;
import org.oxerr.stubhub.client.purchase.PurchaseService;

public class CXFPurchaseService implements PurchaseService {

	private final PurchaseResource purchaseResource;

	public CXFPurchaseService(PurchaseResource purchaseResource) {
		this.purchaseResource = purchaseResource;
	}

	public PurchaseResource resource() {
		return purchaseResource;
	}

}
