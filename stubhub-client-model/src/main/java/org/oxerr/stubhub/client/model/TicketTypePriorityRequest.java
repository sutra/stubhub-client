package org.oxerr.stubhub.client.model;

public class TicketTypePriorityRequest {

	private Integer priority;

	/**
	 * TicketType of the sale
	 * Paper ETicket TesseraDlTifoso SeasonTicketCardExchange PaperNameChange
	 * ETicketNameChange ETicketThirdPartyPreUpload
	 * ReservationCode_FacevalueNotPaid ReservationCode_FacevaluePaid
	 * FlashseatsTicketTransfer TicketMasterMobile ETicketUrl WalkIn QRCode
	 * FlashMobileDeliveryAXS UEFAMobileTransfer GenericMobileTransfer
	 * PassoligTransfer SeasonCardELS ThirdPartyAppTransfer BarcodeMobile
	 */
	private String ticketType;

	private Boolean isBlocked;

	public Integer getPriority() {
		return priority;
	}

	public void setPriority(Integer priority) {
		this.priority = priority;
	}

	public String getTicketType() {
		return ticketType;
	}

	public void setTicketType(String ticketType) {
		this.ticketType = ticketType;
	}

	public Boolean getIsBlocked() {
		return isBlocked;
	}

	public void setIsBlocked(Boolean isBlocked) {
		this.isBlocked = isBlocked;
	}

}
