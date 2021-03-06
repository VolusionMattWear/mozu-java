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
 * Use the Attributes subresource to manage the attributes used to uniquely identify shopper accounts, such as gender or age.
 * </summary>
 */
public class CustomerAttributeResource {
	///
	/// <see cref="Mozu.Api.ApiContext"/>
	///
	private ApiContext _apiContext;

	
	public CustomerAttributeResource(ApiContext apiContext) 
	{
		_apiContext = apiContext;
	}
	
	/**
	 * Retrieves the contents of an attribute associated with the specified customer account.
	 * <p><pre><code>
	 *	CustomerAttribute customerattribute = new CustomerAttribute();
	 *	CustomerAttribute customerAttribute = customerattribute.GetAccountAttribute( accountId,  attributeFQN);
	 * </code></pre></p>
	 * @param accountId Identifier of the customer account associated with the attribute to retrieve.
	 * @param attributeFQN 
	 * @return com.mozu.api.contracts.customer.CustomerAttribute
	 * @see com.mozu.api.contracts.customer.CustomerAttribute
	 */
	public com.mozu.api.contracts.customer.CustomerAttribute getAccountAttribute(Integer accountId, String attributeFQN) throws Exception
	{
		MozuClient<com.mozu.api.contracts.customer.CustomerAttribute> client = com.mozu.api.clients.commerce.customer.accounts.CustomerAttributeClient.getAccountAttributeClient( accountId,  attributeFQN);
		client.setContext(_apiContext);
		client.executeRequest();
		return client.getResult();

	}

	/**
	 * Retrieves the list of customer account attributes.
	 * <p><pre><code>
	 *	CustomerAttribute customerattribute = new CustomerAttribute();
	 *	CustomerAttributeCollection customerAttributeCollection = customerattribute.GetAccountAttributes( accountId);
	 * </code></pre></p>
	 * @param accountId Identifier of the customer account associated with the attributes to retrieve.
	 * @return com.mozu.api.contracts.customer.CustomerAttributeCollection
	 * @see com.mozu.api.contracts.customer.CustomerAttributeCollection
	 */
	public com.mozu.api.contracts.customer.CustomerAttributeCollection getAccountAttributes(Integer accountId) throws Exception
	{
		return getAccountAttributes( accountId,  null,  null,  null,  null);
	}

	/**
	 * Retrieves the list of customer account attributes.
	 * <p><pre><code>
	 *	CustomerAttribute customerattribute = new CustomerAttribute();
	 *	CustomerAttributeCollection customerAttributeCollection = customerattribute.GetAccountAttributes( accountId,  startIndex,  pageSize,  sortBy,  filter);
	 * </code></pre></p>
	 * @param accountId Identifier of the customer account associated with the attributes to retrieve.
	 * @param filter 
	 * @param pageSize 
	 * @param sortBy 
	 * @param startIndex 
	 * @return com.mozu.api.contracts.customer.CustomerAttributeCollection
	 * @see com.mozu.api.contracts.customer.CustomerAttributeCollection
	 */
	public com.mozu.api.contracts.customer.CustomerAttributeCollection getAccountAttributes(Integer accountId, Integer startIndex, Integer pageSize, String sortBy, String filter) throws Exception
	{
		MozuClient<com.mozu.api.contracts.customer.CustomerAttributeCollection> client = com.mozu.api.clients.commerce.customer.accounts.CustomerAttributeClient.getAccountAttributesClient( accountId,  startIndex,  pageSize,  sortBy,  filter);
		client.setContext(_apiContext);
		client.executeRequest();
		return client.getResult();

	}

	/**
	 * Applies a defined attribute to the customer account specified in the request and assigns a value to the customer attribute.
	 * <p><pre><code>
	 *	CustomerAttribute customerattribute = new CustomerAttribute();
	 *	CustomerAttribute customerAttribute = customerattribute.AddAccountAttribute( attribute,  accountId);
	 * </code></pre></p>
	 * @param accountId Unique identifier of the customer account.
	 * @param attribute 
	 * @return com.mozu.api.contracts.customer.CustomerAttribute
	 * @see com.mozu.api.contracts.customer.CustomerAttribute
	 * @see com.mozu.api.contracts.customer.CustomerAttribute
	 */
	public com.mozu.api.contracts.customer.CustomerAttribute addAccountAttribute(com.mozu.api.contracts.customer.CustomerAttribute attribute, Integer accountId) throws Exception
	{
		MozuClient<com.mozu.api.contracts.customer.CustomerAttribute> client = com.mozu.api.clients.commerce.customer.accounts.CustomerAttributeClient.addAccountAttributeClient( attribute,  accountId);
		client.setContext(_apiContext);
		client.executeRequest();
		return client.getResult();

	}

	/**
	 * Updates one or more details of a customer account attribute.
	 * <p><pre><code>
	 *	CustomerAttribute customerattribute = new CustomerAttribute();
	 *	CustomerAttribute customerAttribute = customerattribute.UpdateAccountAttribute( attribute,  accountId,  attributeFQN);
	 * </code></pre></p>
	 * @param accountId Identifier of the customer account associated with the attribute.
	 * @param attributeFQN 
	 * @param attribute 
	 * @return com.mozu.api.contracts.customer.CustomerAttribute
	 * @see com.mozu.api.contracts.customer.CustomerAttribute
	 * @see com.mozu.api.contracts.customer.CustomerAttribute
	 */
	public com.mozu.api.contracts.customer.CustomerAttribute updateAccountAttribute(com.mozu.api.contracts.customer.CustomerAttribute attribute, Integer accountId, String attributeFQN) throws Exception
	{
		MozuClient<com.mozu.api.contracts.customer.CustomerAttribute> client = com.mozu.api.clients.commerce.customer.accounts.CustomerAttributeClient.updateAccountAttributeClient( attribute,  accountId,  attributeFQN);
		client.setContext(_apiContext);
		client.executeRequest();
		return client.getResult();

	}

	/**
	 * 
	 * <p><pre><code>
	 *	CustomerAttribute customerattribute = new CustomerAttribute();
	 *	customerattribute.DeleteAccountAttribute( accountId,  attributeFQN);
	 * </code></pre></p>
	 * @param accountId 
	 * @param attributeFQN 
	 * @return 
	 */
	public void deleteAccountAttribute(Integer accountId, String attributeFQN) throws Exception
	{
		MozuClient client = com.mozu.api.clients.commerce.customer.accounts.CustomerAttributeClient.deleteAccountAttributeClient( accountId,  attributeFQN);
		client.setContext(_apiContext);
		client.executeRequest();

	}

}



