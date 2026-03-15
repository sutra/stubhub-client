package org.oxerr.stubhub.client.model;

import java.util.List;

public class TicketTypeOverrideRequest {

	private String deliveryType;

	private List<TicketTypePriorityRequest> ticketTypePriorities;

	public String getDeliveryType() {
		return deliveryType;
	}

	public void setDeliveryType(String deliveryType) {
		this.deliveryType = deliveryType;
	}

	public List<TicketTypePriorityRequest> getTicketTypePriorities() {
		return ticketTypePriorities;
	}

	public void setTicketTypePriorities(List<TicketTypePriorityRequest> ticketTypePriorities) {
		this.ticketTypePriorities = ticketTypePriorities;
	}

}
