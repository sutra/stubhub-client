package org.oxerr.stubhub.client.model;

import java.math.BigDecimal;
import java.time.LocalDateTime;

public class CurrencyConversionOverrideResponse {

	private Long currencyConversionOverrideId;

	private String fromCurrency;

	private String toCurrency;

	private String paymentMethodNameRegex;

	private BigDecimal conversionRate;

	private LocalDateTime conversionRateDate;

	private LocalDateTime createDate;

	public Long getCurrencyConversionOverrideId() {
		return currencyConversionOverrideId;
	}

	public void setCurrencyConversionOverrideId(Long currencyConversionOverrideId) {
		this.currencyConversionOverrideId = currencyConversionOverrideId;
	}

	public String getFromCurrency() {
		return fromCurrency;
	}

	public void setFromCurrency(String fromCurrency) {
		this.fromCurrency = fromCurrency;
	}

	public String getToCurrency() {
		return toCurrency;
	}

	public void setToCurrency(String toCurrency) {
		this.toCurrency = toCurrency;
	}

	public String getPaymentMethodNameRegex() {
		return paymentMethodNameRegex;
	}

	public void setPaymentMethodNameRegex(String paymentMethodNameRegex) {
		this.paymentMethodNameRegex = paymentMethodNameRegex;
	}

	public BigDecimal getConversionRate() {
		return conversionRate;
	}

	public void setConversionRate(BigDecimal conversionRate) {
		this.conversionRate = conversionRate;
	}

	public LocalDateTime getConversionRateDate() {
		return conversionRateDate;
	}

	public void setConversionRateDate(LocalDateTime conversionRateDate) {
		this.conversionRateDate = conversionRateDate;
	}

	public LocalDateTime getCreateDate() {
		return createDate;
	}

	public void setCreateDate(LocalDateTime createDate) {
		this.createDate = createDate;
	}

}
