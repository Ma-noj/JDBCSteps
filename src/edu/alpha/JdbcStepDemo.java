package edu.alpha;

import java.sql.Driver;
import java.sql.SQLException;

public class JdbcStepDemo {

	public static void main(String[] args) {
		try {
			Driver driver = new com.mysql.cj.jdbc.Driver();
			System.out.println(driver);
		} catch (SQLException e) {
			e.printStackTrace();
		}
	}
}
