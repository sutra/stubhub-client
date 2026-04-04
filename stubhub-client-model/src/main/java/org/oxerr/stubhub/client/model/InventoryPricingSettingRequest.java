package org.oxerr.stubhub.client.model;

import java.math.BigDecimal;
import java.util.List;

public class InventoryPricingSettingRequest {

	/**
	 * Flag to control whether Pricing should be enabled for the current listing.
	 */
	private Boolean pricingEnabled;

	/**
	 * The minimum amount inventory can be priced at.
	 * Certain users can price below the floor if a warning is accepted.
	 */
	private BigDecimal netProceedsFloor;

	/**
	 * The maximum amount inventory can be priced at.
	 * Certain users can price above the ceiling if a warning is accepted.
	 */
	private BigDecimal netProceedsCeiling;

	/**
	 * - Simple
	 * - RowExtrapolation
	 */
	private String undercutMode;

	/**
	 * Default amount to price under a comparable listing in the currency unit
	 * of the listing. Applied after UndercutRelativeAmount.
	 */
	private BigDecimal undercutAbsoluteAmount;

	/**
	 * Default precent to price under a comparable listing.
	 * Applied before UndercutRelativeAmount.
	 */
	private BigDecimal undercutRelativeAmount;

	/**
	 * Mode to be used for comparable listings.
	 * <ul>
	 * <li>QualityScore</li>
	 * <li>SameSection</li>
	 * <li>SameZone</li>
	 * <li>SameEvent</li>
	 * </ul>
	 */
	private String compListingMode;

	/**
	 * Sets the minimum quality of listings that we be used for comparable
	 * listings.
	 */
	private BigDecimal compListingFloor;

	/**
	 * Sets the minimum quality of listings that we be used for comparable
	 * listings.
	 */
	private BigDecimal compListingCeiling;

	/**
	 * Selected section ids for filtering
	 */
	private List<Integer> sectionIdFilter;

	/**
	 * Selected row ids for filtering
	 */
	private List<Integer> rowIdFilter;

	/**
	 * Flag to control whether quantity score adjustment should be enabled
	 * for the listing.
	 */
	private Boolean quantityScoreAdjustmentEnabled;

	/**
	 * Sets the overrides json for the quantity score adjustment.
	 */
	private String quantityScoreAdjustmentOverridesJson;

	/**
	 * Flag to control whether its only enabled for the same zone.
	 */
	private Boolean onlyForSameZoneEnabled;

	/**
	 * Flag to control whether its only enabled for the selected sections.
	 */
	private Boolean onlyForSelectedSectionsEnabled;

	/**
	 * Mode to be used for outlier.
	 * <ul>
	 * <li>StandardDeviations</li>
	 * <li>KthLowest</li>
	 * <li>SkipLogic</li>
	 * </ul>
	 */
	private String outlierMode;

	/**
	 * Sets the number of standard deviations to use for outlier settings.
	 */
	private Double standardDeviations;

	/**
	 * Sets the max number of outlier listings to use for KthLowest outlier
	 * settings.
	 */
	private Integer kthLowestOutlierLimit;

	/**
	 * Sets the absolute monetary amount to use for determining the KthLowest
	 * outliers.
	 */
	private Double kthLowestAbsoluteOutlierSpacing;

	/**
	 * Sets the relative percentage amount (0-100) to use for determining
	 * the KthLowest outliers.
	 */
	private BigDecimal kthLowestRelativeOutlierSpacing;

	/**
	 * Sets the max discount velocity percent for the circuit breaker.
	 */
	private BigDecimal maxDiscountVelocityPercent;

	/**
	 * Sets the max discount velocity ticks for the circuit breaker.
	 */
	private Long maxDiscountVelocityTicks;

	/**
	 * Sets the minimum quality of listings that we be used for comparable
	 * listings.
	 */
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
