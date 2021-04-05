import com.ibm.bankk.*;
public class TestAccount {

	public static void main(String[] args) {
		
		Banking s1 = AccountFactory.openSavingsAccount("Polo");
		// Banking s1 = new Savings("Polo");  after learning interfaces try this.
		
		try {
			s1.deposit(1000);
			s1.withdraw(2000);
			s1.deposit(2000);
			s1.withdraw(10000);
			s1.statement();
			
		} catch(BalanceException e) {
			e.printStackTrace(); // for debugging/troubleshoot - User: Developers
			System.out.println(e); // for system/application audit -  User: Loggers
			System.out.println(e.getMessage()); //For end users
		}
		
		
		/*s1.deposit(3000);
		s1.withdraw(2000);
		s1.deposit(4000);
		
		s1.statement();*/
			
		
		/*Account a1 = new Account ("polo", 1000);
		a1.details();
		a1.deposit(2000);
		a1.summary();
		a1.withdraw(5000);
		
		
		Savings s1 = new Savings("mona");
		s1.details();
		s1.withdraw(500);
		
		Current c1 = new Current("monal");
		c1.details();
		c1.withdraw(3000);
		c1.withdraw(7000);
		c1.summary();
		c1.deposit(2000);
		c1.deposit(4000);
		c1.summary();
		*/
		
	
	}
}
