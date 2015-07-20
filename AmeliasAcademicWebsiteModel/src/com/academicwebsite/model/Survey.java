package com.academicwebsite.model;

import java.util.Date;
import java.util.List;

public class Survey {

	private Integer surveyID;
	private String title;
	private String description;
	private Date dateCreated;
	private Boolean isActive;
	private Boolean isHistoricalInterview;
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

	public Boolean getIsHistoricalInterview() {
		return isHistoricalInterview;
	}

	public void setIsHistoricalInterview(Boolean isHistoricalInterview) {
		this.isHistoricalInterview = isHistoricalInterview;
	}

	public List<Question> getQuestions() {
		return questions;
	}

	public void setQuestions(List<Question> questions) {
		this.questions = questions;
	}

	public Survey() {
		surveyID = 0;
	}

	public Survey(int surveyID) {
		this.surveyID = surveyID;
	}
}
