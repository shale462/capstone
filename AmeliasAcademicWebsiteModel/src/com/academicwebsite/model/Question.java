package com.academicwebsite.model;

import java.util.List;

public class Question {
	private Integer questionID;
	private Integer surveyID;
	private String question;
	private Integer type;
	private List<Answer> answers;

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

	public String getQuestion() {
		return question;
	}

	public void setQuestion(String question) {
		this.question = question;
	}

	public Integer getType() {
		return type;
	}

	public void setType(Integer type) {
		this.type = type;
	}

	public List<Answer> getAnswers() {
		return answers;
	}

	public void setAnswers(List<Answer> answers) {
		this.answers = answers;
	}

	public Question() {
		questionID = 0;
		surveyID = 0;
		type = 0;
	}

	public Question(Integer questionID, Integer surveyID, Integer type) {
		this.questionID = questionID;
		this.surveyID = surveyID;
		this.type = type;
	}
}
