package org.oxerr.stubhub.client.model;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNull;
import static org.junit.jupiter.api.Assertions.assertTrue;

import java.io.IOException;

import org.junit.jupiter.api.Test;

import com.fasterxml.jackson.databind.ObjectMapper;

class InventoryExportResponseTest {

	private final ObjectMapper objectMapper = ObjectMappers.createObjectMapper();

	@Test
	void testInventoryExportResponse_search() throws IOException {
		InventoryExportResponse r = objectMapper
			.createParser(getClass().getResourceAsStream("InventoryExportResponse-search.json"))
			.readValueAs(InventoryExportResponse.class);
		assertNull(r.getDeletedInventoryIds());
		assertEquals(17947802994L, r.getPaginationToken().longValue());
		assertEquals(84, r.getNumberOfItems().intValue());
	}

	@Test
	void testInventoryExportResponse_export() throws IOException {
		InventoryExportResponse r = objectMapper
				.createParser(getClass().getResourceAsStream("InventoryExportResponse-export.json"))
				.readValueAs(InventoryExportResponse.class);
		assertTrue(r.getDeletedInventoryIds().isEmpty());
		assertEquals(17951828250L, r.getPaginationToken().longValue());
		assertEquals(100, r.getNumberOfItems().intValue());
	}

}
