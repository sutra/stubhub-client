package org.oxerr.stubhub.client.model;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;

/**
 * Gets or Sets ApiPosBroadcastState
 */
public enum ApiPosBroadcastState {

	DELIST("Delist"),

	LIST("List");

	private String value;

	ApiPosBroadcastState(String value) {
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
	public static ApiPosBroadcastState fromValue(String value) {
		for (ApiPosBroadcastState b : ApiPosBroadcastState.values()) {
			if (b.value.equals(value)) {
				return b;
			}
		}
		throw new IllegalArgumentException("Unexpected value '" + value + "'");
	}
}
