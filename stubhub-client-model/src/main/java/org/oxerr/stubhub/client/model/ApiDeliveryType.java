package org.oxerr.stubhub.client.model;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;

/**
 * Gets or Sets ApiDeliveryType
 */
public enum ApiDeliveryType {

	IN_APP("InApp"),

	PDF("PDF"),

	PAPER("Paper"),

	MEMBER_CARD("MemberCard"),

	WALLET("Wallet"),

	CUSTOM("Custom");

	private String value;

	ApiDeliveryType(String value) {
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
	public static ApiDeliveryType fromValue(String value) {
		for (ApiDeliveryType b : ApiDeliveryType.values()) {
			if (b.value.equals(value)) {
				return b;
			}
		}
		throw new IllegalArgumentException("Unexpected value '" + value + "'");
	}
}
