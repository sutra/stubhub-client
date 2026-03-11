package org.oxerr.stubhub.client.model;

import java.math.BigDecimal;

public class UnderCutSetting {

	private String undercutMode;

	private BigDecimal undercutAbsoluteAmount;

	private BigDecimal undercutRelativeAmount;

	public String getUndercutMode() {
		return undercutMode;
	}

	public void setUndercutMode(String undercutMode) {
		this.undercutMode = undercutMode;
	}

	public BigDecimal getUndercutAbsoluteAmount() {
		return undercutAbsoluteAmount;
	}

	public void setUndercutAbsoluteAmount(BigDecimal undercutAbsoluteAmount) {
		this.undercutAbsoluteAmount = undercutAbsoluteAmount;
	}

	public BigDecimal getUndercutRelativeAmount() {
		return undercutRelativeAmount;
	}

	public void setUndercutRelativeAmount(BigDecimal undercutRelativeAmount) {
		this.undercutRelativeAmount = undercutRelativeAmount;
	}

}
