package org.oxerr.stubhub.client.model;

import java.math.BigDecimal;

public class UpdateListingPricingSettingsRequest {

	private Boolean autoPricingEnabled;

	private BigDecimal netProceedsFloor;

	private BigDecimal netProceedsCeiling;

	private CompListingSettingsRequest compListingSettings;

	private UndercutSettingsRequest undercutSettings;

	private OutlierSettingsRequest outlierSettings;

	public Boolean getAutoPricingEnabled() {
		return autoPricingEnabled;
	}

	public void setAutoPricingEnabled(Boolean autoPricingEnabled) {
		this.autoPricingEnabled = autoPricingEnabled;
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

	public CompListingSettingsRequest getCompListingSettings() {
		return compListingSettings;
	}

	public void setCompListingSettings(CompListingSettingsRequest compListingSettings) {
		this.compListingSettings = compListingSettings;
	}

	public UndercutSettingsRequest getUndercutSettings() {
		return undercutSettings;
	}

	public void setUndercutSettings(UndercutSettingsRequest undercutSettings) {
		this.undercutSettings = undercutSettings;
	}

	public OutlierSettingsRequest getOutlierSettings() {
		return outlierSettings;
	}

	public void setOutlierSettings(OutlierSettingsRequest outlierSettings) {
		this.outlierSettings = outlierSettings;
	}

}
