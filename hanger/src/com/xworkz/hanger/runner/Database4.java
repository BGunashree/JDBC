package com.xworkz.hanger.runner;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;

import com.xworkz.hanger.enumerate.ConnectionEnum3;

public class Database4 {

	public static void main(String[] args) {
		
		
		PreparedStatement pst=null;
		try(Connection connection=DriverManager.getConnection(ConnectionEnum3.URL.getValue(), ConnectionEnum3.USERNAME.getValue(), ConnectionEnum3.PASSWORD.getValue()))
		{
			
			pst=connection.prepareStatement("insert into city_table values(?,?)");
			pst.setInt(1, 1);
			pst.setString(2, "Bangalore");
		    pst.executeUpdate();
		    
		    pst.setInt(1, 2);
			pst.setString(2, "Mangaluru");
		    pst.executeUpdate();
		    
		    pst.setInt(1, 3);
			pst.setString(2, "Kalaburagi");
		    pst.executeUpdate();
		    
		    pst.setInt(1, 4);
			pst.setString(2, "Udupi");
		    pst.executeUpdate();
		    
		    pst.setInt(1, 5);
			pst.setString(2, "Shivamogga");
		    pst.executeUpdate();
		    
		    pst.setInt(1, 6);
			pst.setString(2, "Tumakuru");
		    pst.executeUpdate();
		    
		    pst.setInt(1, 7);
			pst.setString(2, "Bidar");
		    pst.executeUpdate();
		    
		    pst.setInt(1, 8);
			pst.setString(2, "Vijayapura");
		    pst.executeUpdate();
		    
		    pst.setInt(1, 9);
			pst.setString(2, "Hassan");
		    pst.executeUpdate();
		    
		    pst.setInt(1, 10);
			pst.setString(2, "Ballari");
		    pst.executeUpdate();
		    
		    pst.setInt(1, 11);
			pst.setString(2, "Raichur");
		    pst.executeUpdate();
		    
		    pst.setInt(1, 12);
			pst.setString(2, "Hosapete");
		    pst.executeUpdate();
		    
		    pst.setInt(1, 13);
			pst.setString(2, "Gadag");
		    pst.executeUpdate();
		    
		    pst.setInt(1, 14);
			pst.setString(2, "Belagavi");
		    pst.executeUpdate();
		    
		    pst.setInt(1, 15);
			pst.setString(2, "Davangere");
		    pst.executeUpdate();
		   
			
					
		}
		catch(Exception e)
		{
			e.printStackTrace();
		}

	}

}
