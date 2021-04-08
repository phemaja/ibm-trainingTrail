package com.ibm.test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotNull;

import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;

import com.ibm.dao.PortfolioDao;
import com.ibm.entity.Portfolio;



public class TestPortFolio {
	public static PortfolioDao dao;
	@BeforeAll
	public static void setup() {
		dao =new PortfolioDao();
	}
	
	@Test
	public void testAddPort() {
		Portfolio p=new Portfolio();
		p.setHolder("IBM");
		assertEquals(11, dao.addPortfolio(11));
		System.out.println(p);
	}
	@Test
	public void testFindPort() {
		Portfolio p1 = dao.getPortFolio(11);
		assertNotNull(p1);
		System.out.println(p1);
		System.out.println(p1.getPid());
	}
}
