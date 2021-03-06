/**
 *     This code was auto-generated by a Codezu.     
 *
 *     Changes to this file may cause incorrect behavior and will be lost if
 *     the code is regenerated.
 */
package com.mozu.api.contracts.customer;

import java.util.List;
import java.io.Serializable;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import org.joda.time.DateTime;
import com.mozu.api.contracts.core.AuditInfo;

/**
 *	Properties of an attribute associated with a customer account.
 */
@JsonIgnoreProperties(ignoreUnknown = true)
public class CustomerAttribute implements Serializable
{
	// Default Serial Version UID
	private static final long serialVersionUID = 1L;

	/**
	 * Unique identifier of the attribute definition.
	 */
	protected Integer attributeDefinitionId;

	public Integer getAttributeDefinitionId() {
		return this.attributeDefinitionId;
	}

	public void setAttributeDefinitionId(Integer attributeDefinitionId) {
		this.attributeDefinitionId = attributeDefinitionId;
	}

	/**
	 * The fully qualified name of the attribute, which is a user defined attribute identifier.
	 */
	protected String fullyQualifiedName;

	public String getFullyQualifiedName() {
		return this.fullyQualifiedName;
	}

	public void setFullyQualifiedName(String fullyQualifiedName) {
		this.fullyQualifiedName = fullyQualifiedName;
	}

	/**
	 * List of values for the attribute.
	 */
	protected List<Object> values;
	public List<Object> getValues() {
		return this.values;
	}
	public void setValues(List<Object> values) {
		this.values = values;
	}

	/**
	 * Identifier and datetime stamp information recorded when a user or application creates, updates, or deletes a resource entity. This value is system-supplied and read-only.
	 */
	protected AuditInfo auditInfo;

	public AuditInfo getAuditInfo() {
		return this.auditInfo;
	}

	public void setAuditInfo(AuditInfo auditInfo) {
		this.auditInfo = auditInfo;
	}

}
