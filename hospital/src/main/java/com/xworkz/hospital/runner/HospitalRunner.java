package com.xworkz.hospital.runner;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;


import com.xworkz.hospital.dto.HospitalDTO;

public class HospitalRunner {

	public static void main(String[] args) {
		
		EntityManagerFactory emf=Persistence.createEntityManagerFactory("TestPersistence");
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
			HospitalDTO b=new HospitalDTO(5,"Fortis","Bhannerghatta",9812486600L,"fortis@gmail.com",5,200,500,"Shivindar",1990);
			entityManager.persist(b);
			et.commit();
		}
		catch(Exception e)
		{
			e.getMessage();
		}
		finally
		{
			entityManager.close();
		}
		

	}

}


