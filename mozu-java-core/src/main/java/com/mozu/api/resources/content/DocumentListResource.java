/**
 *     This code was auto-generated by a Codezu.     
 *
 *     Changes to this file may cause incorrect behavior and will be lost if
 *     the code is regenerated.
 */
package com.mozu.api.resources.content;

import com.mozu.api.ApiContext;
import java.util.List;
import java.util.ArrayList;
import com.mozu.api.MozuClient;
import com.mozu.api.MozuUrl;
import com.mozu.api.Headers;
import com.mozu.api.security.AuthTicket;
import org.apache.commons.lang.StringUtils;

/** <summary>
 * Use the document lists resource to organize your site's documents into a hierarchy. Document lists can contain documents, folders, and complete hierarchies of folders, which contain documents with unique names.
 * </summary>
 */
public class DocumentListResource {
	///
	/// <see cref="Mozu.Api.ApiContext"/>
	///
	private ApiContext _apiContext;

	
	public DocumentListResource(ApiContext apiContext) 
	{
		_apiContext = apiContext;
	}
	
	/**
	 * Retrieves a collection of document lists.
	 * <p><pre><code>
	 *	DocumentList documentlist = new DocumentList();
	 *	DocumentListCollection documentListCollection = documentlist.GetDocumentLists(dataViewMode);
	 * </code></pre></p>
	 * @return com.mozu.api.contracts.content.DocumentListCollection
	 * @see com.mozu.api.contracts.content.DocumentListCollection
	 */
	public com.mozu.api.contracts.content.DocumentListCollection getDocumentLists(com.mozu.api.DataViewMode dataViewMode) throws Exception
	{
		return getDocumentLists(dataViewMode,  null,  null);
	}

	/**
	 * Retrieves a collection of document lists.
	 * <p><pre><code>
	 *	DocumentList documentlist = new DocumentList();
	 *	DocumentListCollection documentListCollection = documentlist.GetDocumentLists(dataViewMode,  pageSize,  startIndex);
	 * </code></pre></p>
	 * @param pageSize The number of results to display on each page when creating paged results from a query. The maximum value is 200.
	 * @param startIndex 
	 * @return com.mozu.api.contracts.content.DocumentListCollection
	 * @see com.mozu.api.contracts.content.DocumentListCollection
	 */
	public com.mozu.api.contracts.content.DocumentListCollection getDocumentLists(com.mozu.api.DataViewMode dataViewMode, Integer pageSize, Integer startIndex) throws Exception
	{
		MozuClient<com.mozu.api.contracts.content.DocumentListCollection> client = com.mozu.api.clients.content.DocumentListClient.getDocumentListsClient(dataViewMode,  pageSize,  startIndex);
		client.setContext(_apiContext);
		client.executeRequest();
		return client.getResult();

	}

	/**
	 * Retrieve the details of a document list by providing the list name.
	 * <p><pre><code>
	 *	DocumentList documentlist = new DocumentList();
	 *	DocumentList documentList = documentlist.GetDocumentList(dataViewMode,  documentListName);
	 * </code></pre></p>
	 * @param documentListName The name of the document list.
	 * @return com.mozu.api.contracts.content.DocumentList
	 * @see com.mozu.api.contracts.content.DocumentList
	 */
	public com.mozu.api.contracts.content.DocumentList getDocumentList(com.mozu.api.DataViewMode dataViewMode, String documentListName) throws Exception
	{
		MozuClient<com.mozu.api.contracts.content.DocumentList> client = com.mozu.api.clients.content.DocumentListClient.getDocumentListClient(dataViewMode,  documentListName);
		client.setContext(_apiContext);
		client.executeRequest();
		return client.getResult();

	}

}



