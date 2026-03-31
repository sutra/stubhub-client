package org.oxerr.stubhub.client.model;

import java.math.BigDecimal;
import java.time.LocalDateTime;
import java.util.List;
import java.util.UUID;

public class ListingResponse {

	private EventMappingResponse eventMapping;

	private EventResponse event;

	private VenueResponse venue;

	private PerformerResponse performer;

	private Long id;

	private LocalDateTime inHandAt;

	private ListingSeatingResponse seating;

	private List<ListingNoteResponse> listingNotes;

	private String currencyCode;

	private BigDecimal unitCost;

	private BigDecimal taxedCost;

	private Integer availableQuantity;

	private Integer maxDisplayQuantity;

	private Boolean isPreDelivered;

	private SplitType splitType;

	private String splitTypeValue;

	private Boolean hideSeatsFromMarketplace;

	private List<TicketResponse> tickets;

	private Boolean instantTransfer;

	private BigDecimal faceValue;

	private List<StockTypeMapping> stockType;

	private String internalNotes;

	private List<TagResponse> tags;

	private Long resourceVersion;

	private String externalId;

	private BigDecimal totalCost;

	private Boolean zoneFill;

	private AdminHoldResponse adminHold;

	private Boolean isExpired;

	private UUID sellerAccountId;

	private Long duplicatedListingId;

	private Boolean isGeneralAdmission;

	private List<MarketplacePricingInfo> listingPricesByMarketplace;

	private List<MarketplaceListingStatus> listingStatusByMarketplace;

	private List<MarketplaceSeatingOverrideInfo> seatingOverridesByMarketplace;

	private UUID pricerUserId;

	private PricingSetting pricingSetting;

	private Boolean isBroadcast;

	private LocalDateTime lastPriceUpdatedDate;

	private Boolean autoFulfill;

	private UUID listingGroupId;

	private Integer listingGroupPriority;

	private Long exchangePosId;

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

	public LocalDateTime getInHandAt() {
		return inHandAt;
	}

	public void setInHandAt(LocalDateTime inHandAt) {
		this.inHandAt = inHandAt;
	}

	public ListingSeatingResponse getSeating() {
		return seating;
	}

	public void setSeating(ListingSeatingResponse seating) {
		this.seating = seating;
	}

	public List<ListingNoteResponse> getListingNotes() {
		return listingNotes;
	}

	public void setListingNotes(List<ListingNoteResponse> listingNotes) {
		this.listingNotes = listingNotes;
	}

	public String getCurrencyCode() {
		return currencyCode;
	}

	public void setCurrencyCode(String currencyCode) {
		this.currencyCode = currencyCode;
	}

	public BigDecimal getUnitCost() {
		return unitCost;
	}

	public void setUnitCost(BigDecimal unitCost) {
		this.unitCost = unitCost;
	}

	public BigDecimal getTaxedCost() {
		return taxedCost;
	}

	public void setTaxedCost(BigDecimal taxedCost) {
		this.taxedCost = taxedCost;
	}

	public Integer getAvailableQuantity() {
		return availableQuantity;
	}

	public void setAvailableQuantity(Integer availableQuantity) {
		this.availableQuantity = availableQuantity;
	}

	public Integer getMaxDisplayQuantity() {
		return maxDisplayQuantity;
	}

	public void setMaxDisplayQuantity(Integer maxDisplayQuantity) {
		this.maxDisplayQuantity = maxDisplayQuantity;
	}

	public Boolean getIsPreDelivered() {
		return isPreDelivered;
	}

	public void setIsPreDelivered(Boolean isPreDelivered) {
		this.isPreDelivered = isPreDelivered;
	}

	public SplitType getSplitType() {
		return splitType;
	}

	public void setSplitType(SplitType splitType) {
		this.splitType = splitType;
	}

	public String getSplitTypeValue() {
		return splitTypeValue;
	}

	public void setSplitTypeValue(String splitTypeValue) {
		this.splitTypeValue = splitTypeValue;
	}

	public Boolean getHideSeatsFromMarketplace() {
		return hideSeatsFromMarketplace;
	}

	public void setHideSeatsFromMarketplace(Boolean hideSeatsFromMarketplace) {
		this.hideSeatsFromMarketplace = hideSeatsFromMarketplace;
	}

	public List<TicketResponse> getTickets() {
		return tickets;
	}

	public void setTickets(List<TicketResponse> tickets) {
		this.tickets = tickets;
	}

	public Boolean getInstantTransfer() {
		return instantTransfer;
	}

	public void setInstantTransfer(Boolean instantTransfer) {
		this.instantTransfer = instantTransfer;
	}

	public BigDecimal getFaceValue() {
		return faceValue;
	}

	public void setFaceValue(BigDecimal faceValue) {
		this.faceValue = faceValue;
	}

