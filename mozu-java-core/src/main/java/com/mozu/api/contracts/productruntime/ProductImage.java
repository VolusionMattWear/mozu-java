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

/**
 *	Properties of an image defined for a product.
 */
@JsonIgnoreProperties(ignoreUnknown = true)
public class ProductImage implements Serializable
{
	// Default Serial Version UID
	private static final long serialVersionUID = 1L;

	/**
	 * Descriptive text associated with the image or video that appears on the storefront.
	 */
	protected String altText;

	public String getAltText() {
		return this.altText;
	}

	public void setAltText(String altText) {
		this.altText = altText;
	}

	protected String cmsId;

	public String getCmsId() {
		return this.cmsId;
	}

	public void setCmsId(String cmsId) {
		this.cmsId = cmsId;
	}

	/**
	 * Image title that appears on the storefront.
	 */
	protected String imageLabel;

	public String getImageLabel() {
		return this.imageLabel;
	}

	public void setImageLabel(String imageLabel) {
		this.imageLabel = imageLabel;
	}

	/**
	 * URL of the product image.
	 */
	protected String imageUrl;

	public String getImageUrl() {
		return this.imageUrl;
	}

	public void setImageUrl(String imageUrl) {
		this.imageUrl = imageUrl;
	}

	/**
	 * Type of media specification required to successfully render the product image, video, or other content.
	 */
	protected String mediaType;

	public String getMediaType() {
		return this.mediaType;
	}

	public void setMediaType(String mediaType) {
		this.mediaType = mediaType;
	}

	/**
	 * The numeric value that denotes the place this entity occupies in the order of the entity list.
	 */
	protected Integer sequence;

	public Integer getSequence() {
		return this.sequence;
	}

	public void setSequence(Integer sequence) {
		this.sequence = sequence;
	}

	/**
	 * The file link or URL of the product video.
	 */
	protected String videoUrl;

	public String getVideoUrl() {
		return this.videoUrl;
	}

	public void setVideoUrl(String videoUrl) {
		this.videoUrl = videoUrl;
	}

}
