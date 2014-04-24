/**
 *     This code was auto-generated by a Codezu.     
 *
 *     Changes to this file may cause incorrect behavior and will be lost if
 *     the code is regenerated.
 */
package com.mozu.api.clients.commerce.catalog.admin;

import java.util.List;
import java.util.ArrayList;
import com.mozu.api.MozuClient;
import com.mozu.api.MozuUrl;
import com.mozu.api.Headers;
import com.mozu.api.security.AuthTicket;
import org.apache.commons.lang.StringUtils;

/** <summary>
 * Use the Product Publishing resource to publish or discard pending changes to product definitions in the master catalog.
 * </summary>
 */
public class PublishingScopeClient {
	
	/**
	 * Deletes the draft version of product changes for each product code specified in the request.
	 * <p><pre><code>
	 * MozuClient mozuClient=DiscardDraftsClient(dataViewMode,  publishScope);
	 * client.setBaseAddress(url);
	 * client.executeRequest();
	 * </code></pre></p>
	 * @param dataViewMode DataViewMode
	 * @param publishScope Properties of the pending product changes to include in this operation.
	 * @return Mozu.Api.MozuClient 
	 * @see com.mozu.api.contracts.productadmin.PublishingScope
	 */
	public static MozuClient discardDraftsClient(com.mozu.api.DataViewMode dataViewMode, com.mozu.api.contracts.productadmin.PublishingScope publishScope) throws Exception
	{
		MozuUrl url = com.mozu.api.urls.commerce.catalog.admin.PublishingScopeUrl.discardDraftsUrl();
		String verb = "POST";
				MozuClient mozuClient = new MozuClient();
		mozuClient.setVerb(verb);
		mozuClient.setResourceUrl(url);
		mozuClient.setBody(publishScope);
		mozuClient.addHeader(Headers.X_VOL_DATAVIEW_MODE ,dataViewMode.toString());
		return mozuClient;

	}

	/**
	 * Publishes the draft version of product changes for each product code specified in the request, and changes the product publish state to "live".
	 * <p><pre><code>
	 * MozuClient mozuClient=PublishDraftsClient(dataViewMode,  publishScope);
	 * client.setBaseAddress(url);
	 * client.executeRequest();
	 * </code></pre></p>
	 * @param dataViewMode DataViewMode
	 * @param publishScope Properties of the pending product changes to include in this operation.
	 * @return Mozu.Api.MozuClient 
	 * @see com.mozu.api.contracts.productadmin.PublishingScope
	 */
	public static MozuClient publishDraftsClient(com.mozu.api.DataViewMode dataViewMode, com.mozu.api.contracts.productadmin.PublishingScope publishScope) throws Exception
	{
		MozuUrl url = com.mozu.api.urls.commerce.catalog.admin.PublishingScopeUrl.publishDraftsUrl();
		String verb = "POST";
				MozuClient mozuClient = new MozuClient();
		mozuClient.setVerb(verb);
		mozuClient.setResourceUrl(url);
		mozuClient.setBody(publishScope);
		mozuClient.addHeader(Headers.X_VOL_DATAVIEW_MODE ,dataViewMode.toString());
		return mozuClient;

	}

}



