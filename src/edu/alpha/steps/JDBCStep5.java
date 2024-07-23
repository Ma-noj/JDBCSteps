package edu.alpha.steps;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class JDBCStep5 {
	public static void main(String[] args) {
		// Step1 To Load or Register the Driver
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");

			// Step2 to Get the Connection
			String dbUrl = "jdbc:mysql://localhost:3306";
			String user = "root";
			String password = "root";

			Connection connection = DriverManager.getConnection(dbUrl, user, password);

			// Step3 To Write SQL Query and Create Statement

			String sqlQuery = "INSERT INTO carapp_jdbc.car VALUES(107,'car7')";

			Statement statement = connection.createStatement();
			// Step 4 To Process the Result
			int result = statement.executeUpdate(sqlQuery);

			if (result == 1) {
				System.out.println("Car Info Inserted");
			} else {
				System.out.println("Car Info Not Inserted");
			}

			// Step 5 to Close the Connection
			connection.close();
			statement.close();

			System.out.println("Connection and Statement Object Closed");

		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		} catch (SQLException e) {
			e.printStackTrace();
		}
	}
}
