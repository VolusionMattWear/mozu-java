/**
 *     This code was auto-generated by a Codezu.     
 *
 *     Changes to this file may cause incorrect behavior and will be lost if
 *     the code is regenerated.
 */
package com.mozu.api.contracts.productadmin;

import java.io.Serializable;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import org.joda.time.DateTime;
import com.mozu.api.contracts.productadmin.ProductCost;

@JsonIgnoreProperties(ignoreUnknown = true)
public class ProductSupplierInfo implements Serializable
{
	// Default Serial Version UID
	private static final long serialVersionUID = 1L;

	protected String distPartNumber;

	public String getDistPartNumber() {
		return this.distPartNumber;
	}

	public void setDistPartNumber(String distPartNumber) {
		this.distPartNumber = distPartNumber;
	}

	protected String mfgPartNumber;

	public String getMfgPartNumber() {
		return this.mfgPartNumber;
	}

	public void setMfgPartNumber(String mfgPartNumber) {
		this.mfgPartNumber = mfgPartNumber;
	}

	protected ProductCost cost;

	public ProductCost getCost() {
		return this.cost;
	}

	public void setCost(ProductCost cost) {
		this.cost = cost;
	}

}
