package org.oxerr.stubhub.client.model;

import java.time.Instant;

public class HealthCheckResponse {

	private String status;

	private Instant timestamp;

	public String getStatus() {
		return status;
	}

	public void setStatus(String status) {
		this.status = status;
	}

	public Instant getTimestamp() {
		return timestamp;
	}

	public void setTimestamp(Instant timestamp) {
		this.timestamp = timestamp;
	}

}
