package org.oxerr.stubhub.client.model;

import static org.junit.jupiter.api.Assertions.assertEquals;

import java.io.IOException;
import java.time.Instant;

import org.junit.jupiter.api.Test;

import com.fasterxml.jackson.databind.ObjectMapper;

class HealthCheckResponseTest {

	private final ObjectMapper objectMapper = ObjectMappers.createObjectMapper();

	@Test
	void test() throws IOException {
		HealthCheckResponse r = objectMapper
			.createParser(getClass().getResourceAsStream("HealthCheckResponse.json"))
			.readValueAs(HealthCheckResponse.class);
		assertEquals("Healthy", r.getStatus());
		assertEquals(Instant.parse("2026-02-22T17:11:04.4264736Z"), r.getTimestamp());
	}

}
