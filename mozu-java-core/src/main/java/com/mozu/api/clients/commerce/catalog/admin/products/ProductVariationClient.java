/**
 *     This code was auto-generated by a Codezu.     
 *
 *     Changes to this file may cause incorrect behavior and will be lost if
 *     the code is regenerated.
 */
package com.mozu.api.clients.commerce.catalog.admin.products;

import java.util.List;
import java.util.ArrayList;
import com.mozu.api.MozuClient;
import com.mozu.api.MozuUrl;
import com.mozu.api.Headers;
import com.mozu.api.security.AuthTicket;
import org.apache.commons.lang.StringUtils;

/** <summary>
 * Use the product variations sub-resource to manage the variations of a product based on its attributes. For example, a t-shirt product could be offered in six variations: Small Black, Medium Black, Large Black, Small White, Medium White, and Large White.
 * </summary>
 */
public class ProductVariationClient {
	
	/**
	 * Retrieves the details of a product variation based on the supplied product code and variation key.
	 * <p><pre><code>
	 * MozuClient<com.mozu.api.contracts.productadmin.ProductVariation> mozuClient=GetProductVariationClient(dataViewMode,  productCode,  variationKey);
	 * client.setBaseAddress(url);
	 * client.executeRequest();
	 * ProductVariation productVariation = client.Result();
	 * </code></pre></p>
	 * @param productCode Merchant-created code that uniquely identifies the product such as a SKU or item number. Once created, the product code is read-only.
	 * @param variationKey System-generated key that represents the attribute values that uniquely identify a specific product variation.
	 * @return Mozu.Api.MozuClient <com.mozu.api.contracts.productadmin.ProductVariation>
	 * @see com.mozu.api.contracts.productadmin.ProductVariation
	 */
	public static MozuClient<com.mozu.api.contracts.productadmin.ProductVariation> getProductVariationClient(com.mozu.api.DataViewMode dataViewMode, String productCode, String variationKey) throws Exception
	{
		MozuUrl url = com.mozu.api.urls.commerce.catalog.admin.products.ProductVariationUrl.getProductVariationUrl(productCode, variationKey);
		String verb = "GET";
		Class<?> clz = com.mozu.api.contracts.productadmin.ProductVariation.class;
		MozuClient<com.mozu.api.contracts.productadmin.ProductVariation> mozuClient = new MozuClient(clz);
		mozuClient.setVerb(verb);
		mozuClient.setResourceUrl(url);
		mozuClient.addHeader(Headers.X_VOL_DATAVIEW_MODE ,dataViewMode.toString());
		return mozuClient;

	}

	/**
	 * Retrieves a list of the product variations configured for the specified product code.
	 * <p><pre><code>
	 * MozuClient<com.mozu.api.contracts.productadmin.ProductVariationPagedCollection> mozuClient=GetProductVariationsClient(dataViewMode,  productCode);
	 * client.setBaseAddress(url);
	 * client.executeRequest();
	 * ProductVariationPagedCollection productVariationPagedCollection = client.Result();
	 * </code></pre></p>
	 * @param productCode Merchant-created code that uniquely identifies the product such as a SKU or item number. Once created, the product code is read-only.
	 * @return Mozu.Api.MozuClient <com.mozu.api.contracts.productadmin.ProductVariationPagedCollection>
	 * @see com.mozu.api.contracts.productadmin.ProductVariationPagedCollection
	 */
	public static MozuClient<com.mozu.api.contracts.productadmin.ProductVariationPagedCollection> getProductVariationsClient(com.mozu.api.DataViewMode dataViewMode, String productCode) throws Exception
	{
		return getProductVariationsClient(dataViewMode,  productCode,  null,  null,  null,  null);
	}

	/**
	 * Retrieves a list of the product variations configured for the specified product code.
	 * <p><pre><code>
	 * MozuClient<com.mozu.api.contracts.productadmin.ProductVariationPagedCollection> mozuClient=GetProductVariationsClient(dataViewMode,  productCode,  startIndex,  pageSize,  sortBy,  filter);
	 * client.setBaseAddress(url);
	 * client.executeRequest();
	 * ProductVariationPagedCollection productVariationPagedCollection = client.Result();
	 * </code></pre></p>
	 * @param filter A set of expressions that consist of a field, operator, and value and represent search parameter syntax when filtering results of a query. Valid operators include equals (eq), does not equal (ne), greater than (gt), less than (lt), greater than or equal to (ge), less than or equal to (le), starts with (sw), or contains (cont). For example - "filter=IsDisplayed+eq+true"
	 * @param pageSize The number of results to display on each page when creating paged results from a query. The maximum value is 200.
	 * @param productCode Merchant-created code that uniquely identifies the product such as a SKU or item number. Once created, the product code is read-only.
	 * @param sortBy The property by which to sort results and whether the results appear in ascending (a-z) order, represented by ASC or in descending (z-a) order, represented by DESC. The sortBy parameter follows an available property. For example: "sortBy=productCode+asc"
	 * @param startIndex When creating paged results from a query, this value indicates the zero-based offset in the complete result set where the returned entities begin. For example, with a PageSize of 25, to get the 51st through the 75th items, use startIndex=3.
	 * @return Mozu.Api.MozuClient <com.mozu.api.contracts.productadmin.ProductVariationPagedCollection>
	 * @see com.mozu.api.contracts.productadmin.ProductVariationPagedCollection
	 */
	public static MozuClient<com.mozu.api.contracts.productadmin.ProductVariationPagedCollection> getProductVariationsClient(com.mozu.api.DataViewMode dataViewMode, String productCode, Integer startIndex, Integer pageSize, String sortBy, String filter) throws Exception
	{
		MozuUrl url = com.mozu.api.urls.commerce.catalog.admin.products.ProductVariationUrl.getProductVariationsUrl(filter, pageSize, productCode, sortBy, startIndex);
		String verb = "GET";
		Class<?> clz = com.mozu.api.contracts.productadmin.ProductVariationPagedCollection.class;
		MozuClient<com.mozu.api.contracts.productadmin.ProductVariationPagedCollection> mozuClient = new MozuClient(clz);
		mozuClient.setVerb(verb);
		mozuClient.setResourceUrl(url);
		mozuClient.addHeader(Headers.X_VOL_DATAVIEW_MODE ,dataViewMode.toString());
		return mozuClient;

	}

