package org.oxerr.stubhub.client.model;

public class PosState {

	private String fullfilmentState;

	private String allocationState;

	private String saleStatus;

	public String getFullfilmentState() {
		return fullfilmentState;
	}

	public void setFullfilmentState(String fullfilmentState) {
		this.fullfilmentState = fullfilmentState;
	}

	public String getAllocationState() {
		return allocationState;
	}

	public void setAllocationState(String allocationState) {
		this.allocationState = allocationState;
	}

	public String getSaleStatus() {
		return saleStatus;
	}

	public void setSaleStatus(String saleStatus) {
		this.saleStatus = saleStatus;
	}

}
