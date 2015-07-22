/**
 * 
 */
package com.academicwebsite.service.impl;

import java.util.ArrayList;

import com.academicwebsite.dao.AdminDAO;
import com.academicwebsite.dao.impl.AdminDAOImpl;
import com.academicwebsite.model.Admin;
import com.academicwebsite.model.Group;
import com.academicwebsite.model.PublishedWork;
import com.academicwebsite.service.AdminService;

/**
 * @author Liz
 *
 */
public class AdminServiceImpl implements AdminService {
	
	private AdminDAO dao;
	
	public AdminServiceImpl(){
		
		dao = AdminDAOImpl.getAdminDAO();
	}

	/* (non-Javadoc)
	 * @see com.academicwebsite.service.AdminService#selectGroup()
	 */
	@Override
	public ArrayList<Group> selectGroup() {
		
		return dao.selectGroup();
	}

	/* (non-Javadoc)
	 * @see com.academicwebsite.service.AdminService#selectPubWork()
	 */
	@Override
	public ArrayList<PublishedWork> selectPubWork() {
		
		return dao.selectPubWork();
	}

	/* (non-Javadoc)
	 * @see com.academicwebsite.service.AdminService#addGroup(com.academicwebsite.model.Group)
	 */
	@Override
	public void addGroup(Group group) {
		
		dao.addGroup(group);

	}

	/* (non-Javadoc)
	 * @see com.academicwebsite.service.AdminService#editGroup(com.academicwebsite.model.Group)
	 */
	@Override
	public void editGroup(Group group) {
		
		dao.editGroup(group);
	}

	/* (non-Javadoc)
	 * @see com.academicwebsite.service.AdminService#deleteGroup(int)
	 */
	@Override
	public void deleteGroup(int groupID) {
		
		dao.deleteAdmin(groupID);

	}

	/* (non-Javadoc)
	 * @see com.academicwebsite.service.AdminService#addUserToGroup(int, int)
	 */
	@Override
	public void addUserToGroup(int groupID, int userID) {
		
		dao.addUserToGroup(groupID, userID);
	}

	/* (non-Javadoc)
	 * @see com.academicwebsite.service.AdminService#removeUserFromGroup(int, int)
	 */
	@Override
	public void removeUserFromGroup(int groupID, int userID) {
		
		dao.removeUserFromGroup(groupID, userID);

	}

	/* (non-Javadoc)
	 * @see com.academicwebsite.service.AdminService#addPublishedWork(com.academicwebsite.model.PublishedWork)
	 */
	@Override
	public void addPublishedWork(PublishedWork publishedWork) {
		
		dao.addPublishedWork(publishedWork);

	}

	/* (non-Javadoc)
	 * @see com.academicwebsite.service.AdminService#editPublishedWork(com.academicwebsite.model.PublishedWork)
	 */
	@Override
	public void editPublishedWork(PublishedWork publishedWork) {
	
		dao.editPublishedWork(publishedWork);

	}

	/* (non-Javadoc)
	 * @see com.academicwebsite.service.AdminService#deletePublishedWork(int)
	 */
	@Override
	public void deletePublishedWork(int pubWorkID) {
		
		dao.deletePublishedWork(pubWorkID);

	}

	/* (non-Javadoc)
	 * @see com.academicwebsite.service.AdminService#addAdmin(com.academicwebsite.model.Admin)
	 */
	@Override
	public void addAdmin(Admin admin) {
		
		dao.addAdmin(admin);

	}

	/* (non-Javadoc)
	 * @see com.academicwebsite.service.AdminService#editAdmin(com.academicwebsite.model.Admin)
	 */
	@Override
	public void editAdmin(Admin admin) {
		
		dao.editAdmin(admin);
	}

	/* (non-Javadoc)
	 * @see com.academicwebsite.service.AdminService#deleteAdmin(int)
	 */
	@Override
	public void deleteAdmin(int adminID) {
		
		dao.deleteAdmin(adminID);

	}

}
