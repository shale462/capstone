/**
 * 
 */
package com.academicwebsite.model;

import java.util.ArrayList;
import java.util.Date;

/**
 * @author Liz
 *
 */
public class Blog {

	private Integer blogID;
	private String title;
	private String description;
	private String blog;
	private Date datePosted;
	private ArrayList<Comment> comments;

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
	 * @return the description
	 */
	public String getDescription() {
		return description;
	}

	/**
	 * @param description
	 *            the description to set
	 */
	public void setDescription(String description) {
		this.description = description;
	}

	/**
	 * @return the blog
	 */
	public String getBlog() {
		return blog;
	}

	/**
	 * @param blog
	 *            the blog to set
	 */
	public void setBlog(String blog) {
		this.blog = blog;
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
	 * @return the comments
	 */
	public ArrayList<Comment> getComments() {
		return comments;
	}

	/**
	 * @param comments
	 *            the comments to set
	 */
	public void setComments(ArrayList<Comment> comments) {
		this.comments = comments;
	}

	public Blog() {
		blogID = 0;
		// title = "";
		// description = "";
		blog = "";
		datePosted = null;
		// comments = null;

	}

	public Blog(Integer blogID, String blog, Date datePosted) {
		this.blogID = blogID;
		// this.title = title;
		// this.description = description;
		this.blog = blog;
		this.datePosted = datePosted;
		// comments = null;

	}

}
