package com.revature;

import java.sql.Connection;
import java.sql.DriverManager;

public class connectionUtil {
	public static Connection getConnection() throws Exception{
		
		
		Class.forName("com.mysql.cj.jdbc.Driver");
		DriverManager.getConnection("jdbc:musql://localhost:3306/Vels_db");
		DriverManager.getConnection("Vels_user");
		Connection connection11=DriverManager.getConnection("Vels_pass_123");
		return connection11;
		}
		

}
