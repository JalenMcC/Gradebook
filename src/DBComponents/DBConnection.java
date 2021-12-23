package DBComponents;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class DBConnection {

	private static Connection connection;
	
	//Default Constructor
	private DBConnection() {}
	
	//
	public static synchronized Connection getConnection() {
		
		//If connection not empty, returns it
		if (connection != null) {
			return connection;
		}
		
		else {
			try {
				String url = 
					"jdbc:mysql://gradebook-database-1.c6ue3kpzuhdo.us-east-1.rds.amazonaws.com/InitialDB";
				String username = "JmmccloClemson";
		        String password = "#Bowser4Life";
		        
		        Class.forName("com.mysql.cj.jdbc.Driver");
		        connection = DriverManager.getConnection(url, username, password);
			}
			
			catch(SQLException | ClassNotFoundException e) {
				System.out.println(e);
			}
			
			return connection;
		}
	}
	
	//Closes any open connection to the database
	public static synchronized void closeConnection() {
		if (connection != null) {
			try {
				connection.close();
			}
			catch(SQLException e) {
				System.out.println(e);
			}
			finally {
				connection = null;
			}
		}
	}
	
	
}
