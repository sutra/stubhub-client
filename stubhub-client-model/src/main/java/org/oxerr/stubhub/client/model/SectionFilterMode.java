package org.oxerr.stubhub.client.model;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;

public enum SectionFilterMode {

	SAME_SECTION("SameSection"),

	SAME_ZONE("SameZone");

	private String value;

	SectionFilterMode(String value) {
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
	public static SectionFilterMode fromValue(String value) {
		for (SectionFilterMode b : SectionFilterMode.values()) {
			if (b.value.equals(value)) {
				return b;
			}
		}
		throw new IllegalArgumentException("Unexpected value '" + value + "'");
	}

}
