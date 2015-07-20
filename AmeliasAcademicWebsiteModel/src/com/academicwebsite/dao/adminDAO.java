/**
 * 
 */
package com.academicwebsite.dao;

import com.academicwebsite.model.Admin;
import com.academicwebsite.model.Group;
import com.academicwebsite.model.PublishedWork;
import com.academicwebsite.model.Report;
import com.academicwebsite.model.User;

/**
 * @author Liz
 *
 */
public interface adminDAO {
	
	public void addGroup(Group group);
	public void editGroup(int groupID);
	public void deleteGroup(int groupID);
	public void addUserToGroup(int groupID, int userID);
	public void removeUserFromGroup(int groupID, int userID);
	public void addPublishedWork(PublishedWork publishedWork);
	public void editPublishedWork(int pubWorkID);
	public void deletePublishedWork(int pubWorkID);
	public void addAdmin(Admin admin);
	public void editAdmin(int adminID);
	public void deleteAdmin(int adminID);
	public void addReport(Report report);
	public void editReport(int reportID);
	public void deleteReport(int reportID);
	public void exportReport(int reportID);
	
}
