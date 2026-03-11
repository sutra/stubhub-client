package org.oxerr.stubhub.client.model;

import java.math.BigDecimal;
import java.time.OffsetDateTime;
import java.util.List;
import java.util.UUID;

public class HoldResponse {

	private EventMappingResponse eventMapping;

	private EventResponse event;

	private VenueResponse venue;

	private PerformerResponse performer;

	private Long id;

	private String marketplaceSaleId;

	private String marketplaceListingId;

	private Long inventoryId;

	private OffsetDateTime inHandAt;

	private SeatingResponse seating;

	private SeatingResponse marketplaceOriginalSeating;

	private BigDecimal totalNetProceeds;

	private BigDecimal totalCost;

	private BigDecimal totalCharges;

	private BigDecimal totalCredits;

	private String currencyCode;

	private OffsetDateTime saleDate;

	private OffsetDateTime updateDate;

	private Integer quantitySold;

	private Integer quantityWasted;

	private String marketplace;

	private String stockType;

	private List<ListingNoteResponse> listingNotes;

	private PosState posState;

	private MarketplaceState marketplaceState;

	private List<VendorResponse> vendorInfos;

	private List<PurchaseVendorAccountResponse> vendorAccounts;

	private List<TicketResponse> tickets;

	private String paymentStatus;

	private String paymentReferenceNumber;

	private OffsetDateTime lastPaymentDate;

	private String internalNotes;

	private TicketHolderResponse ticketHolder;

	private List<TagResponse> tags;

	private OffsetDateTime createdDate;

	private OffsetDateTime fulfillmentDate;

	private Long originatedFromListingId;

	private OffsetDateTime cancellationDate;

	private Integer fulfillmentVersion;

	private Integer marketplaceFulfillmentVersion;

	private String externalId;

	private UUID fulfillmentUserId;

	private Boolean autoFulfill;

	private UUID sellerAccountId;

	private List<BuyerCommission> buyerCommissionOverride;

	private BigDecimal originalNetProceedsAmount;

	private String originalNetProceedsCurrency;

	private OffsetDateTime expirationDate;

	public EventMappingResponse getEventMapping() {
		return eventMapping;
	}

	public void setEventMapping(EventMappingResponse eventMapping) {
		this.eventMapping = eventMapping;
	}

	public EventResponse getEvent() {
		return event;
	}

	public void setEvent(EventResponse event) {
		this.event = event;
	}

	public VenueResponse getVenue() {
		return venue;
	}

	public void setVenue(VenueResponse venue) {
		this.venue = venue;
	}

	public PerformerResponse getPerformer() {
		return performer;
	}

