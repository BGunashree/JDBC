package com.xworkz.hanger.runner;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;

import com.xworkz.hanger.enumerate.ConnectionEnum;



public class InsertQuery1 {

	public static void main(String[] args) {
		
		
		
		PreparedStatement pst=null;
		try(Connection connection=DriverManager.getConnection(ConnectionEnum.URL.getValue(), ConnectionEnum.USERNAME.getValue(), ConnectionEnum.PASSWORD.getValue()))
		{
			pst=connection.prepareStatement("insert into washing_machine_details values(?,?,?,?)");
			pst.setInt(1, 1);
			pst.setString(2, "IFB");
			pst.setString(3, "Front Load");
			pst.setInt(4,48000);
			pst.setInt(1, 2);
			pst.setString(2, "LG");
			pst.setString(3, "Front Load");
			pst.setInt(4,40000);
			
			
			pst.executeUpdate();
			
			int id[]= {3,4,5,6,7,8,9,10,11,12,13,14,15};
			String name[]= {"Samsung","Panasonic","Whirlpool","Haier","Godrej","Onida","Bosch","Maytag","Hotpoint","Electrolux","Acer","Intec","Sansui"};
			String loadType[]= {"Top Load","Front Load","Top Load","Front Load","Top Load","Front Load","Top Load","Front Load","Top Load","Front Load","Top Load","Front Load","Top Load"};
			int cost[]= {30000,40000,50000,20000,30000,40000,50000,20000,30000,40000,50000,20000,30000};
			for(int i=0;i<13;i++)
			{
				pst.setInt(1, id[i]);
				pst.setString(2,name[i]);
				pst.setString(3, loadType[i]);
				pst.setInt(4, cost[i]);
				pst.addBatch();
			}
			int count[]=pst.executeBatch();
			for(int c:count)
			{
				if(c>0)
				{
					continue;
				}
				else
				{
					System.out.println("error");
				}
			}
			
					
		}
		catch(Exception e)
		{
			e.printStackTrace();
		}

	}

}