package com.xworkz.hanger.runner;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;

import com.xworkz.hanger.enumerate.ConnectionEnum2;

public class InsertQuery3 {

	public static void main(String[] args) {
		
		

		PreparedStatement pst=null;
		try(Connection connection=DriverManager.getConnection(ConnectionEnum2.URL.getValue(), ConnectionEnum2.USERNAME.getValue(), ConnectionEnum2.PASSWORD.getValue()))
		{
			pst=connection.prepareStatement("insert into mall_info values(?,?,?)");
			pst.setInt(1, 1);
			pst.setString(2, "RMZ");
			pst.setString(3, "Yelahanka");
		    pst.addBatch();
			pst.setInt(1, 2);
			pst.setString(2, "Mall of Asia");
			pst.setString(3, "Yelahanka");
			pst.addBatch();
			pst.setInt(1, 3);
			pst.setString(2, "Orion Uptown");
			pst.setString(3, "Katamnallur");
			pst.addBatch();
			pst.setInt(1, 4);
			pst.setString(2, "Mantri Square");
			pst.setString(3, "Malleshwaram");
			pst.addBatch();
			
			pst.setInt(1, 5);
			pst.setString(2, "Gopalan");
			pst.setString(3, "Benniganahalli");
			pst.addBatch();
			pst.setInt(1, 6);
			pst.setString(2, "Lulu");
			pst.setString(3, "Sujatha");
			pst.addBatch();
			pst.setInt(1, 7);
			pst.setString(2, "GT");
			pst.setString(3, "Magadi");
			pst.addBatch();
			pst.setInt(1, 8);
			pst.setString(2, "Elements");
			pst.setString(3, "Nagvara");
			pst.addBatch();
			pst.setInt(1, 9);
			pst.setString(2, "Nexus");
			pst.setString(3, "Kormangala");
			pst.addBatch();
			
			pst.setInt(1, 10);
			pst.setString(2, "Centro");
			pst.setString(3, "Varthur");
			pst.addBatch();
			pst.setInt(1, 11);
			pst.setString(2, "Esteem");
			pst.setString(3, "Hebbal");
			pst.addBatch();
			pst.setInt(1, 12);
			pst.setString(2, "Vaishnavi Sapphire");
			pst.setString(3, "Yeshwantpur");
			
			pst.addBatch();
			pst.setInt(1, 13);
			pst.setString(2, "Ecity");
			pst.setString(3, "Electronic city");
			pst.addBatch();
			pst.setInt(1, 14);
			pst.setString(2, "Centrum");
			pst.setString(3, "Hubli");
			pst.addBatch();
			pst.setInt(1, 15);
			pst.setString(2, "Stellar");
			pst.setString(3, "Hubli");
			pst.addBatch();
			
			
			
			int[] count=pst.executeBatch();
			
			
			
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
