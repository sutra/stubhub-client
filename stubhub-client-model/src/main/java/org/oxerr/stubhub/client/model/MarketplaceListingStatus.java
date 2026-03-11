package org.oxerr.stubhub.client.model;

import java.util.List;

public class MarketplaceListingStatus {

	private String listingStatus;

	private String marketplaceBroadcastState;

	private String posBroadcastState;

	private List<String> broadcastErrors;

	private String marketplaceName;

	private String marketplaceListingId;

	private String marketPlaceEventIdOverride;

	public String getListingStatus() {
		return listingStatus;
	}

	public void setListingStatus(String listingStatus) {
		this.listingStatus = listingStatus;
	}

	public String getMarketplaceBroadcastState() {
		return marketplaceBroadcastState;
	}

	public void setMarketplaceBroadcastState(String marketplaceBroadcastState) {
		this.marketplaceBroadcastState = marketplaceBroadcastState;
	}

	public String getPosBroadcastState() {
		return posBroadcastState;
	}

	public void setPosBroadcastState(String posBroadcastState) {
		this.posBroadcastState = posBroadcastState;
	}

	public List<String> getBroadcastErrors() {
		return broadcastErrors;
	}

	public void setBroadcastErrors(List<String> broadcastErrors) {
		this.broadcastErrors = broadcastErrors;
	}

	public String getMarketplaceName() {
		return marketplaceName;
	}

	public void setMarketplaceName(String marketplaceName) {
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
