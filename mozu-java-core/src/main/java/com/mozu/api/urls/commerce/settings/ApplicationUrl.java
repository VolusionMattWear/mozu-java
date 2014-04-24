/**
 *     This code was auto-generated by a Codezu.     
 *
 *     Changes to this file may cause incorrect behavior and will be lost if
 *     the code is regenerated.
 */
package com.mozu.api.urls.commerce.settings;

import com.mozu.api.MozuUrl;
import com.mozu.api.utils.UrlFormatter;


public class ApplicationUrl
{

	/**
	 * Get Resource Url for ThirdPartyGetApplication
	 * @return   String Resource Url
	 */
	public static MozuUrl thirdPartyGetApplicationUrl()
	{
		UrlFormatter formatter = new UrlFormatter("/api/commerce/settings/applications/");
		return new MozuUrl(formatter.getResourceUrl(), MozuUrl.UrlLocation.TENANT_POD) ;
	}

	/**
	 * Get Resource Url for ThirdPartyUpdateApplication
	 * @return   String Resource Url
	 */
	public static MozuUrl thirdPartyUpdateApplicationUrl()
	{
		UrlFormatter formatter = new UrlFormatter("/api/commerce/settings/applications/");
		return new MozuUrl(formatter.getResourceUrl(), MozuUrl.UrlLocation.TENANT_POD) ;
	}

}

