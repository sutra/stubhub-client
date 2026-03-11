package org.oxerr.stubhub.client.model;

import java.util.List;
import java.util.UUID;

public class DealConfigResponse {

	private UUID configId;

	private List<DealConfigHurdleResponse> hurdles;

	private String splitType;

	public UUID getConfigId() {
		return configId;
	}

	public void setConfigId(UUID configId) {
		this.configId = configId;
	}

	public List<DealConfigHurdleResponse> getHurdles() {
		return hurdles;
	}

	public void setHurdles(List<DealConfigHurdleResponse> hurdles) {
		this.hurdles = hurdles;
	}

	public String getSplitType() {
		return splitType;
	}

	public void setSplitType(String splitType) {
		this.splitType = splitType;
	}

}
