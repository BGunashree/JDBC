package com.xworkz.watch.runner;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class WatchRunner {

public static void main(String[] args) {
		
		String url="jdbc:mysql://localhost:3306/watch";
		String userName="root";
		String password="Xworkzodc@123";
		Connection connection=null;
		String query="insert into watch_table values(20,'Tudor')";
		try {
			connection=DriverManager.getConnection(url, userName, password);
			Statement statement=connection.createStatement();
			int value=statement.executeUpdate(query);
			if(value>0)
			{
				System.out.println("saved");
			}
			else
			{
				System.out.println("not saved");
			}
			
			
		}
		catch(SQLException e)
		{
			e.printStackTrace();
		}
		

	}

}
