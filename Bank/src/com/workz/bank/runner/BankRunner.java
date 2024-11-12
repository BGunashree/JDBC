package com.workz.bank.runner;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class BankRunner {



		public static void main(String[] args) {

			String url = "jdbc:mysql://localhost:3306/bank";
			String userName = "root";
			String password = "Xworkzodc@123";
			/*String query0 = "insert into bank_table values(1,'Gunashree','gunashreebayanna@gmail.com','Bangalore',9380916659,'Gunashree','Canara',50000,1122334455,true,'Savings Account','F','abcd1234'),"
			+"(2, 'Akshay', 'Akshay@gmail.com', 'Mumbai', 9876543210, 'Akshay', 'HDFC', 75000, 2233445566, true, 'Current Account', 'M','efgh4567'),"
			+"(3, 'Lavanya', 'lavanya@gmail.com', 'Chennai', 8765432109, 'Lavanya', 'ICICI', 62000, 3344556677, true, 'Savings Account', 'F','ghij6789'),"
			+"(4, 'Anil', 'anil@gmail.com', 'Delhi', 7654321098, 'Anil', 'Axis Bank', 90000, 4455667788, true, 'Fixed Deposit', 'M','jklm1234'),"
			+"(5, 'Sneha', 'snehamishra@gmail.com', 'Kolkata', 6543210987, 'Sneha', 'PNB', 45000, 5566778899, true, 'Savings Account', 'F','mnop4567'),"
			+"(6, 'Jeevan', 'jeevan@gmail.com', 'Pune', 5432109876, 'Jeevan', 'Bank of Baroda', 58000, 6677889900, true, 'Current Account', 'M','opqr789'),"
			+"(7, 'Lakshmi', 'lakshminair@gmail.com', 'Hyderabad', 8660084035, 'Lakshmi', 'Canara Bank', 30000, 7788990011, true, 'Recurring Deposit', 'F','qrst1234'),"
			+"(8, 'Rajath', 'rajathsagar@gmail.com', 'Ahmedabad', 3210987654, 'Rajath', 'Union Bank', 55000, 8899001122, true, 'Business Account', 'M','stuv6789'),"
			+"(9, 'Soujanya', 'rsoujanya@gmail.com', 'Bangalore', 2109876543, 'Soujanya', 'IDFC First', 47000, 9900112233, true, 'Savings Account', 'F','uvw8900'),"
			+"(10, 'Kishan', 'kishangowda@gmail.com', 'Jaipur', 1098765432, 'Kishan', 'Yes Bank', 38000, 1001100110, true, 'Current Account', 'M','uwxy0987'),"
			+"(11, 'Jessica', 'jessicareddy@gmail.com', 'Lucknow', 9087654321, 'Jessica', 'Kotak Mahindra', 70000, 1102200334, true, 'Savings Account', 'F','xyz3456'),"
			+"(12, 'Mithun', 'mithuncb@gmail.com', 'Nagpur', 8976543210, 'Mithun', 'RBL Bank', 64000, 2203301445, true, 'Salary Account', 'M','qwer1234'),"
			+"(13, 'Pooja', 'poojayadav@gmail.com', 'Indore', 7865432109, 'Pooja', 'Bank of India', 71000, 3304402556, true, 'Current Account', 'F','erty4567'),"
			+"(14, 'Pavan', 'pavangowda@gmail.com', 'Surat', 6754321098, 'Pavan', 'Federal Bank', 81000, 4405503667, true, 'Savings Account', 'M','oplm7898'),"
			+"(15, 'Riya', 'riyaa@gmail.com', 'Patna', 5643210987, 'Riyaa', 'South Indian Bank', 52000, 5506604778, true, 'Fixed Deposit', 'F','ghjk6734'),"
			+"(16, 'Akash', 'akashmehta@gmail.com', 'Kanpur', 4532109876, 'Akash', 'Standard Chartered', 60000, 6607705889, true, 'Savings Account', 'M','rtyvb6724'),"
			+"(17, 'Rachana', 'rachanam@gmail.com', 'Coimbatore', 3421098765, 'Rachana', 'DBS Bank', 58000, 7708806990, true, 'Business Account', 'F','zxcv8934'),"
			+"(18, 'Aleeza', 'aleeza@gmail.com', 'Mysore', 2310987654, 'Aleeza', 'Karnataka Bank', 49000, 8809907001, true, 'Savings Account', 'M','dfgh0845'),"
			+"(19, 'Swati', 'swatiagrawal@gmail.com', 'Guwahati', 1209876543, 'Swati', 'Bank of Maharashtra', 45000, 9901100112, true, 'NRI Account', 'F','kjla3672'),"
			+"(20, 'Hema', 'hemavati@gmail.com', 'Ranchi', 1098765432, 'Hema', 'Indian Overseas Bank', 55000, 1012202334, true, 'Joint Account', 'F','xerty2447')";*/

			String query1="select * from bank_table";
			String query2 = "select name from bank_table where email='hemavati@gmail.com' and bpassword='xerty2447'";

			String query3="(select address from bank_table where name='Gunashree' and phone_number='9380916659')";
			String query4="(select email,bpassword from bank_table where phone_number='9380916659')";
			String query5="(select name from bank_table where id>10)";
			
			String[] queries= {query1,query2,query3,query4,query5};
			try {
				Connection connection=DriverManager.getConnection(url, userName, password);
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
		                        String name = resultSet.getString("name");
		                        String email = resultSet.getString("email");
		                        String phonenumber = resultSet.getString("phone_number");
		                        String address=resultSet.getString("address");
		                        String aname=resultSet.getString("account_name");
		                       
		                        String bank_name = resultSet.getString("bank_name");
		                        System.out.println("ID: " + id + ", Name: " + name + ", Email: " + email 
		                                           + ", Phone Number: " + phonenumber + ", bank_name: " + bank_name +", address:"+address + ", aname:"+ aname);
		                    } else if (query.equals(query2) || query.equals(query5)) {
		                        String name = resultSet.getString("name");
		                        System.out.println("Name: " + name);
		                    } else if (query.equals(query3)) {
		                        String address = resultSet.getString("address");
		                        System.out.println("Address: " + address);
		                    } else if (query.equals(query4)) {
		                        String email = resultSet.getString("email");
		                        String bpassword = resultSet.getString("bpassword");
		                        System.out.println("Email: " + email + ", Password: " + bpassword);
		                    }
		                    
		                    
		                    
		                }

		                System.out.println("Query executed successfully.\n");
		               
		            }
				
			
				
			}
			
			
			
			catch(SQLException e)
			{
				e.printStackTrace();
			}


		}	

	

}
