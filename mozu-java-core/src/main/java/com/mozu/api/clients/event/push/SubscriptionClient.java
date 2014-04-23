/**
 *     This code was auto-generated by a Codezu.     
 *
 *     Changes to this file may cause incorrect behavior and will be lost if
 *     the code is regenerated.
 */
package com.mozu.api.clients.event.push;

import java.util.List;
import java.util.ArrayList;
import com.mozu.api.MozuClient;
import com.mozu.api.MozuUrl;
import com.mozu.api.Headers;
import com.mozu.api.security.AuthTicket;
import org.apache.commons.lang.StringUtils;

/** <summary>
 * 
 * </summary>
 */
public class SubscriptionClient {
	
	/**
	 * 
	 * <p><pre><code>
	 * MozuClient<com.mozu.api.contracts.event.SubscriptionCollection> mozuClient=GetSubscriptionsClient();
	 * client.setBaseAddress(url);
	 * client.executeRequest();
	 * SubscriptionCollection subscriptionCollection = client.Result();
	 * </code></pre></p>
	 * @return Mozu.Api.MozuClient <com.mozu.api.contracts.event.SubscriptionCollection>
	 * @see com.mozu.api.contracts.event.SubscriptionCollection
	 */
	public static MozuClient<com.mozu.api.contracts.event.SubscriptionCollection> getSubscriptionsClient() throws Exception
	{
		return getSubscriptionsClient( null,  null,  null,  null);
	}

	/**
	 * 
	 * <p><pre><code>
	 * MozuClient<com.mozu.api.contracts.event.SubscriptionCollection> mozuClient=GetSubscriptionsClient( startIndex,  pageSize,  sortBy,  filter);
	 * client.setBaseAddress(url);
	 * client.executeRequest();
	 * SubscriptionCollection subscriptionCollection = client.Result();
	 * </code></pre></p>
	 * @param filter 
	 * @param pageSize 
	 * @param sortBy 
	 * @param startIndex 
	 * @return Mozu.Api.MozuClient <com.mozu.api.contracts.event.SubscriptionCollection>
	 * @see com.mozu.api.contracts.event.SubscriptionCollection
	 */
	public static MozuClient<com.mozu.api.contracts.event.SubscriptionCollection> getSubscriptionsClient(Integer startIndex, Integer pageSize, String sortBy, String filter) throws Exception
	{
		MozuUrl url = com.mozu.api.urls.event.push.SubscriptionUrl.getSubscriptionsUrl(filter, pageSize, sortBy, startIndex);
		String verb = "GET";
		Class<?> clz = com.mozu.api.contracts.event.SubscriptionCollection.class;
		MozuClient<com.mozu.api.contracts.event.SubscriptionCollection> mozuClient = new MozuClient(clz);
		mozuClient.setVerb(verb);
		mozuClient.setResourceUrl(url);
		return mozuClient;

	}

}



