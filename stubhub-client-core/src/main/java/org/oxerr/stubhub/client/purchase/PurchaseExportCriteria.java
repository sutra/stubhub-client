package org.oxerr.stubhub.client.purchase;

import java.time.OffsetDateTime;

public class PurchaseExportCriteria {

	private Long paginationToken;

	private Integer maxPageSize;

	private Boolean includeBuyerCommissionsPerTicket;

	private OffsetDateTime updatedDateSince;

	private Boolean onlyDeleted;

	private String deletedState;

	private OffsetDateTime createDateFrom;

	private OffsetDateTime createDateTo;

	private OffsetDateTime updatedDateTo;

	public Long getPaginationToken() {
		return paginationToken;
	}

	public void setPaginationToken(Long paginationToken) {
		this.paginationToken = paginationToken;
	}

	public Integer getMaxPageSize() {
		return maxPageSize;
	}

	public void setMaxPageSize(Integer maxPageSize) {
		this.maxPageSize = maxPageSize;
	}

	public Boolean getIncludeBuyerCommissionsPerTicket() {
		return includeBuyerCommissionsPerTicket;
	}

	public void setIncludeBuyerCommissionsPerTicket(Boolean includeBuyerCommissionsPerTicket) {
		this.includeBuyerCommissionsPerTicket = includeBuyerCommissionsPerTicket;
	}

	public OffsetDateTime getUpdatedDateSince() {
		return updatedDateSince;
	}

	public void setUpdatedDateSince(OffsetDateTime updatedDateSince) {
		this.updatedDateSince = updatedDateSince;
	}

	public Boolean getOnlyDeleted() {
		return onlyDeleted;
	}

	public void setOnlyDeleted(Boolean onlyDeleted) {
		this.onlyDeleted = onlyDeleted;
	}

	public String getDeletedState() {
		return deletedState;
	}

	public void setDeletedState(String deletedState) {
		this.deletedState = deletedState;
	}

	public OffsetDateTime getCreateDateFrom() {
		return createDateFrom;
	}

	public void setCreateDateFrom(OffsetDateTime createDateFrom) {
		this.createDateFrom = createDateFrom;
	}

	public OffsetDateTime getCreateDateTo() {
		return createDateTo;
	}

	public void setCreateDateTo(OffsetDateTime createDateTo) {
		this.createDateTo = createDateTo;
	}

	public OffsetDateTime getUpdatedDateTo() {
		return updatedDateTo;
	}

	public void setUpdatedDateTo(OffsetDateTime updatedDateTo) {
		this.updatedDateTo = updatedDateTo;
	}

}
