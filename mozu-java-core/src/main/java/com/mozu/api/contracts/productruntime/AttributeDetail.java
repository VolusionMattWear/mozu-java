/**
 *     This code was auto-generated by a Codezu.     
 *
 *     Changes to this file may cause incorrect behavior and will be lost if
 *     the code is regenerated.
 */
package com.mozu.api.contracts.productruntime;

import java.io.Serializable;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import org.joda.time.DateTime;
import com.mozu.api.contracts.productruntime.AttributeValidation;

/**
 *	The product attribute details common between all attribute types - properties, options, and extras.
 */
@JsonIgnoreProperties(ignoreUnknown = true)
public class AttributeDetail implements Serializable
{
	// Default Serial Version UID
	private static final long serialVersionUID = 1L;

	/**
	 * The data type (such as datetime or string) associated with the attribute.
	 */
	protected String dataType;

	public String getDataType() {
		return this.dataType;
	}

	public void setDataType(String dataType) {
		this.dataType = dataType;
	}

	/**
	 * Unique sequence of the attribute for its data type.
	 */
	protected Integer dataTypeSequence;

	public Integer getDataTypeSequence() {
		return this.dataTypeSequence;
	}

	public void setDataTypeSequence(Integer dataTypeSequence) {
		this.dataTypeSequence = dataTypeSequence;
	}

	/**
	 * Description of the attribute in the language specified by the locale code.
	 */
	protected String description;

	public String getDescription() {
		return this.description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	/**
	 * The input type (such as date or text area) accepted for the attribute's data type.
	 */
	protected String inputType;

	public String getInputType() {
		return this.inputType;
	}

	public void setInputType(String inputType) {
		this.inputType = inputType;
	}

	/**
	 * Name of the atrribute in the language specified by the locale code.
	 */
	protected String name;

	public String getName() {
		return this.name;
	}

	public void setName(String name) {
		this.name = name;
	}

	/**
	 * The usage type of the product attribute, which is property, option, or extra.
	 */
	protected String usageType;

	public String getUsageType() {
		return this.usageType;
	}

	public void setUsageType(String usageType) {
		this.usageType = usageType;
	}

	/**
	 * The type of value for the attribute, which is either ShopperEntered, AdminEntered, or Predefined.
	 */
	protected String valueType;

	public String getValueType() {
		return this.valueType;
	}

	public void setValueType(String valueType) {
		this.valueType = valueType;
	}

	/**
	 * Validation rules of an attribute that determine which values are valid for ShopperEntered and AdminEntered ValueTypes.
	 */
	protected AttributeValidation validation;

	public AttributeValidation getValidation() {
		return this.validation;
	}

	public void setValidation(AttributeValidation validation) {
		this.validation = validation;
	}

}
