package com.xworkz.xworkzAdminDetails.repository;


import com.xworkz.xworkzAdminDetails.entity.AdminDetailsEntity;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;


@Repository
public class AdminDetailsRepositoryImpl implements  AdminDetailsRepository{

    @Autowired
    EntityManagerFactory emf;

    @Override
    public boolean save(AdminDetailsEntity adminDetailsEntity)
    {
        System.out.println("data in repoImpl:"+adminDetailsEntity.toString());
        EntityManager em=emf.createEntityManager();
        EntityTransaction et=em.getTransaction();
        try{
            et.begin();
            em.persist(adminDetailsEntity);
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
}
