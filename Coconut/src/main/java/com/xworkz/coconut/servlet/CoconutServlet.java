package com.xworkz.coconut.servlet;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.xworkz.coconut.dto.CoconutDTO;
import com.xworkz.coconut.service.CoconutService;
import com.xworkz.coconut.service.CoconutServiceImpl;

@WebServlet(loadOnStartup=1,urlPatterns="/send")
public class CoconutServlet extends HttpServlet{
	
	
	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		
		
		String name=req.getParameter("uname");
		String email=req.getParameter("email");
		String age=req.getParameter("age");
		String phone=req.getParameter("phn");
		String address=req.getParameter("address");
		String gender=req.getParameter("gender");
		int cage=Integer.parseInt(age);
		CoconutDTO coconutDTO=new CoconutDTO(name,email,cage,phone,address,gender);
		CoconutService csr=new CoconutServiceImpl();
		if(csr.validation(coconutDTO))
		{
			System.out.println("inserted");
		}
		else
		{
			System.out.println("not inserted");
		}
		
		
		
		
	}

}
