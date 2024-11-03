package com.xworkz.delete.runner;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class ShoeDeleteRunner {

public static void main(String[] args) {
		
		String url="jdbc:mysql://localhost:3306/shoe";
		String userName="root";
		String password="Xworkzodc@123";
		
		String query1="delete from  shoe_table  where id=11";
		String query2="delete from shoe_table where id=12";
		String query3="delete from shoe_table where id=13";
		String query4="delete from  shoe_table  where id=14";
		String query5="delete from  shoe_table  where id=15";
		String query6="delete from shoe_table  where id=16";
		String query7="delete from shoe_table  where id=17";
		String query8="delete from shoe_table  where id=18";
		String query9="delete from shoe_table  where id=19";
		String query10="delete from shoe_table  where id=20";
		
		
		
		
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
