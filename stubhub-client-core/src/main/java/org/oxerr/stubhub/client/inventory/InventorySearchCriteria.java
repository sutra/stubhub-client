package org.oxerr.stubhub.client.inventory;

import java.time.OffsetDateTime;
import java.util.List;
import java.util.UUID;

public class InventorySearchCriteria {

	private List<Integer> eventIds;

	private List<Integer> categoryIds;

	private List<String> includeTags;

	private List<String> excludeTags;

	private OffsetDateTime purchaseStartDate;

	private OffsetDateTime purchaseEndDate;

	private Integer maxPageSize;

	private Long paginationToken;

	private Boolean includePastEvents;

	private Boolean includeBuyerCommissionsPerTicket;

	private UUID eventMappingId;

	private String vendorName;

	private String eventSearchText;

	private String tagKey;

	private String tagValue;

	public List<Integer> getEventIds() {
		return eventIds;
	}

	public void setEventIds(List<Integer> eventIds) {
		this.eventIds = eventIds;
	}

	public List<Integer> getCategoryIds() {
		return categoryIds;
	}

	public void setCategoryIds(List<Integer> categoryIds) {
		this.categoryIds = categoryIds;
	}

	public List<String> getIncludeTags() {
		return includeTags;
	}

	public void setIncludeTags(List<String> includeTags) {
		this.includeTags = includeTags;
	}

	public List<String> getExcludeTags() {
		return excludeTags;
	}

	public void setExcludeTags(List<String> excludeTags) {
		this.excludeTags = excludeTags;
	}

	public OffsetDateTime getPurchaseStartDate() {
		return purchaseStartDate;
	}

	public void setPurchaseStartDate(OffsetDateTime purchaseStartDate) {
		this.purchaseStartDate = purchaseStartDate;
	}

	public OffsetDateTime getPurchaseEndDate() {
		return purchaseEndDate;
	}

	public void setPurchaseEndDate(OffsetDateTime purchaseEndDate) {
		this.purchaseEndDate = purchaseEndDate;
	}

	public Integer getMaxPageSize() {
		return maxPageSize;
	}

	public void setMaxPageSize(Integer maxPageSize) {
		this.maxPageSize = maxPageSize;
	}

	public Long getPaginationToken() {
		return paginationToken;
	}

	public void setPaginationToken(Long paginationToken) {
		this.paginationToken = paginationToken;
	}

	public Boolean getIncludePastEvents() {
		return includePastEvents;
	}

	public void setIncludePastEvents(Boolean includePastEvents) {
		this.includePastEvents = includePastEvents;
	}

	public Boolean getIncludeBuyerCommissionsPerTicket() {
		return includeBuyerCommissionsPerTicket;
	}

	public void setIncludeBuyerCommissionsPerTicket(Boolean includeBuyerCommissionsPerTicket) {
		this.includeBuyerCommissionsPerTicket = includeBuyerCommissionsPerTicket;
	}

	public UUID getEventMappingId() {
		return eventMappingId;
	}

	public void setEventMappingId(UUID eventMappingId) {
		this.eventMappingId = eventMappingId;
	}

	public String getVendorName() {
		return vendorName;
	}

	public void setVendorName(String vendorName) {
		this.vendorName = vendorName;
	}

	public String getEventSearchText() {
		return eventSearchText;
	}

	public void setEventSearchText(String eventSearchText) {
		this.eventSearchText = eventSearchText;
	}

	public String getTagKey() {
		return tagKey;
	}

	public void setTagKey(String tagKey) {
		this.tagKey = tagKey;
	}

	public String getTagValue() {
		return tagValue;
	}

	public void setTagValue(String tagValue) {
		this.tagValue = tagValue;
	}

}
