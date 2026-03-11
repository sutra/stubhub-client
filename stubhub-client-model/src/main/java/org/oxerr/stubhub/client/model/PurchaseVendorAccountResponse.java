package org.oxerr.stubhub.client.model;

import java.util.UUID;

public class PurchaseVendorAccountResponse {

	private String vendorAccountName;

	private String vendorAccountEmail;

	private String vendorAccountPassword;

	private UUID vendorAccountId;

	private PurchaseVendorResponse vendor;

	private UUID defaultBuyerUserId;

	private Integer defaultPurchasePaymentMethodId;

	private ProxyDto proxy;

	private String cookie;

	public String getVendorAccountName() {
		return vendorAccountName;
	}

	public void setVendorAccountName(String vendorAccountName) {
		this.vendorAccountName = vendorAccountName;
	}

	public String getVendorAccountEmail() {
		return vendorAccountEmail;
	}

	public void setVendorAccountEmail(String vendorAccountEmail) {
		this.vendorAccountEmail = vendorAccountEmail;
	}

	public String getVendorAccountPassword() {
		return vendorAccountPassword;
	}

	public void setVendorAccountPassword(String vendorAccountPassword) {
		this.vendorAccountPassword = vendorAccountPassword;
	}

	public UUID getVendorAccountId() {
		return vendorAccountId;
	}

	public void setVendorAccountId(UUID vendorAccountId) {
		this.vendorAccountId = vendorAccountId;
	}

	public PurchaseVendorResponse getVendor() {
		return vendor;
	}

	public void setVendor(PurchaseVendorResponse vendor) {
		this.vendor = vendor;
	}

	public UUID getDefaultBuyerUserId() {
		return defaultBuyerUserId;
	}

	public void setDefaultBuyerUserId(UUID defaultBuyerUserId) {
		this.defaultBuyerUserId = defaultBuyerUserId;
	}

	public Integer getDefaultPurchasePaymentMethodId() {
		return defaultPurchasePaymentMethodId;
	}

	public void setDefaultPurchasePaymentMethodId(Integer defaultPurchasePaymentMethodId) {
		this.defaultPurchasePaymentMethodId = defaultPurchasePaymentMethodId;
	}

	public ProxyDto getProxy() {
		return proxy;
	}

	public void setProxy(ProxyDto proxy) {
		this.proxy = proxy;
	}

	public String getCookie() {
		return cookie;
	}

	public void setCookie(String cookie) {
		this.cookie = cookie;
	}

}
