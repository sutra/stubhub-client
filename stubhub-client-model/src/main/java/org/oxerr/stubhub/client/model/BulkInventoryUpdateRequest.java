package org.oxerr.stubhub.client.model;

import java.math.BigDecimal;
import java.util.List;

public class BulkInventoryUpdateRequest {

	private List<InventoryPriceUpdateRequest> prices;

	private List<InventoryBroadcastUpdateRequest> broadcastStatuses;

	/**
	 * The person or pricing strategy whose currently pricing the tickets.
	 */
	private String pricerUserId;

	private List<InventoryBarcodeUpdateRequest> barcodes;

	private List<InventoryTicketExternalIdUpdateRequest> ticketExternalIds;

	private List<InventoryTicketUrlUpdateRequest> ticketUrls;

	private InventoryPricingSettingRequest pricingSetting;

	/**
	 * Pre-Upload ETickets
	 */
	private List<ETicketUploadRequest> eTickets;

	/**
	 * Developer specified tags
	 */
	private List<TagRequest> tags;

	private String internalNotes;

	private List<MarketplaceSeatingOverrideUpdateRequest> marketplaceSeatingOverrides;

	/**
	 * Upload proof of ticket ownership
	 */
	private List<FileRequest> proofOfOwnership;

	/**
	 * The latest date that all tickets are in hand.
	 */
	private String inHandAt;

	private ApiSplitType splitType;

	private ApiDeliveryType deliveryType;

	private List<TicketTypeOverrideRequest> ticketTypeOverrides;

	private InventoryAdminHoldRequest adminHold;

	/**
	 * List of Listing Note Request
	 */
	private List<ListingNoteRequest> listingNotes;

	/**
	 * Max display quantity
	 */
	private Integer maxDisplayQuantity;

	/**
	 * Hide seats from marketplace
	 */
	private Boolean hideSeats;

	/**
	 * Should auto fulfill
	 */
	private Boolean autoFulfill;

	/**
	 * Unique identifier for the inventory
	 */
	private String externalId;

	private BigDecimal unitCost;

	private BigDecimal faceValueCost;

	private Boolean zoneFill;

	private Long inventoryId;

	public BulkInventoryUpdateRequest() {
	}

	public BulkInventoryUpdateRequest(Long inventoryId) {
		this.inventoryId = inventoryId;
	}

	public List<InventoryPriceUpdateRequest> getPrices() {
		return prices;
	}

	public void setPrices(List<InventoryPriceUpdateRequest> prices) {
		this.prices = prices;
	}

	public List<InventoryBroadcastUpdateRequest> getBroadcastStatuses() {
		return broadcastStatuses;
	}

	public void setBroadcastStatuses(List<InventoryBroadcastUpdateRequest> broadcastStatuses) {
		this.broadcastStatuses = broadcastStatuses;
	}

	public String getPricerUserId() {
		return pricerUserId;
	}

	public void setPricerUserId(String pricerUserId) {
		this.pricerUserId = pricerUserId;
	}

	public List<InventoryBarcodeUpdateRequest> getBarcodes() {
		return barcodes;
	}

	public void setBarcodes(List<InventoryBarcodeUpdateRequest> barcodes) {
		this.barcodes = barcodes;
	}

	public List<InventoryTicketExternalIdUpdateRequest> getTicketExternalIds() {
		return ticketExternalIds;
	}

	public void setTicketExternalIds(List<InventoryTicketExternalIdUpdateRequest> ticketExternalIds) {
		this.ticketExternalIds = ticketExternalIds;
	}

	public List<InventoryTicketUrlUpdateRequest> getTicketUrls() {
		return ticketUrls;
	}

	public void setTicketUrls(List<InventoryTicketUrlUpdateRequest> ticketUrls) {
		this.ticketUrls = ticketUrls;
	}

	public InventoryPricingSettingRequest getPricingSetting() {
		return pricingSetting;
	}

