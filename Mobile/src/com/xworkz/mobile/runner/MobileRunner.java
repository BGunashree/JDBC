package com.xworkz.mobile.runner;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class MobileRunner {

public static void main(String[] args) {
		
		String url="jdbc:mysql://localhost:3306/mobile";
		String userName="root";
		String password="Xworkzodc@123";
		Connection connection=null;
		
		try {
			connection=DriverManager.getConnection(url, userName, password);
			Statement statement=connection.createStatement();
			int value=statement.executeUpdate("insert into mobile_table(id,mob_name,price) values(1,'Samsung',20000),(2,'Apple',100000),(3,'Xiaomi',15000),(4,'Vivo',20000),"
					+ "(5,'Oppp',30000),(6,'Poco',25000),(7,'Moto',7000),(8,'Lava',10000),(9,'Asus',40000),(10,'Nothing',20000),(11,'Infinix',21000),(12,'Nokia',14000),(13,'Micromax',12000)"
					+ ",(14,'Honor',15000),(15,'Nubia',17000),(16,'Celkon',26000),(17,'Sony',28000),(18,'Intex',30000),(19,'Tecno',22000),(20,'Gionee',18000)");
			if(value>0)
			{
				System.out.println("saved");
			}
			else
			{
				System.out.println("not saved");
			}
			
			
		}
		catch(SQLException e)
		{
			e.printStackTrace();
		}
		

	}


}
