package com.xworkz.cycle.runner;

import java.sql.Connection;

import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class MobileUpdateRunner {

public static void main(String[] args) {
		
		String url="jdbc:mysql://localhost:3306/mobile";
		String userName="root";
		String password="Xworkzodc@123";
		
		String query1="update mobile_table set price=30000 where id=1";
		String query2="update mobile_table set price=120000 where id=2";
		String query3="update mobile_table set price=14000 where id=3";
		String query4="update mobile_table set price=17000 where id=4";
		String query5="update mobile_table set price=19000 where id=5";
		String query6="update mobile_table set price=18000 where id=6";
		String query7="update mobile_table set price=11000 where id=7";
		String query8="update mobile_table set price=8000 where id=8";
		String query9="update mobile_table set price=35000 where id=9";
		String query10="update mobile_table set price=23000 where id=10";
		
		
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
