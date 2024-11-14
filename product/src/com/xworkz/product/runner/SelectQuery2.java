package com.xworkz.product.runner;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

import com.xworkz.product.enumerate.ConnectionEnum;



public class SelectQuery2 {

	public static void main(String[] args) {
		
		
		String query="(select cname from product_table where email='gunashreebayanna@gmail.com' and epassword='abc@123')";
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
					  
					String cname = resultSet.getString("cname");
                    System.out.println("Name: " + cname);
				}while(resultSet.next());
			}
			
			
		}
		
		
		
		
		catch(SQLException e)
		{
			e.printStackTrace();
		}


	}

}
