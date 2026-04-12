package org.oxerr.stubhub.client.model;

import java.math.BigDecimal;
import java.time.OffsetDateTime;
import java.util.List;

public class TicketGroupResponse {

	private EventMappingResponse eventMapping;

	private EventResponse event;

	private VenueResponse venue;

	private PerformerResponse performer;

	private Long id;

	private OffsetDateTime inHandAt;

	private SeatingResponse seating;

	private Integer ticketCount;

	private List<ListingNoteResponse> listingNotes;

	private List<TicketResponse> tickets;

	private String currencyCode;

	private BigDecimal unitCost;

	private BigDecimal totalCost;

	private BigDecimal expectedValue;

	private BigDecimal taxPaid;

	private Boolean isFaceValueCost;

	private BigDecimal faceValueCost;

	private String deliveryType;

	private BigDecimal deliveryCost;

	private String externalId;

	private List<TagResponse> tags;

	private BigDecimal totalEstimatedCost;

	private String totalEstimatedCostCurrency;

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

	public Integer getTicketCount() {
		return ticketCount;
	}

	public void setTicketCount(Integer ticketCount) {
		this.ticketCount = ticketCount;
	}

	public List<ListingNoteResponse> getListingNotes() {
		return listingNotes;
	}

	public void setListingNotes(List<ListingNoteResponse> listingNotes) {
		this.listingNotes = listingNotes;
	}

	public List<TicketResponse> getTickets() {
		return tickets;
	}

	public void setTickets(List<TicketResponse> tickets) {
		this.tickets = tickets;
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

	public BigDecimal getTotalCost() {
		return totalCost;
	}

	public void setTotalCost(BigDecimal totalCost) {
		this.totalCost = totalCost;
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

	public Boolean getIsFaceValueCost() {
		return isFaceValueCost;
	}

	public void setIsFaceValueCost(Boolean isFaceValueCost) {
		this.isFaceValueCost = isFaceValueCost;
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

	public String getExternalId() {
		return externalId;
	}

	public void setExternalId(String externalId) {
		this.externalId = externalId;
	}

	public List<TagResponse> getTags() {
		return tags;
	}

	public void setTags(List<TagResponse> tags) {
		this.tags = tags;
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
