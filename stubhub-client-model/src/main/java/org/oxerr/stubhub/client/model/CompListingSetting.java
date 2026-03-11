package org.oxerr.stubhub.client.model;

import java.math.BigDecimal;

public class CompListingSetting {

	private String compListingMode;

	private BigDecimal compListingFloor;

	private BigDecimal compListingCeiling;

	private Boolean quantityScoreAdjustmentEnabled;

	private String quantityScoreAdjustmentOverridesJson;

	private Boolean onlyForSameZoneEnabled;

	private Boolean onlyForSelectedSectionsEnabled;

	public String getCompListingMode() {
		return compListingMode;
	}

	public void setCompListingMode(String compListingMode) {
		this.compListingMode = compListingMode;
	}

	public BigDecimal getCompListingFloor() {
		return compListingFloor;
	}

	public void setCompListingFloor(BigDecimal compListingFloor) {
		this.compListingFloor = compListingFloor;
	}

	public BigDecimal getCompListingCeiling() {
		return compListingCeiling;
	}

	public void setCompListingCeiling(BigDecimal compListingCeiling) {
		this.compListingCeiling = compListingCeiling;
	}

	public Boolean getQuantityScoreAdjustmentEnabled() {
		return quantityScoreAdjustmentEnabled;
	}

	public void setQuantityScoreAdjustmentEnabled(Boolean quantityScoreAdjustmentEnabled) {
		this.quantityScoreAdjustmentEnabled = quantityScoreAdjustmentEnabled;
	}

	public String getQuantityScoreAdjustmentOverridesJson() {
		return quantityScoreAdjustmentOverridesJson;
	}

	public void setQuantityScoreAdjustmentOverridesJson(String quantityScoreAdjustmentOverridesJson) {
		this.quantityScoreAdjustmentOverridesJson = quantityScoreAdjustmentOverridesJson;
	}

	public Boolean getOnlyForSameZoneEnabled() {
		return onlyForSameZoneEnabled;
	}

	public void setOnlyForSameZoneEnabled(Boolean onlyForSameZoneEnabled) {
		this.onlyForSameZoneEnabled = onlyForSameZoneEnabled;
	}

	public Boolean getOnlyForSelectedSectionsEnabled() {
		return onlyForSelectedSectionsEnabled;
	}

	public void setOnlyForSelectedSectionsEnabled(Boolean onlyForSelectedSectionsEnabled) {
		this.onlyForSelectedSectionsEnabled = onlyForSelectedSectionsEnabled;
	}

}
