package org.oxerr.stubhub.client.model;

import java.math.BigDecimal;

public class CircuitBreakerSetting {

	private BigDecimal relativeCeiling;

	private BigDecimal relativeFloor;

	private BigDecimal maxDiscountVelocityPercent;

	private Long maxDiscountVelocityTicks;

	private Integer minCompListingCount;

	public BigDecimal getRelativeCeiling() {
		return relativeCeiling;
	}

	public void setRelativeCeiling(BigDecimal relativeCeiling) {
		this.relativeCeiling = relativeCeiling;
	}

	public BigDecimal getRelativeFloor() {
		return relativeFloor;
	}

	public void setRelativeFloor(BigDecimal relativeFloor) {
		this.relativeFloor = relativeFloor;
	}

	public BigDecimal getMaxDiscountVelocityPercent() {
		return maxDiscountVelocityPercent;
	}

	public void setMaxDiscountVelocityPercent(BigDecimal maxDiscountVelocityPercent) {
		this.maxDiscountVelocityPercent = maxDiscountVelocityPercent;
	}

	public Long getMaxDiscountVelocityTicks() {
		return maxDiscountVelocityTicks;
	}

	public void setMaxDiscountVelocityTicks(Long maxDiscountVelocityTicks) {
		this.maxDiscountVelocityTicks = maxDiscountVelocityTicks;
	}

	public Integer getMinCompListingCount() {
		return minCompListingCount;
	}

	public void setMinCompListingCount(Integer minCompListingCount) {
		this.minCompListingCount = minCompListingCount;
	}

}
