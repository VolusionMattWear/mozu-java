/**
 *     This code was auto-generated by a Codezu.     
 *
 *     Changes to this file may cause incorrect behavior and will be lost if
 *     the code is regenerated.
 */
package com.mozu.api.contracts.productruntime;

import java.util.List;
import java.io.Serializable;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import org.joda.time.DateTime;
import com.mozu.api.contracts.productruntime.AttributeDetail;
import com.mozu.api.contracts.productruntime.ProductPropertyValue;

/**
 *	Details of a property attribute defined for a product.
 */
@JsonIgnoreProperties(ignoreUnknown = true)
public class ProductProperty implements Serializable
{
	// Default Serial Version UID
	private static final long serialVersionUID = 1L;

	/**
	 * The fully qualified name of the attribute, which is a user defined attribute identifier.
	 */
	protected String attributeFQN;

	public String getAttributeFQN() {
		return this.attributeFQN;
	}

	public void setAttributeFQN(String attributeFQN) {
		this.attributeFQN = attributeFQN;
	}

	/**
	 * If true, the product property does not appear for the product in the storefront.
	 */
	protected Boolean isHidden;

	public Boolean getIsHidden() {
		return this.isHidden;
	}

	public void setIsHidden(Boolean isHidden) {
		this.isHidden = isHidden;
	}

	/**
	 * If true, the product property can have more than one selected value.
	 */
	protected Boolean isMultiValue;

	public Boolean getIsMultiValue() {
		return this.isMultiValue;
	}

	public void setIsMultiValue(Boolean isMultiValue) {
		this.isMultiValue = isMultiValue;
	}

	/**
	 * Details of the attribute defined as a product property.
	 */
	protected AttributeDetail attributeDetail;

	public AttributeDetail getAttributeDetail() {
		return this.attributeDetail;
	}

	public void setAttributeDetail(AttributeDetail attributeDetail) {
		this.attributeDetail = attributeDetail;
	}

	/**
	 * List of values defined for the product property attribute.
	 */
	protected List<ProductPropertyValue> values;
	public List<ProductPropertyValue> getValues() {
		return this.values;
	}
	public void setValues(List<ProductPropertyValue> values) {
		this.values = values;
	}

}
