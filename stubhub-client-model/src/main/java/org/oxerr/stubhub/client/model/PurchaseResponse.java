package org.oxerr.stubhub.client.model;

import java.math.BigDecimal;
import java.time.OffsetDateTime;
import java.util.List;
import java.util.UUID;

public class PurchaseResponse {

	private Long id;

	private String vendorOrderId;

	private UUID buyerUserId;

	private OffsetDateTime purchaseDate;

	private OffsetDateTime cancellationDate;

	private OffsetDateTime createdDate;

	private OffsetDateTime updatedDate;

	private ApiPurchaseOrderState state;

	private String internalNotes;

	private PurchaseVendorAccountResponse vendorAccount;

	private PurchaseVendorAccountResponse secondaryVendorAccount;

	private List<PurchaseCostResponse> additionalCosts;

	private List<PurchasePaymentResponse> payments;

	private List<TicketGroupResponse> ticketGroups;

	private List<TagResponse> tags;

	private BigDecimal totalAmount;

	private ApiPurchasePaymentStatus paymentStatus;

	private String changeReason;

	private String externalId;

	private List<BuyerCommissionResponse> commissions;

	private UUID sellerAccountId;

	private UUID dealId;

	private Boolean isCommissionsLocked;

	private BigDecimal totalEstimatedCost;

	private String totalEstimatedCostCurrency;

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getVendorOrderId() {
		return vendorOrderId;
	}

	public void setVendorOrderId(String vendorOrderId) {
		this.vendorOrderId = vendorOrderId;
	}

	public UUID getBuyerUserId() {
		return buyerUserId;
	}

	public void setBuyerUserId(UUID buyerUserId) {
		this.buyerUserId = buyerUserId;
	}

	public OffsetDateTime getPurchaseDate() {
		return purchaseDate;
	}

	public void setPurchaseDate(OffsetDateTime purchaseDate) {
		this.purchaseDate = purchaseDate;
	}

	public OffsetDateTime getCancellationDate() {
		return cancellationDate;
	}

	public void setCancellationDate(OffsetDateTime cancellationDate) {
		this.cancellationDate = cancellationDate;
	}

	public OffsetDateTime getCreatedDate() {
		return createdDate;
	}

	public void setCreatedDate(OffsetDateTime createdDate) {
		this.createdDate = createdDate;
	}

	public OffsetDateTime getUpdatedDate() {
		return updatedDate;
	}

	public void setUpdatedDate(OffsetDateTime updatedDate) {
		this.updatedDate = updatedDate;
	}

	public ApiPurchaseOrderState getState() {
		return state;
	}

	public void setState(ApiPurchaseOrderState state) {
		this.state = state;
	}

	public String getInternalNotes() {
		return internalNotes;
	}

	public void setInternalNotes(String internalNotes) {
		this.internalNotes = internalNotes;
	}

	public PurchaseVendorAccountResponse getVendorAccount() {
		return vendorAccount;
	}

	public void setVendorAccount(PurchaseVendorAccountResponse vendorAccount) {
		this.vendorAccount = vendorAccount;
	}

	public PurchaseVendorAccountResponse getSecondaryVendorAccount() {
		return secondaryVendorAccount;
	}

	public void setSecondaryVendorAccount(PurchaseVendorAccountResponse secondaryVendorAccount) {
		this.secondaryVendorAccount = secondaryVendorAccount;
	}

	public List<PurchaseCostResponse> getAdditionalCosts() {
		return additionalCosts;
	}

	public void setAdditionalCosts(List<PurchaseCostResponse> additionalCosts) {
		this.additionalCosts = additionalCosts;
	}

	public List<PurchasePaymentResponse> getPayments() {
		return payments;
	}

	public void setPayments(List<PurchasePaymentResponse> payments) {
		this.payments = payments;
	}

	public List<TicketGroupResponse> getTicketGroups() {
		return ticketGroups;
	}

	public void setTicketGroups(List<TicketGroupResponse> ticketGroups) {
		this.ticketGroups = ticketGroups;
	}

	public List<TagResponse> getTags() {
		return tags;
	}

	public void setTags(List<TagResponse> tags) {
		this.tags = tags;
	}

	public BigDecimal getTotalAmount() {
		return totalAmount;
	}

	public void setTotalAmount(BigDecimal totalAmount) {
		this.totalAmount = totalAmount;
	}

	public ApiPurchasePaymentStatus getPaymentStatus() {
		return paymentStatus;
	}

	public void setPaymentStatus(ApiPurchasePaymentStatus paymentStatus) {
		this.paymentStatus = paymentStatus;
	}

	public String getChangeReason() {
		return changeReason;
	}

	public void setChangeReason(String changeReason) {
		this.changeReason = changeReason;
	}

	public String getExternalId() {
		return externalId;
	}

	public void setExternalId(String externalId) {
		this.externalId = externalId;
	}

	public List<BuyerCommissionResponse> getCommissions() {
		return commissions;
	}

	public void setCommissions(List<BuyerCommissionResponse> commissions) {
		this.commissions = commissions;
	}

	public UUID getSellerAccountId() {
		return sellerAccountId;
	}

	public void setSellerAccountId(UUID sellerAccountId) {
		this.sellerAccountId = sellerAccountId;
	}

	public UUID getDealId() {
		return dealId;
	}

	public void setDealId(UUID dealId) {
		this.dealId = dealId;
	}

	public Boolean getIsCommissionsLocked() {
		return isCommissionsLocked;
	}

	public void setIsCommissionsLocked(Boolean isCommissionsLocked) {
		this.isCommissionsLocked = isCommissionsLocked;
	}

	public BigDecimal getTotalEstimatedCost() {
		return totalEstimatedCost;
	}

	public void setTotalEstimatedCost(BigDecimal totalEstimatedCost) {
		this.totalEstimatedCost = totalEstimatedCost;
	}

	public String getTotalEstimatedCostCurrency() {
		return totalEstimatedCostCurrency;
	}

	public void setTotalEstimatedCostCurrency(String totalEstimatedCostCurrency) {
		this.totalEstimatedCostCurrency = totalEstimatedCostCurrency;
	}

}
