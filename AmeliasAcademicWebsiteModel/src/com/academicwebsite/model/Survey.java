package com.academicwebsite.model;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class Survey {

	private Integer surveyID;
	private String title;
	private String description;
	private Date dateCreated;
	private Boolean isActive;
	private List<Question> questions;

	public Integer getSurveyID() {
		return surveyID;
	}

	public void setSurveyID(Integer surveyID) {
		this.surveyID = surveyID;
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public Date getDateCreated() {
		return dateCreated;
	}

	public void setDateCreated(Date dateCreated) {
		this.dateCreated = dateCreated;
	}

	public Boolean getIsActive() {
		return isActive;
	}

	public void setIsActive(Boolean isActive) {
		this.isActive = isActive;
	}

	public List<Question> getQuestions() {
		return questions;
	}

	public void setQuestions(List<Question> questions) {
		this.questions = questions;
	}

	public Survey() {
		surveyID = 0;
		title = "";
		description = "";
		questions = new ArrayList<Question>();
	}

	public Survey(int surveyID, String title, String description,
			List<Question> questions) {
		this.surveyID = surveyID;
		this.title = title;
		this.description = description;
		this.questions = questions;
	}
}
