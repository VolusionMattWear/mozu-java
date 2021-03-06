/**
 *     This code was auto-generated by a Codezu.     
 *
 *     Changes to this file may cause incorrect behavior and will be lost if
 *     the code is regenerated.
 */
package com.mozu.api.contracts.productadmin;

import java.util.List;
import java.io.Serializable;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import org.joda.time.DateTime;
import com.mozu.api.contracts.productadmin.ProductVariationDeltaPrice;
import com.mozu.api.contracts.productadmin.ProductVariationOption;
import com.mozu.api.contracts.productadmin.ProductSupplierInfo;

/**
 *	Properties of a specific product variation.
 */
@JsonIgnoreProperties(ignoreUnknown = true)
public class ProductVariation implements Serializable
{
	// Default Serial Version UID
	private static final long serialVersionUID = 1L;

	/**
	 * The difference between the base weight for a product and this variation of the product, which can be a positive or negative decimal value.
	 */
	protected Double deltaWeight;

	public Double getDeltaWeight() {
		return this.deltaWeight;
	}

	public void setDeltaWeight(Double deltaWeight) {
		this.deltaWeight = deltaWeight;
	}

	protected List<String> fulfillmentTypesSupported;
	public List<String> getFulfillmentTypesSupported() {
		return this.fulfillmentTypesSupported;
	}
	public void setFulfillmentTypesSupported(List<String> fulfillmentTypesSupported) {
		this.fulfillmentTypesSupported = fulfillmentTypesSupported;
	}

	/**
	 * If true, this variation of this product is marked available for sale.
	 */
	protected Boolean isActive;

	public Boolean getIsActive() {
		return this.isActive;
	}

	public void setIsActive(Boolean isActive) {
		this.isActive = isActive;
	}

	/**
	 * If true, the production variation is no longer available for sale. For example, if a merchant stops selling all "small" shirts, all product variations with the "small" option are set to IsOrphan. System-supplied and read-only.
	 */
	protected Boolean isOrphan;

	public Boolean getIsOrphan() {
		return this.isOrphan;
	}

	public void setIsOrphan(Boolean isOrphan) {
		this.isOrphan = isOrphan;
	}

	protected String upc;

	public String getUpc() {
		return this.upc;
	}

	public void setUpc(String upc) {
		this.upc = upc;
	}

	/**
	 * If true, one or more product variations are configured for the specified product code.
	 */
	protected Boolean variationExists;

	public Boolean getVariationExists() {
		return this.variationExists;
	}

	public void setVariationExists(Boolean variationExists) {
		this.variationExists = variationExists;
	}

	/**
	 * System-generated key that represents the attribute values that uniquely identify a specific product variation.
	 */
	protected String variationkey;

	public String getVariationkey() {
		return this.variationkey;
	}

	public void setVariationkey(String variationkey) {
		this.variationkey = variationkey;
	}

	/**
	 * Merchant-created code associated with a specific product variation. Variation product codes maintain an association with the base product code.
	 */
	protected String variationProductCode;

	public String getVariationProductCode() {
		return this.variationProductCode;
	}

	public void setVariationProductCode(String variationProductCode) {
		this.variationProductCode = variationProductCode;
	}

	/**
	 * The difference between the base price for the product and this variation of the product, which can be a positive or negative decimal value. For example, if the base price for a t-shirt product is $10, but the XL variation should cost $12, the DeltaPrice value should be "2". However, if the XS variation should only cost $8, the DeltaPrice value should be "-2".
	 */
	protected ProductVariationDeltaPrice deltaPrice;

	public ProductVariationDeltaPrice getDeltaPrice() {
		return this.deltaPrice;
	}

	public void setDeltaPrice(ProductVariationDeltaPrice deltaPrice) {
		this.deltaPrice = deltaPrice;
	}

	/**
	 * Wrapper for the list of option attributes configured for the product variation.
	 */
	protected List<ProductVariationOption> options;
	public List<ProductVariationOption> getOptions() {
		return this.options;
	}
	public void setOptions(List<ProductVariationOption> options) {
		this.options = options;
	}

	protected ProductSupplierInfo supplierInfo;

	public ProductSupplierInfo getSupplierInfo() {
		return this.supplierInfo;
	}

	public void setSupplierInfo(ProductSupplierInfo supplierInfo) {
		this.supplierInfo = supplierInfo;
	}

}
