package org.oxerr.stubhub.client.model;

import java.math.BigDecimal;

public class InvoicePaymentLineResponse {

	private Long marketplacePaymentLineId;

	private Long marketplacePaymentId;

	private String externalPaymentId;

	private String externalPaymentLineId;

	private String externalSaleId;

	private Long saleId;

	private String currency;

	private Double amount;

	private Boolean isCredit;

	private String paymentLineDescription;

	private String paymentLineType;

	private BigDecimal convertedPaymentAmount;

	private String convertedPaymentCurrencyCode;

	public Long getMarketplacePaymentLineId() {
		return marketplacePaymentLineId;
	}

	public void setMarketplacePaymentLineId(Long marketplacePaymentLineId) {
		this.marketplacePaymentLineId = marketplacePaymentLineId;
	}

	public Long getMarketplacePaymentId() {
		return marketplacePaymentId;
	}

	public void setMarketplacePaymentId(Long marketplacePaymentId) {
		this.marketplacePaymentId = marketplacePaymentId;
	}

	public String getExternalPaymentId() {
		return externalPaymentId;
	}

	public void setExternalPaymentId(String externalPaymentId) {
		this.externalPaymentId = externalPaymentId;
	}

	public String getExternalPaymentLineId() {
		return externalPaymentLineId;
	}

	public void setExternalPaymentLineId(String externalPaymentLineId) {
		this.externalPaymentLineId = externalPaymentLineId;
	}

	public String getExternalSaleId() {
		return externalSaleId;
	}

	public void setExternalSaleId(String externalSaleId) {
		this.externalSaleId = externalSaleId;
	}

	public Long getSaleId() {
		return saleId;
	}

	public void setSaleId(Long saleId) {
		this.saleId = saleId;
	}

	public String getCurrency() {
		return currency;
	}

	public void setCurrency(String currency) {
		this.currency = currency;
	}

	public Double getAmount() {
		return amount;
	}

	public void setAmount(Double amount) {
		this.amount = amount;
	}

	public Boolean getIsCredit() {
		return isCredit;
	}

	public void setIsCredit(Boolean isCredit) {
		this.isCredit = isCredit;
	}

	public String getPaymentLineDescription() {
		return paymentLineDescription;
	}

	public void setPaymentLineDescription(String paymentLineDescription) {
		this.paymentLineDescription = paymentLineDescription;
	}

	public String getPaymentLineType() {
		return paymentLineType;
	}

	public void setPaymentLineType(String paymentLineType) {
		this.paymentLineType = paymentLineType;
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

}
