package org.oxerr.stubhub.client.model;

import java.math.BigDecimal;

public class PricingSetting {

	private Boolean pricingEnabled;

	private BigDecimal netProceedsFloor;

	private BigDecimal netProceedsCeiling;

	private UnderCutSetting underCutSetting;

	private CompListingSetting compListingSetting;

	private OutlierSetting outlierSetting;

	private CircuitBreakerSetting circuitBreakerSetting;

	private BigDecimal marketPrice;

	private String resultState;

	public Boolean getPricingEnabled() {
		return pricingEnabled;
	}

	public void setPricingEnabled(Boolean pricingEnabled) {
		this.pricingEnabled = pricingEnabled;
	}

	public BigDecimal getNetProceedsFloor() {
		return netProceedsFloor;
	}

	public void setNetProceedsFloor(BigDecimal netProceedsFloor) {
		this.netProceedsFloor = netProceedsFloor;
	}

	public BigDecimal getNetProceedsCeiling() {
		return netProceedsCeiling;
	}

	public void setNetProceedsCeiling(BigDecimal netProceedsCeiling) {
		this.netProceedsCeiling = netProceedsCeiling;
	}

	public UnderCutSetting getUnderCutSetting() {
		return underCutSetting;
	}

	public void setUnderCutSetting(UnderCutSetting underCutSetting) {
		this.underCutSetting = underCutSetting;
	}

	public CompListingSetting getCompListingSetting() {
		return compListingSetting;
	}

	public void setCompListingSetting(CompListingSetting compListingSetting) {
		this.compListingSetting = compListingSetting;
	}

	public OutlierSetting getOutlierSetting() {
		return outlierSetting;
	}

	public void setOutlierSetting(OutlierSetting outlierSetting) {
		this.outlierSetting = outlierSetting;
	}

	public CircuitBreakerSetting getCircuitBreakerSetting() {
		return circuitBreakerSetting;
	}

	public void setCircuitBreakerSetting(CircuitBreakerSetting circuitBreakerSetting) {
		this.circuitBreakerSetting = circuitBreakerSetting;
	}

	public BigDecimal getMarketPrice() {
		return marketPrice;
	}

	public void setMarketPrice(BigDecimal marketPrice) {
		this.marketPrice = marketPrice;
	}

	public String getResultState() {
		return resultState;
	}

	public void setResultState(String resultState) {
		this.resultState = resultState;
	}

}
