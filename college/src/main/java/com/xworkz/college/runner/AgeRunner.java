package com.xworkz.college.runner;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

import com.xworkz.college.dto.CollegeDTO;

public class AgeRunner {

	public static void main(String[] args) {
		
		EntityManagerFactory emf=Persistence.createEntityManagerFactory("com.xworkz");
		EntityManager entityManager=emf.createEntityManager();
		EntityTransaction et=entityManager.getTransaction();
		if(emf!=null)
		{
			System.out.println("connected");
		}
		
		
//		 where cd.age>15
		
		try
		{
			et.begin();
		 List<CollegeDTO> list1 = entityManager.createQuery("select cd from CollegeDTO cd where cd.age>15",CollegeDTO.class).getResultList();
		 
		 System.out.println("list "+list1.size());
		 for(CollegeDTO dto:list1)
		 {
			 System.out.println("name:"+dto.getName()+" "+"phone:"+dto.getPhone());
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