	public void setPerformer(PerformerResponse performer) {
		this.performer = performer;
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getMarketplaceSaleId() {
		return marketplaceSaleId;
	}

	public void setMarketplaceSaleId(String marketplaceSaleId) {
		this.marketplaceSaleId = marketplaceSaleId;
	}

	public String getMarketplaceListingId() {
		return marketplaceListingId;
	}

	public void setMarketplaceListingId(String marketplaceListingId) {
		this.marketplaceListingId = marketplaceListingId;
	}

	public Long getInventoryId() {
		return inventoryId;
	}

	public void setInventoryId(Long inventoryId) {
		this.inventoryId = inventoryId;
	}

	public OffsetDateTime getInHandAt() {
		return inHandAt;
	}

	public void setInHandAt(OffsetDateTime inHandAt) {
		this.inHandAt = inHandAt;
	}

	public SeatingResponse getSeating() {
		return seating;
	}

	public void setSeating(SeatingResponse seating) {
		this.seating = seating;
	}

	public SeatingResponse getMarketplaceOriginalSeating() {
		return marketplaceOriginalSeating;
	}

	public void setMarketplaceOriginalSeating(SeatingResponse marketplaceOriginalSeating) {
		this.marketplaceOriginalSeating = marketplaceOriginalSeating;
	}

	public BigDecimal getTotalNetProceeds() {
		return totalNetProceeds;
	}

	public void setTotalNetProceeds(BigDecimal totalNetProceeds) {
		this.totalNetProceeds = totalNetProceeds;
	}

	public BigDecimal getTotalCost() {
		return totalCost;
	}

	public void setTotalCost(BigDecimal totalCost) {
		this.totalCost = totalCost;
	}

	public BigDecimal getTotalCharges() {
		return totalCharges;
	}

	public void setTotalCharges(BigDecimal totalCharges) {
		this.totalCharges = totalCharges;
	}

	public BigDecimal getTotalCredits() {
		return totalCredits;
	}

	public void setTotalCredits(BigDecimal totalCredits) {
		this.totalCredits = totalCredits;
	}

	public String getCurrencyCode() {
		return currencyCode;
	}

	public void setCurrencyCode(String currencyCode) {
		this.currencyCode = currencyCode;
	}

	public OffsetDateTime getSaleDate() {
		return saleDate;
	}

	public void setSaleDate(OffsetDateTime saleDate) {
		this.saleDate = saleDate;
	}

	public OffsetDateTime getUpdateDate() {
		return updateDate;
	}

	public void setUpdateDate(OffsetDateTime updateDate) {
		this.updateDate = updateDate;
	}

	public Integer getQuantitySold() {
		return quantitySold;
	}

	public void setQuantitySold(Integer quantitySold) {
		this.quantitySold = quantitySold;
	}

	public Integer getQuantityWasted() {
		return quantityWasted;
	}

	public void setQuantityWasted(Integer quantityWasted) {
		this.quantityWasted = quantityWasted;
	}

	public String getMarketplace() {
		return marketplace;
	}

	public void setMarketplace(String marketplace) {
		this.marketplace = marketplace;
	}

	public String getStockType() {
		return stockType;
	}

	public void setStockType(String stockType) {
		this.stockType = stockType;
	}

	public List<ListingNoteResponse> getListingNotes() {
		return listingNotes;
	}

	public void setListingNotes(List<ListingNoteResponse> listingNotes) {
		this.listingNotes = listingNotes;
	}

	public PosState getPosState() {
		return posState;
	}

	public void setPosState(PosState posState) {
		this.posState = posState;
	}

	public MarketplaceState getMarketplaceState() {
		return marketplaceState;
	}

	public void setMarketplaceState(MarketplaceState marketplaceState) {
		this.marketplaceState = marketplaceState;
	}

	public List<VendorResponse> getVendorInfos() {
		return vendorInfos;
	}

	public void setVendorInfos(List<VendorResponse> vendorInfos) {
		this.vendorInfos = vendorInfos;
	}

	public List<PurchaseVendorAccountResponse> getVendorAccounts() {
		return vendorAccounts;
	}

	public void setVendorAccounts(List<PurchaseVendorAccountResponse> vendorAccounts) {
		this.vendorAccounts = vendorAccounts;
	}

	public List<TicketResponse> getTickets() {
		return tickets;
	}

	public void setTickets(List<TicketResponse> tickets) {
		this.tickets = tickets;
	}

	public String getPaymentStatus() {
		return paymentStatus;
	}

	public void setPaymentStatus(String paymentStatus) {
		this.paymentStatus = paymentStatus;
	}

	public String getPaymentReferenceNumber() {
		return paymentReferenceNumber;
	}

	public void setPaymentReferenceNumber(String paymentReferenceNumber) {
		this.paymentReferenceNumber = paymentReferenceNumber;
	}

	public OffsetDateTime getLastPaymentDate() {
		return lastPaymentDate;
	}

	public void setLastPaymentDate(OffsetDateTime lastPaymentDate) {
		this.lastPaymentDate = lastPaymentDate;
	}

	public String getInternalNotes() {
		return internalNotes;
	}

	public void setInternalNotes(String internalNotes) {
		this.internalNotes = internalNotes;
	}

	public TicketHolderResponse getTicketHolder() {
		return ticketHolder;
	}

	public void setTicketHolder(TicketHolderResponse ticketHolder) {
		this.ticketHolder = ticketHolder;
	}

	public List<TagResponse> getTags() {
		return tags;
	}

	public void setTags(List<TagResponse> tags) {
		this.tags = tags;
	}

	public OffsetDateTime getCreatedDate() {
		return createdDate;
	}

	public void setCreatedDate(OffsetDateTime createdDate) {
		this.createdDate = createdDate;
	}

	public OffsetDateTime getFulfillmentDate() {
		return fulfillmentDate;
	}

	public void setFulfillmentDate(OffsetDateTime fulfillmentDate) {
		this.fulfillmentDate = fulfillmentDate;
	}

	public Long getOriginatedFromListingId() {
		return originatedFromListingId;
	}

	public void setOriginatedFromListingId(Long originatedFromListingId) {
		this.originatedFromListingId = originatedFromListingId;
	}

	public OffsetDateTime getCancellationDate() {
		return cancellationDate;
	}

	public void setCancellationDate(OffsetDateTime cancellationDate) {
		this.cancellationDate = cancellationDate;
	}

	public Integer getFulfillmentVersion() {
		return fulfillmentVersion;
	}

	public void setFulfillmentVersion(Integer fulfillmentVersion) {
		this.fulfillmentVersion = fulfillmentVersion;
	}

	public Integer getMarketplaceFulfillmentVersion() {
		return marketplaceFulfillmentVersion;
	}

	public void setMarketplaceFulfillmentVersion(Integer marketplaceFulfillmentVersion) {
		this.marketplaceFulfillmentVersion = marketplaceFulfillmentVersion;
	}

	public String getExternalId() {
		return externalId;
	}

	public void setExternalId(String externalId) {
		this.externalId = externalId;
	}

	public UUID getFulfillmentUserId() {
		return fulfillmentUserId;
	}

	public void setFulfillmentUserId(UUID fulfillmentUserId) {
		this.fulfillmentUserId = fulfillmentUserId;
	}

	public Boolean getAutoFulfill() {
		return autoFulfill;
	}

	public void setAutoFulfill(Boolean autoFulfill) {
		this.autoFulfill = autoFulfill;
	}

	public UUID getSellerAccountId() {
		return sellerAccountId;
	}

	public void setSellerAccountId(UUID sellerAccountId) {
		this.sellerAccountId = sellerAccountId;
	}

	public List<BuyerCommission> getBuyerCommissionOverride() {
		return buyerCommissionOverride;
	}

	public void setBuyerCommissionOverride(List<BuyerCommission> buyerCommissionOverride) {
		this.buyerCommissionOverride = buyerCommissionOverride;
	}

	public BigDecimal getOriginalNetProceedsAmount() {
		return originalNetProceedsAmount;
	}

	public void setOriginalNetProceedsAmount(BigDecimal originalNetProceedsAmount) {
		this.originalNetProceedsAmount = originalNetProceedsAmount;
	}

	public String getOriginalNetProceedsCurrency() {
		return originalNetProceedsCurrency;
	}

	public void setOriginalNetProceedsCurrency(String originalNetProceedsCurrency) {
		this.originalNetProceedsCurrency = originalNetProceedsCurrency;
	}

	public OffsetDateTime getExpirationDate() {
		return expirationDate;
	}

	public void setExpirationDate(OffsetDateTime expirationDate) {
		this.expirationDate = expirationDate;
	}

}
