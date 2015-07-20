/**
 * 
 */
package com.academicwebsite.model;

/**
 * @author Liz
 *
 */
public class Login {

	private String email;
	private String password;
	private Integer loginAttempts;
	private Boolean isLocked;

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

	/**
	 * @return the loginAttempts
	 */
	public Integer getLoginAttempts() {
		return loginAttempts;
	}

	/**
	 * @param loginAttempts
	 *            the loginAttempts to set
	 */
	public void setLoginAttempts(Integer loginAttempts) {
		this.loginAttempts = loginAttempts;
	}

	/**
	 * @return the isLocked
	 */
	public Boolean getIsLocked() {
		return isLocked;
	}

	/**
	 * @param isLocked
	 *            the isLocked to set
	 */
	public void setIsLocked(Boolean isLocked) {
		this.isLocked = isLocked;
	}

	public Login() {
		email = "";
		password = "";
		//loginAttempts = 0;
		//isLocked = null;
	}

	public Login(String email, String password) {
		this.email = email;
		this.password = password;
		//this.loginAttempts = loginAttempts;
		//this.isLocked = isLocked;
	}

}
