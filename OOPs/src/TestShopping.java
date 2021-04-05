import com.ibm.shop.*;

public class TestShopping {

	public static void main(String[] args) throws OutOfTheStockException, PaymentException, CouponException {
		ShoppingCart cart = new ShoppingCart();
		Product p1 = new Product("iphone 12 mini", 66000);
		
		cart.addProdcut(p1);
		cart.addProdcut(new Product("Apple watch se", 29000));
		cart.addProdcut(new Product("Apple airpods2", 12500));
		cart.addProdcut(new Product("Apple Macbook pro 13", 125000));
		cart.addProdcut(new Product("Apple earphones", 29000));
		cart.addProdcut(new Product("Nothing", 0));
	//	cart.checkout();
		cart.checkout("HOLI200");
		cart.checkout("APRIL150");
	}
}
