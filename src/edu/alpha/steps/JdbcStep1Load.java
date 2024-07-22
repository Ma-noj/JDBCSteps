package edu.alpha.steps;

public class JdbcStep1Load {

	public static void main(String[] args) {
		// Step 1 to Load or Register the Driver In to the Application
		try {
		// Load the Driver Class to the JVM
			
			Class.forName("com.mysql.cj.jdbc.Driver");

			System.out.println("Driver Registered to the Application");
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		}
	}

}
