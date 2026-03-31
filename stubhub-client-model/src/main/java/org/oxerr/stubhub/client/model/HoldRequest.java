package org.oxerr.stubhub.client.model;

import java.math.BigDecimal;
import java.util.List;

public class HoldRequest {

	private Long inventoryId;

	private String marketplace;

	private String marketplaceSaleId;

	private String marketplaceListingId;

	private SeatingRequest seating;

	private BigDecimal totalNetProceeds;

	private String currencyCode;

	private Integer quantitySold;

	private String saleDate;

	private String expirationDate;

	private List<TagRequest> tags;

	private String inHandAt;

	public Long getInventoryId() {
		return inventoryId;
	}

	public void setInventoryId(Long inventoryId) {
		this.inventoryId = inventoryId;
	}

	public String getMarketplace() {
		return marketplace;
	}

	public void setMarketplace(String marketplace) {
		this.marketplace = marketplace;
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

	public SeatingRequest getSeating() {
		return seating;
	}

	public void setSeating(SeatingRequest seating) {
		this.seating = seating;
	}

	public BigDecimal getTotalNetProceeds() {
		return totalNetProceeds;
	}

	public void setTotalNetProceeds(BigDecimal totalNetProceeds) {
		this.totalNetProceeds = totalNetProceeds;
	}

	public String getCurrencyCode() {
		return currencyCode;
	}

	public void setCurrencyCode(String currencyCode) {
		this.currencyCode = currencyCode;
	}

	public Integer getQuantitySold() {
		return quantitySold;
	}

	public void setQuantitySold(Integer quantitySold) {
		this.quantitySold = quantitySold;
	}

	public String getSaleDate() {
		return saleDate;
	}

	public void setSaleDate(String saleDate) {
		this.saleDate = saleDate;
	}

	public String getExpirationDate() {
		return expirationDate;
	}

	public void setExpirationDate(String expirationDate) {
		this.expirationDate = expirationDate;
	}

	public List<TagRequest> getTags() {
		return tags;
	}

	public void setTags(List<TagRequest> tags) {
		this.tags = tags;
	}

	public String getInHandAt() {
		return inHandAt;
	}

	public void setInHandAt(String inHandAt) {
		this.inHandAt = inHandAt;
	}

}
