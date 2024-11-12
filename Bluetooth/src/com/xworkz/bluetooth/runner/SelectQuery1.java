package com.xworkz.bluetooth.runner;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

import com.xworkz.bluetooth.enumerate.ConnectionEnum;

public class SelectQuery1 {

	public static void main(String[] args) {
		
		

		String query="select * from employee_details";
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
					  
					 int id = resultSet.getInt("id");
                     String ename = resultSet.getString("ename");
                     String email = resultSet.getString("email");
                     String address = resultSet.getString("address");
                     String epassword = resultSet.getString("epassword");
                     String phonenumber = resultSet.getString("phonenumber");
                     double salary = resultSet.getDouble("income");
                     int age = resultSet.getInt("age");
                     int exp = resultSet.getInt("experience");
                     System.out.println("ID: " + id + ", Name: " + ename + ", Email: " + email 
                                        + ", Phone Number: " + phonenumber + ", Salary: " + salary + ", address: " + address + ", epassword: " + epassword + ", age: " + age + ", exp: " + exp);
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
