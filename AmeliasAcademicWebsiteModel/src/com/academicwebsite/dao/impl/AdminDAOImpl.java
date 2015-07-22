package com.academicwebsite.dao.impl;

import java.sql.Connection;
import java.sql.Date;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.ArrayList;

import com.academicwebsite.dao.AdminDAO;
import com.academicwebsite.model.Admin;
import com.academicwebsite.model.Group;
import com.academicwebsite.model.PublishedWork;
import com.academicwebsite.model.Report;

/**
 * @author Liz
 *
 */
public class AdminDAOImpl implements AdminDAO {

	private static AdminDAOImpl dao;

	private AdminDAOImpl() {
	}

	public static AdminDAOImpl getAdminDAO() {
		if (dao == null) {
			dao = new AdminDAOImpl();
		}
		return dao;
	}

	private Connection openConnection() {
		Connection connection = null;

		try {

			Class.forName("com.mysql.jdbc.Driver");

			connection = DriverManager
					.getConnection("jdbc:mysql://localhost:3306/ameliadatabase");

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

	@Override
	public ArrayList<Group> selectGroup() {
		Connection con = null;
		Statement statement;
		ResultSet rs = null;
		Group group = null;

		ArrayList<Group> groups = new ArrayList<Group>();

		try {
			con = openConnection();
			String query = "SELECT * FROM ameliadatabase.groups";
			statement = con.createStatement();
			rs = statement.executeQuery(query);

			while (rs.next()) {
				group = new Group(rs.getInt(1), rs.getString(2),
						rs.getString(3));

				groups.add(group);
			}
		} catch (Exception e) {
			// TODO: handle exception e.printStackTrace(); } finally
			e.printStackTrace();

		} finally {

			closeConnection(con);
		}

		return groups;

	}

	@Override
	public ArrayList<PublishedWork> selectPubWork() {

		Connection con = null;
		Statement statement;
		ResultSet rs = null;
		PublishedWork pubWork = null;

		ArrayList<PublishedWork> pubWorks = new ArrayList<PublishedWork>();

		try {
			con = openConnection();
			String query = "SELECT * FROM ameliadatabase.publishedwork";
			statement = con.createStatement();
			rs = statement.executeQuery(query);

			while (rs.next()) {
				pubWork = new PublishedWork(rs.getInt(1), rs.getString(2),
						rs.getString(3), rs.getString(4), rs.getDate(5),
						rs.getDate(6));

				pubWorks.add(pubWork);
			}
		} catch (Exception e) {
			// TODO: handle exception e.printStackTrace(); } finally
			e.printStackTrace();

		} finally {

			closeConnection(con);
		}

		return pubWorks;

	}

	@Override
	public void addGroup(Group group) {

		Connection con = null;
		PreparedStatement ps = null;

		try {
			con = openConnection();
			String query = "INSERT INTO ameliadatabase.groups VALUES(?,?)";
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

	@Override
	public void editGroup(Group group) {

		Connection con = null;
		PreparedStatement ps = null;

		try {
			con = openConnection();
			String query = "UPDATE ameliadatabase.groups SET groupsName = ?, description = ? WHERE groupsID = ?";
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

	@Override
	public void deleteGroup(int groupID) {

		Connection con = null;
		PreparedStatement ps = null;

		try {
			con = openConnection();
			String query = "DELETE FROM ameliadatabase.groups WHERE groupsID = ?";
			ps = con.prepareStatement(query);
			ps.setInt(1, groupID);

			ps.executeUpdate();

		} catch (Exception e) {

			e.printStackTrace();

		} finally {

			closeConnection(con);
		}

	}

	@Override
	public void addUserToGroup(int groupID, int userID) {

		Connection con = null;
		PreparedStatement ps = null;

		try {
			con = openConnection();
			String query = "INSERT INTO ameliadatabase.usergroups VALUES(?,?)";
			ps = con.prepareStatement(query);
			ps.setInt(1, groupID);
			ps.setInt(2, userID);
			ps.executeUpdate();

		} catch (Exception e) {

			e.printStackTrace();

		} finally {

			closeConnection(con);
		}

	}

	@Override
	public void removeUserFromGroup(int groupID, int userID) {

		Connection con = null;
		PreparedStatement ps = null;

		try {
			con = openConnection();
			String query = "DELETE FROM ameliadatabase.usergroups WHERE groupsID = ? AND userid = ?";
			ps = con.prepareStatement(query);
			ps.setInt(1, groupID);
			ps.setInt(2, userID);

			ps.executeUpdate();

		} catch (Exception e) {

			e.printStackTrace();

		} finally {

			closeConnection(con);
		}

	}

	@Override
	public void addPublishedWork(PublishedWork publishedWork) {

		Connection con = null;
		PreparedStatement ps = null;

		try {
			con = openConnection();
			String query = "INSERT INTO ameliadatabase.publishedwork VALUES(?,?,?,?)";
			ps = con.prepareStatement(query);
			ps.setString(1, publishedWork.getTitle());
			ps.setString(2, publishedWork.getAuthor());
			ps.setString(3, publishedWork.getFileLocation());
			ps.setDate(4, (Date) publishedWork.getDateCreated());
			ps.executeUpdate();

		} catch (Exception e) {

			e.printStackTrace();

		} finally {

			closeConnection(con);
		}

	}

	@Override
	public void editPublishedWork(PublishedWork publishedWork) {

		Connection con = null;
		PreparedStatement ps = null;

		try {
			con = openConnection();
			String query = "UPDATE ameliadatabase.publishedwork SET title = ?, author = ?, fileLocation = ?"
					+ "dateCreated = ? WHERE pubWorkID = ?";
			ps = con.prepareStatement(query);
			ps.setString(1, publishedWork.getTitle());
			ps.setString(2, publishedWork.getAuthor());
			ps.setString(3, publishedWork.getFileLocation());
			ps.setDate(4, (Date) publishedWork.getDateCreated());

			ps.executeUpdate();

		} catch (Exception e) {

			e.printStackTrace();

		} finally {

			closeConnection(con);
		}

	}

	@Override
	public void deletePublishedWork(int pubWorkID) {

		Connection con = null;
		PreparedStatement ps = null;

		try {
			con = openConnection();
			String query = "DELETE FROM ameliadatabase.publishedwork WHERE pubWorkID = ?";
			ps = con.prepareStatement(query);
			ps.setInt(1, pubWorkID);

			ps.executeUpdate();

		} catch (Exception e) {

			e.printStackTrace();

		} finally {

			closeConnection(con);
		}

	}

	@Override
	public void addAdmin(Admin admin) {

		Connection con = null;
		PreparedStatement ps = null;

		try {
			con = openConnection();
			String query = "INSERT INTO ameliadatabase.admin VALUES(?,?,?)";
			ps = con.prepareStatement(query);
			ps.setString(1, admin.getAdminName());
			ps.setString(2, admin.getEmail());
			ps.setString(3, admin.getPassword());
			ps.executeUpdate();

		} catch (Exception e) {

			e.printStackTrace();

		} finally {

			closeConnection(con);
		}

	}

	@Override
	public void editAdmin(Admin admin) {

		Connection con = null;
		PreparedStatement ps = null;

		try {
			con = openConnection();
			String query = "UPDATE ameliadatabase.admin SET adminName = ?, email = ?, password = ?";
			ps = con.prepareStatement(query);
			ps.setString(1, admin.getAdminName());
			ps.setString(2, admin.getEmail());
			ps.setString(3, admin.getPassword());

			ps.executeUpdate();

		} catch (Exception e) {

			e.printStackTrace();

		} finally {

			closeConnection(con);
		}

	}

	@Override
	public void deleteAdmin(int adminID) {

		Connection con = null;
		PreparedStatement ps = null;

		try {
			con = openConnection();
			String query = "DELETE FROM ameliadatabase.admin WHERE adminID = ?";
			ps = con.prepareStatement(query);
			ps.setInt(1, adminID);

			ps.executeUpdate();

		} catch (Exception e) {

			e.printStackTrace();

		} finally {

			closeConnection(con);
		}

	}

	// TODO figure out how to export reports
	// public void exportReport(int reportID) {

	// }

}
