package org.oxerr.stubhub.client.model;

public class VendorResponse {

	private Integer vendorId;

	private String vendorName;

	private String vendorAccountName;

	private String vendorAccountEmail;

	private Long purchaseOrderId;

	private Boolean isAlternativeDeliveryAccount;

	public Integer getVendorId() {
		return vendorId;
	}

	public void setVendorId(Integer vendorId) {
		this.vendorId = vendorId;
	}

	public String getVendorName() {
		return vendorName;
	}

	public void setVendorName(String vendorName) {
		this.vendorName = vendorName;
	}

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

	public Long getPurchaseOrderId() {
		return purchaseOrderId;
	}

	public void setPurchaseOrderId(Long purchaseOrderId) {
		this.purchaseOrderId = purchaseOrderId;
	}

	public Boolean getIsAlternativeDeliveryAccount() {
		return isAlternativeDeliveryAccount;
	}

	public void setIsAlternativeDeliveryAccount(Boolean isAlternativeDeliveryAccount) {
		this.isAlternativeDeliveryAccount = isAlternativeDeliveryAccount;
	}

}
