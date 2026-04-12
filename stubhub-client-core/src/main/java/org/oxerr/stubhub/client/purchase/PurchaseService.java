package org.oxerr.stubhub.client.purchase;

import java.util.Iterator;
import java.util.Spliterators;
import java.util.stream.Stream;
import java.util.stream.StreamSupport;

import org.oxerr.stubhub.client.model.PurchaseResponse;

public interface PurchaseService {

	Iterator<PurchaseResponse> iteratePurchases(PurchaseExportCriteria criteria);

	default Stream<PurchaseResponse> streamPurchases() {
		return streamPurchases(new PurchaseExportCriteria());
	}

	default Stream<PurchaseResponse> streamPurchases(PurchaseExportCriteria criteria) {
		var i = iteratePurchases(criteria);
		return StreamSupport.stream(Spliterators.spliteratorUnknownSize(i, 0), false);
	}

}
