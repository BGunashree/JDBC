package com.xworkz.movie.runner;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;


import com.xworkz.movie.dto.MovieDTO;

public class MovieRunner {

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
			MovieDTO b=new MovieDTO(5,"Slumdog Millionaire","Danny","Boyle","Dev","Freida",2008,600000,10.0,9000000);
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

