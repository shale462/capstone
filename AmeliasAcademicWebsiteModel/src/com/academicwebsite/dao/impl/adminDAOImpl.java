package com.academicwebsite.dao.impl;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;

import com.academicwebsite.dao.adminDAO;
import com.academicwebsite.model.Admin;
import com.academicwebsite.model.Group;
import com.academicwebsite.model.PublishedWork;
import com.academicwebsite.model.Report;

public class adminDAOImpl implements adminDAO {

	private static adminDAOImpl dao;

	private adminDAOImpl() {
	}

	public static adminDAOImpl getAdminDAO() {
		if (dao == null) {
			dao = new adminDAOImpl();
		}
		return dao;
	}

	private Connection openConnection() {
		Connection connection = null;

		try {

			Class.forName("com.mysql.jdbc.Driver");

			connection = DriverManager
					.getConnection("jdbc:mysql://localhost:3306/ameliadatabase;create=true");

			// connection =
			// DriverManager.getConnection("jdbc:mysql://localhost:3306/ameliadatabase",
			// "root",
			// "Zayra*2012");

		} catch (Exception e) {
			e.printStackTrace();
		}
		return connection;
	}

	private void closeConnection(Connection connection) {
		if (connection != null) {

			try {
				connection.close();

			} catch (Exception e) {

				e.printStackTrace();
			}
		}
	}

	public void addGroup(Group group) {

		Connection con = null;
		PreparedStatement ps = null;

		try {
			con = openConnection();
			String query = "INSERT INTO ameliadatabase.ADMIN values(?,?)";
			ps = con.prepareStatement(query);
			ps.setString(1, group.getGroupName());
			ps.setString(2, group.getDescription());

			ps.executeUpdate();

		} catch (Exception e) {

			e.printStackTrace();
		} finally {

			closeConnection(con);
		}

	}

	public void editGroup(int groupID) {

	}

	public void deleteGroup(int groupID) {

	}

	public void addUserToGroup(int groupID, int userID) {

	}

	public void removeUserFromGroup(int groupID, int userID) {

	}

	public void addPublishedWork(PublishedWork publishedWork) {

	}

	public void editPublishedWork(int pubWorkID) {

	}

	public void deletePublishedWork(int pubWorkID) {

	}

	public void addAdmin(Admin admin) {

	}

	public void editAdmin(int adminID) {

	}

	public void deleteAdmin(int adminID) {

	}

	public void addReport(Report report) {

	}

	public void editReport(int reportID) {

	}

	public void deleteReport(int reportID) {

	}

	public void exportReport(int reportID) {

	}

}
