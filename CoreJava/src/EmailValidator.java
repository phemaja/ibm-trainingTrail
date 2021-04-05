
public class EmailValidator {
	
	//Rules to validate email
	// 1. there should be only 1 occurrence of @ and .
	// 2. min 4 chars before @
	// 3. min 3 chars between @ and .
	// 4. min 2 chars after
	public static void main(String[] args) {
		String email = "phemaja@gmail.com";
		/*String[] divide = email.split("@");
		if(divide[0].length()>4) {
			String[] divi = divide[1].split(".");
			if(divi[0].length()>3 && divi[1].length()>2) {
				System.out.println("valid email");
			}
		}
		else {
			System.out.println("invalid");
		}*/
		
		int i = email.indexOf('@');
		int j = email.indexOf('.');
		if( i == email.lastIndexOf('@')&& j== email.lastIndexOf('.') && i>3 && j>i+3 && email.length()>j+2)
	
			System.out.println("valid");
		else
			System.out.println("invalid");
	}
}
