import com.ibm.stock.Broker; 
import com.ibm.stock.Exchange;
import com.ibm.stock.Holder;
//import com.ibm.stock.Stock; //used when stock ibm is used
import com.ibm.stock.StockSingleton;

public class TestStock {
	public static void main(String[] args) {
		//Stock ibm = new Stock();
		
		//Holder h =ibm;
		Holder h =StockSingleton.getStock();
		h.view();
		
		//Broker b=ibm;
		Broker b= StockSingleton.getStock();
		b.gets();
		//b.view();
		
		//Exchange e =ibm;
		Exchange e = StockSingleton.getStock();
		//e.gets();
		e.set();
		//e.view();
		
		System.out.println(e==h);
	}
}
