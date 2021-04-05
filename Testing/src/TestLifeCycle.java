import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

import java.util.ArrayList;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
//import org.junit.jupiter.api.Disabled;

public class TestLifeCycle {
	private ArrayList<String> basket;
	@BeforeAll
	public static void setup() {
		System.out.println("Before all test cases");
	}
	
	@AfterAll
	public static void teardown() {
		System.out.println("After all test cases");
	}
	
	@BeforeEach
	public void setupEach() {
		basket = new ArrayList<String>();
		System.out.println("Before each test cases");
	}
	
	@AfterEach
	public void teardownEacg() {
		basket =null;
		System.out.println("After each test cases");
	}
	
	@Test
	public void testEmptyBasket() {
		System.out.println("Testing empty basket");
		assertTrue(basket.isEmpty());
	}
	
	@Test
	 
	public void testOneItem() {
		basket.add("Apple");
		System.out.println("Testing basket with 1 item");
		assertEquals(1, basket.size());
	}
}
