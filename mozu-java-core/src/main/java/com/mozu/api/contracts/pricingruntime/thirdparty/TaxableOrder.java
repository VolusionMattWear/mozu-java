/**
 *     This code was auto-generated by a Codezu.     
 *
 *     Changes to this file may cause incorrect behavior and will be lost if
 *     the code is regenerated.
 */
package com.mozu.api.contracts.pricingruntime.thirdparty;

import java.util.List;
import java.io.Serializable;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import org.joda.time.DateTime;
import com.mozu.api.contracts.pricingruntime.TaxableLineItem;
import com.mozu.api.contracts.pricingruntime.thirdparty.TaxContext;

@JsonIgnoreProperties(ignoreUnknown = true)
public class TaxableOrder implements Serializable
{
	// Default Serial Version UID
	private static final long serialVersionUID = 1L;

	protected String currencyCode;

	public String getCurrencyCode() {
		return this.currencyCode;
	}

	public void setCurrencyCode(String currencyCode) {
		this.currencyCode = currencyCode;
	}

	protected Double handlingFee;

	public Double getHandlingFee() {
		return this.handlingFee;
	}

	public void setHandlingFee(Double handlingFee) {
		this.handlingFee = handlingFee;
	}

	protected DateTime orderDate;

	public DateTime getOrderDate() {
		return this.orderDate;
	}

	public void setOrderDate(DateTime orderDate) {
		this.orderDate = orderDate;
	}

	protected String originalDocumentCode;

	public String getOriginalDocumentCode() {
		return this.originalDocumentCode;
	}

	public void setOriginalDocumentCode(String originalDocumentCode) {
		this.originalDocumentCode = originalDocumentCode;
	}

	protected DateTime originalOrderDate;

	public DateTime getOriginalOrderDate() {
		return this.originalOrderDate;
	}

	public void setOriginalOrderDate(DateTime originalOrderDate) {
		this.originalOrderDate = originalOrderDate;
	}

	protected Double shippingAmount;

	public Double getShippingAmount() {
		return this.shippingAmount;
	}

	public void setShippingAmount(Double shippingAmount) {
		this.shippingAmount = shippingAmount;
	}

	protected String taxRequestType;

	public String getTaxRequestType() {
		return this.taxRequestType;
	}

	public void setTaxRequestType(String taxRequestType) {
		this.taxRequestType = taxRequestType;
	}

	protected List<TaxableLineItem> lineItems;
	public List<TaxableLineItem> getLineItems() {
		return this.lineItems;
	}
	public void setLineItems(List<TaxableLineItem> lineItems) {
		this.lineItems = lineItems;
	}

	protected TaxContext taxContext;

	public TaxContext getTaxContext() {
		return this.taxContext;
	}

	public void setTaxContext(TaxContext taxContext) {
		this.taxContext = taxContext;
	}

}
