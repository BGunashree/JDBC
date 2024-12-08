package com.xworkz.vehicle.runner;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;
import javax.persistence.Query;

import com.xworkz.vehicle.entity.VehicleEntity;



public class GetAllRunner {

	public static void main(String[] args) {
		
		EntityManagerFactory emf=Persistence.createEntityManagerFactory("com.xworkz");
		EntityManager entityManager=emf.createEntityManager();
		EntityTransaction et=entityManager.getTransaction();
		Query query=entityManager.createNamedQuery("findAll");
		List<VehicleEntity> list=query.getResultList();
		for(VehicleEntity ve:list)
		   System.out.println(ve.toString());
		try
		{
			et.begin();
			et.commit();
		}
		catch(Exception e)
		{
			e.getMessage();
		}
		finally {
			emf.close();
			entityManager.close();
		}

	}

}
