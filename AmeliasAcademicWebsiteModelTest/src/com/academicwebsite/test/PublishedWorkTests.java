package com.academicwebsite.test;

import static org.junit.Assert.*;

import java.util.Date;

import org.junit.Before;
import org.junit.Test;

import com.academicwebsite.model.PublishedWork;

public class PublishedWorkTests {
	PublishedWork publishedWork;
	String fileLocation;
	Integer pubWorkID;

	@Before
	public void setUp() throws Exception {
		publishedWork = new PublishedWork();
	}

	@Test
	public void testGetPubWorkID() {
		assertSame(0, publishedWork.getPubWorkID());
	}

	@Test
	public void testSetPubWorkID() {
		pubWorkID = 1;
		publishedWork.setPubWorkID(pubWorkID);
		assertEquals(pubWorkID, publishedWork.getPubWorkID());
	}

	@Test
	public void testGetTitle() {
		assertNull(publishedWork.getTitle());
	}

	@Test
	public void testSetTitle() {
		String title = "Published Work Title";
		publishedWork.setTitle(title);
		assertEquals(title, publishedWork.getTitle());
	}

	@Test
	public void testGetAuthor() {
		assertNull(publishedWork.getAuthor());
	}

	@Test
	public void testSetAuthor() {
		String author = "author";
		publishedWork.setAuthor(author);
		assertEquals(author, publishedWork.getAuthor());
	}

	@Test
	public void testGetFileLocation() {
		assertSame("", publishedWork.getFileLocation());
	}

	@Test
	public void testSetFileLocation() {
		fileLocation = "C:\\user\\documents";
		publishedWork.setFileLocation(fileLocation);
		assertEquals(fileLocation, publishedWork.getFileLocation());
	}

	@Test
	public void testGetDateCreated() {
		assertNull(publishedWork.getDateCreated());
	}

	@Test
	public void testSetDateCreated() {
		Date dateCreated = new Date();
		publishedWork.setDateCreated(dateCreated);
		assertEquals(dateCreated, publishedWork.getDateCreated());
	}

	@Test
	public void testGetDatePosted() {
		assertNull(publishedWork.getDatePosted());
	}

	@Test
	public void testSetDatePosted() {
		Date datePosted = new Date();
		publishedWork.setDatePosted(datePosted);
		assertEquals(datePosted, publishedWork.getDatePosted());
	}

	@Test
	public void testPublishedWork() {
		PublishedWork pubWork = new PublishedWork();
		assertNotNull(pubWork);
	}

	@Test
	public void testPublishedWorkIntegerString() {
		PublishedWork pubWork = new PublishedWork(pubWorkID, fileLocation);
		assertNotNull(pubWork);
	}

}
