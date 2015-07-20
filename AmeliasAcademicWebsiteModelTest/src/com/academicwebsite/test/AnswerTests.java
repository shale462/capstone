package com.academicwebsite.test;

import static org.junit.Assert.*;

import java.util.Date;

import org.junit.AfterClass;
import org.junit.Before;
import org.junit.Test;

import com.academicwebsite.model.Answer;

public class AnswerTests {

	private Answer answer;
	private Integer answerID;
	private Integer questionID;
	private Integer surveyID;
	private String email;
	private String answerString;
	private Date dateTime;

	@AfterClass
	public static void tearDownAfterClass() throws Exception {
	}

	@Before
	public void setUp() throws Exception {
		answerID = questionID = surveyID = 1;
		answer = new Answer();
	}

	@Test
	public void testGetAnswerID() {
		assertSame(0, answer.getAnswerID());
	}

	@Test
	public void testSetAnswerID() {
		answer.setAnswerID(answerID);
		assertEquals(answerID, answer.getAnswerID());
	}

	@Test
	public void testGetQuestionID() {
		assertSame(0, answer.getQuestionID());
	}

	@Test
	public void testSetQuestionID() {
		answer.setQuestionID(questionID);
		assertEquals(questionID, answer.getQuestionID());
	}

	@Test
	public void testGetSurveyID() {
		assertSame(0, answer.getSurveyID());
	}

	@Test
	public void testSetSurveyID() {
		answer.setSurveyID(surveyID);
		assertEquals(surveyID, answer.getSurveyID());
	}

	@Test
	public void testGetEmail() {
		assertNull(answer.getEmail());
	}

	@Test
	public void testSetEmail() {
		email = "sample@email.com";
		answer.setEmail(email);
		assertEquals(email, answer.getEmail());
	}

	@Test
	public void testGetAnswer() {
		assertNull(answer.getAnswer());
	}

	@Test
	public void testSetAnswer() {
		answerString = "Sample answer";
		answer.setAnswer(answerString);
		assertEquals(answerString, answer.getAnswer());
	}

	@Test
	public void testGetDateTime() {
		assertNull(answer.getDateTime());
	}

	@Test
	public void testSetDateTime() {
		dateTime = new Date();
		answer.setDateTime(dateTime);
		assertEquals(dateTime, answer.getDateTime());
	}

	@Test
	public void testAnswer() {
		assertNotNull(answer);
	}

	@Test
	public void testAnswerIntegerIntegerInteger() {
		answer = new Answer(answerID, questionID, surveyID);
		assertNotNull(answer);
	}

}
