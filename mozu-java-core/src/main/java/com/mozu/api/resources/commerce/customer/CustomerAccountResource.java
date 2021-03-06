/**
 *     This code was auto-generated by a Codezu.     
 *
 *     Changes to this file may cause incorrect behavior and will be lost if
 *     the code is regenerated.
 */
package com.mozu.api.resources.commerce.customer;

import com.mozu.api.ApiContext;
import java.util.List;
import java.util.ArrayList;
import com.mozu.api.MozuClient;
import com.mozu.api.MozuUrl;
import com.mozu.api.Headers;
import com.mozu.api.security.AuthTicket;
import org.apache.commons.lang.StringUtils;

/** <summary>
 * Use the Customer Accounts resource to manage the components of shopper accounts, including attributes, contact information, company notes, and groups associated with the customer account.
 * </summary>
 */
public class CustomerAccountResource {
	///
	/// <see cref="Mozu.Api.ApiContext"/>
	///
	private ApiContext _apiContext;

	
	public CustomerAccountResource(ApiContext apiContext) 
	{
		_apiContext = apiContext;
	}
	
	/**
	 * Retrieves a list of customer accounts.
	 * <p><pre><code>
	 *	CustomerAccount customeraccount = new CustomerAccount();
	 *	CustomerAccountCollection customerAccountCollection = customeraccount.GetAccounts();
	 * </code></pre></p>
	 * @return com.mozu.api.contracts.customer.CustomerAccountCollection
	 * @see com.mozu.api.contracts.customer.CustomerAccountCollection
	 */
	public com.mozu.api.contracts.customer.CustomerAccountCollection getAccounts() throws Exception
	{
		return getAccounts( null,  null,  null,  null,  null,  null,  null,  null);
	}

	/**
	 * Retrieves a list of customer accounts.
	 * <p><pre><code>
	 *	CustomerAccount customeraccount = new CustomerAccount();
	 *	CustomerAccountCollection customerAccountCollection = customeraccount.GetAccounts( startIndex,  pageSize,  sortBy,  filter,  fields,  q,  qLimit,  isAnonymous);
	 * </code></pre></p>
	 * @param fields The fields to include in the response.
	 * @param filter A set of expressions that consist of a field, operator, and value and represent search parameter syntax when filtering results of a query. Valid operators include equals (eq), does not equal (ne), greater than (gt), less than (lt), greater than or equal to (ge), less than or equal to (le), starts with (sw), or contains (cont). For example - "filter=IsDisplayed+eq+true"
	 * @param isAnonymous 
	 * @param pageSize 
	 * @param q A list of customer account search terms to use in the query when searching across customer name and email. Separate multiple search terms with a space character.
	 * @param qLimit The maximum number of search results to return in the response. You can limit any range between 1-100.
	 * @param sortBy 
	 * @param startIndex 
	 * @return com.mozu.api.contracts.customer.CustomerAccountCollection
	 * @see com.mozu.api.contracts.customer.CustomerAccountCollection
	 */
	public com.mozu.api.contracts.customer.CustomerAccountCollection getAccounts(Integer startIndex, Integer pageSize, String sortBy, String filter, String fields, String q, Integer qLimit, Boolean isAnonymous) throws Exception
	{
		MozuClient<com.mozu.api.contracts.customer.CustomerAccountCollection> client = com.mozu.api.clients.commerce.customer.CustomerAccountClient.getAccountsClient( startIndex,  pageSize,  sortBy,  filter,  fields,  q,  qLimit,  isAnonymous);
		client.setContext(_apiContext);
		client.executeRequest();
		return client.getResult();

	}

	/**
	 * Retrieve details of a customer account.
	 * <p><pre><code>
	 *	CustomerAccount customeraccount = new CustomerAccount();
	 *	CustomerAccount customerAccount = customeraccount.GetAccount( accountId);
	 * </code></pre></p>
	 * @param accountId Unique identifier of the customer account to retrieve.
	 * @return com.mozu.api.contracts.customer.CustomerAccount
	 * @see com.mozu.api.contracts.customer.CustomerAccount
	 */
	public com.mozu.api.contracts.customer.CustomerAccount getAccount(Integer accountId) throws Exception
	{
		MozuClient<com.mozu.api.contracts.customer.CustomerAccount> client = com.mozu.api.clients.commerce.customer.CustomerAccountClient.getAccountClient( accountId);
		client.setContext(_apiContext);
		client.executeRequest();
		return client.getResult();

	}

