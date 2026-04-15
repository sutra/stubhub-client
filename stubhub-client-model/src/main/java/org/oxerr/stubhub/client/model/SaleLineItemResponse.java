package org.oxerr.stubhub.client.model;

import java.time.OffsetDateTime;

public class SaleLineItemResponse {

	private Long id;

	private Long saleId;

	private ApiSaleLineItemStatus status;

	private ApiSaleLineItemCostType costType;

	private OffsetDateTime costDate;

	private OffsetDateTime dueDate;

	private Double cost;

	private String currencyCode;

	private String description;

	private Long marketplacePaymentLineId;

	private Boolean paymentReceived;

	private String paymentReferenceId;

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public Long getSaleId() {
		return saleId;
	}

	public void setSaleId(Long saleId) {
		this.saleId = saleId;
	}

	public ApiSaleLineItemStatus getStatus() {
		return status;
	}

	public void setStatus(ApiSaleLineItemStatus status) {
		this.status = status;
	}

	public ApiSaleLineItemCostType getCostType() {
		return costType;
	}

	public void setCostType(ApiSaleLineItemCostType costType) {
		this.costType = costType;
	}

	public OffsetDateTime getCostDate() {
		return costDate;
	}

	public void setCostDate(OffsetDateTime costDate) {
		this.costDate = costDate;
	}

	public OffsetDateTime getDueDate() {
		return dueDate;
	}

	public void setDueDate(OffsetDateTime dueDate) {
		this.dueDate = dueDate;
	}

	public Double getCost() {
		return cost;
	}

	public void setCost(Double cost) {
		this.cost = cost;
	}

	public String getCurrencyCode() {
		return currencyCode;
	}

	public void setCurrencyCode(String currencyCode) {
		this.currencyCode = currencyCode;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public Long getMarketplacePaymentLineId() {
		return marketplacePaymentLineId;
	}

	public void setMarketplacePaymentLineId(Long marketplacePaymentLineId) {
		this.marketplacePaymentLineId = marketplacePaymentLineId;
	}

	public Boolean getPaymentReceived() {
		return paymentReceived;
	}

	public void setPaymentReceived(Boolean paymentReceived) {
		this.paymentReceived = paymentReceived;
	}

	public String getPaymentReferenceId() {
		return paymentReferenceId;
	}

	public void setPaymentReferenceId(String paymentReferenceId) {
		this.paymentReferenceId = paymentReferenceId;
	}

}
