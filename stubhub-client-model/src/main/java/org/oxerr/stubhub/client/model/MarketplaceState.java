package org.oxerr.stubhub.client.model;

public class MarketplaceState {

	private String fullfilmentState;

	private String paymentState;

	private String contractState;

	public String getFullfilmentState() {
		return fullfilmentState;
	}

	public void setFullfilmentState(String fullfilmentState) {
		this.fullfilmentState = fullfilmentState;
	}

	public String getPaymentState() {
		return paymentState;
	}

	public void setPaymentState(String paymentState) {
		this.paymentState = paymentState;
	}

	public String getContractState() {
		return contractState;
	}

	public void setContractState(String contractState) {
		this.contractState = contractState;
	}

}
