package com.xworkz.refrigerator.runner;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

import com.xworkz.refrigerator.enumerate.ConnectionEnum;

public class SelectQuery1 {

	public static void main(String[] args) {
		
		String query="select * from bank_table";
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
	                  String name = resultSet.getString("name");
	                  String email = resultSet.getString("email");
	                  String phonenumber = resultSet.getString("phone_number");
	                  String address=resultSet.getString("address");
	                  String aname=resultSet.getString("account_name");
	                 String password=resultSet.getString("bpassword");
	                  String bank_name = resultSet.getString("bank_name");
	                  String gender = resultSet.getString("gender");
	                  String accountNumber = resultSet.getString("account_number");
	                  String accountType = resultSet.getString("type_of_account");
	                  System.out.println("ID: " + id + ", Name: " + name + ", Email: " + email 
	                                     + ", Phone Number: " + phonenumber + ", bank_name: " + bank_name +", address:"+address + ", aname:"+ aname +", password:"+ password+", gender:"+ gender
	                                     +", accountNumber:"+ accountNumber +", accountType:"+ accountType);
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
