package org.oxerr.stubhub.client.model;

import java.util.List;

public class DeleteEventTagsRequest {

	private List<String> tagNames;

	public List<String> getTagNames() {
		return tagNames;
	}

	public void setTagNames(List<String> tagNames) {
		this.tagNames = tagNames;
	}

}
