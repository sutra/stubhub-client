package org.oxerr.stubhub.client.model;

import java.util.List;

public class SearchListingsResponse {

	private Long nextPaginationToken;

	private List<ListingResponse> data;

	public Long getNextPaginationToken() {
		return nextPaginationToken;
	}

	public void setNextPaginationToken(Long nextPaginationToken) {
		this.nextPaginationToken = nextPaginationToken;
	}

	public List<ListingResponse> getData() {
		return data;
	}

	public void setData(List<ListingResponse> data) {
		this.data = data;
	}

}
