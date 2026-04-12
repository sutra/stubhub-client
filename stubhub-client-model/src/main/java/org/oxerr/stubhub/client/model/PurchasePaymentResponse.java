package org.oxerr.stubhub.client.model;

import java.math.BigDecimal;
import java.time.OffsetDateTime;

public class PurchasePaymentResponse {

	private Long id;

	private ApiPurchasePaymentStatus paymentStatus;

	private OffsetDateTime paymentDueDate;

	private OffsetDateTime paymentDate;

	private Double paymentAmount;

	private String currencyCode;

	private PurchasePaymentMethodResponse paymentMethod;

	private BigDecimal purchaseAmountInPaymentCurrency;

	private String paymentNote;

	private BigDecimal convertedPaymentAmount;

	private String convertedPaymentAmountCurrency;

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public ApiPurchasePaymentStatus getPaymentStatus() {
		return paymentStatus;
	}

	public void setPaymentStatus(ApiPurchasePaymentStatus paymentStatus) {
		this.paymentStatus = paymentStatus;
	}

	public OffsetDateTime getPaymentDueDate() {
		return paymentDueDate;
	}

	public void setPaymentDueDate(OffsetDateTime paymentDueDate) {
		this.paymentDueDate = paymentDueDate;
	}

	public OffsetDateTime getPaymentDate() {
		return paymentDate;
	}

	public void setPaymentDate(OffsetDateTime paymentDate) {
		this.paymentDate = paymentDate;
	}

	public Double getPaymentAmount() {
		return paymentAmount;
	}

	public void setPaymentAmount(Double paymentAmount) {
		this.paymentAmount = paymentAmount;
	}

	public String getCurrencyCode() {
		return currencyCode;
	}

	public void setCurrencyCode(String currencyCode) {
		this.currencyCode = currencyCode;
	}

	public PurchasePaymentMethodResponse getPaymentMethod() {
		return paymentMethod;
	}

	public void setPaymentMethod(PurchasePaymentMethodResponse paymentMethod) {
		this.paymentMethod = paymentMethod;
	}

	public BigDecimal getPurchaseAmountInPaymentCurrency() {
		return purchaseAmountInPaymentCurrency;
	}

	public void setPurchaseAmountInPaymentCurrency(BigDecimal purchaseAmountInPaymentCurrency) {
		this.purchaseAmountInPaymentCurrency = purchaseAmountInPaymentCurrency;
	}

	public String getPaymentNote() {
		return paymentNote;
	}

	public void setPaymentNote(String paymentNote) {
		this.paymentNote = paymentNote;
	}

	public BigDecimal getConvertedPaymentAmount() {
		return convertedPaymentAmount;
	}

	public void setConvertedPaymentAmount(BigDecimal convertedPaymentAmount) {
		this.convertedPaymentAmount = convertedPaymentAmount;
	}

	public String getConvertedPaymentAmountCurrency() {
		return convertedPaymentAmountCurrency;
	}

	public void setConvertedPaymentAmountCurrency(String convertedPaymentAmountCurrency) {
		this.convertedPaymentAmountCurrency = convertedPaymentAmountCurrency;
	}

}
