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

@JsonIgnoreProperties(ignoreUnknown = true)
public class ProductPricingBehaviorInfo implements Serializable
{
	// Default Serial Version UID
	private static final long serialVersionUID = 1L;

	protected Boolean discountsRestricted;

	public Boolean getDiscountsRestricted() {
		return this.discountsRestricted;
	}

	public void setDiscountsRestricted(Boolean discountsRestricted) {
		this.discountsRestricted = discountsRestricted;
	}

	protected DateTime discountsRestrictedEndDate;

	public DateTime getDiscountsRestrictedEndDate() {
		return this.discountsRestrictedEndDate;
	}

	public void setDiscountsRestrictedEndDate(DateTime discountsRestrictedEndDate) {
		this.discountsRestrictedEndDate = discountsRestrictedEndDate;
	}

	protected DateTime discountsRestrictedStartDate;

	public DateTime getDiscountsRestrictedStartDate() {
		return this.discountsRestrictedStartDate;
	}

	public void setDiscountsRestrictedStartDate(DateTime discountsRestrictedStartDate) {
		this.discountsRestrictedStartDate = discountsRestrictedStartDate;
	}

}
