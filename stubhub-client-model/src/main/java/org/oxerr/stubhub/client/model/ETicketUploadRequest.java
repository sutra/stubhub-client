package org.oxerr.stubhub.client.model;

public class ETicketUploadRequest {

	private UserDocumentFileRequest file;

	private Long ticketId;

	private Boolean isDelete;

	public UserDocumentFileRequest getFile() {
		return file;
	}

	public void setFile(UserDocumentFileRequest file) {
		this.file = file;
	}

	public Long getTicketId() {
		return ticketId;
	}

	public void setTicketId(Long ticketId) {
		this.ticketId = ticketId;
	}

	public Boolean getIsDelete() {
		return isDelete;
	}

	public void setIsDelete(Boolean isDelete) {
		this.isDelete = isDelete;
	}

}
