/**
 * 
 */
package com.academicwebsite.test;

import static org.junit.Assert.*;

import java.util.ArrayList;

import org.junit.Before;
import org.junit.Test;

import com.academicwebsite.model.Group;
import com.academicwebsite.model.User;

/**
 * @author Liz
 *
 */
public class GroupTests {
	
	Group group;
	int groupsID;
	String groupName;
	String description;

	/**
	 * @throws java.lang.Exception
	 */
	@Before
	public void setUp() throws Exception {
		group = new Group();
	}

	/**
	 * Test method for {@link com.academicwebsite.model.Group#getGroupID()}.
	 */
	@Test
	public void testGetGroupID() {
		
		groupsID = 1;
		group.setGroupID(groupsID);
		assertEquals(groupsID, group.getGroupID());
	}

	/**
	 * Test method for {@link com.academicwebsite.model.Group#setGroupID(java.lang.Integer)}.
	 */
	@Test
	public void testSetGroupID() {
		
		groupsID = 1;
		group.setGroupID(groupsID);
		assertEquals(groupsID, group.getGroupID());
	}

	/**
	 * Test method for {@link com.academicwebsite.model.Group#getGroupName()}.
	 */
	@Test
	public void testGetGroupName() {
		
		groupName = "Group One";
		group.setGroupName(groupName);
		assertEquals(groupName, group.getGroupName());
	}

	/**
	 * Test method for {@link com.academicwebsite.model.Group#setGroupName(java.lang.String)}.
	 */
	@Test
	public void testSetGroupName() {
		
		groupName = "Group One";
		group.setGroupName(groupName);
		assertEquals(groupName, group.getGroupName());
	}

	/**
	 * Test method for {@link com.academicwebsite.model.Group#getDescription()}.
	 */
	@Test
	public void testGetDescription() {
		
		description = "This is a description";
		group.setDescription(description);
		assertEquals(description, group.getDescription());
	}

	/**
	 * Test method for {@link com.academicwebsite.model.Group#setDescription(java.lang.String)}.
	 */
	@Test
	public void testSetDescription() {
		
		description = "This is a description";
		group.setDescription(description);
		assertEquals(description, group.getDescription());
	}

	/**
	 * Test method for {@link com.academicwebsite.model.Group#getUsers()}.
	 */
	@Test
	public void testGetUsers() {
		
		ArrayList<User> users = new ArrayList<User>();
		group.setUsers(users);
		assertEquals(users,group.getUsers());
	}

	/**
	 * Test method for {@link com.academicwebsite.model.Group#setUsers(java.util.ArrayList)}.
	 */
	@Test
	public void testSetUsers() {
		
		ArrayList<User> users = new ArrayList<User>();
		group.setUsers(users);
		assertEquals(users,group.getUsers());
	}

	/**
	 * Test method for {@link com.academicwebsite.model.Group#Group()}.
	 */
	@Test
	public void testGroup() {
		
		group = new Group();
		assertNotNull(group);
	}

	/**
	 * Test method for {@link com.academicwebsite.model.Group#Group(java.lang.Integer, java.lang.String)}.
	 */
	@Test
	public void testGroupIntegerString() {
		group = new Group(1, "Group", "This is a group");
		assertNotNull(group);
	}

}
