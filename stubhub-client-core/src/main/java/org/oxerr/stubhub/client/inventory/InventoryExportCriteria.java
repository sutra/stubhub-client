package org.oxerr.stubhub.client.inventory;

import java.time.OffsetDateTime;

public class InventoryExportCriteria {

	private OffsetDateTime updatedDateSince;

	private Integer pageSize;

	private Long paginationToken;

	private Boolean includePastEvents;

	private Boolean includeBuyerCommissionsPerTicket;

	private OffsetDateTime createDateFrom;

	private OffsetDateTime createDateTo;

	private OffsetDateTime updatedDateTo;

	public OffsetDateTime getUpdatedDateSince() {
		return updatedDateSince;
	}

	public void setUpdatedDateSince(OffsetDateTime updatedDateSince) {
		this.updatedDateSince = updatedDateSince;
	}

	public Integer getPageSize() {
		return pageSize;
	}

	public void setPageSize(Integer pageSize) {
		this.pageSize = pageSize;
	}

	public Long getPaginationToken() {
		return paginationToken;
	}

	public void setPaginationToken(Long paginationToken) {
		this.paginationToken = paginationToken;
	}

	public Boolean getIncludePastEvents() {
		return includePastEvents;
	}

	public void setIncludePastEvents(Boolean includePastEvents) {
		this.includePastEvents = includePastEvents;
	}

	public Boolean getIncludeBuyerCommissionsPerTicket() {
		return includeBuyerCommissionsPerTicket;
	}

	public void setIncludeBuyerCommissionsPerTicket(Boolean includeBuyerCommissionsPerTicket) {
		this.includeBuyerCommissionsPerTicket = includeBuyerCommissionsPerTicket;
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
