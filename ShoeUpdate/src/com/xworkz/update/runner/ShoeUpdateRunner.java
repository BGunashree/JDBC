package com.xworkz.update.runner;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class ShoeUpdateRunner {

public static void main(String[] args) {
		
		String url="jdbc:mysql://localhost:3306/shoe";
		String userName="root";
		String password="Xworkzodc@123";
		
		String query1="update shoe_table set color='gray' where id=1";
		String query2="update shoe_table set color='plum' where id=2";
		String query3="update shoe_table set color='crimson' where id=3";
		String query4="update shoe_table set color='lavander' where id=4";
		String query5="update shoe_table set color='black' where id=5";
		String query6="update shoe_table set color='navy blue' where id=6";
		String query7="update shoe_table set color='white' where id=7";
		String query8="update shoe_table set color='red' where id=8";
		String query9="update shoe_table set color='white' where id=9";
		String query10="update shoe_table set color='gray' where id=10";
		
		
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
