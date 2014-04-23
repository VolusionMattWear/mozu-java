/**
 *     This code was auto-generated by a Codezu.     
 *
 *     Changes to this file may cause incorrect behavior and will be lost if
 *     the code is regenerated.
 */
package com.mozu.api.urls.content;

import com.mozu.api.MozuUrl;
import com.mozu.api.utils.UrlFormatter;


public class PropertyTypeUrl
{

	/**
	 * Get Resource Url for GetPropertyTypes
	 * @param pageSize 
	 * @param startIndex 
	 * @return   String Resource Url
	 */
	public static MozuUrl getPropertyTypesUrl(Integer pageSize, Integer startIndex)
	{
		UrlFormatter formatter = new UrlFormatter("/api/content/propertytypes/?pageSize={pageSize}&startIndex={startIndex}");
		formatter.formatUrl("pageSize", pageSize);
		formatter.formatUrl("startIndex", startIndex);
		return new MozuUrl(formatter.getResourceUrl(), MozuUrl.UrlLocation.TENANT_POD) ;
	}

	/**
	 * Get Resource Url for GetPropertyType
	 * @param propertyTypeName 
	 * @return   String Resource Url
	 */
	public static MozuUrl getPropertyTypeUrl(String propertyTypeName)
	{
		UrlFormatter formatter = new UrlFormatter("/api/content/propertytypes/{propertyTypeName}");
		formatter.formatUrl("propertyTypeName", propertyTypeName);
		return new MozuUrl(formatter.getResourceUrl(), MozuUrl.UrlLocation.TENANT_POD) ;
	}

	/**
	 * Get Resource Url for PropertyValueTypes
	 * @return   String Resource Url
	 */
	public static MozuUrl propertyValueTypesUrl()
	{
		UrlFormatter formatter = new UrlFormatter("/api/content/propertytypes/propertyvaluetypes");
		return new MozuUrl(formatter.getResourceUrl(), MozuUrl.UrlLocation.TENANT_POD) ;
	}

}

