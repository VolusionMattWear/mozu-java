/**
 *     This code was auto-generated by a Codezu.     
 *
 *     Changes to this file may cause incorrect behavior and will be lost if
 *     the code is regenerated.
 */
package com.mozu.api.resources.commerce.catalog.admin.attributedefinition;

import com.mozu.api.ApiContext;
import java.util.List;
import java.util.ArrayList;
import com.mozu.api.MozuClient;
import com.mozu.api.MozuUrl;
import com.mozu.api.Headers;
import com.mozu.api.security.AuthTicket;
import org.apache.commons.lang.StringUtils;

/** <summary>
 * Use the Attribute Definition resource to manage the properties, options, and extras that uniquely describe products of a specific type. Attributes can be associated with a product type, assigned values by a merchant or shopper, and added as faceted search filters for a product category. Options are product attributes that describe unique configurations made by the shopper, such as size or color, and generate a new product variation (or unique SKU). Properties are product attributes that describe aspects of the product that do not represent an option configurable by the shopper, such as screen resolution or brand. Extras are product attributes that describe add-on configurations made by the shopper that do not represent a product variation, such as a monogram.
 * </summary>
 */
public class AttributeResource {
	///
	/// <see cref="Mozu.Api.ApiContext"/>
	///
	private ApiContext _apiContext;

	
	public AttributeResource(ApiContext apiContext) 
	{
		_apiContext = apiContext;
	}
	
	/**
	 * Retrieves a paged list of attributes according to any specified filter criteria and sort options.
	 * <p><pre><code>
	 *	Attribute attribute = new Attribute();
	 *	AttributeCollection attributeCollection = attribute.GetAttributes(dataViewMode);
	 * </code></pre></p>
	 * @param dataViewMode DataViewMode
	 * @return com.mozu.api.contracts.productadmin.AttributeCollection
	 * @see com.mozu.api.contracts.productadmin.AttributeCollection
	 */
	public com.mozu.api.contracts.productadmin.AttributeCollection getAttributes(com.mozu.api.DataViewMode dataViewMode) throws Exception
	{
		return getAttributes(dataViewMode,  null,  null,  null,  null);
	}

	/**
	 * Retrieves a paged list of attributes according to any specified filter criteria and sort options.
	 * <p><pre><code>
	 *	Attribute attribute = new Attribute();
	 *	AttributeCollection attributeCollection = attribute.GetAttributes(dataViewMode,  startIndex,  pageSize,  sortBy,  filter);
	 * </code></pre></p>
	 * @param filter A set of expressions that consist of a field, operator, and value and represent search parameter syntax when filtering results of a query. Valid operators include equals (eq), does not equal (ne), greater than (gt), less than (lt), greater than or equal to (ge), less than or equal to (le), starts with (sw), or contains (cont). For example - "filter=IsDisplayed+eq+true"
	 * @param pageSize The number of results to display on each page when creating paged results from a query. The maximum value is 200.
	 * @param sortBy 
	 * @param startIndex 
	 * @param dataViewMode DataViewMode
	 * @return com.mozu.api.contracts.productadmin.AttributeCollection
	 * @see com.mozu.api.contracts.productadmin.AttributeCollection
	 */
	public com.mozu.api.contracts.productadmin.AttributeCollection getAttributes(com.mozu.api.DataViewMode dataViewMode, Integer startIndex, Integer pageSize, String sortBy, String filter) throws Exception
	{
		MozuClient<com.mozu.api.contracts.productadmin.AttributeCollection> client = com.mozu.api.clients.commerce.catalog.admin.attributedefinition.AttributeClient.getAttributesClient(dataViewMode,  startIndex,  pageSize,  sortBy,  filter);
		client.setContext(_apiContext);
		client.executeRequest();
		return client.getResult();

	}

