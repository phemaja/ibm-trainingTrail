import java.util.Arrays;
import java.util.IntSummaryStatistics;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.IntStream;
import java.util.stream.Stream;

import javax.print.attribute.IntegerSyntax;

public class StreamDemo {

	public static void print(Object obj) {
		System.out.println(obj);
	}
	
	public static void main(String[] args) {
		Integer[] ar = {9,2,5,7,9,2};
		List<Integer> numbers = Arrays.asList(ar);
		
		System.out.println("prining nos--------");
		numbers.forEach(System.out::println);
		numbers.forEach(StreamDemo::print);
		
		System.out.println("distinct nos--------");
		numbers.stream().distinct().forEach(System.out::println);
		
		System.out.println("2nd type of printing distinct nos--------");
		Stream<Integer> str1 = numbers.stream().distinct();
		str1.forEach(System.out::println);
		
		System.out.println("count--------");//terminal function: so after using it cant write code
		//System.out.println(str1.count());

		System.out.println("nos greater than 5--------");
		Stream<Integer> str2 = numbers.stream().filter(n -> n>=5);
		str2.forEach(System.out::println);
		
		System.out.println("print till 3 --------");
		numbers.stream().limit(3).forEach(System.out::println);
	
		System.out.println("sorted order--------");
		numbers.stream().distinct().sorted().forEach(System.out::println);
	
		
		
		System.out.println("sum the values in different ways--------");
		System.out.println("Sum of ArrayList Integers: "+numbers.stream()
		 .mapToInt(i -> i)
		 .sum());
		
		System.out.println(numbers.stream().reduce(0, Integer::sum));
		
		System.out.println(numbers.stream().reduce(0, (a,b)-> a+b));
		System.out.println(numbers.stream().mapToInt(Integer::intValue).sum());
		System.out.println(numbers.parallelStream().collect(Collectors.summingInt(Integer::intValue)));
		
		System.out.println("on range--------");
		System.out.println(IntStream.range(1, 99).count());
		IntStream.range(1, 10).skip(5).forEach(System.out::println);
		System.out.println(IntStream.range(1, 10).sum());
		
		System.out.println("IntSummary Statastics--------");
		IntSummaryStatistics summary = IntStream.of(7,2,19,88,73,4,10)
				.summaryStatistics();
		System.out.println(summary);
	
	}
	
		
}