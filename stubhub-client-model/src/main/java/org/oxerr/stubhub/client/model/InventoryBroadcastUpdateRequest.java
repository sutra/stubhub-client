package org.oxerr.stubhub.client.model;

public class InventoryBroadcastUpdateRequest {

	private String marketplace;

	private String marketplaceBroadcastState;

	private String posBroadcastState;

	public String getMarketplace() {
		return marketplace;
	}

	public void setMarketplace(String marketplace) {
		this.marketplace = marketplace;
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

}
