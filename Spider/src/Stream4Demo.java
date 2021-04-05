import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.IntStream;

public class Stream4Demo {
	
	public static void process(int i) {
		
	}
	
	public static void main(String[] args) {
		List<Integer>  numbers=new ArrayList<Integer>();
		for(int n=1;n<=100;n++) 
			numbers.add(n);
		
	//	List<Integer> numbers = IntStream.range(1,1000).
		long startTime = System.currentTimeMillis();
		numbers.stream().forEach(Stream4Demo::process);
		long endTime = System.currentTimeMillis();
		System.out.println("Time taken by Sequential stream:" + (endTime - startTime));
	
		System.out.println("===========parallel output==========");
		
		startTime = System.currentTimeMillis();
		numbers.parallelStream().forEach(Stream4Demo::process);
		endTime = System.currentTimeMillis();
		System.out.println("Time taken by Parallel stream:" + (endTime - startTime));
	
	}
}
