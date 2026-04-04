package org.oxerr.stubhub.client.model;

import java.math.BigDecimal;

public class UpdateListingPricingSettingsRequest {

	/**
	 * Flag to control whether auto-pricing should be enabled for the listing.
	 */
	private Boolean autoPricingEnabled;

	/**
	 * The minimum amount inventory can be priced at. Certain users can price
	 * below the floor if a warning is accepted.
	 */
	private BigDecimal netProceedsFloor;

	/**
	 * The maximum amount inventory can be priced at. Certain users can price
	 * above the ceiling if a warning is accepted.
	 */
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
