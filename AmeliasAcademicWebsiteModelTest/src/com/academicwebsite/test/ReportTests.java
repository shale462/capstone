package com.academicwebsite.test;

import static org.junit.Assert.*;

import java.util.Date;

import org.junit.Before;
import org.junit.Test;

import com.academicwebsite.model.Report;

public class ReportTests {
	Report report;

	@Before
	public void setUp() throws Exception {
		report = new Report();
	}

	@Test
	public void testGetReportID() {
		assertSame(0, report.getReportID());
	}

	@Test
	public void testSetReportID() {
		Integer newID = 2;
		report.setReportID(newID);
		assertEquals(newID, report.getReportID());
	}

	@Test
	public void testGetReportName() {
		assertNull(report.getReportName());
	}

	@Test
	public void testSetReportName() {
		String reportName = "Report Name";
		report.setReportName(reportName);
		assertEquals(reportName, report.getReportName());
	}

	@Test
	public void testGetDescription() {
		assertNull(report.getDescription());
	}

	@Test
	public void testSetDescription() {
		String description = "report description";
		report.setDescription(description);
		assertEquals(description, report.getDescription());
	}

	@Test
	public void testGetReportDate() {
		assertNull(report.getReportDate());
	}

	@Test
	public void testSetReportDate() {
		Date reportDate = new Date();
		report.setReportDate(reportDate);
		assertEquals(reportDate, report.getReportDate());
	}

	@Test
	public void testReport() {
		Report report1=new Report();
		assertNotNull(report1);
	}

	@Test
	public void testReportIntegerString() {
		Integer reportID = 1;
		Report report1 = new Report(reportID);
		assertNotNull(report1);
	}

}
