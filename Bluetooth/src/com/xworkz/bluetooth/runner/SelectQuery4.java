package com.xworkz.bluetooth.runner;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

import com.xworkz.bluetooth.enumerate.ConnectionEnum;

public class SelectQuery4 {

	public static void main(String[] args) {

		String query="(select email,epassword from employee_details where phonenumber='9876543210')";
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
					  
					String email = resultSet.getString("email");
                    String epassword = resultSet.getString("epassword");
                    System.out.println("Email: " + email + ", Password: " + epassword);
				}while(resultSet.next());
			}
			
			
		}
		
		
		
		
		catch(SQLException e)
		{
			e.printStackTrace();
		}


	}

}
