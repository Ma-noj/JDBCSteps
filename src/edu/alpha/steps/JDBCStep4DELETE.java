package edu.alpha.steps;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class JDBCStep4DELETE {
	public static void main(String[] args) {
		// Step 1

		try {
			Class.forName("com.mysql.cj.jdbc.Driver");

			// Step 2

			String dbUrl = "jdbc:mysql://localhost:3306";
			String user = "root";
			String password = "root";

			Connection connection = DriverManager.getConnection(dbUrl, user, password);

			// Step3

			String sqlQuery = "DELETE FROM carapp_jdbc.car WHERE car_id=102";
			Statement statement = connection.createStatement();

			int result = statement.executeUpdate(sqlQuery);
			// Step 4
			if (result == 1) {
				System.out.println("Car Info DELETED");
			} else {
				System.out.println("Car Info Not DELETED");
			}
		} catch (ClassNotFoundException | SQLException e) {
			e.printStackTrace();
		}
	}
}
