package com.academicwebsite.test;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

import com.academicwebsite.model.Admin;

public class AdminTests {
	
	Admin admin;
	int adminID;
	String adminName;
	String email;
	String password;

	@Before
	public void setUp() throws Exception {
		
		admin = new Admin();
	}

	@Test
	public void testGetAdminID() {
		
		adminID = 1;
		admin.setAdminID(adminID);
		//assertEquals(adminID, admin.getAdminID());
	}

	@Test
	public void testSetAdminID() {
		fail("Not yet implemented");
	}

	@Test
	public void testGetAdminName() {
		fail("Not yet implemented");
	}

	@Test
	public void testSetAdminName() {
		fail("Not yet implemented");
	}

	@Test
	public void testGetEmail() {
		fail("Not yet implemented");
	}

	@Test
	public void testSetEmail() {
		fail("Not yet implemented");
	}

	@Test
	public void testGetPassword() {
		fail("Not yet implemented");
	}

	@Test
	public void testSetPassword() {
		fail("Not yet implemented");
	}

	@Test
	public void testAdmin() {
		fail("Not yet implemented");
	}

	@Test
	public void testAdminIntegerStringString() {
		fail("Not yet implemented");
	}

}
