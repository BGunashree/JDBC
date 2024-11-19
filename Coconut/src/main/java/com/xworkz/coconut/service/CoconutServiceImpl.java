package com.xworkz.coconut.service;

import com.xworkz.coconut.dto.CoconutDTO;
import com.xworkz.coconut.repository.CoconutRepoImpl;

public class CoconutServiceImpl implements CoconutService{

	@Override
	public boolean validation(CoconutDTO coconutDTO) {
		
		boolean valid=true;
		boolean saved=false;
		
		if(coconutDTO!=null)
		{
			
			String name=coconutDTO.getName();
			if(name.length()>6 && name.length()<14)
			{
				System.out.println("valid name");
			}
			else
			{
				valid=false;
				System.out.println("Invalid name");
			}
			String phone=coconutDTO.getPhone();
			if(phone.length()==10 && phone.startsWith("9"))
			{
				System.out.println("valid phone");
			}
			else
			{
				valid=false;
				System.out.println("Invalid phone");
			}
			
			int age=coconutDTO.getAge();
			if(age>5)
			{
				System.out.println("valid age");
			}
			else
			{
				valid=false;
				System.out.println("Invalid age");
			}
			
			String email=coconutDTO.getEmail();
			if( email.codePointAt(0)>65  && email.codePointAt(0)<90 && email.indexOf('@')==7 && email.endsWith("gmail.com"))
			{
				System.out.println("valid email ");
			}
			else
			{
				valid=false;
				System.out.println("invalid email");
			}
			
			
		}
		if(valid)
		{
			System.out.println("valid data");
				CoconutRepoImpl cr=new CoconutRepoImpl();
			 saved=cr.save(coconutDTO);
			 
				
				
		}
		
		return saved;
	}

}
