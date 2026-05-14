package org.oxerr.stubhub.client.model;

import java.math.BigDecimal;
import java.time.OffsetDateTime;
import java.util.List;

public class InventoryCreateRequest {

	private String currencyCode;

	private BigDecimal unitCost;

	private BigDecimal expectedValue;

	private BigDecimal taxPaid;

	private BigDecimal faceValueCost;

	private ApiDeliveryType deliveryType;

	private BigDecimal deliveryCost;

	private EventRequest event;

	private EventMappingRequest eventMapping;

	/**
	 * Primary Event Id is the event ID from the primary vendor.
	 * It is used to map the event quickly.
	 */
	private String primaryEventId;

	/**
	 * Given a Sale can consist of tickets purchased at different times,
	 * this should be the latest date that all tickets are in hand.
	 * This is a seller-provided field and it does not have to coincide
	 * with listings or purchase orders.
	 */
	private OffsetDateTime inHandAt;

	/**
	 * How the inventory may be split.
	 *
	 * Allowable values:
	 * - Any
	 * - None
	 * - AvoidOne
	 * - AvoidOneAndThree
	 * - Pairs
	 */
	private ApiSplitType splitType;

	/**
	 * Max display quantity
	 */
	private Integer maxDisplayQuantity;

	private PurchaseSeatingRequest seating;

	/**
	 * The number of tickets in this set.
	 *
	 * - For Sale, it would be the same as QuantitySold
	 * - but this is the physical number of allocated tickets.
	 * - For Listing for PO, it would just mean the number of tickets listed.
	 */
	private Integer ticketCount;

	/**
	 * List of Listing Note Request.
	 */
	private List<ListingNoteRequest> listingNotes;

	/**
	 * Autobroadcast listings after the purchase order is created.
	 */
	private Boolean autoBroadcast;

	/**
	 * Listing internal notes.
	 */
	private String internalNotes;

	/**
	 * PreDeliveryState Values:
	 * - Yes
	 * - No
	 * - null
	 */
	private String preDeliveryState;

	/**
	 * Unique identifier for the inventory.
	 */
	private String externalId;

	/**
	 * Developer specified tags.
	 */
	private List<TagRequest> tags;

	private InventoryAdminHoldRequest adminHold;

	private Boolean zoneFill;

	private InventoryPricingSettingRequest pricingSetting;

	private UpdateListingPricingSettingsRequest autoPricingSettings;

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

	public BigDecimal getExpectedValue() {
		return expectedValue;
	}

	public void setExpectedValue(BigDecimal expectedValue) {
		this.expectedValue = expectedValue;
	}

	public BigDecimal getTaxPaid() {
		return taxPaid;
	}

	public void setTaxPaid(BigDecimal taxPaid) {
		this.taxPaid = taxPaid;
	}

	public BigDecimal getFaceValueCost() {
		return faceValueCost;
	}

	public void setFaceValueCost(BigDecimal faceValueCost) {
		this.faceValueCost = faceValueCost;
	}

	public ApiDeliveryType getDeliveryType() {
		return deliveryType;
	}

	public void setDeliveryType(ApiDeliveryType deliveryType) {
		this.deliveryType = deliveryType;
	}

	public BigDecimal getDeliveryCost() {
		return deliveryCost;
	}

	public void setDeliveryCost(BigDecimal deliveryCost) {
		this.deliveryCost = deliveryCost;
	}

	public EventRequest getEvent() {
		return event;
	}

	public void setEvent(EventRequest event) {
		this.event = event;
	}

	public EventMappingRequest getEventMapping() {
		return eventMapping;
	}

	public void setEventMapping(EventMappingRequest eventMapping) {
		this.eventMapping = eventMapping;
	}

	public String getPrimaryEventId() {
		return primaryEventId;
	}

	public void setPrimaryEventId(String primaryEventId) {
		this.primaryEventId = primaryEventId;
	}

	public OffsetDateTime getInHandAt() {
		return inHandAt;
	}

	public void setInHandAt(OffsetDateTime inHandAt) {
		this.inHandAt = inHandAt;
	}

	public ApiSplitType getSplitType() {
		return splitType;
	}

	public void setSplitType(ApiSplitType splitType) {
		this.splitType = splitType;
	}

	public Integer getMaxDisplayQuantity() {
		return maxDisplayQuantity;
	}

	public void setMaxDisplayQuantity(Integer maxDisplayQuantity) {
		this.maxDisplayQuantity = maxDisplayQuantity;
	}

	public PurchaseSeatingRequest getSeating() {
		return seating;
	}

	public void setSeating(PurchaseSeatingRequest seating) {
		this.seating = seating;
	}

	public Integer getTicketCount() {
		return ticketCount;
	}

	public void setTicketCount(Integer ticketCount) {
		this.ticketCount = ticketCount;
	}

	public List<ListingNoteRequest> getListingNotes() {
		return listingNotes;
	}

	public void setListingNotes(List<ListingNoteRequest> listingNotes) {
		this.listingNotes = listingNotes;
	}

	public Boolean getAutoBroadcast() {
		return autoBroadcast;
	}

	public void setAutoBroadcast(Boolean autoBroadcast) {
		this.autoBroadcast = autoBroadcast;
	}

	public String getInternalNotes() {
		return internalNotes;
	}

	public void setInternalNotes(String internalNotes) {
		this.internalNotes = internalNotes;
	}

	public String getPreDeliveryState() {
		return preDeliveryState;
	}

	public void setPreDeliveryState(String preDeliveryState) {
		this.preDeliveryState = preDeliveryState;
	}

	public String getExternalId() {
		return externalId;
	}

	public void setExternalId(String externalId) {
		this.externalId = externalId;
	}

	public List<TagRequest> getTags() {
		return tags;
	}

	public void setTags(List<TagRequest> tags) {
		this.tags = tags;
	}

	public InventoryAdminHoldRequest getAdminHold() {
		return adminHold;
	}

	public void setAdminHold(InventoryAdminHoldRequest adminHold) {
		this.adminHold = adminHold;
	}

	public Boolean getZoneFill() {
		return zoneFill;
	}

	public void setZoneFill(Boolean zoneFill) {
		this.zoneFill = zoneFill;
	}

	public InventoryPricingSettingRequest getPricingSetting() {
		return pricingSetting;
	}

	public void setPricingSetting(InventoryPricingSettingRequest pricingSetting) {
		this.pricingSetting = pricingSetting;
	}

	public UpdateListingPricingSettingsRequest getAutoPricingSettings() {
		return autoPricingSettings;
	}

	public void setAutoPricingSettings(UpdateListingPricingSettingsRequest autoPricingSettings) {
		this.autoPricingSettings = autoPricingSettings;
	}

}
