/**
 *     This code was auto-generated by a Codezu.     
 *
 *     Changes to this file may cause incorrect behavior and will be lost if
 *     the code is regenerated.
 */
package com.mozu.api.clients.commerce.customer.accounts;

import java.util.List;
import java.util.ArrayList;
import com.mozu.api.MozuClient;
import com.mozu.api.MozuUrl;
import com.mozu.api.Headers;
import com.mozu.api.security.AuthTicket;
import org.apache.commons.lang.StringUtils;

/** <summary>
 * Merchants and customers can create, view, update, and delete a contact for a customer account. A customer account may have multiple contacts for billing and shipping addresses.
 * </summary>
 */
public class CustomerContactClient {
	
	/**
	 * Retrieves the specified contact for a customer account such as a billing or shipping contact.
	 * <p><pre><code>
	 * MozuClient<com.mozu.api.contracts.customer.CustomerContact> mozuClient=GetAccountContactClient( accountId,  contactId);
	 * client.setBaseAddress(url);
	 * client.executeRequest();
	 * CustomerContact customerContact = client.Result();
	 * </code></pre></p>
	 * @param accountId Unique identifier of the customer account whose contact information is being retrieved.
	 * @param contactId Unique identifier of the customer account contact to retrieve.
	 * @return Mozu.Api.MozuClient <com.mozu.api.contracts.customer.CustomerContact>
	 * @see com.mozu.api.contracts.customer.CustomerContact
	 */
	public static MozuClient<com.mozu.api.contracts.customer.CustomerContact> getAccountContactClient(Integer accountId, Integer contactId) throws Exception
	{
		MozuUrl url = com.mozu.api.urls.commerce.customer.accounts.CustomerContactUrl.getAccountContactUrl(accountId, contactId);
		String verb = "GET";
		Class<?> clz = com.mozu.api.contracts.customer.CustomerContact.class;
		MozuClient<com.mozu.api.contracts.customer.CustomerContact> mozuClient = new MozuClient(clz);
		mozuClient.setVerb(verb);
		mozuClient.setResourceUrl(url);
		return mozuClient;

	}

	/**
	 * Retrieves a list of contacts for a customer according to any specified filter criteria and sort options.
	 * <p><pre><code>
	 * MozuClient<com.mozu.api.contracts.customer.CustomerContactCollection> mozuClient=GetAccountContactsClient( accountId);
	 * client.setBaseAddress(url);
	 * client.executeRequest();
	 * CustomerContactCollection customerContactCollection = client.Result();
	 * </code></pre></p>
	 * @param accountId Unique identifier of the customer account associated with the contact information to retrieve.
	 * @return Mozu.Api.MozuClient <com.mozu.api.contracts.customer.CustomerContactCollection>
	 * @see com.mozu.api.contracts.customer.CustomerContactCollection
	 */
	public static MozuClient<com.mozu.api.contracts.customer.CustomerContactCollection> getAccountContactsClient(Integer accountId) throws Exception
	{
		return getAccountContactsClient( accountId,  null,  null,  null,  null);
	}

	/**
	 * Retrieves a list of contacts for a customer according to any specified filter criteria and sort options.
	 * <p><pre><code>
	 * MozuClient<com.mozu.api.contracts.customer.CustomerContactCollection> mozuClient=GetAccountContactsClient( accountId,  startIndex,  pageSize,  sortBy,  filter);
	 * client.setBaseAddress(url);
	 * client.executeRequest();
	 * CustomerContactCollection customerContactCollection = client.Result();
	 * </code></pre></p>
	 * @param accountId Unique identifier of the customer account associated with the contact information to retrieve.
	 * @param filter A set of expressions that consist of a field, operator, and value and represent search parameter syntax when filtering results of a query. Valid operators include equals (eq), does not equal (ne), greater than (gt), less than (lt), greater than or equal to (ge), less than or equal to (le), starts with (sw), or contains (cont). For example - "filter=IsDisplayed+eq+true"
	 * @param pageSize The number of results to display on each page when creating paged results from a query. The maximum value is 200.
	 * @param sortBy 
	 * @param startIndex 
	 * @return Mozu.Api.MozuClient <com.mozu.api.contracts.customer.CustomerContactCollection>
	 * @see com.mozu.api.contracts.customer.CustomerContactCollection
	 */
	public static MozuClient<com.mozu.api.contracts.customer.CustomerContactCollection> getAccountContactsClient(Integer accountId, Integer startIndex, Integer pageSize, String sortBy, String filter) throws Exception
	{
		MozuUrl url = com.mozu.api.urls.commerce.customer.accounts.CustomerContactUrl.getAccountContactsUrl(accountId, filter, pageSize, sortBy, startIndex);
		String verb = "GET";
		Class<?> clz = com.mozu.api.contracts.customer.CustomerContactCollection.class;
		MozuClient<com.mozu.api.contracts.customer.CustomerContactCollection> mozuClient = new MozuClient(clz);
		mozuClient.setVerb(verb);
		mozuClient.setResourceUrl(url);
		return mozuClient;

	}

