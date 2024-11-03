package com.xworkz.update.runner;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class WatchUpdateRunner {

public static void main(String[] args) {
		
		String url="jdbc:mysql://localhost:3306/watch";
		String userName="root";
		String password="Xworkzodc@123";
		
		String query1="update watch_table set price=35000 where id=1";
		String query2="update watch_table set price=10000 where id=2";
		String query3="update watch_table set price=14000 where id=3";
		String query4="update watch_table set price=17000 where id=4";
		String query5="update watch_table set price=19000 where id=5";
		String query6="update watch_table set price=20000 where id=6";
		String query7="update watch_table set price=30000 where id=7";
		String query8="update watch_table set price=8000 where id=8";
		String query9="update watch_table set price=14000 where id=9";
		String query10="update watch_table set price=2000 where id=10";
		
		
		try(Connection connection=DriverManager.getConnection(url, userName, password)){
			
			Statement statement=connection.createStatement();
			statement.executeUpdate(query1);
			statement.executeUpdate(query2);
			statement.executeUpdate(query3);
			statement.executeUpdate(query4);
			statement.executeUpdate(query5);
			statement.executeUpdate(query6);
			statement.executeUpdate(query7);
			statement.executeUpdate(query8);
			statement.executeUpdate(query9);
			statement.executeUpdate(query10);
			
				
			
		}
		catch(SQLException e)
		{
			e.printStackTrace();
		}
		

	}
}
