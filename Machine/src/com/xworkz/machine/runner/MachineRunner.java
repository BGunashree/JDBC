package com.xworkz.machine.runner;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class MachineRunner {

	public static void main(String[] args) {
		
		
		String url="jdbc:mysql://localhost:3306/employee";
		String userName="root";
		String password="Xworkzodc@123";
		Connection connection=null;
	/*	String query0="insert into employee_details(id, ename, email, address, phonenumber, epassword, age, income, height, experience, accnt_balance, rating) VALUES "
				+" (1, 'Gunashree', 'gunashreebayanna@gmail.com', 'Vijayapura', 9876543210, 'abcd1234', 30, 45000.50, 5.9, 5, 100000, 4.5),"
				+  "(2, 'Divya', 'divyagowda@gmail.com', 'Hoskote', 9876543211, 'efgh5678', 28, 55000.75, 5.5, 3, 150000, 4.2),"
				+ "(3, 'Akshay', 'akshaygowda1997@gmail.com', 'Srinivaspura', 9876543212, 'ijkl9012', 35, 60000.00, 5.7, 7, 200000, 4.8),"
				+ "(4, 'Anil', 'anillumar@gmail.com', 'Sulibele', 9876543213, 'mnop3456', 40, 75000.25, 6.0, 10, 250000, 4.6),"
				+ "(5, 'Harshitha', 'Harshitha@gmail.com', 'Varthur', 9876543214, 'qrst6789', 29, 53000.10, 5.4, 4, 180000, 4.3),"
				+ "(6, 'Likitha', 'Likitha@gmail.com', 'Chikballapura', 9876543215, 'uvwx0123', 32, 65000.30, 5.8, 6, 300000, 4.7),"
				+ "(7, 'Megha', 'meghashree@gmail.com', 'Shidlagatta', 9876543216, 'yzab4567', 27, 58000.45, 5.6, 3, 220000, 4.4),"
				+ "(8, 'Jeevan', 'jeevan266@gmail.com', 'Sahakarnagar', 9876543217, 'cdef7890', 38, 67000.60, 6.1, 8, 400000, 4.9),"
				+ "(9, 'Mohak', 'mohak@gmail.com', 'Kr puram', 9876543218, 'ghij23455', 31, 49000.25, 5.3, 5, 170000, 4.1),"
				+ "(10, 'Vimala', 'vimalarajath2gmail.com', 'Kolar', 9876543219, 'klmn6789', 36, 70000.80, 6.2, 9, 350000, 4.8),"
				+ "(11, 'Soujanya', 'soujanyasony2gmail.com', 'Chintamani', 9876543220, 'opqr1234', 34, 52000.50, 5.5, 6, 210000, 4.6),"
				+ "(12, 'Lavanya', 'rlavanya@gmail.com', 'HSR layout', 9876543221, 'stuv5678', 33, 61000.40, 5.9, 6, 280000, 4.5),"
				+ "(13, 'Jessica', 'jessicareddy@gmail.com', 'Banashankari', 9876543222, 'wxyz8901', 26, 56000.00, 5.6, 3, 240000, 4.3),"
				+ "(14, 'Jaya', 'jayap@gmail.com', 'Yelahanka', 9876543223, 'abcd2345', 29, 53000.90, 6.0, 4, 160000, 4.4),"
				+ "(15, 'Darshan', 'darshanmanjunath@gmail.com', 'Devanahalli', 9876543224, 'efgh6789', 39, 68000.25, 5.7, 9, 420000, 4.7),"
				+ "(16, 'Mithun', 'mithungowda@gmail.com', 'Baglur', 9876543225, 'ijkl0123', 41, 72000.50, 5.8, 10, 370000, 4.9),"
				+ "(17, 'Pavan', 'pavancb@gmail.com', 'Mallehswaram', 9876543226, 'mnop4567', 25, 49000.70, 5.5, 2, 130000, 4.2),"
				+ "(18, 'Adhvik', 'adhvikp@gmail.com', 'Kormangala', 9876543227, 'qrst8901', 37, 66000.00, 6.1, 8, 330000, 4.6),"
				+ "(19, 'Riya', 'riya56@gmail.com', 'Kudla', 9876543228, 'uvwx2345', 32, 59000.50, 5.9, 5, 270000, 4.5),"
				+ "(20, 'Rachana', 'rachana24@gmail.com', 'Haveri', 9876543229, 'yzab6789', 42, 74000.75, 6.0, 12, 450000, 5.0)";*/
		String query1="select * from employee_details";
		String query2="(select ename from employee_details where email='gunashreebayanna@gmail.com' and epassword='abcd1234')";
		String query3="(select address from employee_details where ename='Gunashree' and phonenumber='9876543210')";
		String query4="(select email,epassword from employee_details where phonenumber='9876543210')";
		String query5="(select ename from employee_details where id>10)";
		
		String[] queries= {query1,query2,query3,query4,query5};
		try {
			connection=DriverManager.getConnection(url, userName, password);
			Statement statement=connection.createStatement();
			/*int value=statement.executeUpdate(query0);
			if(value>0)
			{
				System.out.println("saved");
			}
			else
			{
				System.out.println("not saved");
			}*/
			 for (String query : queries) {
	                System.out.println("Executing query: " + query);

	               
	                ResultSet resultSet = statement.executeQuery(query);

	           
	                while (resultSet.next()) {
	                   
	                    if (query.equals(query1)) {
	                        
	                        int id = resultSet.getInt("id");
	                        String ename = resultSet.getString("ename");
	                        String email = resultSet.getString("email");
	                        String address = resultSet.getString("address");
	                        String epassword = resultSet.getString("epassword");
	                        String phonenumber = resultSet.getString("phonenumber");
	                        double salary = resultSet.getDouble("income");
	                        int age = resultSet.getInt("age");
	                        int exp = resultSet.getInt("experience");
	                        System.out.println("ID: " + id + ", Name: " + ename + ", Email: " + email 
	                                           + ", Phone Number: " + phonenumber + ", Salary: " + salary + ", address: " + address + ", epassword: " + epassword + ", age: " + age + ", exp: " + exp);
	                    } else if (query.equals(query2) || query.equals(query5)) {
	                        String ename = resultSet.getString("ename");
	                        System.out.println("Name: " + ename);
	                    } else if (query.equals(query3)) {
	                        String address = resultSet.getString("address");
	                        System.out.println("Address: " + address);
	                    } else if (query.equals(query4)) {
	                        String email = resultSet.getString("email");
	                        String epassword = resultSet.getString("epassword");
	                        System.out.println("Email: " + email + ", Password: " + epassword);
	                    }
	                }

	                System.out.println("Query executed successfully.\n");
	                resultSet.close(); 
	            }
			
			
			
		}
		catch(SQLException e)
		{
			e.printStackTrace();
		}

	}
}
	
	
	


