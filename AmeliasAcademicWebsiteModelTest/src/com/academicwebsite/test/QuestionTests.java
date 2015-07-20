/**
 * 
 */
package com.academicwebsite.test;

import static org.junit.Assert.*;

import java.util.ArrayList;
import java.util.List;

import org.junit.AfterClass;
import org.junit.Before;
import org.junit.Test;

import com.academicwebsite.model.Answer;
import com.academicwebsite.model.Question;

/**
 * @author Sarah
 *
 */
public class QuestionTests {

	private Question question;
	private Answer answer;
	private Integer questionID;
	private Integer surveyID;
	private Integer type;
	private List<Answer> answers;
	private String questionString;

	/**
	 * @throws java.lang.Exception
	 */
	@Before
	public void setUp() throws Exception {
		answers = new ArrayList<Answer>();
		Answer answer = new Answer();
		answer.setAnswer("answer1");
		answers.add(answer);
		questionID = 1;
		surveyID = 1;
		type = 1;
		questionString = "Sample Question";
		question = new Question(questionID, surveyID, type);
		question.setQuestion(questionString);
		question.setAnswers(answers);
	}

	/**
	 * Test method for
	 * {@link com.academicwebsite.model.Question#getQuestionID()}.
	 */
	@Test
	public void testGetQuestionID() {
		assertEquals(questionID, question.getQuestionID());
	}

	/**
	 * Test method for
	 * {@link com.academicwebsite.model.Question#setQuestionID(java.lang.Integer)}
	 * .
	 */
	@Test
	public void testSetQuestionID() {
		Integer newID = 2;
		question.setQuestionID(newID);
		assertEquals(newID, question.getQuestionID());
	}

	/**
	 * Test method for {@link com.academicwebsite.model.Question#getSurveyID()}.
	 */
	@Test
	public void testGetSurveyID() {
		assertEquals(surveyID, question.getSurveyID());
	}

	/**
	 * Test method for
	 * {@link com.academicwebsite.model.Question#setSurveyID(java.lang.Integer)}
	 * .
	 */
	@Test
	public void testSetSurveyID() {
		Integer newID = 2;
		question.setSurveyID(newID);
		assertEquals(newID, question.getSurveyID());
	}

	/**
	 * Test method for {@link com.academicwebsite.model.Question#getQuestion()}.
	 */
	@Test
	public void testGetQuestion() {
		assertEquals(questionString, question.getQuestion());
	}

	/**
	 * Test method for
	 * {@link com.academicwebsite.model.Question#setQuestion(java.lang.String)}.
	 */
	@Test
	public void testSetQuestion() {
		String newQuestion = "New";
		question.setQuestion(newQuestion);
		assertEquals(newQuestion, question.getQuestion());
	}

	/**
	 * Test method for {@link com.academicwebsite.model.Question#getType()}.
	 */
	@Test
	public void testGetType() {
		assertEquals(type, question.getType());
	}

	/**
	 * Test method for
	 * {@link com.academicwebsite.model.Question#setType(java.lang.Integer)}.
	 */
	@Test
	public void testSetType() {
		Integer newType = 2;
		question.setType(newType);
		assertEquals(newType, question.getType());
	}

	/**
	 * Test method for {@link com.academicwebsite.model.Question#getAnswers()}.
	 */
	@Test
	public void testGetAnswers() {
		assertEquals(answers, question.getAnswers());
	}

	/**
	 * Test method for
	 * {@link com.academicwebsite.model.Question#setAnswers(java.util.List)}.
	 */
	@Test
	public void testSetAnswers() {
		ArrayList<Answer> newAnswers = new ArrayList<Answer>();
		Answer newAnswer = new Answer(2, 2, 2);
		newAnswers.add(newAnswer);
		question.setAnswers(newAnswers);
		assertEquals(newAnswers, question.getAnswers());
	}

	/**
	 * Test method for {@link com.academicwebsite.model.Question#Question()}.
	 */
	@Test
	public void testQuestion() {
		Question question2 = new Question();
		assertNotNull(question2);
	}

	/**
	 * Test method for
	 * {@link com.academicwebsite.model.Question#Question(java.lang.Integer, java.lang.Integer, java.lang.Integer)}
	 * .
	 */
	@Test
	public void testQuestionIntegerIntegerInteger() {
		Question question2 = new Question(questionID, surveyID, type);
		assertNotNull(question2);
	}

}
