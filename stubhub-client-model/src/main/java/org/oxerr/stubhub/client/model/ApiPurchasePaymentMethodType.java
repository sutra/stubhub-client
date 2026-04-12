package org.oxerr.stubhub.client.model;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;

/**
 * Gets or Sets ApiPurchasePaymentMethodType
 */
public enum ApiPurchasePaymentMethodType {

	PAY_PAL("PayPal"),

	E_CHECK("eCheck"),

	CHECK("Check"),

	MONEY_ORDER("MoneyOrder"),

	CARD("Card"),

	CASH("Cash"),

	CREDIT("Credit"),

	COD("COD"),

	BANK_TRANSFER("BankTransfer"),

	DEBIT_CARD("DebitCard"),

	CREDIT_MEMO("CreditMemo"),

	DEBIT_NOTE("DebitNote"),

	OTHER("Other");

	private String value;

	ApiPurchasePaymentMethodType(String value) {
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
	public static ApiPurchasePaymentMethodType fromValue(String value) {
		for (ApiPurchasePaymentMethodType b : ApiPurchasePaymentMethodType.values()) {
			if (b.value.equals(value)) {
				return b;
			}
		}
		throw new IllegalArgumentException("Unexpected value '" + value + "'");
	}
}
