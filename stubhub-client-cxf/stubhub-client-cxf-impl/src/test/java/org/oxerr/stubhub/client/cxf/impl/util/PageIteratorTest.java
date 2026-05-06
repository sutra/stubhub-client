package org.oxerr.stubhub.client.cxf.impl.util;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;
import static org.junit.jupiter.api.Assertions.assertTrue;

import java.util.Collections;
import java.util.concurrent.atomic.AtomicInteger;

import org.junit.jupiter.api.Test;

import jakarta.ws.rs.client.ResponseProcessingException;
import jakarta.ws.rs.core.Response;

class PageIteratorTest {

	@Test
	void shouldRetryAndSucceedOnThirdAttempt() {
		AtomicInteger attempts = new AtomicInteger();

		PageIterator<String> iterator = new PageIterator<String>(10) {
			@Override
			protected Page<String> fetchPage(Long paginationToken) {
				int n = attempts.incrementAndGet();
				if (n < 3) {
					throw responseProcessingException();
				}
				return new PageImpl(1L, 1, Collections.singletonList("ok"));
			}
		};

		assertTrue(iterator.hasNext());
		assertEquals("ok", iterator.next());
		assertEquals(3, attempts.get());
	}

	@Test
	void shouldFailAfterMaxAttemptsWhenAlwaysThrowingResponseProcessingException() {
		AtomicInteger attempts = new AtomicInteger();

		PageIterator<String> iterator = new PageIterator<String>(10) {
			@Override
			protected Page<String> fetchPage(Long paginationToken) {
				attempts.incrementAndGet();
				throw responseProcessingException();
			}
		};

		assertThrows(ResponseProcessingException.class, iterator::hasNext);
		assertEquals(3, attempts.get());
	}

	private ResponseProcessingException responseProcessingException() {
		Response response = Response.status(500).entity("boom").build();
		return new ResponseProcessingException(response, "simulated");
	}
}
