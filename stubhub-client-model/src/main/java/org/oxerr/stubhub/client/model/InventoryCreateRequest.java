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

	private String deliveryType;

	private BigDecimal deliveryCost;

	private EventRequest event;

	private EventMappingRequest eventMapping;

	private String primaryEventId;

	private OffsetDateTime inHandAt;

	private String splitType;

	private Integer maxDisplayQuantity;

	private PurchaseSeatingRequest seating;

	private Integer ticketCount;

	private List<ListingNoteRequest> listingNotes;

	private Boolean autoBroadcast;

	private String internalNotes;

	private String preDeliveryState;

	private String externalId;

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

	public String getDeliveryType() {
		return deliveryType;
	}

	public void setDeliveryType(String deliveryType) {
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

	public String getSplitType() {
		return splitType;
	}

	public void setSplitType(String splitType) {
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
