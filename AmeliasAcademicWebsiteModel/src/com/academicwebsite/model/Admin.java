package com.academicwebsite.model;

public class Admin {

	private Integer adminID;
	private String adminName;
	private String email;
	private String password;

	/**
	 * @return the adminID
	 */
	public Integer getAdminID() {
		return adminID;
	}

	/**
	 * @param adminID
	 *            the adminID to set
	 */
	public void setAdminID(Integer adminID) {
		this.adminID = adminID;
	}

	/**
	 * @return the adminName
	 */
	public String getAdminName() {
		return adminName;
	}

	/**
	 * @param adminName
	 *            the adminName to set
	 */
	public void setAdminName(String adminName) {
		this.adminName = adminName;
	}

	/**
	 * @return the email
	 */
	public String getEmail() {
		return email;
	}

	/**
	 * @param email
	 *            the email to set
	 */
	public void setEmail(String email) {
		this.email = email;
	}

	/**
	 * @return the password
	 */
	public String getPassword() {
		return password;
	}

	/**
	 * @param password
	 *            the password to set
	 */
	public void setPassword(String password) {
		this.password = password;
	}

	public Admin() {

		adminID = 0;
		adminName = "";
		email = "";
		password = "";
	}

	public Admin(Integer adminID, String email, String password) {

		this.adminID = adminID;
		// this.adminName = adminName;
		this.email = email;
		this.password = password;
	}

}
