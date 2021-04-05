import java.util.Scanner;

public class ScannerDemo {

	public static void main(String[] args) {
		Scanner console = new Scanner(System.in);
		
		System.out.println("Enter Name: ");
		String name =  console.next();
		
		String namePattern = "[A-Z]{1}[a-z]{3,}";//one captial and remaining small, minimum 3 mall
		System.out.println("Your name: "+(name.matches(namePattern)?"valid":"Invalid"));
	
		System.out.println("Enter Mobile No: ");
		String mobile =  console.next();
		
		String mobilePattern = "[7-9][0-9]{9}";
		System.out.println("Mobile no is "+ (mobile.matches(mobilePattern)?"valid":"invalid"));
		
		System.out.println("Enter age: ");
		String age =  console.next();
		
		String agePattern = "[0-9]{2}";
		System.out.println("Age is: "+ (age.matches(agePattern)?"valid":"invalid"));
		
		console.close();
	}
}
