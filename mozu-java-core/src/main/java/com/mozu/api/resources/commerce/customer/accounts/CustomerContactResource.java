/**
 *     This code was auto-generated by a Codezu.     
 *
 *     Changes to this file may cause incorrect behavior and will be lost if
 *     the code is regenerated.
 */
package com.mozu.api.resources.commerce.customer.accounts;

import com.mozu.api.ApiContext;
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
public class CustomerContactResource {
	///
	/// <see cref="Mozu.Api.ApiContext"/>
	///
	private ApiContext _apiContext;

	
	public CustomerContactResource(ApiContext apiContext) 
	{
		_apiContext = apiContext;
	}
	
	/**
	 * Retrieves the specified contact for a customer account such as a billing or shipping contact.
	 * <p><pre><code>
	 *	CustomerContact customercontact = new CustomerContact();
	 *	CustomerContact customerContact = customercontact.GetAccountContact( accountId,  contactId);
	 * </code></pre></p>
	 * @param accountId Unique identifier of the customer account whose contact information is being retrieved.
	 * @param contactId Unique identifier of the customer account contact to retrieve.
	 * @return com.mozu.api.contracts.customer.CustomerContact
	 * @see com.mozu.api.contracts.customer.CustomerContact
	 */
	public com.mozu.api.contracts.customer.CustomerContact getAccountContact(Integer accountId, Integer contactId) throws Exception
	{
		MozuClient<com.mozu.api.contracts.customer.CustomerContact> client = com.mozu.api.clients.commerce.customer.accounts.CustomerContactClient.getAccountContactClient( accountId,  contactId);
		client.setContext(_apiContext);
		client.executeRequest();
		return client.getResult();

	}

	/**
	 * Retrieves a list of contacts for a customer according to any specified filter criteria and sort options.
	 * <p><pre><code>
	 *	CustomerContact customercontact = new CustomerContact();
	 *	CustomerContactCollection customerContactCollection = customercontact.GetAccountContacts( accountId);
	 * </code></pre></p>
	 * @param accountId Unique identifier of the customer account associated with the contact information to retrieve.
	 * @return com.mozu.api.contracts.customer.CustomerContactCollection
	 * @see com.mozu.api.contracts.customer.CustomerContactCollection
	 */
	public com.mozu.api.contracts.customer.CustomerContactCollection getAccountContacts(Integer accountId) throws Exception
	{
		return getAccountContacts( accountId,  null,  null,  null,  null);
	}

	/**
	 * Retrieves a list of contacts for a customer according to any specified filter criteria and sort options.
	 * <p><pre><code>
	 *	CustomerContact customercontact = new CustomerContact();
	 *	CustomerContactCollection customerContactCollection = customercontact.GetAccountContacts( accountId,  startIndex,  pageSize,  sortBy,  filter);
	 * </code></pre></p>
	 * @param accountId Unique identifier of the customer account associated with the contact information to retrieve.
	 * @param filter A set of expressions that consist of a field, operator, and value and represent search parameter syntax when filtering results of a query. Valid operators include equals (eq), does not equal (ne), greater than (gt), less than (lt), greater than or equal to (ge), less than or equal to (le), starts with (sw), or contains (cont). For example - "filter=IsDisplayed+eq+true"
	 * @param pageSize The number of results to display on each page when creating paged results from a query. The maximum value is 200.
	 * @param sortBy 
	 * @param startIndex 
	 * @return com.mozu.api.contracts.customer.CustomerContactCollection
	 * @see com.mozu.api.contracts.customer.CustomerContactCollection
	 */
	public com.mozu.api.contracts.customer.CustomerContactCollection getAccountContacts(Integer accountId, Integer startIndex, Integer pageSize, String sortBy, String filter) throws Exception
	{
		MozuClient<com.mozu.api.contracts.customer.CustomerContactCollection> client = com.mozu.api.clients.commerce.customer.accounts.CustomerContactClient.getAccountContactsClient( accountId,  startIndex,  pageSize,  sortBy,  filter);
		client.setContext(_apiContext);
		client.executeRequest();
		return client.getResult();

	}

	/**
	 * Creates a new contact for a customer account such as a new shipping address.
	 * <p><pre><code>
	 *	CustomerContact customercontact = new CustomerContact();
	 *	CustomerContact customerContact = customercontact.AddAccountContact( contact,  accountId);
	 * </code></pre></p>
	 * @param accountId Unique identifier of the customer account containing the new contact.
	 * @param contact Properties of the new contact. Required properties: Contact.Email, ContactType.
	 * @return com.mozu.api.contracts.customer.CustomerContact
	 * @see com.mozu.api.contracts.customer.CustomerContact
	 * @see com.mozu.api.contracts.customer.CustomerContact
	 */
	public com.mozu.api.contracts.customer.CustomerContact addAccountContact(com.mozu.api.contracts.customer.CustomerContact contact, Integer accountId) throws Exception
	{
		MozuClient<com.mozu.api.contracts.customer.CustomerContact> client = com.mozu.api.clients.commerce.customer.accounts.CustomerContactClient.addAccountContactClient( contact,  accountId);
		client.setContext(_apiContext);
		client.executeRequest();
		return client.getResult();

	}

	/**
	 * Updates a contact for a specified customer account such as to update addresses or change which contact is the primary contact for billing.
	 * <p><pre><code>
	 *	CustomerContact customercontact = new CustomerContact();
	 *	CustomerContact customerContact = customercontact.UpdateAccountContact( contact,  accountId,  contactId);
	 * </code></pre></p>
	 * @param accountId Unique identifier of the customer account whose contact information is being updated.
	 * @param contactId Unique identifer of the customer account contact being updated.
	 * @param contact All properties the updated contact will have. Required properties: Name and email address.
	 * @return com.mozu.api.contracts.customer.CustomerContact
	 * @see com.mozu.api.contracts.customer.CustomerContact
	 * @see com.mozu.api.contracts.customer.CustomerContact
	 */
	public com.mozu.api.contracts.customer.CustomerContact updateAccountContact(com.mozu.api.contracts.customer.CustomerContact contact, Integer accountId, Integer contactId) throws Exception
	{
		MozuClient<com.mozu.api.contracts.customer.CustomerContact> client = com.mozu.api.clients.commerce.customer.accounts.CustomerContactClient.updateAccountContactClient( contact,  accountId,  contactId);
		client.setContext(_apiContext);
		client.executeRequest();
		return client.getResult();

	}

	/**
	 * Deletes a contact for the specified customer account.
	 * <p><pre><code>
	 *	CustomerContact customercontact = new CustomerContact();
	 *	customercontact.DeleteAccountContact( accountId,  contactId);
	 * </code></pre></p>
	 * @param accountId Unique identifier of the customer account.
	 * @param contactId Unique identifier of the customer account contact to delete.
	 * @return 
	 */
	public void deleteAccountContact(Integer accountId, Integer contactId) throws Exception
	{
		MozuClient client = com.mozu.api.clients.commerce.customer.accounts.CustomerContactClient.deleteAccountContactClient( accountId,  contactId);
		client.setContext(_apiContext);
		client.executeRequest();

	}

}



