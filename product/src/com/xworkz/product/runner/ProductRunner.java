package com.xworkz.product.runner;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;


import com.xworkz.product.dto.ProductDTO;
import com.xworkz.product.enumerate.ConnectionEnum;

public class ProductRunner {

	public static void main(String[] args) {
		
		
		ProductDTO productDto1=new ProductDTO(1,"Gunashree","gunashreebayanna@gmail.com","Vijayapura",8951144517L,"abc@123","Watch",20000,"Electronic","Armani");
		ProductDTO productDto2=new ProductDTO(2,"Divya","divya01@gmail.com","Hoskote",8953344517L,"cde@123","Sofa",100000,"Furniture","Ikea");
		ProductDTO productDto3=new ProductDTO(3,"Supritha","sonusupritha@gmail.com","Sahakarnagar",9951144977L,"efg@123","Dining Table",50000,"Furniture","Ikea");
		ProductDTO productDto4=new ProductDTO(4,"Prathi","preethimanjunath@gmail.com","Chikballapura",8760112399L,"ghi@123","Grinder",2000,"Electronic","Greenchef");
		ProductDTO productDto5=new ProductDTO(5,"Rachana","rachanam@gmail.com","Devanahalli",8904733310L,"jkl@123","Hoodie",1000,"Clothing","H&M");
		ProductDTO productDto6=new ProductDTO(6,"Likitha","plikitha@gmail.com","Hebbala",8959944517L,"lmn@123","Jean",900,"Clothing","Only");
		ProductDTO productDto7=new ProductDTO(7,"Lasya","lasyam@gmail.com","Yelahanka",8660084035L,"opq@123","Sunscreen",800,"Essentials","Neutrogena");
		ProductDTO productDto8=new ProductDTO(8,"Akshay","akshaygowda@gmail.com","Kolar",9739611655L,"rst@123","Mobile",21000,"Electronic","Redmi");
		ProductDTO productDto9=new ProductDTO(9,"Anil","anilkumar@gmail.com","Srinivaspura",8951144679L,"uvw@123","TV",50000,"Electronic","Lg");
		ProductDTO productDto10=new ProductDTO(10,"Jeevan","jeevang@gmail.com","Kr puram",9379745434L,"xyz@123","Jacket",1200,"Clothing","Puma");
		ProductDTO[] dtos= {productDto1,productDto2,productDto3,productDto4,productDto5,productDto6,productDto7,productDto8,productDto9,productDto10};
		Connection connection=null;
		PreparedStatement pst=null;
		try {
			
			connection=DriverManager.getConnection(ConnectionEnum.URL.getValue(), ConnectionEnum.USERNAME.getValue(), ConnectionEnum.PASSWORD.getValue());
			pst=connection.prepareStatement("insert into product_table values(?,?,?,?,?,?,?,?,?,?)");
			for(ProductDTO dto:dtos)
			{
				pst.setInt(1,dto.getId() );
				pst.setString(2, dto.getName());
				pst.setString(3, dto.getEmail());
				pst.setString(4, dto.getAddress());
				pst.setLong(5,dto.getPhoneNumber());
				pst.setString(6, dto.getPassword());
				pst.setString(7, dto.getProductName());
				pst.setInt(8, dto.getPrice());
				pst.setString(9, dto.getCategory());
				pst.setString(10, dto.getSupplier());
				pst.addBatch();
			}
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
