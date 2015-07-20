package com.academicwebsite.model;

import java.util.Date;

public class Answer {
	private Integer answerID;
	private Integer questionID;
	private Integer surveyID;
	private String email;
	private String answer;
	private Date dateTime;

	public Integer getAnswerID() {
		return answerID;
	}

	public void setAnswerID(Integer answerID) {
		this.answerID = answerID;
	}

	public Integer getQuestionID() {
		return questionID;
	}

	public void setQuestionID(Integer questionID) {
		this.questionID = questionID;
	}

	public Integer getSurveyID() {
		return surveyID;
	}

	public void setSurveyID(Integer surveyID) {
		this.surveyID = surveyID;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getAnswer() {
		return answer;
	}

	public void setAnswer(String answer) {
		this.answer = answer;
	}

	public Date getDateTime() {
		return dateTime;
	}

	public void setDateTime(Date dateTime) {
		this.dateTime = dateTime;
	}

	public Answer() {
		answerID = 0;
		questionID = 0;
		surveyID = 0;
	}

	public Answer(Integer answerID, Integer questionID, Integer surveyID) {
		this.answerID = answerID;
		this.questionID = questionID;
		this.surveyID = surveyID;
	}
}
