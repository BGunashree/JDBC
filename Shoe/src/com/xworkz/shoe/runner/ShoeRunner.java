package com.xworkz.shoe.runner;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class ShoeRunner {

public static void main(String[] args) {
		
		String url="jdbc:mysql://localhost:3306/shoe";
		String userName="root";
		String password="Xworkzodc@123";
		Connection connection=null;
		String query="insert into shoe_table values(20,'Brikenstock','black')";
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
