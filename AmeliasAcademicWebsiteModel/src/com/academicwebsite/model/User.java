package com.academicwebsite.model;

/**
 * @author Liz
 *
 */
public class User {
	
	// declare variable for email of user with getter and setter methods	
	private String email;
	
	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}
	
	
	// declare variable for password of user with getter and setter methods
	private String password;
	
	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}
	
	
	public User()
	{
		email = "";
		password = "";
	
	}
	
	public User(String email, String password)
	{
		this.email = email;
		this.password = password;
	}
	


}
