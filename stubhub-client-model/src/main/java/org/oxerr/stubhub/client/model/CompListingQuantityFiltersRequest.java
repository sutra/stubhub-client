package org.oxerr.stubhub.client.model;

import java.util.List;

public class CompListingQuantityFiltersRequest {

	/**
	 * Exact quantities to filter comparable listings by.
	 */
	private List<Integer> exactQuantities;

	/**
	 * Minimum quantity to filter comparable listings by.
	 */
	private Integer greaterThanOrEqualToQuantity;

	public List<Integer> getExactQuantities() {
		return exactQuantities;
	}

	public void setExactQuantities(List<Integer> exactQuantities) {
		this.exactQuantities = exactQuantities;
	}

	public Integer getGreaterThanOrEqualToQuantity() {
		return greaterThanOrEqualToQuantity;
	}

	public void setGreaterThanOrEqualToQuantity(Integer greaterThanOrEqualToQuantity) {
		this.greaterThanOrEqualToQuantity = greaterThanOrEqualToQuantity;
	}

}
