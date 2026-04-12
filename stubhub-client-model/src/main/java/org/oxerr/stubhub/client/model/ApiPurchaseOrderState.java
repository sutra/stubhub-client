package org.oxerr.stubhub.client.model;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;

/**
 * Gets or Sets ApiPurchaseOrderState
 */
public enum ApiPurchaseOrderState {

	ACTIVE("Active"),

	CANCELLED("Cancelled"),

	VOID("Void"),

	DRAFTED("Drafted");

	private String value;

	ApiPurchaseOrderState(String value) {
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
	public static ApiPurchaseOrderState fromValue(String value) {
		for (ApiPurchaseOrderState b : ApiPurchaseOrderState.values()) {
			if (b.value.equals(value)) {
				return b;
			}
		}
		throw new IllegalArgumentException("Unexpected value '" + value + "'");
	}
}
