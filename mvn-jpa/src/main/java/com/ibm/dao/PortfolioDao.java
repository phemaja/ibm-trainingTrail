package com.ibm.dao;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

import com.ibm.entity.Portfolio;
import com.ibm.entity.Share;

public class PortfolioDao {
	private EntityManagerFactory factory;
	public PortfolioDao() {
		factory=Persistence.createEntityManagerFactory("MyJPA");
	}
	public int addPortfolio(int pid) {
		EntityManager em=factory.createEntityManager();
		EntityTransaction txn=em.getTransaction();
		txn.begin();
		
		Portfolio p=new Portfolio();
		p.setPid(pid);
		p.setHolder("polo");
		
		Share s=new Share();
		s.setStock("IBM");
		s.setQuantity(100);
		s.setQuote(250);
		
		Share s1=new Share();
		s1.setStock("Amazon");
		s1.setQuantity(100);
		s1.setQuote(250);
		
		p.getShares().add(s);
		p.getShares().add(s1);
		
		em.persist(p);
		
		txn.commit();
		em.close();
		return pid;
	}
	public Portfolio getPortFolio(int pid) {
		EntityManager em=factory.createEntityManager();
		Portfolio p=em.find(Portfolio.class, pid);
		return p;
	}
}