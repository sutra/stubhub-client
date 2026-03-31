package org.oxerr.stubhub.client.model;

import java.math.BigDecimal;
import java.util.List;
import java.util.UUID;

public class TicketResponse {

	private Long id;

	private Long ticketGroupId;

	private Integer ordinal;

	private String row;

	private String seat;

	private String barcode;

	private String ticketUrl;

	private String externalTicketId;

	private Long listingId;

	private Long saleId;

	private Long holdId;

	private Long purchaseOrderId;

	private UUID vendorAccountId;

	private BigDecimal commissionPercentage;

	private UUID buyerUserId;

	private BigDecimal unitCost;

	private String externalId;

	private String uniqueId;

	private List<BuyerCommissionResponse> buyerCommissions;

	private String vendorOrderId;

	private String transferId;

	private UUID secondaryVendorAccountId;

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public Long getTicketGroupId() {
		return ticketGroupId;
	}

	public void setTicketGroupId(Long ticketGroupId) {
		this.ticketGroupId = ticketGroupId;
	}

	public Integer getOrdinal() {
		return ordinal;
	}

	public void setOrdinal(Integer ordinal) {
		this.ordinal = ordinal;
	}

	public String getRow() {
		return row;
	}

	public void setRow(String row) {
		this.row = row;
	}

	public String getSeat() {
		return seat;
	}

	public void setSeat(String seat) {
		this.seat = seat;
	}

	public String getBarcode() {
		return barcode;
	}

	public void setBarcode(String barcode) {
		this.barcode = barcode;
	}

	public String getTicketUrl() {
		return ticketUrl;
	}

	public void setTicketUrl(String ticketUrl) {
		this.ticketUrl = ticketUrl;
	}

	public String getExternalTicketId() {
		return externalTicketId;
	}

	public void setExternalTicketId(String externalTicketId) {
		this.externalTicketId = externalTicketId;
	}

	public Long getListingId() {
		return listingId;
	}

	public void setListingId(Long listingId) {
		this.listingId = listingId;
	}

	public Long getSaleId() {
		return saleId;
	}

	public void setSaleId(Long saleId) {
		this.saleId = saleId;
	}

	public Long getHoldId() {
		return holdId;
	}

	public void setHoldId(Long holdId) {
		this.holdId = holdId;
	}

	public Long getPurchaseOrderId() {
		return purchaseOrderId;
	}

	public void setPurchaseOrderId(Long purchaseOrderId) {
		this.purchaseOrderId = purchaseOrderId;
	}

	public UUID getVendorAccountId() {
		return vendorAccountId;
	}

	public void setVendorAccountId(UUID vendorAccountId) {
		this.vendorAccountId = vendorAccountId;
	}

	public BigDecimal getCommissionPercentage() {
		return commissionPercentage;
	}

	public void setCommissionPercentage(BigDecimal commissionPercentage) {
		this.commissionPercentage = commissionPercentage;
	}

	public UUID getBuyerUserId() {
		return buyerUserId;
	}

	public void setBuyerUserId(UUID buyerUserId) {
		this.buyerUserId = buyerUserId;
	}

	public BigDecimal getUnitCost() {
		return unitCost;
	}

	public void setUnitCost(BigDecimal unitCost) {
		this.unitCost = unitCost;
	}

	public String getExternalId() {
		return externalId;
	}

	public void setExternalId(String externalId) {
		this.externalId = externalId;
	}

	public String getUniqueId() {
		return uniqueId;
	}

	public void setUniqueId(String uniqueId) {
		this.uniqueId = uniqueId;
	}

	public List<BuyerCommissionResponse> getBuyerCommissions() {
		return buyerCommissions;
	}

	public void setBuyerCommissions(List<BuyerCommissionResponse> buyerCommissions) {
		this.buyerCommissions = buyerCommissions;
	}

	public String getVendorOrderId() {
		return vendorOrderId;
	}

	public void setVendorOrderId(String vendorOrderId) {
		this.vendorOrderId = vendorOrderId;
	}

	public String getTransferId() {
		return transferId;
	}

	public void setTransferId(String transferId) {
		this.transferId = transferId;
	}

	public UUID getSecondaryVendorAccountId() {
		return secondaryVendorAccountId;
	}

	public void setSecondaryVendorAccountId(UUID secondaryVendorAccountId) {
		this.secondaryVendorAccountId = secondaryVendorAccountId;
	}

}
