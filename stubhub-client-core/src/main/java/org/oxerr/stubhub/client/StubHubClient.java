package org.oxerr.stubhub.client;

import org.oxerr.stubhub.client.event.EventService;
import org.oxerr.stubhub.client.inventory.InventoryService;
import org.oxerr.stubhub.client.purchase.PurchaseService;

public interface StubHubClient {

	EventService event();

	InventoryService inventory();

	PurchaseService purchase();

}
