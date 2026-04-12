package org.oxerr.stubhub.client.model;

import static org.junit.jupiter.api.Assertions.assertEquals;

import java.util.ArrayList;
import java.util.List;

import org.junit.jupiter.api.Test;

class ListingNoteRequestTest {

	@Test
	void testEquals() {
		assertEquals(List.of(new ListingNoteRequest("This is a note.")), List.of(new ListingNoteRequest("This is a note.")));
	}

	@Test
	void testHashCode() {
		assertEquals(List.of(new ListingNoteRequest("This is a note.")).hashCode(), List.of(new ListingNoteRequest("This is a note.")).hashCode());

		var notes = new ArrayList<>();
		notes.add(new ListingNoteRequest("This is a note."));
		notes.remove(new ListingNoteRequest("This is a note."));
		assertEquals(List.of(), notes);
	}

}
