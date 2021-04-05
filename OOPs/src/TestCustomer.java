import com.ibm.cust.*;

public class TestCustomer {
	public static void main(String[] args) {
		Customer c1 = new Customer("polo", 9000);
		c1.details();
		
		LoyalCustomer lc = new LoyalCustomer("poli",9000,3000);
		lc.details();
		
		
	}
}
