package org.oxerr.stubhub.client.model;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;

/**
 * Gets or Sets ApiPosPaymentState
 */
public enum ApiPosPaymentState {

	UNPAID("Unpaid"),

	QUEUED("Queued"),

	PAID("Paid"),

	PARTIALLY_PAID("PartiallyPaid"),

	PENDING_REVERSAL("PendingReversal"),

	REVERSED("Reversed");

	private String value;

	ApiPosPaymentState(String value) {
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
	public static ApiPosPaymentState fromValue(String value) {
		for (ApiPosPaymentState b : ApiPosPaymentState.values()) {
			if (b.value.equals(value)) {
				return b;
			}
		}
		throw new IllegalArgumentException("Unexpected value '" + value + "'");
	}
}
