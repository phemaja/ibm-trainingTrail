
public class StringDemo {

	public static void main(String[] args) {
		String s1 = "Hello";
		String s2 = new String("Hello");
		String s3 = "Hello";
		
		System.out.println(s1);
		
		System.out.println(s1==s2);
		System.out.println(s1==s3);
		
		s1 = s1 + " World"; 
		//everyone a string is manipulated a new memory is allocated to new string
		System.out.println(s1);
		System.out.println(s1.length());
		
		System.out.println(s1.indexOf('o'));
		System.out.println(s1.lastIndexOf('o'));
		System.out.println(s1.charAt(5));
		
		System.out.println(s1.substring(3));
		System.out.println(s1.substring(3,7));
		
		System.out.println(s1.replace('o', 'a'));
		System.out.println(s1);
		//no change in the original string i.e each string method returns a new string with changes made to the original string.
	
		String week = "Sun-Mon-Tue-Wed-Thu-Fri-Sat";
		System.out.println(week);
		
		String[] days = week.split("-");
		for (String day : days) {
			System.out.println(day);
		}
	}

}
