package org.oxerr.stubhub.client.model;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;

/**
 * Gets or Sets ApiSaleLineItemCostType
 */
public enum ApiSaleLineItemCostType {

	CREDIT("Credit"),

	CHARGE("Charge"),

	PROCEEDS("Proceeds"),

	TAXES("Taxes");

	private String value;

	ApiSaleLineItemCostType(String value) {
		this.value = value;
	}

	@JsonValue
	public String getValue() {
		return value;
	}

	@Override
	public String toString() {
		return String.valueOf(value);
	}

	@JsonCreator
	public static ApiSaleLineItemCostType fromValue(String value) {
		for (ApiSaleLineItemCostType b : ApiSaleLineItemCostType.values()) {
			if (b.value.equals(value)) {
				return b;
			}
		}
		throw new IllegalArgumentException("Unexpected value '" + value + "'");
	}
}
