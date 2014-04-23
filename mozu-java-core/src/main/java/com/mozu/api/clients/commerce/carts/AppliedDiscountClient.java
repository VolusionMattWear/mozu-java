/**
 *     This code was auto-generated by a Codezu.     
 *
 *     Changes to this file may cause incorrect behavior and will be lost if
 *     the code is regenerated.
 */
package com.mozu.api.clients.commerce.carts;

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
public class AppliedDiscountClient {
	
	/**
	 * 
	 * <p><pre><code>
	 * MozuClient<com.mozu.api.contracts.commerceruntime.carts.Cart> mozuClient=ApplyCouponClient( cartId,  couponCode);
	 * client.setBaseAddress(url);
	 * client.executeRequest();
	 * Cart cart = client.Result();
	 * </code></pre></p>
	 * @param cartId 
	 * @param couponCode 
	 * @return Mozu.Api.MozuClient <com.mozu.api.contracts.commerceruntime.carts.Cart>
	 * @see com.mozu.api.contracts.commerceruntime.carts.Cart
	 */
	public static MozuClient<com.mozu.api.contracts.commerceruntime.carts.Cart> applyCouponClient(String cartId, String couponCode) throws Exception
	{
		MozuUrl url = com.mozu.api.urls.commerce.carts.AppliedDiscountUrl.applyCouponUrl(cartId, couponCode);
		String verb = "PUT";
		Class<?> clz = com.mozu.api.contracts.commerceruntime.carts.Cart.class;
		MozuClient<com.mozu.api.contracts.commerceruntime.carts.Cart> mozuClient = new MozuClient(clz);
		mozuClient.setVerb(verb);
		mozuClient.setResourceUrl(url);
		return mozuClient;

	}

	/**
	 * 
	 * <p><pre><code>
	 * MozuClient<com.mozu.api.contracts.commerceruntime.carts.Cart> mozuClient=RemoveCouponsClient( cartId);
	 * client.setBaseAddress(url);
	 * client.executeRequest();
	 * Cart cart = client.Result();
	 * </code></pre></p>
	 * @param cartId 
	 * @return Mozu.Api.MozuClient <com.mozu.api.contracts.commerceruntime.carts.Cart>
	 * @see com.mozu.api.contracts.commerceruntime.carts.Cart
	 */
	public static MozuClient<com.mozu.api.contracts.commerceruntime.carts.Cart> removeCouponsClient(String cartId) throws Exception
	{
		MozuUrl url = com.mozu.api.urls.commerce.carts.AppliedDiscountUrl.removeCouponsUrl(cartId);
		String verb = "DELETE";
		Class<?> clz = com.mozu.api.contracts.commerceruntime.carts.Cart.class;
		MozuClient<com.mozu.api.contracts.commerceruntime.carts.Cart> mozuClient = new MozuClient(clz);
		mozuClient.setVerb(verb);
		mozuClient.setResourceUrl(url);
		return mozuClient;

	}

	/**
	 * 
	 * <p><pre><code>
	 * MozuClient<com.mozu.api.contracts.commerceruntime.carts.Cart> mozuClient=RemoveCouponClient( cartId,  couponCode);
	 * client.setBaseAddress(url);
	 * client.executeRequest();
	 * Cart cart = client.Result();
	 * </code></pre></p>
	 * @param cartId 
	 * @param couponCode 
	 * @return Mozu.Api.MozuClient <com.mozu.api.contracts.commerceruntime.carts.Cart>
	 * @see com.mozu.api.contracts.commerceruntime.carts.Cart
	 */
	public static MozuClient<com.mozu.api.contracts.commerceruntime.carts.Cart> removeCouponClient(String cartId, String couponCode) throws Exception
	{
		MozuUrl url = com.mozu.api.urls.commerce.carts.AppliedDiscountUrl.removeCouponUrl(cartId, couponCode);
		String verb = "DELETE";
		Class<?> clz = com.mozu.api.contracts.commerceruntime.carts.Cart.class;
		MozuClient<com.mozu.api.contracts.commerceruntime.carts.Cart> mozuClient = new MozuClient(clz);
		mozuClient.setVerb(verb);
		mozuClient.setResourceUrl(url);
		return mozuClient;

	}

}