	public List<StockTypeMapping> getStockType() {
		return stockType;
	}

	public void setStockType(List<StockTypeMapping> stockType) {
		this.stockType = stockType;
	}

	public String getInternalNotes() {
		return internalNotes;
	}

	public void setInternalNotes(String internalNotes) {
		this.internalNotes = internalNotes;
	}

	public List<TagResponse> getTags() {
		return tags;
	}

	public void setTags(List<TagResponse> tags) {
		this.tags = tags;
	}

	public Long getResourceVersion() {
		return resourceVersion;
	}

	public void setResourceVersion(Long resourceVersion) {
		this.resourceVersion = resourceVersion;
	}

	public String getExternalId() {
		return externalId;
	}

	public void setExternalId(String externalId) {
		this.externalId = externalId;
	}

	public BigDecimal getTotalCost() {
		return totalCost;
	}

	public void setTotalCost(BigDecimal totalCost) {
		this.totalCost = totalCost;
	}

	public Boolean getZoneFill() {
		return zoneFill;
	}

	public void setZoneFill(Boolean zoneFill) {
		this.zoneFill = zoneFill;
	}

	public AdminHoldResponse getAdminHold() {
		return adminHold;
	}

	public void setAdminHold(AdminHoldResponse adminHold) {
		this.adminHold = adminHold;
	}

	public Boolean getIsExpired() {
		return isExpired;
	}

	public void setIsExpired(Boolean isExpired) {
		this.isExpired = isExpired;
	}

	public UUID getSellerAccountId() {
		return sellerAccountId;
	}

	public void setSellerAccountId(UUID sellerAccountId) {
		this.sellerAccountId = sellerAccountId;
	}

	public Long getDuplicatedListingId() {
		return duplicatedListingId;
	}

	public void setDuplicatedListingId(Long duplicatedListingId) {
		this.duplicatedListingId = duplicatedListingId;
	}

	public Boolean getIsGeneralAdmission() {
		return isGeneralAdmission;
	}

	public void setIsGeneralAdmission(Boolean isGeneralAdmission) {
		this.isGeneralAdmission = isGeneralAdmission;
	}

	public List<MarketplacePricingInfo> getListingPricesByMarketplace() {
		return listingPricesByMarketplace;
	}

	public void setListingPricesByMarketplace(List<MarketplacePricingInfo> listingPricesByMarketplace) {
		this.listingPricesByMarketplace = listingPricesByMarketplace;
	}

	public List<MarketplaceListingStatus> getListingStatusByMarketplace() {
		return listingStatusByMarketplace;
	}

	public void setListingStatusByMarketplace(List<MarketplaceListingStatus> listingStatusByMarketplace) {
		this.listingStatusByMarketplace = listingStatusByMarketplace;
	}

	public List<MarketplaceSeatingOverrideInfo> getSeatingOverridesByMarketplace() {
		return seatingOverridesByMarketplace;
	}

	public void setSeatingOverridesByMarketplace(List<MarketplaceSeatingOverrideInfo> seatingOverridesByMarketplace) {
		this.seatingOverridesByMarketplace = seatingOverridesByMarketplace;
	}

	public UUID getPricerUserId() {
		return pricerUserId;
	}

	public void setPricerUserId(UUID pricerUserId) {
		this.pricerUserId = pricerUserId;
	}

	public PricingSetting getPricingSetting() {
		return pricingSetting;
	}

	public void setPricingSetting(PricingSetting pricingSetting) {
		this.pricingSetting = pricingSetting;
	}

	public Boolean getIsBroadcast() {
		return isBroadcast;
	}

	public void setIsBroadcast(Boolean isBroadcast) {
		this.isBroadcast = isBroadcast;
	}

	public LocalDateTime getLastPriceUpdatedDate() {
		return lastPriceUpdatedDate;
	}

	public void setLastPriceUpdatedDate(LocalDateTime lastPriceUpdatedDate) {
		this.lastPriceUpdatedDate = lastPriceUpdatedDate;
	}

	public Boolean getAutoFulfill() {
		return autoFulfill;
	}

	public void setAutoFulfill(Boolean autoFulfill) {
		this.autoFulfill = autoFulfill;
	}

	public UUID getListingGroupId() {
		return listingGroupId;
	}

	public void setListingGroupId(UUID listingGroupId) {
		this.listingGroupId = listingGroupId;
	}

	public Integer getListingGroupPriority() {
		return listingGroupPriority;
	}

	public void setListingGroupPriority(Integer listingGroupPriority) {
		this.listingGroupPriority = listingGroupPriority;
	}

	public Long getExchangePosId() {
		return exchangePosId;
	}

	public void setExchangePosId(Long exchangePosId) {
		this.exchangePosId = exchangePosId;
	}

}
