package org.oxerr.stubhub.client.model;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;

/**
 * Gets or Sets ApiTagValueInheritMode
 */
public enum ApiTagValueInheritMode {

	SYNC_LIVE_VALUE("SyncLiveValue"),

	COPY_VALUE_ON_CREATE("CopyValueOnCreate"),

	DO_NOT_INHERIT("DoNotInherit");

	private String value;

	ApiTagValueInheritMode(String value) {
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
	public static ApiTagValueInheritMode fromValue(String value) {
		for (ApiTagValueInheritMode b : ApiTagValueInheritMode.values()) {
			if (b.value.equals(value)) {
				return b;
			}
		}
		throw new IllegalArgumentException("Unexpected value '" + value + "'");
	}
}
