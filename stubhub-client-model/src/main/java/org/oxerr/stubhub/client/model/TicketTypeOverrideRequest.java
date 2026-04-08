package org.oxerr.stubhub.client.model;

import java.util.List;

public class TicketTypeOverrideRequest {

	private ApiDeliveryType deliveryType;

	private List<TicketTypePriorityRequest> ticketTypePriorities;

	public ApiDeliveryType getDeliveryType() {
		return deliveryType;
	}

	public void setDeliveryType(ApiDeliveryType deliveryType) {
		this.deliveryType = deliveryType;
	}

	public List<TicketTypePriorityRequest> getTicketTypePriorities() {
		return ticketTypePriorities;
	}

	public void setTicketTypePriorities(List<TicketTypePriorityRequest> ticketTypePriorities) {
		this.ticketTypePriorities = ticketTypePriorities;
	}

}
