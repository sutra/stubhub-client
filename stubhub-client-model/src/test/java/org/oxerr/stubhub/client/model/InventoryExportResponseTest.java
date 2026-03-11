package org.oxerr.stubhub.client.model;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNull;

import java.io.IOException;

import org.junit.jupiter.api.Test;

import com.fasterxml.jackson.databind.ObjectMapper;

class InventoryExportResponseTest {

	private final ObjectMapper objectMapper = ObjectMappers.createObjectMapper();

	@Test
	void test() throws IOException {
		InventoryExportResponse r = objectMapper
			.createParser(getClass().getResourceAsStream("InventoryExportResponse.json"))
			.readValueAs(InventoryExportResponse.class);
		assertNull(r.getDeletedInventoryIds());
		assertEquals(17947802994L, r.getPaginationToken().longValue());
		assertEquals(84, r.getNumberOfItems().intValue());
	}

}
