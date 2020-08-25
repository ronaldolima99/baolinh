package com.connecttodb;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import com.connecttodb.model.Category;
import com.connecttodb.model.User;

public class ConnectMysqlExample {

	private final static String CONNECTION_STRING = "jdbc:mysql://localhost:3306/productmanagement?characterEncoding=utf8";
	private final static String USER_NAME = "root";
	private final static String PASSWORD = "root";
	private final static String JDBC_DRIVER = "com.mysql.jdbc.Driver";

	private Connection getConnection() {
		try {
			Class.forName(JDBC_DRIVER);
			return DriverManager.getConnection(CONNECTION_STRING, USER_NAME, PASSWORD);
		} catch (Exception ex) {
			throw new IllegalArgumentException(String.format("Cannot connect to database [%s]", ex.getMessage()));
		}
	}

	private ResultSet getResultSet(String sql) {
		try {

			Connection connection = getConnection();
			Statement statment = connection.createStatement();
			return statment.executeQuery(sql);

		} catch (Exception ex) {
			throw new IllegalArgumentException(String.format("Cannot execute query [%s]", ex.getMessage()));
		}
	}

	public List<User> getUsers() {

		List<User> users = new ArrayList();

		ResultSet rs = getResultSet("select * from user_admin");

		try {
			while (rs.next()) {
				User user = new User();
				user.setId(rs.getString("Id"));
				user.setEmail(rs.getString("Email"));
				user.setFullname(rs.getString("Fullname"));
				user.setPass(rs.getString("pass_word"));
				user.setPhone(rs.getString("Phonenumber"));

				users.add(user);
			}
		} catch (SQLException e) {
			System.err.print(e.getMessage());
		}

		return users;
	}

	public void addCategory(Category category) {
		String query = "insert into category (id, category_name) values (?, ?)";
		try {
			PreparedStatement preparedStatement = getConnection().prepareStatement(query);
			preparedStatement.setString(1, category.getId());
			preparedStatement.setString(2, category.getName());

			int rs = preparedStatement.executeUpdate();
			if (rs == 0) {
				System.out.println("Insert failed");
			} else {
				System.out.println("Insert sucessfully");
			}

		} catch (SQLException e) {
			e.printStackTrace();
		}

	}

	public List<Category> getCategory() {
		List<Category> categories = new ArrayList();
		ResultSet rs = getResultSet("select * from category");
		try {
			while (rs.next()) {
				Category category = new Category();
				category.setId(rs.getString("id"));
				category.setName(rs.getString("category_name"));

				categories.add(category);
			}

			for (Category category : categories) {
				System.out.print(category);
			}
		} catch (Exception ex) {
			ex.printStackTrace();
		}
		return categories;
	}

	public void updateCateggory() {
		String query = "update category set category_name = 'com chay' where id = 'BA01'";
		try {
			PreparedStatement preparedStatement = getConnection().prepareStatement(query);
			int rs = preparedStatement.executeUpdate(query);

			if (rs == 0) {
				System.out.print("update successfull");
			} else {
				System.out.print("update faileds");

			}
		} catch (SQLException e) {
			e.printStackTrace();
		}
	}

	public void deleteCategory() {
		String query = "delete from category where id = 'c1'";

		try {
			PreparedStatement preparedStatement = getConnection().prepareStatement(query);
			int rs = preparedStatement.executeUpdate(query);
			if (rs == 0) {
				System.out.print("delete successfull");
			} else {
				System.out.print("delete failed");
			}
		} catch (SQLException e) {
			e.printStackTrace();
		}

	}

}
