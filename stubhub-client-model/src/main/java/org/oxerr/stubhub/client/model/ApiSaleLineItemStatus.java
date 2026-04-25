package org.oxerr.stubhub.client.model;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;

/**
 * Gets or Sets ApiSaleLineItemStatus
 */
public enum ApiSaleLineItemStatus {

	PAID("Paid"),

	UNPAID("Unpaid");

	private String value;

	ApiSaleLineItemStatus(String value) {
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
	public static ApiSaleLineItemStatus fromValue(String value) {
		for (ApiSaleLineItemStatus b : ApiSaleLineItemStatus.values()) {
			if (b.value.equals(value)) {
				return b;
			}
		}
		throw new IllegalArgumentException("Unexpected value '" + value + "'");
	}
}
