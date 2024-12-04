package com.xworkz.college.runner;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

import com.xworkz.college.dto.CollegeDTO;


public class CollegeRunner {

	public static void main(String[] args) {
		
		EntityManagerFactory emf=Persistence.createEntityManagerFactory("com.xworkz");
		if(emf!=null)
		{
			System.out.println("connected");
		}
		else
		{
			System.out.println("not connected");
		}
		EntityManager entityManager=emf.createEntityManager();
		EntityTransaction et=entityManager.getTransaction();
		try
		{
			et.begin();
			
		  List<CollegeDTO> list=entityManager.createQuery("select gd from CollegeDTO gd",CollegeDTO.class).getResultList();
		  System.out.println(list.size());
			
		  for(CollegeDTO dto:list)
		  {
			 
			  System.out.println(dto);
		  }
		  
		
		  int value = entityManager.createQuery(
			        "update CollegeDTO cd set cd.name=:name, cd.email=:email where cd.phone=:phone").setParameter("name","Lavi").setParameter("email","lavi@gmail.com").setParameter("phone",9876543210L).executeUpdate();
			 
		  
          if(value>0)
          {
        	  System.out.println("updated");
          }
          else
          {
        	  System.out.println("not updated");
          }
		  
          //CollegeDTO dto=new CollegeDTO();

		 
		  
			List<String> emails = entityManager.createQuery(
			        "select cd.email from CollegeDTO cd where cd.name like :pat1 or cd.name like :pat2", 
			        String.class)
			        .setParameter("pat1", "S%")
			        .setParameter("pat2", "N%")
			        .getResultList();

			for (String email : emails) {
			    System.out.println(email);
			}

		  
			et.commit();
		  
	
		}
		catch(Exception e)
		{
			e.getMessage();
		}
		finally
		{
			emf.close();
			entityManager.close();
		}

	}

}
