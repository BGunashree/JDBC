package com.xworkz.refrigerator.runner;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

import com.xworkz.refrigerator.enumerate.ConnectionEnum;

public class SelectQuery2 {

	public static void main(String[] args) {
		
		String query="select name from bank_table where email='hemavati@gmail.com' and bpassword='xerty2447'";
		try {
			Connection connection=DriverManager.getConnection(ConnectionEnum.URL.getValue(), ConnectionEnum.USERNAME.getValue(), ConnectionEnum.PASSWORD.getValue());
			Statement statement=connection.createStatement();
			ResultSet resultSet=statement.executeQuery(query);
			if(!resultSet.next())
			{
				System.out.println("No data found in database");
			}
			else
			{
				
				do{
					  
	                  String name = resultSet.getString("name");
	                  System.out.println(" name:"+ name);
	                  System.out.println();
				}while(resultSet.next());
			}
			
			
		}
		
		
		
		
		catch(SQLException e)
		{
			e.printStackTrace();
		}


	}

}
