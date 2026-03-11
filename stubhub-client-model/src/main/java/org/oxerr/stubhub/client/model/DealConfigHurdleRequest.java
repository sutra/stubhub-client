package org.oxerr.stubhub.client.model;

import java.math.BigDecimal;
import java.util.List;
import java.util.UUID;

public class DealConfigHurdleRequest {

	private UUID hurdleId;

	private String splitThresholdDirectionType;

	private BigDecimal splitThresholdValue;

	private UUID vendorAccountId;

	private BigDecimal vendorsCommission;

	private List<BuyerCommissionRequest> purchasersCommissions;

	private Boolean isFallback;

	private Integer priority;

	public UUID getHurdleId() {
		return hurdleId;
	}

	public void setHurdleId(UUID hurdleId) {
		this.hurdleId = hurdleId;
	}

	public String getSplitThresholdDirectionType() {
		return splitThresholdDirectionType;
	}

	public void setSplitThresholdDirectionType(String splitThresholdDirectionType) {
		this.splitThresholdDirectionType = splitThresholdDirectionType;
	}

	public BigDecimal getSplitThresholdValue() {
		return splitThresholdValue;
	}

	public void setSplitThresholdValue(BigDecimal splitThresholdValue) {
		this.splitThresholdValue = splitThresholdValue;
	}

	public UUID getVendorAccountId() {
		return vendorAccountId;
	}

	public void setVendorAccountId(UUID vendorAccountId) {
		this.vendorAccountId = vendorAccountId;
	}

	public BigDecimal getVendorsCommission() {
		return vendorsCommission;
	}

	public void setVendorsCommission(BigDecimal vendorsCommission) {
		this.vendorsCommission = vendorsCommission;
	}

	public List<BuyerCommissionRequest> getPurchasersCommissions() {
		return purchasersCommissions;
	}

	public void setPurchasersCommissions(List<BuyerCommissionRequest> purchasersCommissions) {
		this.purchasersCommissions = purchasersCommissions;
	}

	public Boolean getIsFallback() {
		return isFallback;
	}

	public void setIsFallback(Boolean isFallback) {
		this.isFallback = isFallback;
	}

	public Integer getPriority() {
		return priority;
	}

	public void setPriority(Integer priority) {
		this.priority = priority;
	}

}
