package org.oxerr.stubhub.client.model;

public class BulkProcessingResult {

	private Long entityId;

	private String externalId;

	private ErrorResource error;

	public Long getEntityId() {
		return entityId;
	}

	public void setEntityId(Long entityId) {
		this.entityId = entityId;
	}

	public String getExternalId() {
		return externalId;
	}

	public void setExternalId(String externalId) {
		this.externalId = externalId;
	}

	public ErrorResource getError() {
		return error;
	}

	public void setError(ErrorResource error) {
		this.error = error;
	}

}
