/**
 * 
 */
package com.academicwebsite.model;

import java.util.Date;

/**
 * @author Liz
 *
 */
public class Profile {

	private Integer profileID;
	private String email;
	private String firstName;
	private String lastName;
	private Date DOB;
	private Integer genderID;

	/**
	 * @return the profileID
	 */
	public Integer getProfileID() {
		return profileID;
	}

	/**
	 * @param profileID
	 *            the profileID to set
	 */
	public void setProfileID(Integer profileID) {
		this.profileID = profileID;
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
	 * @return the firstName
	 */
	public String getFirstName() {
		return firstName;
	}

	/**
	 * @param firstName
	 *            the firstName to set
	 */
	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	/**
	 * @return the lastName
	 */
	public String getLastName() {
		return lastName;
	}

	/**
	 * @param lastName
	 *            the lastName to set
	 */
	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	/**
	 * @return the dOB
	 */
	public Date getDOB() {
		return DOB;
	}

	/**
	 * @param dOB
	 *            the dOB to set
	 */
	public void setDOB(Date dOB) {
		this.DOB = dOB;
	}

	/**
	 * @return the genderID
	 */
	public Integer getGenderID() {
		return genderID;
	}

	/**
	 * @param genderID
	 *            the genderID to set
	 */
	public void setGenderID(Integer genderID) {
		this.genderID = genderID;
	}

	public Profile() {
		profileID = 0;
		email = "";
		// not sure if I add nullable parameters
		// firstName = "";
		// lastName = "";
		// DOB = null;
		// genderID = 0;

	}

	public Profile(Integer profileID, String email) {
		this.profileID = profileID;
		this.email = email;
		// firstName = "";
		// lastName = "";
		// DOB = null;
		// genderID = 0;

	}

}
