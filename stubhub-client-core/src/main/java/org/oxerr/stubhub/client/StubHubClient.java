package org.oxerr.stubhub.client;

import org.oxerr.stubhub.client.event.EventService;
import org.oxerr.stubhub.client.inventory.InventoryService;

public interface StubHubClient {

	EventService event();

	InventoryService inventory();

}
