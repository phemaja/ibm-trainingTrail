package com.ibm.test;

import static org.junit.jupiter.api.Assertions.assertNotNull;

import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;

import com.ibm.dao.CitizenDao;
import com.ibm.entity.Citizen;

public class TestCitizen {
	private static CitizenDao dao;
	
	@BeforeAll
	public static void setup() {
		dao= new CitizenDao();
	}
	
	@Test
	public void testAdd() {
		Citizen c = new Citizen();
		c.setName("hemaja");
		Citizen cp = dao.addCitizen(c);
		assertNotNull(cp);
		System.out.println(cp);
	}
}
