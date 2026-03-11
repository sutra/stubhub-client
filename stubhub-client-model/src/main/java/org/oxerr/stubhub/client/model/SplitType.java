package org.oxerr.stubhub.client.model;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;

public enum SplitType {

	NUMBER_1(1),

	NUMBER_2(2),

	NUMBER_3(3),

	NUMBER_4(4),

	NUMBER_5(5);

	private Integer value;

	SplitType(Integer value) {
		this.value = value;
	}

	@JsonValue
	public Integer getValue() {
		return value;
	}

	@Override
	public String toString() {
		return String.valueOf(value);
	}

	@JsonCreator
	public static SplitType fromValue(Integer value) {
		for (SplitType b : SplitType.values()) {
			if (b.value.equals(value)) {
				return b;
			}
		}
		throw new IllegalArgumentException("Unexpected value '" + value + "'");
	}
}
