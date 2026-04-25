package org.oxerr.stubhub.client.invoice;

import java.time.OffsetDateTime;

public class InvoiceExportCriteria {

	private OffsetDateTime updateDateSince;

	private OffsetDateTime updateDateTo;

	private Long updateDatePaginationToken;

	private OffsetDateTime createdDateFrom;

	private OffsetDateTime createdDateTo;

	private OffsetDateTime createdDatePaginationToken;

	private Integer maxPageSize;

	private Boolean includeWastedSales;

	public OffsetDateTime getUpdateDateSince() {
		return updateDateSince;
	}

	public void setUpdateDateSince(OffsetDateTime updateDateSince) {
		this.updateDateSince = updateDateSince;
	}

	public OffsetDateTime getUpdateDateTo() {
		return updateDateTo;
	}

	public void setUpdateDateTo(OffsetDateTime updateDateTo) {
		this.updateDateTo = updateDateTo;
	}

	public Long getUpdateDatePaginationToken() {
		return updateDatePaginationToken;
	}

	public void setUpdateDatePaginationToken(Long updateDatePaginationToken) {
		this.updateDatePaginationToken = updateDatePaginationToken;
	}

	public OffsetDateTime getCreatedDateFrom() {
		return createdDateFrom;
	}

	public void setCreatedDateFrom(OffsetDateTime createdDateFrom) {
		this.createdDateFrom = createdDateFrom;
	}

	public OffsetDateTime getCreatedDateTo() {
		return createdDateTo;
	}

	public void setCreatedDateTo(OffsetDateTime createdDateTo) {
		this.createdDateTo = createdDateTo;
	}

	public OffsetDateTime getCreatedDatePaginationToken() {
		return createdDatePaginationToken;
	}

	public void setCreatedDatePaginationToken(OffsetDateTime createdDatePaginationToken) {
		this.createdDatePaginationToken = createdDatePaginationToken;
	}

	public Integer getMaxPageSize() {
		return maxPageSize;
	}

	public void setMaxPageSize(Integer maxPageSize) {
		this.maxPageSize = maxPageSize;
	}

	public Boolean getIncludeWastedSales() {
		return includeWastedSales;
	}

	public void setIncludeWastedSales(Boolean includeWastedSales) {
		this.includeWastedSales = includeWastedSales;
	}

}
