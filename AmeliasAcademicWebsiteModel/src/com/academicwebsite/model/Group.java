package com.academicwebsite.model;

import java.util.ArrayList;

public class Group {

	private Integer groupID;
	private String groupName;
	private String description;
	private ArrayList<User> users;

	/**
	 * @return the groupID
	 */
	public Integer getGroupID() {
		return groupID;
	}

	/**
	 * @param groupID
	 *            the groupID to set
	 */
	public void setGroupID(Integer groupID) {
		this.groupID = groupID;
	}

	/**
	 * @return the groupName
	 */
	public String getGroupName() {
		return groupName;
	}

	/**
	 * @param groupName
	 *            the groupName to set
	 */
	public void setGroupName(String groupName) {
		this.groupName = groupName;
	}

	/**
	 * @return the description
	 */
	public String getDescription() {
		return description;
	}

	/**
	 * @param description
	 *            the description to set
	 */
	public void setDescription(String description) {
		this.description = description;
	}

	/**
	 * @return the users
	 */
	public ArrayList<User> getUsers() {
		return users;
	}

	/**
	 * @param users
	 *            the users to set
	 */
	public void setUsers(ArrayList<User> users) {
		this.users = users;
	}

	public Group() {
		groupID = 0;
		groupName = "";
		// description = "";
		// users = null;

	}

	public Group(Integer groupID, String groupName) {
		this.groupID = groupID;
		this.groupName = groupName;
		// description = "";
		// users = null;

	}

}
