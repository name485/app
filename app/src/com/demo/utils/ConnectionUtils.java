package com.demo.utils;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class ConnectionUtils {

	public static Connection getConnection() throws ClassNotFoundException{
		Class.forName("com.microsoft.sqlserver.jdbc.SQLServerDriver");
		Connection con= null;
		try {
			con = DriverManager.getConnection("jdbc:sqlserver://SCHINTAKINDI-64:1433;DatabaseName=ths11local", "ths11local", "ths11local");
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return con;		
	}
}
