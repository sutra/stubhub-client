package org.oxerr.stubhub.client.model;

import java.util.List;

public class MarketplaceListingStatus {

	private String listingStatus;

	private ApiMarketplaceBroadcastState marketplaceBroadcastState;

	private ApiPosBroadcastState posBroadcastState;

	private List<String> broadcastErrors;

	private ApiMarketplace marketplaceName;

	private String marketplaceListingId;

	private String marketPlaceEventIdOverride;

	public String getListingStatus() {
		return listingStatus;
	}

	public void setListingStatus(String listingStatus) {
		this.listingStatus = listingStatus;
	}

	public ApiMarketplaceBroadcastState getMarketplaceBroadcastState() {
		return marketplaceBroadcastState;
	}

	public void setMarketplaceBroadcastState(ApiMarketplaceBroadcastState marketplaceBroadcastState) {
		this.marketplaceBroadcastState = marketplaceBroadcastState;
	}

	public ApiPosBroadcastState getPosBroadcastState() {
		return posBroadcastState;
	}

	public void setPosBroadcastState(ApiPosBroadcastState posBroadcastState) {
		this.posBroadcastState = posBroadcastState;
	}

	public List<String> getBroadcastErrors() {
		return broadcastErrors;
	}

	public void setBroadcastErrors(List<String> broadcastErrors) {
		this.broadcastErrors = broadcastErrors;
	}

	public ApiMarketplace getMarketplaceName() {
		return marketplaceName;
	}

	public void setMarketplaceName(ApiMarketplace marketplaceName) {
		this.marketplaceName = marketplaceName;
	}

	public String getMarketplaceListingId() {
		return marketplaceListingId;
	}

	public void setMarketplaceListingId(String marketplaceListingId) {
		this.marketplaceListingId = marketplaceListingId;
	}

	public String getMarketPlaceEventIdOverride() {
		return marketPlaceEventIdOverride;
	}

	public void setMarketPlaceEventIdOverride(String marketPlaceEventIdOverride) {
		this.marketPlaceEventIdOverride = marketPlaceEventIdOverride;
	}

}
