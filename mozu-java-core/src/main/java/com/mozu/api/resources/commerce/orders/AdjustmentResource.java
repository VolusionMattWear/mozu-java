/**
 *     This code was auto-generated by a Codezu.     
 *
 *     Changes to this file may cause incorrect behavior and will be lost if
 *     the code is regenerated.
 */
package com.mozu.api.resources.commerce.orders;

import com.mozu.api.ApiContext;
import java.util.List;
import java.util.ArrayList;
import com.mozu.api.MozuClient;
import com.mozu.api.MozuUrl;
import com.mozu.api.Headers;
import com.mozu.api.security.AuthTicket;
import org.apache.commons.lang.StringUtils;

/** <summary>
 * Use this subresource to manage ad-hoc order level price adjustments.
 * </summary>
 */
public class AdjustmentResource {
	///
	/// <see cref="Mozu.Api.ApiContext"/>
	///
	private ApiContext _apiContext;

	
	public AdjustmentResource(ApiContext apiContext) 
	{
		_apiContext = apiContext;
	}
	
	/**
	 * Applies a shipping adjustment to the specified order.
	 * <p><pre><code>
	 *	Adjustment adjustment = new Adjustment();
	 *	Order order = adjustment.ApplyShippingAdjustment( adjustment,  orderId);
	 * </code></pre></p>
	 * @param orderId Unique identifier of the order associated with the shipping adjustment.
	 * @param adjustment Properties of the shipping adjustment to apply to the order.
	 * @return com.mozu.api.contracts.commerceruntime.orders.Order
	 * @see com.mozu.api.contracts.commerceruntime.orders.Order
	 * @see com.mozu.api.contracts.commerceruntime.commerce.Adjustment
	 */
	public com.mozu.api.contracts.commerceruntime.orders.Order applyShippingAdjustment(com.mozu.api.contracts.commerceruntime.commerce.Adjustment adjustment, String orderId) throws Exception
	{
		return applyShippingAdjustment( adjustment,  orderId,  null,  null);
	}

	/**
	 * Applies a shipping adjustment to the specified order.
	 * <p><pre><code>
	 *	Adjustment adjustment = new Adjustment();
	 *	Order order = adjustment.ApplyShippingAdjustment( adjustment,  orderId,  updateMode,  version);
	 * </code></pre></p>
	 * @param orderId Unique identifier of the order associated with the shipping adjustment.
	 * @param updateMode Specifies whether to apply the shipping adjustment by updating the original order, updating the order in draft mode, or updating the order in draft mode and then committing the changes to the original. Draft mode enables users to make incremental order changes before committing the changes to the original order. Valid values are "ApplyToOriginal," "ApplyToDraft," or "ApplyAndCommit."
	 * @param version System-supplied integer that represents the current version of the order, which prevents users from unintentionally overriding changes to the order. When a user performs an operation for a defined order, the system validates that the version of the updated order matches the version of the order on the server. After the operation completes successfully, the system increments the version number by one.
	 * @param adjustment Properties of the shipping adjustment to apply to the order.
	 * @return com.mozu.api.contracts.commerceruntime.orders.Order
	 * @see com.mozu.api.contracts.commerceruntime.orders.Order
	 * @see com.mozu.api.contracts.commerceruntime.commerce.Adjustment
	 */
	public com.mozu.api.contracts.commerceruntime.orders.Order applyShippingAdjustment(com.mozu.api.contracts.commerceruntime.commerce.Adjustment adjustment, String orderId, String updateMode, String version) throws Exception
	{
		MozuClient<com.mozu.api.contracts.commerceruntime.orders.Order> client = com.mozu.api.clients.commerce.orders.AdjustmentClient.applyShippingAdjustmentClient( adjustment,  orderId,  updateMode,  version);
		client.setContext(_apiContext);
		client.executeRequest();
		return client.getResult();

	}

	/**
	 * Applies a price adjustment to the specified order.
	 * <p><pre><code>
	 *	Adjustment adjustment = new Adjustment();
	 *	Order order = adjustment.ApplyAdjustment( adjustment,  orderId);
	 * </code></pre></p>
	 * @param orderId Unique identifier of the order for which to apply the adjustment.
	 * @param adjustment Properties of the price adjustment to apply to the order.
	 * @return com.mozu.api.contracts.commerceruntime.orders.Order
	 * @see com.mozu.api.contracts.commerceruntime.orders.Order
	 * @see com.mozu.api.contracts.commerceruntime.commerce.Adjustment
	 */
	public com.mozu.api.contracts.commerceruntime.orders.Order applyAdjustment(com.mozu.api.contracts.commerceruntime.commerce.Adjustment adjustment, String orderId) throws Exception
	{
		return applyAdjustment( adjustment,  orderId,  null,  null);
	}

