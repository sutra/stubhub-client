package org.oxerr.stubhub.client.model;

import java.util.List;

public class TagRequest {

	private String name;

	private List<String> values;

	private String valueDataType;

	private Boolean isDelete;

	private Boolean isPersistentTag;

	private String tagValueInheritMode;

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

	public Boolean getIsDelete() {
		return isDelete;
	}

	public void setIsDelete(Boolean isDelete) {
		this.isDelete = isDelete;
	}

	public Boolean getIsPersistentTag() {
		return isPersistentTag;
	}

	public void setIsPersistentTag(Boolean isPersistentTag) {
		this.isPersistentTag = isPersistentTag;
	}

	public String getTagValueInheritMode() {
		return tagValueInheritMode;
	}

	public void setTagValueInheritMode(String tagValueInheritMode) {
		this.tagValueInheritMode = tagValueInheritMode;
	}

}
