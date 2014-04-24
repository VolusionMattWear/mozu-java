/**
 *     This code was auto-generated by a Codezu.     
 *
 *     Changes to this file may cause incorrect behavior and will be lost if
 *     the code is regenerated.
 */
package com.mozu.api.clients.platform;

import java.util.List;
import java.util.ArrayList;
import com.mozu.api.MozuClient;
import com.mozu.api.MozuUrl;
import com.mozu.api.Headers;
import com.mozu.api.security.AuthTicket;
import org.apache.commons.lang.StringUtils;

/** <summary>
 * Use the site data resource to store site-level information required for a third-party application in the Mozu database.
 * </summary>
 */
public class SiteDataClient {
	
	/**
	 * Retrieves the value of a record in the Mozu database.
	 * <p><pre><code>
	 * MozuClient<String> mozuClient=GetDBValueClient( dbEntryQuery);
	 * client.setBaseAddress(url);
	 * client.executeRequest();
	 * string string = client.Result();
	 * </code></pre></p>
	 * @param dbEntryQuery The database entry query string used to retrieve the record information.
	 * @return Mozu.Api.MozuClient <string>
	 * @see string
	 */
	public static MozuClient<String> getDBValueClient(String dbEntryQuery) throws Exception
	{
		MozuUrl url = com.mozu.api.urls.platform.SiteDataUrl.getDBValueUrl(dbEntryQuery);
		String verb = "GET";
		Class<?> clz = String.class;
		MozuClient<String> mozuClient = new MozuClient(clz);
		mozuClient.setVerb(verb);
		mozuClient.setResourceUrl(url);
		return mozuClient;

	}

	/**
	 * Creates a new record in the Mozu database based on the information supplied in the request.
	 * <p><pre><code>
	 * MozuClient mozuClient=CreateDBValueClient( value,  dbEntryQuery);
	 * client.setBaseAddress(url);
	 * client.executeRequest();
	 * </code></pre></p>
	 * @param dbEntryQuery The database entry string to create.
	 * @param value The value string to create.
	 * @return Mozu.Api.MozuClient 
	 * @see string
	 */
	public static MozuClient createDBValueClient(String value, String dbEntryQuery) throws Exception
	{
		MozuUrl url = com.mozu.api.urls.platform.SiteDataUrl.createDBValueUrl(dbEntryQuery);
		String verb = "POST";
				MozuClient mozuClient = new MozuClient();
		mozuClient.setVerb(verb);
		mozuClient.setResourceUrl(url);
		mozuClient.setBody(value);
		return mozuClient;

	}

	/**
	 * Updates a record in the Mozu database based on the information supplied in the request.
	 * <p><pre><code>
	 * MozuClient mozuClient=UpdateDBValueClient( value,  dbEntryQuery);
	 * client.setBaseAddress(url);
	 * client.executeRequest();
	 * </code></pre></p>
	 * @param dbEntryQuery The database entry query string used to update the record information.
	 * @param value The database value to update.
	 * @return Mozu.Api.MozuClient 
	 * @see string
	 */
	public static MozuClient updateDBValueClient(String value, String dbEntryQuery) throws Exception
	{
		MozuUrl url = com.mozu.api.urls.platform.SiteDataUrl.updateDBValueUrl(dbEntryQuery);
		String verb = "PUT";
				MozuClient mozuClient = new MozuClient();
		mozuClient.setVerb(verb);
		mozuClient.setResourceUrl(url);
		mozuClient.setBody(value);
		return mozuClient;

	}

	/**
	 * Removes a previously defined record in the Mozu database.
	 * <p><pre><code>
	 * MozuClient mozuClient=DeleteDBValueClient( dbEntryQuery);
	 * client.setBaseAddress(url);
	 * client.executeRequest();
	 * </code></pre></p>
	 * @param dbEntryQuery The database entry string to delete.
	 * @return Mozu.Api.MozuClient 
	 */
	public static MozuClient deleteDBValueClient(String dbEntryQuery) throws Exception
	{
		MozuUrl url = com.mozu.api.urls.platform.SiteDataUrl.deleteDBValueUrl(dbEntryQuery);
		String verb = "DELETE";
				MozuClient mozuClient = new MozuClient();
		mozuClient.setVerb(verb);
		mozuClient.setResourceUrl(url);
		return mozuClient;

	}

}



