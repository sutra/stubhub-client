package org.oxerr.stubhub.client.cxf.impl.invoice;

import java.util.Iterator;

import org.oxerr.stubhub.client.cxf.resource.InvoiceResource;
import org.oxerr.stubhub.client.invoice.InvoiceExportCriteria;
import org.oxerr.stubhub.client.invoice.InvoiceService;
import org.oxerr.stubhub.client.model.SaleResponse;

public class CXFInvoiceService implements InvoiceService {

	private final InvoiceResource invoiceResource;

	public CXFInvoiceService(InvoiceResource invoiceResource) {
		this.invoiceResource = invoiceResource;
	}

	public InvoiceResource resource() {
		return invoiceResource;
	}

	@Override
	public Iterator<SaleResponse> iterateInvoices(InvoiceExportCriteria criteria) {
		return new InvoiceExportIterator(criteria, invoiceResource);
	}

}
