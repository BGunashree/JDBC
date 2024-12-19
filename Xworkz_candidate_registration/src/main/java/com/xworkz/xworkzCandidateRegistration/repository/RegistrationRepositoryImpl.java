package com.xworkz.xworkzCandidateRegistration.repository;

import com.xworkz.xworkzCandidateRegistration.entity.RegistrationEntity;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Query;


@Repository
public class RegistrationRepositoryImpl implements  RegistrationRepository {

    @Autowired
    EntityManagerFactory emf;

    @Override
    public boolean save(RegistrationEntity registrationEntity) {
        System.out.println("data in repoImpl:"+registrationEntity.toString());
        EntityManager em=emf.createEntityManager();
        EntityTransaction et=em.getTransaction();
        try{
            et.begin();
            em.persist(registrationEntity);
            et.commit();
        }
        catch(Exception e)
        {
            if(et.isActive())
            {
                et.rollback();
            }

        }
        finally {
            em.close();
            //` emf.close();
        }

        return true;
    }

    @Override
    public String findByEmailPassword(String email, String password) {
        EntityManager em=emf.createEntityManager();
        EntityTransaction et=em.getTransaction();
        try{
            et.begin();
            Query query=em.createNamedQuery("findyByEmailAndPassword");
            query.setParameter("byEmail",email).setParameter("byPass",password);
            String name=(String)query.getSingleResult();
            et.commit();
            if(name!=null)
            {
                return name;
            }



        }
        catch(Exception e)
        {
            if(et.isActive())
            {
                et.rollback();
            }

        }
        finally {
            em.close();
            //` emf.close();
        }

        return "data not found";
    }
}
