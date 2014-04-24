/**
 *     This code was auto-generated by a Codezu.     
 *
 *     Changes to this file may cause incorrect behavior and will be lost if
 *     the code is regenerated.
 */
package com.mozu.api.urls.commerce.settings;

import com.mozu.api.MozuUrl;
import com.mozu.api.utils.UrlFormatter;


public class LocationUsageUrl
{

	/**
	 * Get Resource Url for GetLocationUsages
	 * @return   String Resource Url
	 */
	public static MozuUrl getLocationUsagesUrl()
	{
		UrlFormatter formatter = new UrlFormatter("/api/commerce/settings/locationUsages/");
		return new MozuUrl(formatter.getResourceUrl(), MozuUrl.UrlLocation.TENANT_POD) ;
	}

	/**
	 * Get Resource Url for GetLocationUsage
	 * @param code Code that identifies the location usage type, which is "DS" for direct ship, "SP" for in-store pickup, or "storeFinder" for store finder.
	 * @return   String Resource Url
	 */
	public static MozuUrl getLocationUsageUrl(String code)
	{
		UrlFormatter formatter = new UrlFormatter("/api/commerce/settings/locationUsages/{code}");
		formatter.formatUrl("code", code);
		return new MozuUrl(formatter.getResourceUrl(), MozuUrl.UrlLocation.TENANT_POD) ;
	}

	/**
	 * Get Resource Url for UpdateLocationUsage
	 * @param code Code that identifies the location usage type, which is "DS" for direct ship, "SP" for in-store pickup, or "storeFinder" for store finder.
	 * @return   String Resource Url
	 */
	public static MozuUrl updateLocationUsageUrl(String code)
	{
		UrlFormatter formatter = new UrlFormatter("/api/commerce/settings/locationUsages/{code}");
		formatter.formatUrl("code", code);
		return new MozuUrl(formatter.getResourceUrl(), MozuUrl.UrlLocation.TENANT_POD) ;
	}

}

