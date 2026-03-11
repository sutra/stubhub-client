package org.oxerr.stubhub.client.model;

import java.math.BigDecimal;
import java.util.UUID;

public class BuyerCommission {

	private UUID buyerUserId;

	private BigDecimal commissionPercentage;

	public UUID getBuyerUserId() {
		return buyerUserId;
	}

	public void setBuyerUserId(UUID buyerUserId) {
		this.buyerUserId = buyerUserId;
	}

	public BigDecimal getCommissionPercentage() {
		return commissionPercentage;
	}

	public void setCommissionPercentage(BigDecimal commissionPercentage) {
		this.commissionPercentage = commissionPercentage;
	}

}
