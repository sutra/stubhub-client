package org.oxerr.stubhub.client.model;

import java.util.List;

public class TagRequest {

	/**
	 * Tag name to be associated with a listing, sale, or purchase order
	 */
	private String name;

	/**
	 * An array of stringified JSON values associated to the tag name.
	 * The string JSON array length must not exceed 2000 characters
	 */
	private List<String> values;

	private ApiTagValueDataType valueDataType;

	private Boolean isDelete;

	private Boolean isPersistentTag;

	private ApiTagValueInheritMode tagValueInheritMode;

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

	public ApiTagValueDataType getValueDataType() {
		return valueDataType;
	}

	public void setValueDataType(ApiTagValueDataType valueDataType) {
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

	public ApiTagValueInheritMode getTagValueInheritMode() {
		return tagValueInheritMode;
	}

	public void setTagValueInheritMode(ApiTagValueInheritMode tagValueInheritMode) {
		this.tagValueInheritMode = tagValueInheritMode;
	}

}