	/**
	 * 
	 * <p><pre><code>
	 *	CustomerAccount customeraccount = new CustomerAccount();
	 *	LoginState loginState = customeraccount.GetLoginState( accountId);
	 * </code></pre></p>
	 * @param accountId 
	 * @return com.mozu.api.contracts.customer.LoginState
	 * @see com.mozu.api.contracts.customer.LoginState
	 */
	public com.mozu.api.contracts.customer.LoginState getLoginState(Integer accountId) throws Exception
	{
		MozuClient<com.mozu.api.contracts.customer.LoginState> client = com.mozu.api.clients.commerce.customer.CustomerAccountClient.getLoginStateClient( accountId);
		client.setContext(_apiContext);
		client.executeRequest();
		return client.getResult();

	}

	/**
	 * Creates a new customer account based on the information specified in the request.
	 * <p><pre><code>
	 *	CustomerAccount customeraccount = new CustomerAccount();
	 *	CustomerAccount customerAccount = customeraccount.AddAccount( account);
	 * </code></pre></p>
	 * @param account Properties of the customer account to update.
	 * @return com.mozu.api.contracts.customer.CustomerAccount
	 * @see com.mozu.api.contracts.customer.CustomerAccount
	 * @see com.mozu.api.contracts.customer.CustomerAccount
	 */
	public com.mozu.api.contracts.customer.CustomerAccount addAccount(com.mozu.api.contracts.customer.CustomerAccount account) throws Exception
	{
		MozuClient<com.mozu.api.contracts.customer.CustomerAccount> client = com.mozu.api.clients.commerce.customer.CustomerAccountClient.addAccountClient( account);
		client.setContext(_apiContext);
		client.executeRequest();
		return client.getResult();

	}

	/**
	 * 
	 * <p><pre><code>
	 *	CustomerAccount customeraccount = new CustomerAccount();
	 *	customeraccount.ChangePassword( passwordInfo,  accountId);
	 * </code></pre></p>
	 * @param accountId 
	 * @param passwordInfo 
	 * @return 
	 * @see com.mozu.api.contracts.customer.PasswordInfo
	 */
	public void changePassword(com.mozu.api.contracts.customer.PasswordInfo passwordInfo, Integer accountId) throws Exception
	{
		MozuClient client = com.mozu.api.clients.commerce.customer.CustomerAccountClient.changePasswordClient( passwordInfo,  accountId);
		client.setContext(_apiContext);
		client.executeRequest();

	}

	/**
	 * 
	 * <p><pre><code>
	 *	CustomerAccount customeraccount = new CustomerAccount();
	 *	CustomerAuthTicket customerAuthTicket = customeraccount.AddLoginToExistingCustomer( customerAuthInfo,  accountId);
	 * </code></pre></p>
	 * @param accountId 
	 * @param customerAuthInfo 
	 * @return com.mozu.api.contracts.customer.CustomerAuthTicket
	 * @see com.mozu.api.contracts.customer.CustomerAuthTicket
	 * @see com.mozu.api.contracts.customer.CustomerLoginInfo
	 */
	public com.mozu.api.contracts.customer.CustomerAuthTicket addLoginToExistingCustomer(com.mozu.api.contracts.customer.CustomerLoginInfo customerAuthInfo, Integer accountId) throws Exception
	{
		MozuClient<com.mozu.api.contracts.customer.CustomerAuthTicket> client = com.mozu.api.clients.commerce.customer.CustomerAccountClient.addLoginToExistingCustomerClient( customerAuthInfo,  accountId);
		client.setContext(_apiContext);
		client.executeRequest();
		return client.getResult();

	}