	/**
	 * Applies a price adjustment to the specified order.
	 * <p><pre><code>
	 *	Adjustment adjustment = new Adjustment();
	 *	Order order = adjustment.ApplyAdjustment( adjustment,  orderId,  updateMode,  version);
	 * </code></pre></p>
	 * @param orderId Unique identifier of the order for which to apply the adjustment.
	 * @param updateMode Specifies whether to apply the adjustment by updating the original order, updating the order in draft mode, or updating the order in draft mode and then committing the changes to the original. Draft mode enables users to make incremental order changes before committing the changes to the original order. Valid values are "ApplyToOriginal," "ApplyToDraft," or "ApplyAndCommit."
	 * @param version System-supplied integer that represents the current version of the order, which prevents users from unintentionally overriding changes to the order. When a user performs an operation for a defined order, the system validates that the version of the updated order matches the version of the order on the server. After the operation completes successfully, the system increments the version number by one.
	 * @param adjustment Properties of the price adjustment to apply to the order.
	 * @return com.mozu.api.contracts.commerceruntime.orders.Order
	 * @see com.mozu.api.contracts.commerceruntime.orders.Order
	 * @see com.mozu.api.contracts.commerceruntime.commerce.Adjustment
	 */
	public com.mozu.api.contracts.commerceruntime.orders.Order applyAdjustment(com.mozu.api.contracts.commerceruntime.commerce.Adjustment adjustment, String orderId, String updateMode, String version) throws Exception
	{
		MozuClient<com.mozu.api.contracts.commerceruntime.orders.Order> client = com.mozu.api.clients.commerce.orders.AdjustmentClient.applyAdjustmentClient( adjustment,  orderId,  updateMode,  version);
		client.setContext(_apiContext);
		client.executeRequest();
		return client.getResult();

	}

	/**
	 * Removes a shipping adjustment previously applied to an order or draft.
	 * <p><pre><code>
	 *	Adjustment adjustment = new Adjustment();
	 *	Order order = adjustment.RemoveShippingAdjustment( orderId);
	 * </code></pre></p>
	 * @param orderId Unique identifier of the order with the applied shipping adjustment.
	 * @return com.mozu.api.contracts.commerceruntime.orders.Order
	 * @see com.mozu.api.contracts.commerceruntime.orders.Order
	 */
	public com.mozu.api.contracts.commerceruntime.orders.Order removeShippingAdjustment(String orderId) throws Exception
	{
		return removeShippingAdjustment( orderId,  null,  null);
	}

	/**
	 * Removes a shipping adjustment previously applied to an order or draft.
	 * <p><pre><code>
	 *	Adjustment adjustment = new Adjustment();
	 *	Order order = adjustment.RemoveShippingAdjustment( orderId,  updateMode,  version);
	 * </code></pre></p>
	 * @param orderId Unique identifier of the order with the applied shipping adjustment.
	 * @param updateMode Specifies whether to remove the shipping adjustment by updating the original order, updating the order in draft mode, or updating the order in draft mode and then commit the changes to the original. Draft mode enables users to make incremental order changes before committing the changes to the original order. Valid values are "ApplyToOriginal," "ApplyToDraft," or "ApplyAndCommit."
	 * @param version System-supplied integer that represents the current version of the order, which prevents users from unintentionally overriding changes to the order. When a user performs an operation for a defined order, the system validates that the version of the updated order matches the version of the order on the server. After the operation completes successfully, the system increments the version number by one.
	 * @return com.mozu.api.contracts.commerceruntime.orders.Order
	 * @see com.mozu.api.contracts.commerceruntime.orders.Order
	 */
	public com.mozu.api.contracts.commerceruntime.orders.Order removeShippingAdjustment(String orderId, String updateMode, String version) throws Exception
	{
		MozuClient<com.mozu.api.contracts.commerceruntime.orders.Order> client = com.mozu.api.clients.commerce.orders.AdjustmentClient.removeShippingAdjustmentClient( orderId,  updateMode,  version);
		client.setContext(_apiContext);
		client.executeRequest();
		return client.getResult();

	}

	/**
	 * Removes a price adjustment from the specified order.
	 * <p><pre><code>
	 *	Adjustment adjustment = new Adjustment();
	 *	Order order = adjustment.RemoveAdjustment( orderId);
	 * </code></pre></p>
	 * @param orderId Unique identifier of the order for which to delete the adjustment.
	 * @return com.mozu.api.contracts.commerceruntime.orders.Order
	 * @see com.mozu.api.contracts.commerceruntime.orders.Order
	 */
	public com.mozu.api.contracts.commerceruntime.orders.Order removeAdjustment(String orderId) throws Exception
	{
		return removeAdjustment( orderId,  null,  null);
	}

	/**
	 * Removes a price adjustment from the specified order.
	 * <p><pre><code>
	 *	Adjustment adjustment = new Adjustment();
	 *	Order order = adjustment.RemoveAdjustment( orderId,  updateMode,  version);
	 * </code></pre></p>
	 * @param orderId Unique identifier of the order for which to delete the adjustment.
	 * @param updateMode Specifies whether to remove the adjustment by updating the original order, updating the order in draft mode, or updating the order in draft mode and then committing the changes to the original. Draft mode enables users to make incremental order changes before committing the changes to the original order. Valid values are "ApplyToOriginal," "ApplyToDraft," or "ApplyAndCommit."
	 * @param version System-supplied integer that represents the current version of the order, which prevents users from unintentionally overriding changes to the order. When a user performs an operation for a defined order, the system validates that the version of the updated order matches the version of the order on the server. After the operation completes successfully, the system increments the version number by one.
	 * @return com.mozu.api.contracts.commerceruntime.orders.Order
	 * @see com.mozu.api.contracts.commerceruntime.orders.Order
	 */
	public com.mozu.api.contracts.commerceruntime.orders.Order removeAdjustment(String orderId, String updateMode, String version) throws Exception
	{
		MozuClient<com.mozu.api.contracts.commerceruntime.orders.Order> client = com.mozu.api.clients.commerce.orders.AdjustmentClient.removeAdjustmentClient( orderId,  updateMode,  version);
		client.setContext(_apiContext);
		client.executeRequest();
		return client.getResult();

	}

}



