package org.oxerr.stubhub.client.model;

import java.util.List;

public class PurchaseExportResponse {

	private Long paginationToken;

	private Integer numberOfItems;

	private List<PurchaseResponse> purchases;

	public Long getPaginationToken() {
		return paginationToken;
	}

	public void setPaginationToken(Long paginationToken) {
		this.paginationToken = paginationToken;
	}

	public Integer getNumberOfItems() {
		return numberOfItems;
	}

	public void setNumberOfItems(Integer numberOfItems) {
		this.numberOfItems = numberOfItems;
	}

	public List<PurchaseResponse> getPurchases() {
		return purchases;
	}

	public void setPurchases(List<PurchaseResponse> purchases) {
		this.purchases = purchases;
	}

}
