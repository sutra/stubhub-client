package org.oxerr.stubhub.client.model;

import java.time.LocalDateTime;
import java.util.List;

public class InvoiceExportResponse {

	private Long paginationToken;

	private Integer numberOfItems;

	private List<SaleResponse> invoices;

	private LocalDateTime maxCreatedDate;

	public Long getPaginationToken() {
		return paginationToken;
	}

	public void setPaginationToken(Long paginationToken) {
		this.paginationToken = paginationToken;
	}

	public Integer getNumberOfItems() {
		return numberOfItems;
	}

	public void setNumberOfItems(Integer numberOfItems) {
		this.numberOfItems = numberOfItems;
	}

	public List<SaleResponse> getInvoices() {
		return invoices;
	}

	public void setInvoices(List<SaleResponse> invoices) {
		this.invoices = invoices;
	}

	public LocalDateTime getMaxCreatedDate() {
		return maxCreatedDate;
	}

	public void setMaxCreatedDate(LocalDateTime maxCreatedDate) {
		this.maxCreatedDate = maxCreatedDate;
	}

}
