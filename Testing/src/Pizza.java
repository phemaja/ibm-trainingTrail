
public class Pizza {
	
	public double cost=0 ;
	
	public double order(String size, int toppings) throws PizzaException {
		
		if(toppings>2 && toppings<6) {
			if(size=="s") {
				cost = 100 +50*toppings;
			//	System.out.println("small pizza with "+ toppings + "toppings costs" + cost );
				return cost;
			} else if(size=="m") {
				
				cost = 200 +50*toppings;
				//System.out.println("medium pizza with "+ toppings + "toppings costs" + cost);
				return cost;
			}
			else if(size=="l")
			{
				cost = 300 +50*toppings;
				//System.out.println("large pizza with "+ toppings + "toppings costs" + cost );
				return cost;
			} 
		}
		throw new PizzaException("No of toppings are invalid"); 	
	}
}
