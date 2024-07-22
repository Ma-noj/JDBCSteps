package edu.alpha.steps;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class JDBCStep3 {
	public static void main(String[] args) {
		// Step1 To Load or Register the Driver
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");

			// Step2 to Get the Connection
			String dbUrl = "jdbc:mysql://localhost:3306";
			String user = "root";
			String password = "root";

			Connection connection = DriverManager.getConnection(dbUrl, user, password);

			// Setp3 To Write SQL Query and Create Statement

			String sqlQuery = "SELECT * FROM carapp_jdbc.car";

			Statement statement = connection.createStatement();

			System.out.println(statement.execute(sqlQuery));

		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		} catch (SQLException e) {
			e.printStackTrace();
		}
	}
}
