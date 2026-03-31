package org.oxerr.stubhub.client.model;

import java.util.UUID;

public class SellerUserResponse {

	private UUID sellerUserId;

	private String sellerEmail;

	private String authenticationUrl;

	private String userName;

	public UUID getSellerUserId() {
		return sellerUserId;
	}

	public void setSellerUserId(UUID sellerUserId) {
		this.sellerUserId = sellerUserId;
	}

	public String getSellerEmail() {
		return sellerEmail;
	}

	public void setSellerEmail(String sellerEmail) {
		this.sellerEmail = sellerEmail;
	}

	public String getAuthenticationUrl() {
		return authenticationUrl;
	}

	public void setAuthenticationUrl(String authenticationUrl) {
		this.authenticationUrl = authenticationUrl;
	}

	public String getUserName() {
		return userName;
	}

	public void setUserName(String userName) {
		this.userName = userName;
	}

}
