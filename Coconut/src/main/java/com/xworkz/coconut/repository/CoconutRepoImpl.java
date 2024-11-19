package com.xworkz.coconut.repository;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;

import com.xworkz.coconut.constants.ConnectionEnum;
import com.xworkz.coconut.dto.CoconutDTO;


public class CoconutRepoImpl implements CoconutRepo{

	@Override
	public boolean save(CoconutDTO coconutDTO) {
		
		
		Connection connection=null;
		PreparedStatement pst=null;
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
		} catch (ClassNotFoundException e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
		}
		try {
			
			connection=DriverManager.getConnection(ConnectionEnum.URL.getValue(), ConnectionEnum.USERNAME.getValue(), ConnectionEnum.PASSWORD.getValue());
		
			pst=connection.prepareStatement("insert into user_info values(?,?,?,?,?,?)");
			pst.setString(1, coconutDTO.getName());
			pst.setString(2, coconutDTO.getEmail());
			pst.setInt(3, coconutDTO.getAge());
			pst.setString(4, coconutDTO.getPhone());
			pst.setString(5, coconutDTO.getAddress());
			pst.setString(6, coconutDTO.getGender());
			int value=pst.executeUpdate();
			if(value==1)
			{
				System.out.println("saved");
				return true;
			}
			else
			{
				System.out.println("not saved");
				return false;
			}
			
			
		}

		catch(Exception e)
		{
			e.printStackTrace();
		}
		return false;
	}

}
