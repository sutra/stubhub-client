package org.oxerr.stubhub.client.model;

public class ETicketUploadRequest {

	private UserDocumentFileRequest _file;

	private Long ticketId;

	private Boolean isDelete;

	public UserDocumentFileRequest get_file() {
		return _file;
	}

	public void set_file(UserDocumentFileRequest _file) {
		this._file = _file;
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
