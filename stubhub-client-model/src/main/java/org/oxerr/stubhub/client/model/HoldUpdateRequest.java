package org.oxerr.stubhub.client.model;

import java.util.List;

public class HoldUpdateRequest {

	private String expirationDate;

	private List<TagRequest> tags;

	public String getExpirationDate() {
		return expirationDate;
	}

	public void setExpirationDate(String expirationDate) {
		this.expirationDate = expirationDate;
	}

	public List<TagRequest> getTags() {
		return tags;
	}

	public void setTags(List<TagRequest> tags) {
		this.tags = tags;
	}

}
