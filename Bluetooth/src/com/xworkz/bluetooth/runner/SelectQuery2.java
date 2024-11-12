package com.xworkz.bluetooth.runner;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

import com.xworkz.bluetooth.enumerate.ConnectionEnum;

public class SelectQuery2 {

	public static void main(String[] args) {
		
		
		String query="(select ename from employee_details where email='gunashreebayanna@gmail.com' and epassword='abcd1234')";
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
					  
					String ename = resultSet.getString("ename");
                    System.out.println("Name: " + ename);
				}while(resultSet.next());
			}
			
			
		}
		
		
		
		
		catch(SQLException e)
		{
			e.printStackTrace();
		}


	}

}
