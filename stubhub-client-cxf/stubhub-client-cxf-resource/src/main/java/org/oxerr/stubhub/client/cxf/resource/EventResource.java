package org.oxerr.stubhub.client.cxf.resource;

import java.util.UUID;

import org.oxerr.stubhub.client.model.CreateEventTagsRequest;
import org.oxerr.stubhub.client.model.DeleteEventTagsRequest;
import org.oxerr.stubhub.client.model.EventInfoResponse;
import org.oxerr.stubhub.client.model.SectionMappingRequest;
import org.oxerr.stubhub.client.model.SectionMappingResponse;
import org.oxerr.stubhub.client.model.TagRequest;
import org.oxerr.stubhub.client.model.TagValuesForNameRequest;
import org.oxerr.stubhub.client.model.UpdateEventTagsRequest;

import jakarta.ws.rs.Consumes;
import jakarta.ws.rs.DELETE;
import jakarta.ws.rs.GET;
import jakarta.ws.rs.POST;
import jakarta.ws.rs.PUT;
import jakarta.ws.rs.Path;
import jakarta.ws.rs.PathParam;
import jakarta.ws.rs.Produces;
import jakarta.ws.rs.QueryParam;
import jakarta.ws.rs.core.MediaType;

@Path("/events")
@Produces(MediaType.APPLICATION_JSON)
@Consumes(MediaType.APPLICATION_JSON)
public interface EventResource {

	/**
	 * Retrieve Event information using EventId or EventMappingId.
	 *
	 * @param eventId the id of the event.
	 * @param eventMappingId the mapping GUID of the unmapped event.
	 * @return the event information.
	 */
	@GET
	EventInfoResponse get(
		@QueryParam("eventId") Integer eventId,
		@QueryParam("eventMappingId") UUID eventMappingId
	);

	/**
	 * Put Event Tag.
	 */
	@PUT
	@Path("/posevents/{posEventId}/tags")
	EventInfoResponse putTags(
		@PathParam("posEventId") UUID posEventId,
		TagRequest tagRequest
	);

	/**
	 * Put Section Mapping.
	 */
	@PUT
	@Path("/events/{viagogoEventId}/sectionmapping")
	SectionMappingResponse putSectionMapping(
		@PathParam("viagogoEventId") Integer viagogoEventId,
		SectionMappingRequest sectionMappingRequest
	);

	/**
	 * Get Seller Event Tags by Viagogo Event Id.
	 */
	@GET
	@Path("/events/{viagogoEventId}/tags")
	EventInfoResponse getTags(
		@PathParam("viagogoEventId") Integer viagogoEventId
	);

	/**
	 * Delete Seller Event Tags.
	 */
	@DELETE
	@Path("/events/{viagogoEventId}/tags")
	void deleteTags(
		@PathParam("viagogoEventId") Integer viagogoEventId,
		DeleteEventTagsRequest deleteEventTagsRequest
	);

	/**
	 * Create Seller Event Tags.
	 * If any of the tags already exist, the request will be rejected.
	 */
	@POST
	@Path("/events/{viagogoEventId}/tags")
	EventInfoResponse createTags(
		@PathParam("viagogoEventId") Integer viagogoEventId,
		CreateEventTagsRequest createEventTagsRequest
	);

	/**
	 * Update Seller Event Tags.
	 * If any of the tags already exist, the request will replace the values.
	 */
	@PUT
	@Path("/events/{viagogoEventId}/tags")
	EventInfoResponse updateTags(
		@PathParam("viagogoEventId") Integer viagogoEventId,
		UpdateEventTagsRequest updateEventTagsRequest
	);

	/**
	 * Add Values to an existing Tag for an Event.
	 * If any of the tag values already exist, the request will be rejected.
	 */
	@POST
	@Path("/events/{viagogoEventId}/tags/{tagName}/tagValues")
	EventInfoResponse addTagValues(
		@PathParam("viagogoEventId") Integer viagogoEventId,
		@PathParam("tagName") String tagName,
		TagValuesForNameRequest tagValuesForNameRequest
	);

	/**
	 * Delete Specific Values from an existing Tag for an Event.
	 * If any of the tag values don't exist, the request will be rejected.
	 */
	@DELETE
	@Path("/events/{viagogoEventId}/tags/{tagName}/tagValues")
	EventInfoResponse deleteTagValues(
		@PathParam("viagogoEventId") Integer viagogoEventId,
		@PathParam("tagName") String tagName,
		TagValuesForNameRequest tagValuesForNameRequest
	);

}
