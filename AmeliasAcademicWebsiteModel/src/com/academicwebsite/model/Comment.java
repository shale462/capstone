/**
 * 
 */
package com.academicwebsite.model;

import java.util.Date;

/**
 * @author Liz
 *
 */
public class Comment {

	private Integer commentID;
	private Integer blogID;
	private String email;
	private String title;
	private String comment;
	private Date datePosted;
	private Boolean isApproved;

	/**
	 * @return the commentID
	 */
	public Integer getCommentID() {
		return commentID;
	}

	/**
	 * @param commentID
	 *            the commentID to set
	 */
	public void setCommentID(Integer commentID) {
		this.commentID = commentID;
	}

	/**
	 * @return the blogID
	 */
	public Integer getBlogID() {
		return blogID;
	}

	/**
	 * @param blogID
	 *            the blogID to set
	 */
	public void setBlogID(Integer blogID) {
		this.blogID = blogID;
	}

	/**
	 * @return the email
	 */
	public String getEmail() {
		return email;
	}

	/**
	 * @param email
	 *            the email to set
	 */
	public void setEmail(String email) {
		this.email = email;
	}

	/**
	 * @return the title
	 */
	public String getTitle() {
		return title;
	}

	/**
	 * @param title
	 *            the title to set
	 */
	public void setTitle(String title) {
		this.title = title;
	}

	/**
	 * @return the comment
	 */
	public String getComment() {
		return comment;
	}

	/**
	 * @param comment
	 *            the comment to set
	 */
	public void setComment(String comment) {
		this.comment = comment;
	}

	/**
	 * @return the datePosted
	 */
	public Date getDatePosted() {
		return datePosted;
	}

	/**
	 * @param datePosted
	 *            the datePosted to set
	 */
	public void setDatePosted(Date datePosted) {
		this.datePosted = datePosted;
	}

	/**
	 * @return the isApproved
	 */
	public Boolean getIsApproved() {
		return isApproved;
	}

	/**
	 * @param isApproved
	 *            the isApproved to set
	 */
	public void setIsApproved(Boolean isApproved) {
		this.isApproved = isApproved;
	}

	public Comment() {
		commentID = 0;
		blogID = 0;
		email = "";
		// title = "";
		comment = "";
		datePosted = null;
		// isApproved = null;

	}

	public Comment(Integer commentID, Integer blogID, String email,
			String comment, Date datePosted) {
		this.commentID = commentID;
		this.blogID = blogID;
		this.email = email;
		// this.title = title;
		this.comment = comment;
		this.datePosted = datePosted;
		// this.isApproved = isApproved;

	}

}
