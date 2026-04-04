package org.oxerr.stubhub.client.model;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;

public enum ApiMarketplaceBroadcastState {

	DELISTED("Delisted"),

	LISTED("Listed");

	private String value;

	ApiMarketplaceBroadcastState(String value) {
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
	public static ApiMarketplaceBroadcastState fromValue(String value) {
		for (ApiMarketplaceBroadcastState b : ApiMarketplaceBroadcastState.values()) {
			if (b.value.equals(value)) {
				return b;
			}
		}
		throw new IllegalArgumentException("Unexpected value '" + value + "'");
	}
}
