package org.oxerr.stubhub.client.model;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;

/**
 * Gets or Sets ApiPurchaseCostType
 */
public enum ApiPurchaseCostType {

	TAX("Tax"),

	SHIPPING("Shipping"),

	CREDIT_CARD_FEE("CreditCardFee"),

	BULK_DISCOUNT("BulkDiscount"),

	CANCELLED("Cancelled"),

	OTHER("Other");

	private String value;

	ApiPurchaseCostType(String value) {
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
	public static ApiPurchaseCostType fromValue(String value) {
		for (ApiPurchaseCostType b : ApiPurchaseCostType.values()) {
			if (b.value.equals(value)) {
				return b;
			}
		}
		throw new IllegalArgumentException("Unexpected value '" + value + "'");
	}
}