	/**
	 * Creates a new contact for a customer account such as a new shipping address.
	 * <p><pre><code>
	 * MozuClient<com.mozu.api.contracts.customer.CustomerContact> mozuClient=AddAccountContactClient( contact,  accountId);
	 * client.setBaseAddress(url);
	 * client.executeRequest();
	 * CustomerContact customerContact = client.Result();
	 * </code></pre></p>
	 * @param accountId Unique identifier of the customer account containing the new contact.
	 * @param contact Properties of the new contact. Required properties: Contact.Email, ContactType.
	 * @return Mozu.Api.MozuClient <com.mozu.api.contracts.customer.CustomerContact>
	 * @see com.mozu.api.contracts.customer.CustomerContact
	 * @see com.mozu.api.contracts.customer.CustomerContact
	 */
	public static MozuClient<com.mozu.api.contracts.customer.CustomerContact> addAccountContactClient(com.mozu.api.contracts.customer.CustomerContact contact, Integer accountId) throws Exception
	{
		MozuUrl url = com.mozu.api.urls.commerce.customer.accounts.CustomerContactUrl.addAccountContactUrl(accountId);
		String verb = "POST";
		Class<?> clz = com.mozu.api.contracts.customer.CustomerContact.class;
		MozuClient<com.mozu.api.contracts.customer.CustomerContact> mozuClient = new MozuClient(clz);
		mozuClient.setVerb(verb);
		mozuClient.setResourceUrl(url);
		mozuClient.setBody(contact);
		return mozuClient;

	}

	/**
	 * Updates a contact for a specified customer account such as to update addresses or change which contact is the primary contact for billing.
	 * <p><pre><code>
	 * MozuClient<com.mozu.api.contracts.customer.CustomerContact> mozuClient=UpdateAccountContactClient( contact,  accountId,  contactId);
	 * client.setBaseAddress(url);
	 * client.executeRequest();
	 * CustomerContact customerContact = client.Result();
	 * </code></pre></p>
	 * @param accountId Unique identifier of the customer account whose contact information is being updated.
	 * @param contactId Unique identifer of the customer account contact being updated.
	 * @param contact All properties the updated contact will have. Required properties: Name and email address.
	 * @return Mozu.Api.MozuClient <com.mozu.api.contracts.customer.CustomerContact>
	 * @see com.mozu.api.contracts.customer.CustomerContact
	 * @see com.mozu.api.contracts.customer.CustomerContact
	 */
	public static MozuClient<com.mozu.api.contracts.customer.CustomerContact> updateAccountContactClient(com.mozu.api.contracts.customer.CustomerContact contact, Integer accountId, Integer contactId) throws Exception
	{
		MozuUrl url = com.mozu.api.urls.commerce.customer.accounts.CustomerContactUrl.updateAccountContactUrl(accountId, contactId);
		String verb = "PUT";
		Class<?> clz = com.mozu.api.contracts.customer.CustomerContact.class;
		MozuClient<com.mozu.api.contracts.customer.CustomerContact> mozuClient = new MozuClient(clz);
		mozuClient.setVerb(verb);
		mozuClient.setResourceUrl(url);
		mozuClient.setBody(contact);
		return mozuClient;

	}

	/**
	 * Deletes a contact for the specified customer account.
	 * <p><pre><code>
	 * MozuClient mozuClient=DeleteAccountContactClient( accountId,  contactId);
	 * client.setBaseAddress(url);
	 * client.executeRequest();
	 * </code></pre></p>
	 * @param accountId Unique identifier of the customer account.
	 * @param contactId Unique identifier of the customer account contact to delete.
	 * @return Mozu.Api.MozuClient 
	 */
	public static MozuClient deleteAccountContactClient(Integer accountId, Integer contactId) throws Exception
	{
		MozuUrl url = com.mozu.api.urls.commerce.customer.accounts.CustomerContactUrl.deleteAccountContactUrl(accountId, contactId);
		String verb = "DELETE";
				MozuClient mozuClient = new MozuClient();
		mozuClient.setVerb(verb);
		mozuClient.setResourceUrl(url);
		return mozuClient;

	}

}



