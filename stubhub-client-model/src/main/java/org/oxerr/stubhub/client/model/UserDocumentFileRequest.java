package org.oxerr.stubhub.client.model;

public class UserDocumentFileRequest {

	/**
	 * Name of the file
	 */
	private String name;

	/**
	 * Base64 encoded content of the file
	 */
	private String content;

	/**
	 * Content type of the file
	 * application/pdf - pdf eticket application/vnd.apple.pkpass - Apple iPhone eticket application/json - Google Wallet eticket
	 */
	private String contentType;

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getContent() {
		return content;
	}

	public void setContent(String content) {
		this.content = content;
	}

	public String getContentType() {
		return contentType;
	}

	public void setContentType(String contentType) {
		this.contentType = contentType;
	}

}
