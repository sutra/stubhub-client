package org.oxerr.stubhub.client.model;

import java.util.UUID;

public class SellerAccountResponse {

	private UUID sellerAccountId;

	private String sellerAccountName;

	public UUID getSellerAccountId() {
		return sellerAccountId;
	}

	public void setSellerAccountId(UUID sellerAccountId) {
		this.sellerAccountId = sellerAccountId;
	}

	public String getSellerAccountName() {
		return sellerAccountName;
	}

	public void setSellerAccountName(String sellerAccountName) {
		this.sellerAccountName = sellerAccountName;
	}

}
