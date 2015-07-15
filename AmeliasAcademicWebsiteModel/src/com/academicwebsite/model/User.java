package com.academicwebsite.model;

/**
 * @author Liz
 *
 */
public class User {

	private String email;
	private String password;

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public User() {
		email = "";
		password = "";

	}

	public User(String email, String password) {
		this.email = email;
		this.password = password;
	}

}