package org.oxerr.stubhub.client.model;

import static org.junit.jupiter.api.Assertions.assertEquals;

import java.io.IOException;
import java.time.LocalDateTime;

import org.junit.jupiter.api.Test;

import com.fasterxml.jackson.databind.ObjectMapper;

class CurrencyConversionOverrideResponseTest {

	private final ObjectMapper objectMapper = ObjectMappers.createObjectMapper();

	@Test
	void test() throws IOException {
		CurrencyConversionOverrideResponse r = objectMapper
			.createParser(getClass().getResourceAsStream("CurrencyConversionOverrideResponse.json"))
			.readValueAs(CurrencyConversionOverrideResponse.class);
		assertEquals(LocalDateTime.parse("2026-01-10T00:00:00"), r.getConversionRateDate());
		assertEquals(LocalDateTime.parse("2026-01-10T15:44:15.1"), r.getCreateDate());
	}

}