	/**
	 * 
	 * <p><pre><code>
	 *	CustomerAccount customeraccount = new CustomerAccount();
	 *	customeraccount.RecomputeCustomerLifetimeValue( accountId);
	 * </code></pre></p>
	 * @param accountId 
	 * @return 
	 */
	public void recomputeCustomerLifetimeValue(Integer accountId) throws Exception
	{
		MozuClient client = com.mozu.api.clients.commerce.customer.CustomerAccountClient.recomputeCustomerLifetimeValueClient( accountId);
		client.setContext(_apiContext);
		client.executeRequest();

	}

	/**
	 * 
	 * <p><pre><code>
	 *	CustomerAccount customeraccount = new CustomerAccount();
	 *	customeraccount.SetLoginLocked( isLocked,  accountId);
	 * </code></pre></p>
	 * @param accountId 
	 * @param isLocked 
	 * @return 
	 * @see bool
	 */
	public void setLoginLocked(Boolean isLocked, Integer accountId) throws Exception
	{
		MozuClient client = com.mozu.api.clients.commerce.customer.CustomerAccountClient.setLoginLockedClient( isLocked,  accountId);
		client.setContext(_apiContext);
		client.executeRequest();

	}

	/**
	 * 
	 * <p><pre><code>
	 *	CustomerAccount customeraccount = new CustomerAccount();
	 *	customeraccount.SetPasswordChangeRequired( isPasswordChangeRequired,  accountId);
	 * </code></pre></p>
	 * @param accountId 
	 * @param isPasswordChangeRequired 
	 * @return 
	 * @see bool
	 */
	public void setPasswordChangeRequired(Boolean isPasswordChangeRequired, Integer accountId) throws Exception
	{
		MozuClient client = com.mozu.api.clients.commerce.customer.CustomerAccountClient.setPasswordChangeRequiredClient( isPasswordChangeRequired,  accountId);
		client.setContext(_apiContext);
		client.executeRequest();

	}

	/**
	 * 
	 * <p><pre><code>
	 *	CustomerAccount customeraccount = new CustomerAccount();
	 *	CustomerAuthTicket customerAuthTicket = customeraccount.AddAccountAndLogin( accountAndAuthInfo);
	 * </code></pre></p>
	 * @param accountAndAuthInfo 
	 * @return com.mozu.api.contracts.customer.CustomerAuthTicket
	 * @see com.mozu.api.contracts.customer.CustomerAuthTicket
	 * @see com.mozu.api.contracts.customer.CustomerAccountAndAuthInfo
	 */
	public com.mozu.api.contracts.customer.CustomerAuthTicket addAccountAndLogin(com.mozu.api.contracts.customer.CustomerAccountAndAuthInfo accountAndAuthInfo) throws Exception
	{
		MozuClient<com.mozu.api.contracts.customer.CustomerAuthTicket> client = com.mozu.api.clients.commerce.customer.CustomerAccountClient.addAccountAndLoginClient( accountAndAuthInfo);
		client.setContext(_apiContext);
		client.executeRequest();
		return client.getResult();

	}

	/**
	 * 
	 * <p><pre><code>
	 *	CustomerAccount customeraccount = new CustomerAccount();
	 *	CustomerAccountCollection customerAccountCollection = customeraccount.AddAccounts( customers);
	 * </code></pre></p>
	 * @param customers 
	 * @return com.mozu.api.contracts.customer.CustomerAccountCollection
	 * @see com.mozu.api.contracts.customer.CustomerAccountCollection
	 * @see com.mozu.api.contracts.customer.CustomerAccountAndAuthInfo
	 */
	public com.mozu.api.contracts.customer.CustomerAccountCollection addAccounts(List<com.mozu.api.contracts.customer.CustomerAccountAndAuthInfo> customers) throws Exception
	{
		MozuClient<com.mozu.api.contracts.customer.CustomerAccountCollection> client = com.mozu.api.clients.commerce.customer.CustomerAccountClient.addAccountsClient( customers);
		client.setContext(_apiContext);
		client.executeRequest();
		return client.getResult();

	}

