/**
 *     This code was auto-generated by a Codezu.     
 *
 *     Changes to this file may cause incorrect behavior and will be lost if
 *     the code is regenerated.
 */
package com.mozu.api.contracts.shippingruntime;

import java.util.List;
import java.io.Serializable;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import org.joda.time.DateTime;
import com.mozu.api.contracts.shippingruntime.CustomAttribute;
import com.mozu.api.contracts.shippingruntime.ShippingRate;

/**
 *	Arrayed list of calculated shipping rates for the specified carrier.
 */
@JsonIgnoreProperties(ignoreUnknown = true)
public class CarrierRatesResponse implements Serializable
{
	// Default Serial Version UID
	private static final long serialVersionUID = 1L;

	/**
	 * Unique identifier of the shipping carrier.
	 */
	protected String carrierId;

	public String getCarrierId() {
		return this.carrierId;
	}

	public void setCarrierId(String carrierId) {
		this.carrierId = carrierId;
	}

	/**
	 * Collection of carrier-specific key-value attribute pairs required to retrieve a shipping rate request.
	 */
	protected List<CustomAttribute> customAttributes;
	public List<CustomAttribute> getCustomAttributes() {
		return this.customAttributes;
	}
	public void setCustomAttributes(List<CustomAttribute> customAttributes) {
		this.customAttributes = customAttributes;
	}

	/**
	 * Array list of calculated shipping rates for the specified carrier.
	 */
	protected List<ShippingRate> shippingRates;
	public List<ShippingRate> getShippingRates() {
		return this.shippingRates;
	}
	public void setShippingRates(List<ShippingRate> shippingRates) {
		this.shippingRates = shippingRates;
	}

}
