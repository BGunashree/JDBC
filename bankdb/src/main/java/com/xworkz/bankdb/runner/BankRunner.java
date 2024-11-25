package com.xworkz.bankdb.runner;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

import com.xworkz.bankdb.dto.BankDTO;

public class BankRunner {

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
			BankDTO b=new BankDTO(5,"Rachana","Female","Canara","rachana@gmail.com","Vijayapur",9836721010L,5000,"Savings","Devanahalli");
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
