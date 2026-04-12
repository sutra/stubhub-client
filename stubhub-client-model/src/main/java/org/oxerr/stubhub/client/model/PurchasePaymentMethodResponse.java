package org.oxerr.stubhub.client.model;

public class PurchasePaymentMethodResponse {

	private Integer id;

	private String hashedPaymentMethod;

	private String name;

	private ApiPurchasePaymentMethodType type;

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getHashedPaymentMethod() {
		return hashedPaymentMethod;
	}

	public void setHashedPaymentMethod(String hashedPaymentMethod) {
		this.hashedPaymentMethod = hashedPaymentMethod;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public ApiPurchasePaymentMethodType getType() {
		return type;
	}

	public void setType(ApiPurchasePaymentMethodType type) {
		this.type = type;
	}

}
