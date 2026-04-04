package org.oxerr.stubhub.client.model;

public class InventoryBroadcastUpdateRequest {

	private ApiMarketplace marketplace;

	private ApiMarketplaceBroadcastState marketplaceBroadcastState;

	private ApiPosBroadcastState posBroadcastState;

	public ApiMarketplace getMarketplace() {
		return marketplace;
	}

	public void setMarketplace(ApiMarketplace marketplace) {
		this.marketplace = marketplace;
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

}
