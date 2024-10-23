package com.xworkz.train.runner;

import java.sql.Connection;
import java.sql.DriverManager;

public class TrainRunner {

	
	public static void main(String[] args) {
		
		String url="jdbc:mysql://localhost:3306/jdbc";
		String userName="root";
		String password="Xworkzodc@123";
		Connection connection=null;
		try {
			connection=DriverManager.getConnection(url, userName, password);
			if(connection!=null){
				System.out.println("connected");
				
			}
			
		}
		catch(Exception e)
		{
			e.printStackTrace();
		}
		

	}

}
