package com.academicwebsite.model;

import java.util.Date;

public class PublishedWork {
	private int pubWorkID;
	private String title;
	private String author;
	private String fileLocation;
	private Date dateCreated;
	private Date datePosted;

	public int getPubWorkID() {
		return pubWorkID;
	}

	public void setPubWorkID(int pubWorkID) {
		this.pubWorkID = pubWorkID;
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public String getAuthor() {
		return author;
	}

	public void setAuthor(String author) {
		this.author = author;
	}

	public String getFileLocation() {
		return fileLocation;
	}

	public void setFileLocation(String fileLocation) {
		this.fileLocation = fileLocation;
	}

	public Date getDateCreated() {
		return dateCreated;
	}

	public void setDateCreated(Date dateCreated) {
		this.dateCreated = dateCreated;
	}

	public Date getDatePosted() {
		return datePosted;
	}

	public void setDatePosted(Date datePosted) {
		this.datePosted = datePosted;
	}

	public PublishedWork() {
		pubWorkID = 0;
		title = "";
		author = "";
		fileLocation = "";
		dateCreated = null;
		datePosted = null;
	}

	public PublishedWork(int pubWorkID, String title, String author,
			String fileLocation, Date dateCreated, Date datePosted) {
		this.pubWorkID = pubWorkID;
		this.title = title;
		this.author = author;
		this.fileLocation = fileLocation;
		this.dateCreated = dateCreated;
		this.datePosted = datePosted;
	}
}
