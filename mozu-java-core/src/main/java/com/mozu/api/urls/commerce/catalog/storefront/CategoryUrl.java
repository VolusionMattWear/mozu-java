/**
 *     This code was auto-generated by a Codezu.     
 *
 *     Changes to this file may cause incorrect behavior and will be lost if
 *     the code is regenerated.
 */
package com.mozu.api.urls.commerce.catalog.storefront;

import com.mozu.api.MozuUrl;
import com.mozu.api.utils.UrlFormatter;


public class CategoryUrl
{

	/**
	 * Get Resource Url for GetCategories
	 * @param filter A set of expressions that consist of a field, operator, and value and represent search parameter syntax when filtering results of a query. You can filter product category search results by any of its properties, including its position in the category hierarchy. Valid operators include equals (eq), does not equal (ne), greater than (gt), less than (lt), greater than or equal to (ge), less than or equal to (le), starts with (sw), or contains (cont). For example - "filter=IsDisplayed+eq+true"
	 * @param pageSize The number of results to display on each page when creating paged results from a query. The maximum value is 200.
	 * @param sortBy 
	 * @param startIndex 
	 * @return   String Resource Url
	 */
	public static MozuUrl getCategoriesUrl(String filter, Integer pageSize, String sortBy, Integer startIndex)
	{
		UrlFormatter formatter = new UrlFormatter("/api/commerce/catalog/storefront/categories/?filter={filter}&startIndex={startIndex}&pageSize={pageSize}&sortBy={sortBy}");
		formatter.formatUrl("filter", filter);
		formatter.formatUrl("pageSize", pageSize);
		formatter.formatUrl("sortBy", sortBy);
		formatter.formatUrl("startIndex", startIndex);
		return new MozuUrl(formatter.getResourceUrl(), MozuUrl.UrlLocation.TENANT_POD) ;
	}

	/**
	 * Get Resource Url for GetCategory
	 * @param allowInactive If true, allow inactive categories to be retrieved in the category list response. If false, the categories retrieved will not include ones marked inactive.
	 * @param categoryId Unique identifier for the storefront container used to organize products.
	 * @return   String Resource Url
	 */
	public static MozuUrl getCategoryUrl(Boolean allowInactive, Integer categoryId)
	{
		UrlFormatter formatter = new UrlFormatter("/api/commerce/catalog/storefront/categories/{categoryId}?allowInactive={allowInactive}");
		formatter.formatUrl("allowInactive", allowInactive);
		formatter.formatUrl("categoryId", categoryId);
		return new MozuUrl(formatter.getResourceUrl(), MozuUrl.UrlLocation.TENANT_POD) ;
	}

	/**
	 * Get Resource Url for GetCategoryTree
	 * @return   String Resource Url
	 */
	public static MozuUrl getCategoryTreeUrl()
	{
		UrlFormatter formatter = new UrlFormatter("/api/commerce/catalog/storefront/categories/tree");
		return new MozuUrl(formatter.getResourceUrl(), MozuUrl.UrlLocation.TENANT_POD) ;
	}

}

