/**
 *     This code was auto-generated by a Codezu.     
 *
 *     Changes to this file may cause incorrect behavior and will be lost if
 *     the code is regenerated.
 */
package com.mozu.api.contracts.content;

import java.io.Serializable;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import org.joda.time.DateTime;

/**
 *	A high level description of the document draft.
 */
@JsonIgnoreProperties(ignoreUnknown = true)
public class DocumentDraftSummary implements Serializable
{
	// Default Serial Version UID
	private static final long serialVersionUID = 1L;

	protected DateTime activeUpdateDate;

	public DateTime getActiveUpdateDate() {
		return this.activeUpdateDate;
	}

	public void setActiveUpdateDate(DateTime activeUpdateDate) {
		this.activeUpdateDate = activeUpdateDate;
	}

	/**
	 * Name of the document list associated with the draft.
	 */
	protected String documentListName;

	public String getDocumentListName() {
		return this.documentListName;
	}

	public void setDocumentListName(String documentListName) {
		this.documentListName = documentListName;
	}

	protected DateTime draftUpdateDate;

	public DateTime getDraftUpdateDate() {
		return this.draftUpdateDate;
	}

	public void setDraftUpdateDate(DateTime draftUpdateDate) {
		this.draftUpdateDate = draftUpdateDate;
	}

	/**
	 * Identifier of document draft.
	 */
	protected String id;

	public String getId() {
		return this.id;
	}

	public void setId(String id) {
		this.id = id;
	}

	/**
	 * Name of the document draft.
	 */
	protected String name;

	public String getName() {
		return this.name;
	}

	public void setName(String name) {
		this.name = name;
	}

	/**
	 * Whether the draft has been published.
	 */
	protected String publishType;

	public String getPublishType() {
		return this.publishType;
	}

	public void setPublishType(String publishType) {
		this.publishType = publishType;
	}

	/**
	 * Unique identifier of the user who last modified the item. This value is system-supplied and read-only.
	 */
	protected String updatedBy;

	public String getUpdatedBy() {
		return this.updatedBy;
	}

	public void setUpdatedBy(String updatedBy) {
		this.updatedBy = updatedBy;
	}

}
