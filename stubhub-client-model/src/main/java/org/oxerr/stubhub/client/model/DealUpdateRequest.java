package org.oxerr.stubhub.client.model;

import java.math.BigDecimal;
import java.time.OffsetDateTime;

public class DealUpdateRequest {

	private String dealType;

	private OffsetDateTime startDate;

	private OffsetDateTime endDate;

	private BigDecimal guaranteedAmount;

	private DealConfigRequest dealConfig;

	public String getDealType() {
		return dealType;
	}

	public void setDealType(String dealType) {
		this.dealType = dealType;
	}

	public OffsetDateTime getStartDate() {
		return startDate;
	}

	public void setStartDate(OffsetDateTime startDate) {
		this.startDate = startDate;
	}

	public OffsetDateTime getEndDate() {
		return endDate;
	}

	public void setEndDate(OffsetDateTime endDate) {
		this.endDate = endDate;
	}

	public BigDecimal getGuaranteedAmount() {
		return guaranteedAmount;
	}

	public void setGuaranteedAmount(BigDecimal guaranteedAmount) {
		this.guaranteedAmount = guaranteedAmount;
	}

	public DealConfigRequest getDealConfig() {
		return dealConfig;
	}

	public void setDealConfig(DealConfigRequest dealConfig) {
		this.dealConfig = dealConfig;
	}

}
