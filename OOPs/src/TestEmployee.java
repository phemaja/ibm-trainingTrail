import com.ibm.emp.*;

public class TestEmployee {

	public static void main(String[] args) {
		
		/* 
		 * 
		 * Employee e1 = new Employee("polo", 5000);
		e1.payslip();
		System.out.println(e1.getSalary());
		
		Manager mgr = new Manager("poli", 9000, 3000);
		mgr.payslip();
		System.out.println(mgr.getSalary());
		
		Executive exec = new Executive("moli", 7000, 3000);
		exec.payslip();
		System.out.println(exec.getSalary());
		*/
		
		Manager mgr = new Manager("mili", 9000, 3000);
		Executive exec =new Executive("polo",7000,2000);
		
		showSalary(mgr);
		showSalary(exec);		
	}

	//polymorphic method
	private static void showSalary(Employee emp) { 
		if(emp instanceof Manager)  //runtime type identification
			System.out.println("Manager salary: "+emp.getSalary());
		else
			System.out.println("Executive salary: "+emp.getSalary());
		
		}
	/*
	 * 
	 * private static void showSalary(Executive exec) {
	 
		System.out.println("Exeecutive salary: "+exec.getSalary());
	}

	private static void showSalary(Manager mgr) {
		System.out.println("Manager salary: "+ mgr.getSalary());	
	}*/
	
}
