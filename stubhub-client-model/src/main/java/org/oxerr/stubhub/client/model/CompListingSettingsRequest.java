package org.oxerr.stubhub.client.model;

public class CompListingSettingsRequest {

	private SectionFilterMode sectionFilterMode;

	private Integer rowOffset;

	private CompListingQuantityFiltersRequest quantityFilters;

	public SectionFilterMode getSectionFilterMode() {
		return sectionFilterMode;
	}

	public void setSectionFilterMode(SectionFilterMode sectionFilterMode) {
		this.sectionFilterMode = sectionFilterMode;
	}

	public Integer getRowOffset() {
		return rowOffset;
	}

	public void setRowOffset(Integer rowOffset) {
		this.rowOffset = rowOffset;
	}

	public CompListingQuantityFiltersRequest getQuantityFilters() {
		return quantityFilters;
	}

	public void setQuantityFilters(CompListingQuantityFiltersRequest quantityFilters) {
		this.quantityFilters = quantityFilters;
	}

}
