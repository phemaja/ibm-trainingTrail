import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class TestSubscription {

	private Subscription s ;
	
	@BeforeEach
	public void init() {
		s= new Subscription();
	}
	
	@Test
	public void testMonthly() {
		assertEquals(100, s.monthly());
	}
	
	@Test
	public void testQuarterly() {
		assertEquals(250,s.quarterly());
	}
	
	@Test
	public void testAnnually() {
		assertEquals(500,s.annually());
	}

	
}
