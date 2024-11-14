package com.xworkz.hanger.runner;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;

import com.xworkz.hanger.enumerate.ConnectionEnum1;

public class InsertQuery2 {

	public static void main(String[] args) {
	
		PreparedStatement pst=null;
		try(Connection connection=DriverManager.getConnection(ConnectionEnum1.URL.getValue(), ConnectionEnum1.USERNAME.getValue(), ConnectionEnum1.PASSWORD.getValue()))
		{
			pst=connection.prepareStatement("insert into hospital_table values(?,?,?)");
			pst.setInt(1, 1);
			pst.setString(2, "Aster");
			pst.setString(3, "Hebbal");
		    pst.addBatch();
			pst.setInt(1, 2);
			pst.setString(2, "Manipal");
			pst.setString(3, "Hebbal");
			pst.addBatch();
			pst.setInt(1, 3);
			pst.setString(2, "Pranav");
			pst.setString(3, "Banaswadi");
			pst.addBatch();
			pst.setInt(1, 4);
			pst.setString(2, "Sparsh");
			pst.setString(3, "Yelahanka");
			pst.addBatch();
			
			pst.setInt(1, 5);
			pst.setString(2, "Fortis");
			pst.setString(3, "Bannerghatta");
			pst.addBatch();
			pst.setInt(1, 6);
			pst.setString(2, "Suviksha");
			pst.setString(3, "Vijayapura");
			pst.addBatch();
			pst.setInt(1, 7);
			pst.setString(2, "Baptist");
			pst.setString(3, "Hebbal");
			pst.addBatch();
			pst.setInt(1, 8);
			pst.setString(2, "Kims");
			pst.setString(3, "Hebbal");
			pst.addBatch();
			pst.setInt(1, 9);
			pst.setString(2, "Cytecare");
			pst.setString(3, "Baglur");
			pst.addBatch();
			
			pst.setInt(1, 10);
			pst.setString(2, "Relife");
			pst.setString(3, "Yelahanka");
			pst.addBatch();
			pst.setInt(1, 11);
			pst.setString(2, "Sakra");
			pst.setString(3, "Varthur");
			pst.addBatch();
			pst.setInt(1, 12);
			pst.setString(2, "ESI");
			pst.setString(3, "Rajajinagar");
			
			pst.addBatch();
			pst.setInt(1, 13);
			pst.setString(2, "Brindavan");
			pst.setString(3, "Sadahalli");
			pst.addBatch();
			pst.setInt(1, 14);
			pst.setString(2, "Kaveri");
			pst.setString(3, "Sahakarnagar");
			pst.addBatch();
			pst.setInt(1, 15);
			pst.setString(2, "TrueLife");
			pst.setString(3, "Nagwara");
			pst.addBatch();
			
			
			
			int[] count=pst.executeBatch();
			
			
			//int value=pst.executeUpdate();
			for(int c:count)
			{
			if(c>0)
			{
				System.out.println("saved");
			}
			else
			{
				System.out.println("not saved");
			}
			}
			
					
		}
		catch(Exception e)
		{
			e.printStackTrace();
		}

	}

}