	/**
	 * Modifies the collection of variations for the specified product code. Because this PUT replaces the existing resource, supply all information necessary to maintain for the product variation.
	 * <p><pre><code>
	 * MozuClient<com.mozu.api.contracts.productadmin.ProductVariationCollection> mozuClient=UpdateProductVariationsClient(dataViewMode,  productVariations,  productCode);
	 * client.setBaseAddress(url);
	 * client.executeRequest();
	 * ProductVariationCollection productVariationCollection = client.Result();
	 * </code></pre></p>
	 * @param productCode Merchant-created code that uniquely identifies the product such as a SKU or item number. Once created, the product code is read-only.
	 * @param productVariations Wrapper for the collection of variations configured for the specified product code.
	 * @return Mozu.Api.MozuClient <com.mozu.api.contracts.productadmin.ProductVariationCollection>
	 * @see com.mozu.api.contracts.productadmin.ProductVariationCollection
	 * @see com.mozu.api.contracts.productadmin.ProductVariationCollection
	 */
	public static MozuClient<com.mozu.api.contracts.productadmin.ProductVariationCollection> updateProductVariationsClient(com.mozu.api.DataViewMode dataViewMode, com.mozu.api.contracts.productadmin.ProductVariationCollection productVariations, String productCode) throws Exception
	{
		MozuUrl url = com.mozu.api.urls.commerce.catalog.admin.products.ProductVariationUrl.updateProductVariationsUrl(productCode);
		String verb = "PUT";
		Class<?> clz = com.mozu.api.contracts.productadmin.ProductVariationCollection.class;
		MozuClient<com.mozu.api.contracts.productadmin.ProductVariationCollection> mozuClient = new MozuClient(clz);
		mozuClient.setVerb(verb);
		mozuClient.setResourceUrl(url);
		mozuClient.setBody(productVariations);
		mozuClient.addHeader(Headers.X_VOL_DATAVIEW_MODE ,dataViewMode.toString());
		return mozuClient;

	}

	/**
	 * Modifies the details of a variation, based on the supplied variation key, for the specified product code.
	 * <p><pre><code>
	 * MozuClient<com.mozu.api.contracts.productadmin.ProductVariation> mozuClient=UpdateProductVariationClient(dataViewMode,  productVariation,  productCode,  variationKey);
	 * client.setBaseAddress(url);
	 * client.executeRequest();
	 * ProductVariation productVariation = client.Result();
	 * </code></pre></p>
	 * @param productCode Merchant-created code that uniquely identifies the product such as a SKU or item number. Once created, the product code is read-only.
	 * @param variationKey System-generated key that represents the attribute values that uniquely identify a specific product variation.
	 * @param productVariation Wrapper for the properties of the specified product variation.
	 * @return Mozu.Api.MozuClient <com.mozu.api.contracts.productadmin.ProductVariation>
	 * @see com.mozu.api.contracts.productadmin.ProductVariation
	 * @see com.mozu.api.contracts.productadmin.ProductVariation
	 */
	public static MozuClient<com.mozu.api.contracts.productadmin.ProductVariation> updateProductVariationClient(com.mozu.api.DataViewMode dataViewMode, com.mozu.api.contracts.productadmin.ProductVariation productVariation, String productCode, String variationKey) throws Exception
	{
		MozuUrl url = com.mozu.api.urls.commerce.catalog.admin.products.ProductVariationUrl.updateProductVariationUrl(productCode, variationKey);
		String verb = "PUT";
		Class<?> clz = com.mozu.api.contracts.productadmin.ProductVariation.class;
		MozuClient<com.mozu.api.contracts.productadmin.ProductVariation> mozuClient = new MozuClient(clz);
		mozuClient.setVerb(verb);
		mozuClient.setResourceUrl(url);
		mozuClient.setBody(productVariation);
		mozuClient.addHeader(Headers.X_VOL_DATAVIEW_MODE ,dataViewMode.toString());
		return mozuClient;

	}

	/**
	 * Deletes a variation, based on the supplied variation key, for the specified product code.
	 * <p><pre><code>
	 * MozuClient mozuClient=DeleteProductVariationClient(dataViewMode,  productCode,  variationKey);
	 * client.setBaseAddress(url);
	 * client.executeRequest();
	 * </code></pre></p>
	 * @param productCode Merchant-created code that uniquely identifies the product such as a SKU or item number. Once created, the product code is read-only.
	 * @param variationKey System-generated key that represents the attribute values that uniquely identify a specific product variation.
	 * @return Mozu.Api.MozuClient 
	 */
	public static MozuClient deleteProductVariationClient(com.mozu.api.DataViewMode dataViewMode, String productCode, String variationKey) throws Exception
	{
		MozuUrl url = com.mozu.api.urls.commerce.catalog.admin.products.ProductVariationUrl.deleteProductVariationUrl(productCode, variationKey);
		String verb = "DELETE";
				MozuClient mozuClient = new MozuClient();
		mozuClient.setVerb(verb);
		mozuClient.setResourceUrl(url);
		mozuClient.addHeader(Headers.X_VOL_DATAVIEW_MODE ,dataViewMode.toString());
		return mozuClient;

	}

}



