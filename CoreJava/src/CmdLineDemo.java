
public class CmdLineDemo {
	
	
	// for this argument values are given in run configurations
	public static void main(String[] args) {
		//for(String arg : args) {
			//System.out.println(arg);
		//}
		int sum = 0;
		for (String num : args)
			sum += Integer.parseInt(num);
		
		System.out.println("Sum: "+ sum);
		
		int x =10;
		Integer xo = x; // Boxing
		Integer xc = 50;
		
		int total = x+xo+xc;	//unboxing
		System.out.println(total);
	}

}
