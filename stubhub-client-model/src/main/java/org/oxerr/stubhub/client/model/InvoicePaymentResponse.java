package org.oxerr.stubhub.client.model;

import java.math.BigDecimal;
import java.time.OffsetDateTime;
import java.util.List;

public class InvoicePaymentResponse {

	private Long marketplacePaymentId;

	private String marketplace;

	private String externalPaymentId;

	private String paymentReferenceId;

	private OffsetDateTime paymentCreateDate;

	private OffsetDateTime paymentDate;

	private OffsetDateTime receivedDate;

	private String paymentState;

	private String currency;

	private Double paymentAmount;

	private BigDecimal proceedsAmount;

	private BigDecimal creditAmount;

	private BigDecimal chargeAmount;

	private OffsetDateTime startDate;

	private OffsetDateTime endDate;

	private String paymentMethod;

	private BigDecimal convertedPaymentAmount;

	private String convertedPaymentCurrencyCode;

	private List<InvoicePaymentLineResponse> paymentLines;

	public Long getMarketplacePaymentId() {
		return marketplacePaymentId;
	}

	public void setMarketplacePaymentId(Long marketplacePaymentId) {
		this.marketplacePaymentId = marketplacePaymentId;
	}

	public String getMarketplace() {
		return marketplace;
	}

	public void setMarketplace(String marketplace) {
		this.marketplace = marketplace;
	}

	public String getExternalPaymentId() {
		return externalPaymentId;
	}

	public void setExternalPaymentId(String externalPaymentId) {
		this.externalPaymentId = externalPaymentId;
	}

	public String getPaymentReferenceId() {
		return paymentReferenceId;
	}

	public void setPaymentReferenceId(String paymentReferenceId) {
		this.paymentReferenceId = paymentReferenceId;
	}

	public OffsetDateTime getPaymentCreateDate() {
		return paymentCreateDate;
	}

	public void setPaymentCreateDate(OffsetDateTime paymentCreateDate) {
		this.paymentCreateDate = paymentCreateDate;
	}

	public OffsetDateTime getPaymentDate() {
		return paymentDate;
	}

	public void setPaymentDate(OffsetDateTime paymentDate) {
		this.paymentDate = paymentDate;
	}

	public OffsetDateTime getReceivedDate() {
		return receivedDate;
	}

	public void setReceivedDate(OffsetDateTime receivedDate) {
		this.receivedDate = receivedDate;
	}

	public String getPaymentState() {
		return paymentState;
	}

	public void setPaymentState(String paymentState) {
		this.paymentState = paymentState;
	}

	public String getCurrency() {
		return currency;
	}

	public void setCurrency(String currency) {
		this.currency = currency;
	}

	public Double getPaymentAmount() {
		return paymentAmount;
	}

	public void setPaymentAmount(Double paymentAmount) {
		this.paymentAmount = paymentAmount;
	}

	public BigDecimal getProceedsAmount() {
		return proceedsAmount;
	}

	public void setProceedsAmount(BigDecimal proceedsAmount) {
		this.proceedsAmount = proceedsAmount;
	}

	public BigDecimal getCreditAmount() {
		return creditAmount;
	}

	public void setCreditAmount(BigDecimal creditAmount) {
		this.creditAmount = creditAmount;
	}

	public BigDecimal getChargeAmount() {
		return chargeAmount;
	}

	public void setChargeAmount(BigDecimal chargeAmount) {
		this.chargeAmount = chargeAmount;
	}

	public OffsetDateTime getStartDate() {
		return startDate;
	}

	public void setStartDate(OffsetDateTime startDate) {
		this.startDate = startDate;
	}

	public OffsetDateTime getEndDate() {
		return endDate;
	}

	public void setEndDate(OffsetDateTime endDate) {
		this.endDate = endDate;
	}

	public String getPaymentMethod() {
		return paymentMethod;
	}

	public void setPaymentMethod(String paymentMethod) {
		this.paymentMethod = paymentMethod;
	}

	public BigDecimal getConvertedPaymentAmount() {
		return convertedPaymentAmount;
	}

	public void setConvertedPaymentAmount(BigDecimal convertedPaymentAmount) {
		this.convertedPaymentAmount = convertedPaymentAmount;
	}

	public String getConvertedPaymentCurrencyCode() {
		return convertedPaymentCurrencyCode;
	}

	public void setConvertedPaymentCurrencyCode(String convertedPaymentCurrencyCode) {
		this.convertedPaymentCurrencyCode = convertedPaymentCurrencyCode;
	}

	public List<InvoicePaymentLineResponse> getPaymentLines() {
		return paymentLines;
	}

	public void setPaymentLines(List<InvoicePaymentLineResponse> paymentLines) {
		this.paymentLines = paymentLines;
	}

}
