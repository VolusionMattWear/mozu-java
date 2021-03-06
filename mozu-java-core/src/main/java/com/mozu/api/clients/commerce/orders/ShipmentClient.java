/**
 *     This code was auto-generated by a Codezu.     
 *
 *     Changes to this file may cause incorrect behavior and will be lost if
 *     the code is regenerated.
 */
package com.mozu.api.clients.commerce.orders;

import java.util.List;
import java.util.ArrayList;
import com.mozu.api.MozuClient;
import com.mozu.api.MozuUrl;
import com.mozu.api.Headers;
import com.mozu.api.security.AuthTicket;
import org.apache.commons.lang.StringUtils;

/** <summary>
 * Use the shipments resource to manage shipments of collections of packages for an order.
 * </summary>
 */
public class ShipmentClient {
	
	/**
	 * Retrieves the details of the order shipment specified in the request.
	 * <p><pre><code>
	 * MozuClient<com.mozu.api.contracts.commerceruntime.fulfillment.Shipment> mozuClient=GetShipmentClient( orderId,  shipmentId);
	 * client.setBaseAddress(url);
	 * client.executeRequest();
	 * Shipment shipment = client.Result();
	 * </code></pre></p>
	 * @param orderId Unique identifier of the order associated with the shipment to retrieve.
	 * @param shipmentId Unique identifier of the shipment to retrieve.
	 * @return Mozu.Api.MozuClient <com.mozu.api.contracts.commerceruntime.fulfillment.Shipment>
	 * @see com.mozu.api.contracts.commerceruntime.fulfillment.Shipment
	 */
	public static MozuClient<com.mozu.api.contracts.commerceruntime.fulfillment.Shipment> getShipmentClient(String orderId, String shipmentId) throws Exception
	{
		MozuUrl url = com.mozu.api.urls.commerce.orders.ShipmentUrl.getShipmentUrl(orderId, shipmentId);
		String verb = "GET";
		Class<?> clz = com.mozu.api.contracts.commerceruntime.fulfillment.Shipment.class;
		MozuClient<com.mozu.api.contracts.commerceruntime.fulfillment.Shipment> mozuClient = new MozuClient(clz);
		mozuClient.setVerb(verb);
		mozuClient.setResourceUrl(url);
		return mozuClient;

	}

	/**
	 * Retrieves the available shipping methods applicable to the order. Typically used to display available shipping method options on the checkout page.
	 * <p><pre><code>
	 * MozuClient<List<com.mozu.api.contracts.commerceruntime.fulfillment.ShippingRate>> mozuClient=GetAvailableShipmentMethodsClient( orderId);
	 * client.setBaseAddress(url);
	 * client.executeRequest();
	 * ShippingRate shippingRate = client.Result();
	 * </code></pre></p>
	 * @param orderId Unique identifier of the order for the available shipment methods being retrieved.
	 * @return Mozu.Api.MozuClient <List<com.mozu.api.contracts.commerceruntime.fulfillment.ShippingRate>>
	 * @see com.mozu.api.contracts.commerceruntime.fulfillment.ShippingRate
	 */
	public static MozuClient<List<com.mozu.api.contracts.commerceruntime.fulfillment.ShippingRate>> getAvailableShipmentMethodsClient(String orderId) throws Exception
	{
		MozuUrl url = com.mozu.api.urls.commerce.orders.ShipmentUrl.getAvailableShipmentMethodsUrl(orderId);
		String verb = "GET";
		Class<?> clz = new ArrayList<com.mozu.api.contracts.commerceruntime.fulfillment.ShippingRate>(){}.getClass();
		MozuClient<List<com.mozu.api.contracts.commerceruntime.fulfillment.ShippingRate>> mozuClient = new MozuClient(clz);
		mozuClient.setVerb(verb);
		mozuClient.setResourceUrl(url);
		return mozuClient;

	}

	/**
	 * Creates a shipment from one or more package associated with an order and assign a label and tracking number to an order shipment.
	 * <p><pre><code>
	 * MozuClient<List<com.mozu.api.contracts.commerceruntime.fulfillment.Package>> mozuClient=CreatePackageShipmentsClient( packageIds,  orderId);
	 * client.setBaseAddress(url);
	 * client.executeRequest();
	 * Package package = client.Result();
	 * </code></pre></p>
	 * @param orderId Unique identifier of the order for this shipment.
	 * @param packageIds List of unique identifiers for each package associated with this shipment. Not all packages must belong to the same shipment.
	 * @return Mozu.Api.MozuClient <List<com.mozu.api.contracts.commerceruntime.fulfillment.Package>>
	 * @see com.mozu.api.contracts.commerceruntime.fulfillment.Package
	 * @see string
	 */
	public static MozuClient<List<com.mozu.api.contracts.commerceruntime.fulfillment.Package>> createPackageShipmentsClient(List<String> packageIds, String orderId) throws Exception
	{
		MozuUrl url = com.mozu.api.urls.commerce.orders.ShipmentUrl.createPackageShipmentsUrl(orderId);
		String verb = "POST";
		Class<?> clz = new ArrayList<com.mozu.api.contracts.commerceruntime.fulfillment.Package>(){}.getClass();
		MozuClient<List<com.mozu.api.contracts.commerceruntime.fulfillment.Package>> mozuClient = new MozuClient(clz);
		mozuClient.setVerb(verb);
		mozuClient.setResourceUrl(url);
		mozuClient.setBody(packageIds);
		return mozuClient;

	}

	/**
	 * Deletes the shipment specified in the request.
	 * <p><pre><code>
	 * MozuClient mozuClient=DeleteShipmentClient( orderId,  shipmentId);
	 * client.setBaseAddress(url);
	 * client.executeRequest();
	 * </code></pre></p>
	 * @param orderId Unique identifier of the order to cancel shipment.
	 * @param shipmentId Unique identifier of the shipment to cancel.
	 * @return Mozu.Api.MozuClient 
	 */
	public static MozuClient deleteShipmentClient(String orderId, String shipmentId) throws Exception
	{
		MozuUrl url = com.mozu.api.urls.commerce.orders.ShipmentUrl.deleteShipmentUrl(orderId, shipmentId);
		String verb = "DELETE";
				MozuClient mozuClient = new MozuClient();
		mozuClient.setVerb(verb);
		mozuClient.setResourceUrl(url);
		return mozuClient;

	}

}



