package org.oxerr.stubhub.client.cxf.impl.invoice;

import org.oxerr.stubhub.client.cxf.impl.util.PageIterator;
import org.oxerr.stubhub.client.cxf.resource.InvoiceResource;
import org.oxerr.stubhub.client.invoice.InvoiceExportCriteria;
import org.oxerr.stubhub.client.model.SaleResponse;

import io.github.resilience4j.retry.Retry;

public class InvoiceExportIterator extends PageIterator<SaleResponse> {

	private final InvoiceExportCriteria criteria;

	private final InvoiceResource invoiceResource;

	protected InvoiceExportIterator(InvoiceExportCriteria criteria, InvoiceResource invoiceResource) {
		super(criteria.getMaxPageSize() != null ? criteria.getMaxPageSize().intValue() : 100);
		this.criteria = criteria;
		this.invoiceResource = invoiceResource;
	}

	protected InvoiceExportIterator(InvoiceExportCriteria criteria, InvoiceResource invoiceResource, Retry retry) {
		super(criteria.getMaxPageSize() != null ? criteria.getMaxPageSize().intValue() : 100, retry);
		this.criteria = criteria;
		this.invoiceResource = invoiceResource;
	}

	@Override
	protected Page<SaleResponse> fetchPage(Long paginationToken) {
		var r = invoiceResource.export(
			criteria.getUpdateDateSince(),
			criteria.getUpdateDateTo(),
			paginationToken,
			criteria.getCreatedDateFrom(),
			criteria.getCreatedDateTo(),
			criteria.getCreatedDatePaginationToken(),
			criteria.getMaxPageSize(),
			criteria.getIncludeWastedSales()
		);
		return new PageImpl(r.getPaginationToken(), r.getNumberOfItems(), r.getInvoices());
	}

}