	/**
	 * Retrieves the details of the specified product attribute.
	 * <p><pre><code>
	 *	Attribute attribute = new Attribute();
	 *	Attribute attribute = attribute.GetAttribute(dataViewMode,  attributeFQN);
	 * </code></pre></p>
	 * @param attributeFQN The fully qualified name of the attribute, which is a user defined attribute identifier.
	 * @param dataViewMode DataViewMode
	 * @return com.mozu.api.contracts.productadmin.Attribute
	 * @see com.mozu.api.contracts.productadmin.Attribute
	 */
	public com.mozu.api.contracts.productadmin.Attribute getAttribute(com.mozu.api.DataViewMode dataViewMode, String attributeFQN) throws Exception
	{
		MozuClient<com.mozu.api.contracts.productadmin.Attribute> client = com.mozu.api.clients.commerce.catalog.admin.attributedefinition.AttributeClient.getAttributeClient(dataViewMode,  attributeFQN);
		client.setContext(_apiContext);
		client.executeRequest();
		return client.getResult();

	}

	/**
	 * Creates a new attribute to describe one aspect of a product such as color or size, based on its defined product type. The attribute name, attribute type, input type, and data type are required.
	 * <p><pre><code>
	 *	Attribute attribute = new Attribute();
	 *	Attribute attribute = attribute.AddAttribute(dataViewMode,  attribute);
	 * </code></pre></p>
	 * @param dataViewMode DataViewMode
	 * @param attribute Properties of the new product attribute to create.
	 * @return com.mozu.api.contracts.productadmin.Attribute
	 * @see com.mozu.api.contracts.productadmin.Attribute
	 * @see com.mozu.api.contracts.productadmin.Attribute
	 */
	public com.mozu.api.contracts.productadmin.Attribute addAttribute(com.mozu.api.DataViewMode dataViewMode, com.mozu.api.contracts.productadmin.Attribute attribute) throws Exception
	{
		MozuClient<com.mozu.api.contracts.productadmin.Attribute> client = com.mozu.api.clients.commerce.catalog.admin.attributedefinition.AttributeClient.addAttributeClient(dataViewMode,  attribute);
		client.setContext(_apiContext);
		client.executeRequest();
		return client.getResult();

	}

	/**
	 * Updates an existing attribute with attribute properties to set.
	 * <p><pre><code>
	 *	Attribute attribute = new Attribute();
	 *	Attribute attribute = attribute.UpdateAttribute(dataViewMode,  attribute,  attributeFQN);
	 * </code></pre></p>
	 * @param attributeFQN The fully qualified name of the attribute, which is a user defined attribute identifier.
	 * @param dataViewMode DataViewMode
	 * @param attribute Any properties of the attribute that to update.
	 * @return com.mozu.api.contracts.productadmin.Attribute
	 * @see com.mozu.api.contracts.productadmin.Attribute
	 * @see com.mozu.api.contracts.productadmin.Attribute
	 */
	public com.mozu.api.contracts.productadmin.Attribute updateAttribute(com.mozu.api.DataViewMode dataViewMode, com.mozu.api.contracts.productadmin.Attribute attribute, String attributeFQN) throws Exception
	{
		MozuClient<com.mozu.api.contracts.productadmin.Attribute> client = com.mozu.api.clients.commerce.catalog.admin.attributedefinition.AttributeClient.updateAttributeClient(dataViewMode,  attribute,  attributeFQN);
		client.setContext(_apiContext);
		client.executeRequest();
		return client.getResult();

	}

	/**
	 * Deletes a defined product attribute. You cannot delete an attribute assigned a value for a product.
	 * <p><pre><code>
	 *	Attribute attribute = new Attribute();
	 *	attribute.DeleteAttribute(dataViewMode,  attributeFQN);
	 * </code></pre></p>
	 * @param attributeFQN The fully qualified name of the attribute, which is a user defined attribute identifier.
	 * @param dataViewMode DataViewMode
	 * @return 
	 */
	public void deleteAttribute(com.mozu.api.DataViewMode dataViewMode, String attributeFQN) throws Exception
	{
		MozuClient client = com.mozu.api.clients.commerce.catalog.admin.attributedefinition.AttributeClient.deleteAttributeClient(dataViewMode,  attributeFQN);
		client.setContext(_apiContext);
		client.executeRequest();

	}

}



