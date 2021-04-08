/*package com.ibm.test;

import static org.junit.jupiter.api.Assertions.assertNotNull;

import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;

import com.ibm.dao.MovieDao;
import com.ibm.entity.Movie;
import com.ibm.entity.Multiplex;


public class TestMovie {

private static MovieDao dao;
	
	@BeforeAll
	public static void setup() {
		dao= new MovieDao();
	}
	
	@Test
	public void testAddMovie() {
		Movie m = new Movie();
		m.setTitle("3 Idiots");
		m.setRating(4.5);
		int am = dao.addMovie(m);
		assertNotNull(am);
	}
	
	
	@Test
	public void testAddMultiplex() {
		Multiplex m = new Multiplex();
		m.setCity("Hyderabad");
		m.setName("Inox");
		int am = dao.addMultiplex(m);
		assertNotNull(am);
	}
	
	@Test
	public void testAddMovieToMultiplex() {
		
	}
	
	@Test
	public void testFindMovie() {
		
	}
	
	@Test
	public void testFindMultiplex() {
		
	}
	
	
}
*/

package com.ibm.test;

import static org.junit.jupiter.api.Assertions.assertNotEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;

import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;

import com.ibm.dao.MovieDao;
import com.ibm.entity.Movie;
import com.ibm.entity.Multiplex;

public class TestMovie {
	private static MovieDao dao;
	
	@BeforeAll
	public static void init() {
		dao=new MovieDao();
	}
	@Test
	public void testAddMovie() {
		Movie m=new Movie();
		m.setTitle("3 idiots");
		m.setRating(4.0);
		//int mid=dao.addMovie(m);
		assertNotEquals(0, dao.addMovie(m));
		//System.out.print(mid);
		
	}
	
	@Test
	public void testAddMultiplex() {
		Multiplex m=new Multiplex();
		m.setName("INOX");
		m.setCity("Vizag");
		int mid=dao.addMultiplex(m);
		System.out.print(mid);
	}
	
	@Test
	public void testMovieToMultiplex() {
		assertTrue(dao.addMovieToMultiplex(101, 1001));
	}
	
	@Test
	public void findMovie() {
		Movie m=dao.findMovie(101);
		//assertNotNull(m);
		System.out.println(m);
		System.out.println(m.getMovie());
	}
	
	@Test
	public void findMultiplex() {
		Multiplex m=dao.findMultiplex(1001);
		System.out.println(m);
	}
	
}
