
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class TestPizza {

private Pizza p ;
	
	@BeforeEach
	public void init() {
		p = new Pizza();
	}
	
	@Test
	public void testSmallPizza() throws  PizzaException{
		assertEquals(350, p.order("s",5));
	}
	
	@Test
	public void testsMediumPizza() throws PizzaException {
		assertEquals(400, p.order("m",4));
	}
	
	@Test
	public void testLargePizza() throws PizzaException {
		assertEquals(550, p.order("l",5));
	}

	@Test
	public void testInvalidPizza() {
		assertThrows(PizzaException.class,()-> p.order("S", 4));
	
	}
	
	@Test
	public void testInvalidToppings() {
		assertThrows(PizzaException.class,()-> p.order("s", 10));
	
	}
}
