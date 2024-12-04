package com.xworkz.college.runner;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;
import javax.persistence.Query;

import com.xworkz.college.dto.CollegeDTO;

public class QueryRunner {

	public static void main(String[] args) {
		
		EntityManagerFactory emf=Persistence.createEntityManagerFactory("com.xworkz");
		EntityManager entityManager=emf.createEntityManager();
		EntityTransaction et=entityManager.getTransaction();
		/*Query query=entityManager.createNamedQuery("findByName");
		Object object=query.getSingleResult();
		CollegeDTO dto=(CollegeDTO)object;
		System.out.println(dto.toString());*/
		Query[] query=new Query[7];
		query[0]=entityManager.createNamedQuery("findByName");
		query[1]=entityManager.createNamedQuery("findByEmail");
		query[2]=entityManager.createNamedQuery("findByAddress");
		query[3]=entityManager.createNamedQuery("findByPhone");
		query[4]=entityManager.createNamedQuery("findByNameAndPhone");
		query[5]=entityManager.createNamedQuery("findByNameAndEmail");
		query[6]=entityManager.createNamedQuery("findByPhoneAndEmail");
		for(Query q:query)
		{
			Object obj=q.getSingleResult();
			CollegeDTO dto=(CollegeDTO)obj;
			System.out.println(dto.toString());
		}
		try {
			et.begin();
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
