/**
 * 
 */
package com.academicwebsite.dao;

import java.util.ArrayList;

import com.academicwebsite.model.Admin;
import com.academicwebsite.model.Group;
import com.academicwebsite.model.PublishedWork;
import com.academicwebsite.model.Report;
import com.academicwebsite.model.User;

/**
 * @author Liz
 *
 */
public interface AdminDAO {
	
	public ArrayList<Group> selectGroup();
	
	public ArrayList<PublishedWork> selectPubWork();

	public void addGroup(Group group);

	public void editGroup(Group group);

	public void deleteGroup(int groupID);

	public void addUserToGroup(int groupID, int userID);

	public void removeUserFromGroup(int groupID, int userID);

	public void addPublishedWork(PublishedWork publishedWork);

	public void editPublishedWork(PublishedWork publishedWork);

	public void deletePublishedWork(int pubWorkID);

	public void addAdmin(Admin admin);

	public void editAdmin(Admin admin);

	public void deleteAdmin(int adminID);

	// TODO uncomment once export reports works
	//public void exportReport(int reportID);

}
