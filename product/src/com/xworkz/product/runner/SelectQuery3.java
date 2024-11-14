package com.xworkz.product.runner;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

import com.xworkz.product.enumerate.ConnectionEnum;



public class SelectQuery3 {

	public static void main(String[] args) {
		
		
		String query="(select address from product_table where cname='Gunashree' and phone_number=8951144400)";
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
					  
					 String address = resultSet.getString("address");
                     System.out.println("Address: " + address);
				}while(resultSet.next());
			}
			
			
		}
		
		
		
		
		catch(SQLException e)
		{
			e.printStackTrace();
		}


	}

}
