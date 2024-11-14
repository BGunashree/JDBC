package com.xworkz.product.runner;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

import com.xworkz.product.enumerate.ConnectionEnum;



public class SelectQuery1 {

	public static void main(String[] args) {
		
		
		String query="select * from product_table";
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
                     String ename = resultSet.getString("cname");
                     String email = resultSet.getString("email");
                     String address = resultSet.getString("address");
                     String epassword = resultSet.getString("epassword");
                     long phonenumber = resultSet.getLong("phone_number");
                     String productName = resultSet.getString("p_name");
                     int price = resultSet.getInt("price");
                     String category = resultSet.getString("category");
                     String supplier = resultSet.getString("supplier");
                     
                     System.out.println("ID: " + id + ", Name: " + ename + ", Email: " + email + ", supplier: " + supplier +  ",Phone Number: " + phonenumber + ", productName: " + productName + ", address: " + address + ", epassword: " + epassword + ", price: " + price + ", category: " + category);
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
