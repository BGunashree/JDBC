package com.xworkz.cover.repository;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

import com.xworkz.cover.constants.ConnectionEnum;
import com.xworkz.cover.dto.CoverDTO;

public class CoverRepoImpl implements CoverRepo {



	@Override
	public boolean save(CoverDTO dto) {
		Connection connection = null;
		PreparedStatement prst = null;
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		}
		try {
			connection = DriverManager.getConnection(ConnectionEnum.URL.getValue(),
					ConnectionEnum.USERNAME.getValue(), ConnectionEnum.PASSWORD.getValue());

			prst = connection.prepareStatement("insert into company_table values(?,?,?,?,?,?,?)");
			prst.setInt(1, dto.getId());
			prst.setString(2, dto.getName());
			prst.setString(3, dto.getEmail());
			prst.setString(4, dto.getPassword());
			prst.setString(5, dto.getAddress());
			prst.setLong(6, dto.getPhoneNumber());
			prst.setString(7, dto.getIndustryType());

			int value = prst.executeUpdate();
			if (value > 0) {
				System.out.println("saved");
				return true;
			} else {
				System.out.println("not saved");
				return false;
			}

		} catch (SQLException e) {
			e.printStackTrace();
		}
		return false;
	}

//-------------------------------------------------
//listById
	@Override
	public String getListById(int id) {
		String valid = null;
		Connection connection = null;
		PreparedStatement prepared = null;

		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
		} catch (ClassNotFoundException e1) {
			e1.printStackTrace();
		}

		try {
			connection = DriverManager.getConnection(ConnectionEnum.URL.getValue(),
					ConnectionEnum.USERNAME.getValue(), ConnectionEnum.PASSWORD.getValue());
			prepared = connection.prepareStatement("SELECT * FROM company_table WHERE id = ?");
			prepared.setInt(1, id);
			ResultSet set = prepared.executeQuery();

			if (set.next()) {
				int id1 = set.getInt("id");
				String name = set.getString("name");
				long phoneNo = set.getLong("phone_number");
				String email = set.getString("email");
				String password = set.getString("password");
				String address = set.getString("address");
				String industry = set.getString("industry_type");

				valid = "ID: " + id1 + ", Name: " + name + ", Phone: " + phoneNo + ", Email: " + email + ", Password: "
						+ password + ", Address: " + address + ", Industry: " + industry;
			} else {
				valid = "No data found for the given ID.";
			}
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return valid;
	}

//-----------------------------------------------
//getEmailAndPassword
	@Override
	public String getEMailAndPassword(long phoneNumber) {
		
		String isvalid=null;
		Connection connection=null;
		   PreparedStatement prepared=null;
		 
		   try {
				Class.forName("com.mysql.cj.jdbc.Driver");
			} catch (ClassNotFoundException e1) {
				
				e1.printStackTrace();
			}
		   
		    try {
		    connection=DriverManager.getConnection(ConnectionEnum.URL.getValue(),ConnectionEnum.USERNAME.getValue(),ConnectionEnum.PASSWORD.getValue());
			prepared=connection.prepareStatement("select name, email from company_table where phone_number = ?");
		          
			   prepared.setLong(1, phoneNumber);
	         
		        ResultSet set = prepared.executeQuery();
		      while(set.next()) {
		    	  String name = set.getString("name");
		            String email = set.getString("email");
		            isvalid = "Name: " + name + ", Email: " + email;
		    	  
		      }
		         
		    } 
		    catch (SQLException e) {
		        e.printStackTrace();
		    }
		return isvalid;
	}

//---------------------------
//email and password match
public String  checkEmailPassword(String email, String password) {
    
    String valid =null;
    try {
		Class.forName("com.mysql.cj.jdbc.Driver");
	} catch (ClassNotFoundException e1) {
		
		e1.printStackTrace();
	}
    try {
    Connection connection = DriverManager.getConnection(ConnectionEnum.URL.getValue(),ConnectionEnum.USERNAME.getValue(),ConnectionEnum.PASSWORD.getValue());
         PreparedStatement statement = connection.prepareStatement("select * from company_table where email = ? AND password = ?"); 
        statement.setString(1, email);
        statement.setString(2, password);
        ResultSet resultSet = statement.executeQuery();
    
     
            if (resultSet.next()) {
            	valid="success";
                System.out.println("Login successful");
                
            } else {
            	
                System.out.println("Invalid email or password");
                
            }
        }
     catch (SQLException e) {
    	
        e.printStackTrace();
    }
    return valid;
}
//--------------------------------------


@Override
public String deleteByName(String name) {
    Connection connection = null;
    PreparedStatement preparedStatement = null;
    String message = null; 
    
    try {
        Class.forName("com.mysql.cj.jdbc.Driver");
    } catch (ClassNotFoundException e1) {
        e1.printStackTrace();
    }

    try {
        connection = DriverManager.getConnection(ConnectionEnum.URL.getValue(), 
        		ConnectionEnum.USERNAME.getValue(), 
        		ConnectionEnum.PASSWORD.getValue());
        preparedStatement = connection.prepareStatement("delete from company_table where name = ?");
        preparedStatement.setString(1, name);

        int delete = preparedStatement.executeUpdate();
        if (delete > 0) {
            message = "Data deleted successfully";
        } else {
            message = "No record found with the provided name"; 
        }
    } catch (SQLException e) {
        e.printStackTrace();
        message = "Error occurred while deleting data"; 
    }

    return message; 
}

//---------------------------------------------------

	
public String updateByEmail(String email) {
	String ref = null;
	try {
		Class.forName("com.mysql.cj.jdbc.Driver");
	} catch (ClassNotFoundException e) {
		e.printStackTrace();
	}
	Connection connection = null;
	try {
		connection = DriverManager.getConnection(ConnectionEnum.URL.getValue(),
				ConnectionEnum.USERNAME.getValue(), ConnectionEnum.PASSWORD.getValue());
		PreparedStatement preparedStatement = connection
				.prepareStatement("update company_table set address='Yelahanka' where email=?");
		preparedStatement.setString(1, email);
		int value = preparedStatement.executeUpdate();
		if (value > 0) {
			ref = "updated";
		} else {
			ref = "not updated ";
		}
		
	} catch (SQLException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
	return ref;
}
}



