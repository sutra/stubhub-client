package org.oxerr.stubhub.client.model;

import java.math.BigDecimal;

public class OutlierSetting {

	private String outlierMode;

	private BigDecimal standardDeviations;

	private Integer kthLowestOutlierLimit;

	private BigDecimal kthLowestAbsoluteOutlierSpacing;

	private BigDecimal kthLowestRelativeOutlierSpacing;

	public String getOutlierMode() {
		return outlierMode;
	}

	public void setOutlierMode(String outlierMode) {
		this.outlierMode = outlierMode;
	}

	public BigDecimal getStandardDeviations() {
		return standardDeviations;
	}

	public void setStandardDeviations(BigDecimal standardDeviations) {
		this.standardDeviations = standardDeviations;
	}

	public Integer getKthLowestOutlierLimit() {
		return kthLowestOutlierLimit;
	}

	public void setKthLowestOutlierLimit(Integer kthLowestOutlierLimit) {
		this.kthLowestOutlierLimit = kthLowestOutlierLimit;
	}

	public BigDecimal getKthLowestAbsoluteOutlierSpacing() {
		return kthLowestAbsoluteOutlierSpacing;
	}

	public void setKthLowestAbsoluteOutlierSpacing(BigDecimal kthLowestAbsoluteOutlierSpacing) {
		this.kthLowestAbsoluteOutlierSpacing = kthLowestAbsoluteOutlierSpacing;
	}

	public BigDecimal getKthLowestRelativeOutlierSpacing() {
		return kthLowestRelativeOutlierSpacing;
	}

	public void setKthLowestRelativeOutlierSpacing(BigDecimal kthLowestRelativeOutlierSpacing) {
		this.kthLowestRelativeOutlierSpacing = kthLowestRelativeOutlierSpacing;
	}

}
