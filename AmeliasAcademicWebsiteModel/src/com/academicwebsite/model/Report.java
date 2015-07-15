package com.academicwebsite.model;

import java.util.Date;

public class Report {
	private Integer reportID;
	private String reportName;
	private String description;
	private Date reportDate;
	private String sqlStatement;

	public Integer getReportID() {
		return reportID;
	}

	public void setReportID(Integer reportID) {
		this.reportID = reportID;
	}

	public String getReportName() {
		return reportName;
	}

	public void setReportName(String reportName) {
		this.reportName = reportName;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public Date getReportDate() {
		return reportDate;
	}

	public void setReportDate(Date reportDate) {
		this.reportDate = reportDate;
	}

	public String getSqlStatement() {
		return sqlStatement;
	}

	public void setSqlStatement(String sqlStatement) {
		this.sqlStatement = sqlStatement;
	}

	public Report() {
		reportID = 0;
		sqlStatement = "";
	}

	public Report(Integer reportID, String sqlStatement) {
		this.reportID = reportID;
		this.sqlStatement = sqlStatement;
	}

}
