package org.oxerr.stubhub.client.model;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;

/**
 * Gets or Sets ApiMarketplace
 */
public enum ApiMarketplace {

	STUB_HUB("StubHub"),

	VIVID_SEATS("VividSeats"),

	SEAT_GEEK("SeatGeek"),

	TICK_PICK("TickPick"),

	TICKETMASTER("Ticketmaster"),

	OFFLINE("Offline"),

	AXS("AXS"),

	FAN_XCHANGE("FanXchange"),

	GAMETIME("Gametime"),

	TICKET_EVOLUTION("TicketEvolution"),

	TICKET_NETWORK("TicketNetwork"),

	AUTOMATIQ("Automatiq"),

	LYTE("Lyte"),

	GO_TICKETS("GoTickets"),

	B2_B_SALES("B2BSales"),

	TICKET_NETWORK_MERCURY("TicketNetworkMercury"),

	WASTAGE("Wastage"),

	REACH_PRO("ReachPro"),

	DONATION("Donation");

	private String value;

	ApiMarketplace(String value) {
		this.value = value;
	}

	@JsonValue
	public String getValue() {
		return value;
	}

	@Override
	public String toString() {
		return String.valueOf(value);
	}

	@JsonCreator
	public static ApiMarketplace fromValue(String value) {
		for (ApiMarketplace b : ApiMarketplace.values()) {
			if (b.value.equals(value)) {
				return b;
			}
		}
		throw new IllegalArgumentException("Unexpected value '" + value + "'");
	}
}