	public void setPricingSetting(InventoryPricingSettingRequest pricingSetting) {
		this.pricingSetting = pricingSetting;
	}

	public List<ETicketUploadRequest> geteTickets() {
		return eTickets;
	}

	public void seteTickets(List<ETicketUploadRequest> eTickets) {
		this.eTickets = eTickets;
	}

	public List<TagRequest> getTags() {
		return tags;
	}

	public void setTags(List<TagRequest> tags) {
		this.tags = tags;
	}

	public String getInternalNotes() {
		return internalNotes;
	}

	public void setInternalNotes(String internalNotes) {
		this.internalNotes = internalNotes;
	}

	public List<MarketplaceSeatingOverrideUpdateRequest> getMarketplaceSeatingOverrides() {
		return marketplaceSeatingOverrides;
	}

	public void setMarketplaceSeatingOverrides(
			List<MarketplaceSeatingOverrideUpdateRequest> marketplaceSeatingOverrides) {
		this.marketplaceSeatingOverrides = marketplaceSeatingOverrides;
	}

	public List<FileRequest> getProofOfOwnership() {
		return proofOfOwnership;
	}

	public void setProofOfOwnership(List<FileRequest> proofOfOwnership) {
		this.proofOfOwnership = proofOfOwnership;
	}

	public String getInHandAt() {
		return inHandAt;
	}

	public void setInHandAt(String inHandAt) {
		this.inHandAt = inHandAt;
	}

	public ApiSplitType getSplitType() {
		return splitType;
	}

	public void setSplitType(ApiSplitType splitType) {
		this.splitType = splitType;
	}

	public ApiDeliveryType getDeliveryType() {
		return deliveryType;
	}

	public void setDeliveryType(ApiDeliveryType deliveryType) {
		this.deliveryType = deliveryType;
	}

	public List<TicketTypeOverrideRequest> getTicketTypeOverrides() {
		return ticketTypeOverrides;
	}

	public void setTicketTypeOverrides(List<TicketTypeOverrideRequest> ticketTypeOverrides) {
		this.ticketTypeOverrides = ticketTypeOverrides;
	}

	public InventoryAdminHoldRequest getAdminHold() {
		return adminHold;
	}

	public void setAdminHold(InventoryAdminHoldRequest adminHold) {
		this.adminHold = adminHold;
	}

	public List<ListingNoteRequest> getListingNotes() {
		return listingNotes;
	}

	public void setListingNotes(List<ListingNoteRequest> listingNotes) {
		this.listingNotes = listingNotes;
	}

	public Integer getMaxDisplayQuantity() {
		return maxDisplayQuantity;
	}

	public void setMaxDisplayQuantity(Integer maxDisplayQuantity) {
		this.maxDisplayQuantity = maxDisplayQuantity;
	}

	public Boolean getHideSeats() {
		return hideSeats;
	}

	public void setHideSeats(Boolean hideSeats) {
		this.hideSeats = hideSeats;
	}

	public Boolean getAutoFulfill() {
		return autoFulfill;
	}

	public void setAutoFulfill(Boolean autoFulfill) {
		this.autoFulfill = autoFulfill;
	}

	public String getExternalId() {
		return externalId;
	}

	public void setExternalId(String externalId) {
		this.externalId = externalId;
	}

	public BigDecimal getUnitCost() {
		return unitCost;
	}

	public void setUnitCost(BigDecimal unitCost) {
		this.unitCost = unitCost;
	}

	public BigDecimal getFaceValueCost() {
		return faceValueCost;
	}

	public void setFaceValueCost(BigDecimal faceValueCost) {
		this.faceValueCost = faceValueCost;
	}

	public Boolean getZoneFill() {
		return zoneFill;
	}

	public void setZoneFill(Boolean zoneFill) {
		this.zoneFill = zoneFill;
	}

	public Long getInventoryId() {
		return inventoryId;
	}

	public void setInventoryId(Long inventoryId) {
		this.inventoryId = inventoryId;
	}

}
