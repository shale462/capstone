/**
 * 
 */
package com.academicwebsite.test;

import static org.junit.Assert.*;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import org.junit.Before;
import org.junit.Test;

import com.academicwebsite.model.Question;
import com.academicwebsite.model.Survey;

/**
 * @author Sarah
 *
 */
public class SurveyTests {

	private Survey survey;
	private Question question;
	private List<Question> questions;
	private Integer surveyID;
	private String title;
	private String description;

	/**
	 * @throws java.lang.Exception
	 */
	@Before
	public void setUp() throws Exception {
		surveyID = 1;
		survey = new Survey(surveyID);
		questions = new ArrayList<Question>();
	}

	/**
	 * Test method for {@link com.academicwebsite.model.Survey#getSurveyID()}.
	 */
	@Test
	public void testGetSurveyID() {
		assertEquals(surveyID, survey.getSurveyID());
	}

	/**
	 * Test method for
	 * {@link com.academicwebsite.model.Survey#setSurveyID(java.lang.Integer)}.
	 */
	@Test
	public void testSetSurveyID() {
		Integer newID = 2;
		survey.setSurveyID(newID);
		assertEquals(newID, survey.getSurveyID());
	}

	/**
	 * Test method for {@link com.academicwebsite.model.Survey#getTitle()}.
	 */
	@Test
	public void testGetTitle() {
		assertNull(survey.getTitle());
	}

	/**
	 * Test method for
	 * {@link com.academicwebsite.model.Survey#setTitle(java.lang.String)}.
	 */
	@Test
	public void testSetTitle() {
		String surveyTitle = "Title";
		survey.setTitle(surveyTitle);
		assertEquals(surveyTitle, survey.getTitle());
	}

	/**
	 * Test method for {@link com.academicwebsite.model.Survey#getDescription()}
	 * .
	 */
	@Test
	public void testGetDescription() {
		assertNull(survey.getDescription());
	}

	/**
	 * Test method for
	 * {@link com.academicwebsite.model.Survey#setDescription(java.lang.String)}
	 * .
	 */
	@Test
	public void testSetDescription() {
		String description = "Description";
		survey.setDescription(description);
		assertEquals(description, survey.getDescription());
	}

	/**
	 * Test method for {@link com.academicwebsite.model.Survey#getDateCreated()}
	 * .
	 */
	@Test
	public void testGetDateCreated() {
		assertNull(survey.getDateCreated());
	}

	/**
	 * Test method for
	 * {@link com.academicwebsite.model.Survey#setDateCreated(java.util.Date)}.
	 */
	@Test
	public void testSetDateCreated() {
		Date dateCreated = new Date();
		survey.setDateCreated(dateCreated);
		assertEquals(dateCreated, survey.getDateCreated());
	}

	/**
	 * Test method for {@link com.academicwebsite.model.Survey#getIsActive()}.
	 */
	@Test
	public void testGetIsActive() {
		assertNull(survey.getIsActive());
	}

	/**
	 * Test method for
	 * {@link com.academicwebsite.model.Survey#setIsActive(java.lang.Boolean)}.
	 */
	@Test
	public void testSetIsActive() {
		Boolean isActive = true;
		survey.setIsActive(isActive);
		assertEquals(isActive, survey.getIsActive());
	}

	/**
	 * Test method for {@link com.academicwebsite.model.Survey#getIsPublic()}.
	 */
	@Test
	public void testGetIsHistoricalInterview() {
		assertNull(survey.getIsHistoricalInterview());
	}

	/**
	 * Test method for
	 * {@link com.academicwebsite.model.Survey#setIsPublic(java.lang.Boolean)}.
	 */
	@Test
	public void testSetIsHistoricalInterview() {
		Boolean isHistoricalInterview = false;
		survey.setIsHistoricalInterview(isHistoricalInterview);
		assertEquals(isHistoricalInterview, survey.getIsHistoricalInterview());
	}

	/**
	 * Test method for {@link com.academicwebsite.model.Survey#getQuestions()}.
	 */
	@Test
	public void testGetQuestions() {
		assertNull(survey.getQuestions());
	}

	/**
	 * Test method for
	 * {@link com.academicwebsite.model.Survey#setQuestions(java.util.List)}.
	 */
	@Test
	public void testSetQuestions() {
		Question question = new Question(1, surveyID, 1);
		questions.add(question);
		survey.setQuestions(questions);
		assertEquals(questions, survey.getQuestions());
	}

	/**
	 * Test method for {@link com.academicwebsite.model.Survey#Survey()}.
	 */
	@Test
	public void testSurvey() {
		Survey survey1 = new Survey();
		assertNotNull(survey1);
	}

	/**
	 * Test method for {@link com.academicwebsite.model.Survey#Survey(int)}.
	 * Tests survey constructor with parameters
	 */
	@Test
	public void testSurveyInt() {
		Survey survey1 = new Survey(surveyID);
		assertNotNull(survey1);
	}

}
