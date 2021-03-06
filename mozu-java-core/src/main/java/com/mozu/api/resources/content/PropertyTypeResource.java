/**
 *     This code was auto-generated by a Codezu.     
 *
 *     Changes to this file may cause incorrect behavior and will be lost if
 *     the code is regenerated.
 */
package com.mozu.api.resources.content;

import com.mozu.api.ApiContext;
import java.util.List;
import java.util.ArrayList;
import com.mozu.api.MozuClient;
import com.mozu.api.MozuUrl;
import com.mozu.api.Headers;
import com.mozu.api.security.AuthTicket;
import org.apache.commons.lang.StringUtils;

/** <summary>
 * Use the property types subresource to manage content properties.
 * </summary>
 */
public class PropertyTypeResource {
	///
	/// <see cref="Mozu.Api.ApiContext"/>
	///
	private ApiContext _apiContext;

	
	public PropertyTypeResource(ApiContext apiContext) 
	{
		_apiContext = apiContext;
	}
	
	/**
	 * 
	 * <p><pre><code>
	 *	PropertyType propertytype = new PropertyType();
	 *	PropertyTypeCollection propertyTypeCollection = propertytype.GetPropertyTypes(dataViewMode);
	 * </code></pre></p>
	 * @return com.mozu.api.contracts.content.PropertyTypeCollection
	 * @see com.mozu.api.contracts.content.PropertyTypeCollection
	 */
	public com.mozu.api.contracts.content.PropertyTypeCollection getPropertyTypes(com.mozu.api.DataViewMode dataViewMode) throws Exception
	{
		return getPropertyTypes(dataViewMode,  null,  null);
	}

	/**
	 * 
	 * <p><pre><code>
	 *	PropertyType propertytype = new PropertyType();
	 *	PropertyTypeCollection propertyTypeCollection = propertytype.GetPropertyTypes(dataViewMode,  pageSize,  startIndex);
	 * </code></pre></p>
	 * @param pageSize 
	 * @param startIndex 
	 * @return com.mozu.api.contracts.content.PropertyTypeCollection
	 * @see com.mozu.api.contracts.content.PropertyTypeCollection
	 */
	public com.mozu.api.contracts.content.PropertyTypeCollection getPropertyTypes(com.mozu.api.DataViewMode dataViewMode, Integer pageSize, Integer startIndex) throws Exception
	{
		MozuClient<com.mozu.api.contracts.content.PropertyTypeCollection> client = com.mozu.api.clients.content.PropertyTypeClient.getPropertyTypesClient(dataViewMode,  pageSize,  startIndex);
		client.setContext(_apiContext);
		client.executeRequest();
		return client.getResult();

	}

	/**
	 * 
	 * <p><pre><code>
	 *	PropertyType propertytype = new PropertyType();
	 *	PropertyType propertyType = propertytype.GetPropertyType(dataViewMode,  propertyTypeName);
	 * </code></pre></p>
	 * @param propertyTypeName 
	 * @return com.mozu.api.contracts.content.PropertyType
	 * @see com.mozu.api.contracts.content.PropertyType
	 */
	public com.mozu.api.contracts.content.PropertyType getPropertyType(com.mozu.api.DataViewMode dataViewMode, String propertyTypeName) throws Exception
	{
		MozuClient<com.mozu.api.contracts.content.PropertyType> client = com.mozu.api.clients.content.PropertyTypeClient.getPropertyTypeClient(dataViewMode,  propertyTypeName);
		client.setContext(_apiContext);
		client.executeRequest();
		return client.getResult();

	}

	/**
	 * Retrieves the value types associated with a content property.
	 * <p><pre><code>
	 *	PropertyType propertytype = new PropertyType();
	 *	PropertyValueType propertyValueType = propertytype.PropertyValueTypes(dataViewMode);
	 * </code></pre></p>
	 * @return List<com.mozu.api.contracts.content.PropertyValueType>
	 * @see com.mozu.api.contracts.content.PropertyValueType
	 */
	public List<com.mozu.api.contracts.content.PropertyValueType> propertyValueTypes(com.mozu.api.DataViewMode dataViewMode) throws Exception
	{
		MozuClient<List<com.mozu.api.contracts.content.PropertyValueType>> client = com.mozu.api.clients.content.PropertyTypeClient.propertyValueTypesClient(dataViewMode);
		client.setContext(_apiContext);
		client.executeRequest();
		return client.getResult();

	}

}



