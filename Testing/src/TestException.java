/*import static org.junit.Assert.assertThrows;
import static org.junit.jupiter.api.Assertions.assertThrows;

import org.junit.jupiter.api.Test;

public class TestException {

	@Test
	public void division() {
		assertThrows(ArithmeticExpression.class, () -> {int x=10 / 0};
	}
	
	@Test
	public void parseNumber() {
		assertThrows(NumberFormatException.class, () -> Integer.parseInt("tEN"));
	}
}
*/
import static org.junit.jupiter.api.Assertions.assertThrows;

import org.junit.jupiter.api.Test;

public class TestException {
	@Test
	public void division() {
		assertThrows(ArithmeticException.class,()->{int x=10/0;});
	}
	
	@Test
	public void PareseNumber() {
		assertThrows(NumberFormatException.class,()->Integer.parseInt("Ten"));
	}

}