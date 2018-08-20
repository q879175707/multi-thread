package com.singleton.singleton_10;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class MyObject {
	
	public enum MyEnumSingleton {
		connectionFactory;
		private Connection connection;
		private MyEnumSingleton() {
			try {
				System.out.println("调用了MyObject的构造");
				String url = "jdbc:mysql://localhost:3306/test?characterEncoding=utf-8";
				String username = "root";
				String password = "123";
				String driverName = "com.mysql.jdbc.Driver";
				Class.forName(driverName);
				connection = DriverManager.getConnection(url, username, password);
			} catch (ClassNotFoundException e) {
				e.printStackTrace();
			} catch (SQLException e) {
				e.printStackTrace();
			}
		}
		public Connection getConnection() {
			return connection;
		}
	}
	
	public static Connection getConnection() {
		return MyEnumSingleton.connectionFactory.getConnection();
	}
	
}
