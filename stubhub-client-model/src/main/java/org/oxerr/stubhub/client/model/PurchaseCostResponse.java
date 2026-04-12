package org.oxerr.stubhub.client.model;

import java.math.BigDecimal;
import java.time.OffsetDateTime;

public class PurchaseCostResponse {

	private Long id;

	private ApiPurchaseCostType costType;

	private BigDecimal amount;

	private OffsetDateTime date;

	private String description;

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public ApiPurchaseCostType getCostType() {
		return costType;
	}

	public void setCostType(ApiPurchaseCostType costType) {
		this.costType = costType;
	}

	public BigDecimal getAmount() {
		return amount;
	}

	public void setAmount(BigDecimal amount) {
		this.amount = amount;
	}

	public OffsetDateTime getDate() {
		return date;
	}

	public void setDate(OffsetDateTime date) {
		this.date = date;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

}
