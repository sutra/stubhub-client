package org.oxerr.stubhub.client.model;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;

/**
 * Gets or Sets ApiTagValueDataType
 */
public enum ApiTagValueDataType {

	STRING("String"),

	DECIMAL("Decimal"),

	INT("Int"),

	BOOLEAN("Boolean"),

	JSON("Json"),

	URL("Url"),

	MARKETPLACE("Marketplace"),

	DATE("Date"),

	POS_USER("POSUser"),

	VENDOR("Vendor"),

	USER_GROUP("UserGroup");

	private String value;

	ApiTagValueDataType(String value) {
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
	public static ApiTagValueDataType fromValue(String value) {
		for (ApiTagValueDataType b : ApiTagValueDataType.values()) {
			if (b.value.equals(value)) {
				return b;
			}
		}
		throw new IllegalArgumentException("Unexpected value '" + value + "'");
	}
}