	/**
	 * 
	 * <p><pre><code>
	 *	CustomerAccount customeraccount = new CustomerAccount();
	 *	LoginState loginState = customeraccount.GetLoginStateByEmailAddress( emailAddress);
	 * </code></pre></p>
	 * @param emailAddress 
	 * @return com.mozu.api.contracts.customer.LoginState
	 * @see com.mozu.api.contracts.customer.LoginState
	 */
	public com.mozu.api.contracts.customer.LoginState getLoginStateByEmailAddress(String emailAddress) throws Exception
	{
		MozuClient<com.mozu.api.contracts.customer.LoginState> client = com.mozu.api.clients.commerce.customer.CustomerAccountClient.getLoginStateByEmailAddressClient( emailAddress);
		client.setContext(_apiContext);
		client.executeRequest();
		return client.getResult();

	}

	/**
	 * 
	 * <p><pre><code>
	 *	CustomerAccount customeraccount = new CustomerAccount();
	 *	LoginState loginState = customeraccount.GetLoginStateByUserName( userName);
	 * </code></pre></p>
	 * @param userName 
	 * @return com.mozu.api.contracts.customer.LoginState
	 * @see com.mozu.api.contracts.customer.LoginState
	 */
	public com.mozu.api.contracts.customer.LoginState getLoginStateByUserName(String userName) throws Exception
	{
		MozuClient<com.mozu.api.contracts.customer.LoginState> client = com.mozu.api.clients.commerce.customer.CustomerAccountClient.getLoginStateByUserNameClient( userName);
		client.setContext(_apiContext);
		client.executeRequest();
		return client.getResult();

	}

	/**
	 * 
	 * <p><pre><code>
	 *	CustomerAccount customeraccount = new CustomerAccount();
	 *	customeraccount.ResetPassword( resetPasswordInfo);
	 * </code></pre></p>
	 * @param resetPasswordInfo 
	 * @return 
	 * @see com.mozu.api.contracts.customer.ResetPasswordInfo
	 */
	public void resetPassword(com.mozu.api.contracts.customer.ResetPasswordInfo resetPasswordInfo) throws Exception
	{
		MozuClient client = com.mozu.api.clients.commerce.customer.CustomerAccountClient.resetPasswordClient( resetPasswordInfo);
		client.setContext(_apiContext);
		client.executeRequest();

	}

	/**
	 * Updates a customer account.
	 * <p><pre><code>
	 *	CustomerAccount customeraccount = new CustomerAccount();
	 *	CustomerAccount customerAccount = customeraccount.UpdateAccount( account,  accountId);
	 * </code></pre></p>
	 * @param accountId Unique identifier of the customer account.
	 * @param account Properties of the customer account to update.
	 * @return com.mozu.api.contracts.customer.CustomerAccount
	 * @see com.mozu.api.contracts.customer.CustomerAccount
	 * @see com.mozu.api.contracts.customer.CustomerAccount
	 */
	public com.mozu.api.contracts.customer.CustomerAccount updateAccount(com.mozu.api.contracts.customer.CustomerAccount account, Integer accountId) throws Exception
	{
		MozuClient<com.mozu.api.contracts.customer.CustomerAccount> client = com.mozu.api.clients.commerce.customer.CustomerAccountClient.updateAccountClient( account,  accountId);
		client.setContext(_apiContext);
		client.executeRequest();
		return client.getResult();

	}

	/**
	 * Deletes a customer account. A customer account cannot be deleted if any orders exist, past or present.
	 * <p><pre><code>
	 *	CustomerAccount customeraccount = new CustomerAccount();
	 *	customeraccount.DeleteAccount( accountId);
	 * </code></pre></p>
	 * @param accountId Unique identifier of the customer account to delete.
	 * @return 
	 */
	public void deleteAccount(Integer accountId) throws Exception
	{
		MozuClient client = com.mozu.api.clients.commerce.customer.CustomerAccountClient.deleteAccountClient( accountId);
		client.setContext(_apiContext);
		client.executeRequest();

	}

}



