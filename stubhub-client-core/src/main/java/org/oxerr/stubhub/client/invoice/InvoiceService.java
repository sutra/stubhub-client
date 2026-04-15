package org.oxerr.stubhub.client.invoice;

import java.util.Iterator;
import java.util.Spliterators;
import java.util.stream.Stream;
import java.util.stream.StreamSupport;

import org.oxerr.stubhub.client.model.SaleResponse;

public interface InvoiceService {

	default Iterator<SaleResponse> iterateInvoices() {
		return iterateInvoices(new InvoiceExportCriteria());
	}

	Iterator<SaleResponse> iterateInvoices(InvoiceExportCriteria criteria);

	default Stream<SaleResponse> streamInvoices() {
		return streamInvoices(new InvoiceExportCriteria());
	}

	default Stream<SaleResponse> streamInvoices(InvoiceExportCriteria criteria) {
		var i = iterateInvoices(criteria);
		return StreamSupport.stream(Spliterators.spliteratorUnknownSize(i, 0), false);
	}

}
