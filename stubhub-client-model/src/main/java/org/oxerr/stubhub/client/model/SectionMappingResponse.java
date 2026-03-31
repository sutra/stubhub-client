package org.oxerr.stubhub.client.model;

public class SectionMappingResponse {

	private String section;

	private String row;

	private String mappedSection;

	private Integer sectionId;

	public String getSection() {
		return section;
	}

	public void setSection(String section) {
		this.section = section;
	}

	public String getRow() {
		return row;
	}

	public void setRow(String row) {
		this.row = row;
	}

	public String getMappedSection() {
		return mappedSection;
	}

	public void setMappedSection(String mappedSection) {
		this.mappedSection = mappedSection;
	}

	public Integer getSectionId() {
		return sectionId;
	}

	public void setSectionId(Integer sectionId) {
		this.sectionId = sectionId;
	}

}
