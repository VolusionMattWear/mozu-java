/**
 *     This code was auto-generated by a Codezu.     
 *
 *     Changes to this file may cause incorrect behavior and will be lost if
 *     the code is regenerated.
 */
package com.mozu.api.clients.event;

import java.util.List;
import java.util.ArrayList;
import com.mozu.api.MozuClient;
import com.mozu.api.MozuUrl;
import com.mozu.api.Headers;
import com.mozu.api.security.AuthTicket;
import org.apache.commons.lang.StringUtils;

/** <summary>
 * Use the events resource to retrieve events, which are notifications about a create, read, update, or delete operation.
 * </summary>
 */
public class EventNotificationClient {
	
	/**
	 * Retrieves a list of events.
	 * <p><pre><code>
	 * MozuClient<com.mozu.api.contracts.event.EventCollection> mozuClient=GetEventsClient();
	 * client.setBaseAddress(url);
	 * client.executeRequest();
	 * EventCollection eventCollection = client.Result();
	 * </code></pre></p>
	 * @return Mozu.Api.MozuClient <com.mozu.api.contracts.event.EventCollection>
	 * @see com.mozu.api.contracts.event.EventCollection
	 */
	public static MozuClient<com.mozu.api.contracts.event.EventCollection> getEventsClient() throws Exception
	{
		return getEventsClient( null,  null,  null,  null);
	}

	/**
	 * Retrieves a list of events.
	 * <p><pre><code>
	 * MozuClient<com.mozu.api.contracts.event.EventCollection> mozuClient=GetEventsClient( startIndex,  pageSize,  sortBy,  filter);
	 * client.setBaseAddress(url);
	 * client.executeRequest();
	 * EventCollection eventCollection = client.Result();
	 * </code></pre></p>
	 * @param filter A set of expressions that consist of a field, operator, and value and represent search parameter syntax when filtering results of a query. Valid operators include equals (eq), does not equal (ne), greater than (gt), less than (lt), greater than or equal to (ge), less than or equal to (le), starts with (sw), or contains (cont). For example - "filter=IsDisplayed+eq+true"
	 * @param pageSize The number of results to display on each page when creating paged results from a query. The maximum value is 200.
	 * @param sortBy 
	 * @param startIndex 
	 * @return Mozu.Api.MozuClient <com.mozu.api.contracts.event.EventCollection>
	 * @see com.mozu.api.contracts.event.EventCollection
	 */
	public static MozuClient<com.mozu.api.contracts.event.EventCollection> getEventsClient(Integer startIndex, Integer pageSize, String sortBy, String filter) throws Exception
	{
		MozuUrl url = com.mozu.api.urls.event.EventNotificationUrl.getEventsUrl(filter, pageSize, sortBy, startIndex);
		String verb = "GET";
		Class<?> clz = com.mozu.api.contracts.event.EventCollection.class;
		MozuClient<com.mozu.api.contracts.event.EventCollection> mozuClient = new MozuClient(clz);
		mozuClient.setVerb(verb);
		mozuClient.setResourceUrl(url);
		return mozuClient;

	}

	/**
	 * Retrieves an event by providing the event ID.
	 * <p><pre><code>
	 * MozuClient<com.mozu.api.contracts.event.Event> mozuClient=GetEventClient( eventId);
	 * client.setBaseAddress(url);
	 * client.executeRequest();
	 * Event event = client.Result();
	 * </code></pre></p>
	 * @param eventId The unique identifier of the event being retrieved. An event is a notification about a create, read, update, or delete on an order, product, discount or category.
	 * @return Mozu.Api.MozuClient <com.mozu.api.contracts.event.Event>
	 * @see com.mozu.api.contracts.event.Event
	 */
	public static MozuClient<com.mozu.api.contracts.event.Event> getEventClient(String eventId) throws Exception
	{
		MozuUrl url = com.mozu.api.urls.event.EventNotificationUrl.getEventUrl(eventId);
		String verb = "GET";
		Class<?> clz = com.mozu.api.contracts.event.Event.class;
		MozuClient<com.mozu.api.contracts.event.Event> mozuClient = new MozuClient(clz);
		mozuClient.setVerb(verb);
		mozuClient.setResourceUrl(url);
		return mozuClient;

	}

}



