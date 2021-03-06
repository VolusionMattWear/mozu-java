/**
 *     This code was auto-generated by a Codezu.     
 *
 *     Changes to this file may cause incorrect behavior and will be lost if
 *     the code is regenerated.
 */
package com.mozu.api.resources.commerce;

import com.mozu.api.ApiContext;
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
public class InStockNotificationSubscriptionResource {
	///
	/// <see cref="Mozu.Api.ApiContext"/>
	///
	private ApiContext _apiContext;

	
	public InStockNotificationSubscriptionResource(ApiContext apiContext) 
	{
		_apiContext = apiContext;
	}
	
	/**
	 * 
	 * <p><pre><code>
	 *	InStockNotificationSubscription instocknotificationsubscription = new InStockNotificationSubscription();
	 *	InStockNotificationSubscriptionCollection inStockNotificationSubscriptionCollection = instocknotificationsubscription.GetInStockNotificationSubscriptions();
	 * </code></pre></p>
	 * @return com.mozu.api.contracts.customer.InStockNotificationSubscriptionCollection
	 * @see com.mozu.api.contracts.customer.InStockNotificationSubscriptionCollection
	 */
	public com.mozu.api.contracts.customer.InStockNotificationSubscriptionCollection getInStockNotificationSubscriptions() throws Exception
	{
		return getInStockNotificationSubscriptions( null,  null,  null,  null);
	}

	/**
	 * 
	 * <p><pre><code>
	 *	InStockNotificationSubscription instocknotificationsubscription = new InStockNotificationSubscription();
	 *	InStockNotificationSubscriptionCollection inStockNotificationSubscriptionCollection = instocknotificationsubscription.GetInStockNotificationSubscriptions( startIndex,  pageSize,  sortBy,  filter);
	 * </code></pre></p>
	 * @param filter 
	 * @param pageSize 
	 * @param sortBy 
	 * @param startIndex 
	 * @return com.mozu.api.contracts.customer.InStockNotificationSubscriptionCollection
	 * @see com.mozu.api.contracts.customer.InStockNotificationSubscriptionCollection
	 */
	public com.mozu.api.contracts.customer.InStockNotificationSubscriptionCollection getInStockNotificationSubscriptions(Integer startIndex, Integer pageSize, String sortBy, String filter) throws Exception
	{
		MozuClient<com.mozu.api.contracts.customer.InStockNotificationSubscriptionCollection> client = com.mozu.api.clients.commerce.InStockNotificationSubscriptionClient.getInStockNotificationSubscriptionsClient( startIndex,  pageSize,  sortBy,  filter);
		client.setContext(_apiContext);
		client.executeRequest();
		return client.getResult();

	}

	/**
	 * 
	 * <p><pre><code>
	 *	InStockNotificationSubscription instocknotificationsubscription = new InStockNotificationSubscription();
	 *	InStockNotificationSubscription inStockNotificationSubscription = instocknotificationsubscription.GetInStockNotificationSubscription( id);
	 * </code></pre></p>
	 * @param id 
	 * @return com.mozu.api.contracts.customer.InStockNotificationSubscription
	 * @see com.mozu.api.contracts.customer.InStockNotificationSubscription
	 */
	public com.mozu.api.contracts.customer.InStockNotificationSubscription getInStockNotificationSubscription(Integer id) throws Exception
	{
		MozuClient<com.mozu.api.contracts.customer.InStockNotificationSubscription> client = com.mozu.api.clients.commerce.InStockNotificationSubscriptionClient.getInStockNotificationSubscriptionClient( id);
		client.setContext(_apiContext);
		client.executeRequest();
		return client.getResult();

	}

	/**
	 * 
	 * <p><pre><code>
	 *	InStockNotificationSubscription instocknotificationsubscription = new InStockNotificationSubscription();
	 *	InStockNotificationSubscription inStockNotificationSubscription = instocknotificationsubscription.AddInStockNotificationSubscription( inStockNotificationSubscription);
	 * </code></pre></p>
	 * @param inStockNotificationSubscription 
	 * @return com.mozu.api.contracts.customer.InStockNotificationSubscription
	 * @see com.mozu.api.contracts.customer.InStockNotificationSubscription
	 * @see com.mozu.api.contracts.customer.InStockNotificationSubscription
	 */
	public com.mozu.api.contracts.customer.InStockNotificationSubscription addInStockNotificationSubscription(com.mozu.api.contracts.customer.InStockNotificationSubscription inStockNotificationSubscription) throws Exception
	{
		MozuClient<com.mozu.api.contracts.customer.InStockNotificationSubscription> client = com.mozu.api.clients.commerce.InStockNotificationSubscriptionClient.addInStockNotificationSubscriptionClient( inStockNotificationSubscription);
		client.setContext(_apiContext);
		client.executeRequest();
		return client.getResult();

	}

	/**
	 * 
	 * <p><pre><code>
	 *	InStockNotificationSubscription instocknotificationsubscription = new InStockNotificationSubscription();
	 *	instocknotificationsubscription.DeleteInStockNotificationSubscription( id);
	 * </code></pre></p>
	 * @param id 
	 * @return 
	 */
	public void deleteInStockNotificationSubscription(Integer id) throws Exception
	{
		MozuClient client = com.mozu.api.clients.commerce.InStockNotificationSubscriptionClient.deleteInStockNotificationSubscriptionClient( id);
		client.setContext(_apiContext);
		client.executeRequest();

	}

}



