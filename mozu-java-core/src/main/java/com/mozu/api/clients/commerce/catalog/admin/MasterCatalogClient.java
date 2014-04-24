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
 * Use the Master Catalog resource to view details of the master catalogs associated with a tenant and to manage the product publishing mode for each master catalog.
 * </summary>
 */
public class MasterCatalogClient {
	
	/**
	 * Retrieve the details of all master catalog associated with a tenant.
	 * <p><pre><code>
	 * MozuClient<com.mozu.api.contracts.productadmin.MasterCatalogCollection> mozuClient=GetMasterCatalogsClient();
	 * client.setBaseAddress(url);
	 * client.executeRequest();
	 * MasterCatalogCollection masterCatalogCollection = client.Result();
	 * </code></pre></p>
	 * @return Mozu.Api.MozuClient <com.mozu.api.contracts.productadmin.MasterCatalogCollection>
	 * @see com.mozu.api.contracts.productadmin.MasterCatalogCollection
	 */
	public static MozuClient<com.mozu.api.contracts.productadmin.MasterCatalogCollection> getMasterCatalogsClient() throws Exception
	{
		MozuUrl url = com.mozu.api.urls.commerce.catalog.admin.MasterCatalogUrl.getMasterCatalogsUrl();
		String verb = "GET";
		Class<?> clz = com.mozu.api.contracts.productadmin.MasterCatalogCollection.class;
		MozuClient<com.mozu.api.contracts.productadmin.MasterCatalogCollection> mozuClient = new MozuClient(clz);
		mozuClient.setVerb(verb);
		mozuClient.setResourceUrl(url);
		return mozuClient;

	}

	/**
	 * Retrieve the details of the master catalog specified in the request.
	 * <p><pre><code>
	 * MozuClient<com.mozu.api.contracts.productadmin.MasterCatalog> mozuClient=GetMasterCatalogClient(dataViewMode,  masterCatalogId);
	 * client.setBaseAddress(url);
	 * client.executeRequest();
	 * MasterCatalog masterCatalog = client.Result();
	 * </code></pre></p>
	 * @param masterCatalogId 
	 * @return Mozu.Api.MozuClient <com.mozu.api.contracts.productadmin.MasterCatalog>
	 * @see com.mozu.api.contracts.productadmin.MasterCatalog
	 */
	public static MozuClient<com.mozu.api.contracts.productadmin.MasterCatalog> getMasterCatalogClient(com.mozu.api.DataViewMode dataViewMode, Integer masterCatalogId) throws Exception
	{
		MozuUrl url = com.mozu.api.urls.commerce.catalog.admin.MasterCatalogUrl.getMasterCatalogUrl(masterCatalogId);
		String verb = "GET";
		Class<?> clz = com.mozu.api.contracts.productadmin.MasterCatalog.class;
		MozuClient<com.mozu.api.contracts.productadmin.MasterCatalog> mozuClient = new MozuClient(clz);
		mozuClient.setVerb(verb);
		mozuClient.setResourceUrl(url);
		mozuClient.addHeader(Headers.X_VOL_DATAVIEW_MODE ,dataViewMode.toString());
		return mozuClient;

	}

	/**
	 * Updates the product publishing mode for the master catalog specified in the request.
	 * <p><pre><code>
	 * MozuClient<com.mozu.api.contracts.productadmin.MasterCatalog> mozuClient=UpdateMasterCatalogClient(dataViewMode,  masterCatalog,  masterCatalogId);
	 * client.setBaseAddress(url);
	 * client.executeRequest();
	 * MasterCatalog masterCatalog = client.Result();
	 * </code></pre></p>
	 * @param masterCatalogId 
	 * @param masterCatalog Properties of the master catalog to update, which consists of the product publishing mode. Possible values are "Pending" which saves product updates in draft mode until they are published, and "Live" which publishes all product changes immediately.
	 * @return Mozu.Api.MozuClient <com.mozu.api.contracts.productadmin.MasterCatalog>
	 * @see com.mozu.api.contracts.productadmin.MasterCatalog
	 * @see com.mozu.api.contracts.productadmin.MasterCatalog
	 */
	public static MozuClient<com.mozu.api.contracts.productadmin.MasterCatalog> updateMasterCatalogClient(com.mozu.api.DataViewMode dataViewMode, com.mozu.api.contracts.productadmin.MasterCatalog masterCatalog, Integer masterCatalogId) throws Exception
	{
		MozuUrl url = com.mozu.api.urls.commerce.catalog.admin.MasterCatalogUrl.updateMasterCatalogUrl(masterCatalogId);
		String verb = "PUT";
		Class<?> clz = com.mozu.api.contracts.productadmin.MasterCatalog.class;
		MozuClient<com.mozu.api.contracts.productadmin.MasterCatalog> mozuClient = new MozuClient(clz);
		mozuClient.setVerb(verb);
		mozuClient.setResourceUrl(url);
		mozuClient.setBody(masterCatalog);
		mozuClient.addHeader(Headers.X_VOL_DATAVIEW_MODE ,dataViewMode.toString());
		return mozuClient;

	}

}



