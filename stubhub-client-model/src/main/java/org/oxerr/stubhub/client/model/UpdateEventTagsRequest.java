package org.oxerr.stubhub.client.model;

import java.util.List;

public class UpdateEventTagsRequest {

	private List<TagRequest> tags;

	public List<TagRequest> getTags() {
		return tags;
	}

	public void setTags(List<TagRequest> tags) {
		this.tags = tags;
	}

}
