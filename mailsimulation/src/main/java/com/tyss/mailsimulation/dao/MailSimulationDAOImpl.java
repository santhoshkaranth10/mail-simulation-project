package com.tyss.mailsimulation.dao;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.PersistenceUnit;
import javax.persistence.TypedQuery;

import org.springframework.stereotype.Repository;

import com.tyss.mailsimulation.dto.UserInfo;

@Repository
public class MailSimulationDAOImpl implements MailSimulationDAO
{

	@PersistenceUnit
	private EntityManagerFactory factory;
	
	@Override
	public boolean userRegistration(UserInfo userInfo) {
		EntityManager manager=factory.createEntityManager();
		EntityTransaction transection=manager.getTransaction();
		try {
			transection.begin();
			manager.persist(userInfo);
			transection.commit();
			return true;
		} catch (Exception e) {
			e.printStackTrace();
			return false;
		}
	}//end of registration() method

	@Override
	public UserInfo login(String email, String password) {
	    String jpql="from UserInfo where email=:email and password=:password";
	    EntityManager manager=factory.createEntityManager();
	    TypedQuery<UserInfo>query=manager.createQuery(jpql,UserInfo.class);
	    query.setParameter("email", email);
	    query.setParameter("password", password);
	    try {
			UserInfo info=query.getSingleResult();
			return info;
		} catch (Exception e) {
			e.printStackTrace();
			return null;
		}
	    
	}//end of login() method

	@Override
	public boolean changePassword(UserInfo info) {
		EntityManager manager=factory.createEntityManager();
		EntityTransaction transection=manager.getTransaction();
		try {
			transection.begin();
			UserInfo info1=manager.find(UserInfo.class, info.getId());
			info1.setPassword(info.getPassword());
			transection.commit();
			return true;	
		}catch (Exception e) {
			e.printStackTrace();
			return false;
		}
		
	}

}
