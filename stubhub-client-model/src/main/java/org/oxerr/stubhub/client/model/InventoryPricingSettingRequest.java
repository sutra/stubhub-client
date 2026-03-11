package org.oxerr.stubhub.client.model;

import java.math.BigDecimal;
import java.util.List;

public class InventoryPricingSettingRequest {

	private Boolean pricingEnabled;

	private BigDecimal netProceedsFloor;

	private BigDecimal netProceedsCeiling;

	private String undercutMode;

	private BigDecimal undercutAbsoluteAmount;

	private BigDecimal undercutRelativeAmount;

	private String compListingMode;

	private BigDecimal compListingFloor;

	private BigDecimal compListingCeiling;

	private List<Integer> sectionIdFilter;

	private List<Integer> rowIdFilter;

	private Boolean quantityScoreAdjustmentEnabled;

	private String quantityScoreAdjustmentOverridesJson;

	private Boolean onlyForSameZoneEnabled;

	private Boolean onlyForSelectedSectionsEnabled;

	private String outlierMode;

	private Double standardDeviations;

	private Integer kthLowestOutlierLimit;

	private Double kthLowestAbsoluteOutlierSpacing;

	private BigDecimal kthLowestRelativeOutlierSpacing;

	private BigDecimal maxDiscountVelocityPercent;

	private Long maxDiscountVelocityTicks;

	private Integer minCompListingCount;

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

	public List<Integer> getSectionIdFilter() {
		return sectionIdFilter;
	}

	public void setSectionIdFilter(List<Integer> sectionIdFilter) {
		this.sectionIdFilter = sectionIdFilter;
	}

	public List<Integer> getRowIdFilter() {
		return rowIdFilter;
	}

	public void setRowIdFilter(List<Integer> rowIdFilter) {
		this.rowIdFilter = rowIdFilter;
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

	public String getOutlierMode() {
		return outlierMode;
	}

	public void setOutlierMode(String outlierMode) {
		this.outlierMode = outlierMode;
	}

	public Double getStandardDeviations() {
		return standardDeviations;
	}

	public void setStandardDeviations(Double standardDeviations) {
		this.standardDeviations = standardDeviations;
	}

	public Integer getKthLowestOutlierLimit() {
		return kthLowestOutlierLimit;
	}

	public void setKthLowestOutlierLimit(Integer kthLowestOutlierLimit) {
		this.kthLowestOutlierLimit = kthLowestOutlierLimit;
	}

	public Double getKthLowestAbsoluteOutlierSpacing() {
		return kthLowestAbsoluteOutlierSpacing;
	}

	public void setKthLowestAbsoluteOutlierSpacing(Double kthLowestAbsoluteOutlierSpacing) {
		this.kthLowestAbsoluteOutlierSpacing = kthLowestAbsoluteOutlierSpacing;
	}

	public BigDecimal getKthLowestRelativeOutlierSpacing() {
		return kthLowestRelativeOutlierSpacing;
	}

	public void setKthLowestRelativeOutlierSpacing(BigDecimal kthLowestRelativeOutlierSpacing) {
		this.kthLowestRelativeOutlierSpacing = kthLowestRelativeOutlierSpacing;
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
