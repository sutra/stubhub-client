package org.oxerr.stubhub.client.model;

import java.math.BigDecimal;

public class InventoryPriceUpdateRequest {

	private BigDecimal allInPrice;

	private BigDecimal listPrice;

	private String marketplace;

	private BigDecimal marketplaceMarkup;

	private Boolean priceByMarketplace;

	public BigDecimal getAllInPrice() {
		return allInPrice;
	}

	public void setAllInPrice(BigDecimal allInPrice) {
		this.allInPrice = allInPrice;
	}

	public BigDecimal getListPrice() {
		return listPrice;
	}

	public void setListPrice(BigDecimal listPrice) {
		this.listPrice = listPrice;
	}

	public String getMarketplace() {
		return marketplace;
	}

	public void setMarketplace(String marketplace) {
		this.marketplace = marketplace;
	}

	public BigDecimal getMarketplaceMarkup() {
		return marketplaceMarkup;
	}

	public void setMarketplaceMarkup(BigDecimal marketplaceMarkup) {
		this.marketplaceMarkup = marketplaceMarkup;
	}

	public Boolean getPriceByMarketplace() {
		return priceByMarketplace;
	}

	public void setPriceByMarketplace(Boolean priceByMarketplace) {
		this.priceByMarketplace = priceByMarketplace;
	}

}
