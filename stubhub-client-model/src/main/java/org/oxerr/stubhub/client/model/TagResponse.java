package org.oxerr.stubhub.client.model;

import java.util.List;

public class TagResponse {

	private String name;

	private List<String> values;

	private String valueDataType;

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public List<String> getValues() {
		return values;
	}

	public void setValues(List<String> values) {
		this.values = values;
	}

	public String getValueDataType() {
		return valueDataType;
	}

	public void setValueDataType(String valueDataType) {
		this.valueDataType = valueDataType;
	}

}
