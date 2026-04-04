package org.oxerr.stubhub.client.model;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;

/**
 * Gets or Sets ApiSplitType
 */
public enum ApiSplitType {

	ANY("Any"),

	NONE("None"),

	AVOID_ONE("AvoidOne"),

	AVOID_ONE_AND_THREE("AvoidOneAndThree"),

	PAIRS("Pairs");

	private String value;

	ApiSplitType(String value) {
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
	public static ApiSplitType fromValue(String value) {
		for (ApiSplitType b : ApiSplitType.values()) {
			if (b.value.equals(value)) {
				return b;
			}
		}
		throw new IllegalArgumentException("Unexpected value '" + value + "'");
	}
}
