package org.oxerr.stubhub.client.model;

import java.math.BigDecimal;

public class InventoryPriceUpdateRequest {

	/**
	 * AllInPrice is the broadcasted price with taxes / fees
	 */
	private BigDecimal allInPrice;

	/**
	 * ListPrice is unit price
	 */
	private BigDecimal listPrice;

	private ApiMarketplace marketplace;

	/**
	 * Manually set the markup specific to the current marketplace listing.
	 * If not set or False, AllInPrice or ListPrice must be provided for price update.
	 */
	private BigDecimal marketplaceMarkup;

	/**
	 * When the field is set to True, AllInPrice or ListPrice must be provided
	 * for price update. If not set or False, price update will use AllInPrice,
	 * or ListPrice, or derived prices from MarketplaceMarkup.
	 */
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

	public ApiMarketplace getMarketplace() {
		return marketplace;
	}

	public void setMarketplace(ApiMarketplace marketplace) {
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
