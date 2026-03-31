package org.oxerr.stubhub.client.model;

import java.math.BigDecimal;

public class MarketplacePricingInfo {

	private BigDecimal allInPrice;

	private BigDecimal listPrice;

	private String marketplaceName;

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

	public String getMarketplaceName() {
		return marketplaceName;
	}

	public void setMarketplaceName(String marketplaceName) {
		this.marketplaceName = marketplaceName;
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
