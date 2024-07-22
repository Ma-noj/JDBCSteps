package edu.alpha.steps;

import java.sql.Driver;
import java.sql.DriverManager;
import java.sql.SQLException;

public class JdbcStep1 {

	public static void main(String[] args) {
		// Step 1 to Load or Register the Driver In to the Application

		try {
			// Create the Driver Type Object
			Driver driver = new com.mysql.cj.jdbc.Driver();
			// Register the Driver to Our Java Application

			DriverManager.registerDriver(driver);

			System.out.println("Driver Registered to the Application");

		} catch (SQLException e) {
			e.printStackTrace();
		}
	}

}
