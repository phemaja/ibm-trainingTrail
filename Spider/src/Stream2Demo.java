
import java.lang.reflect.Array;
import java.util.*;
import java.util.stream.Stream;

import javax.swing.text.StyledEditorKit.ForegroundAction;

public class Stream2Demo {
public static void main(String[] args) {
	String[] star = {"please","Cherry","Banana","Apple","Grapes","Mango","Strawberry","Papaya","Pineapple"};
	List<String> input = Arrays.asList(star);
	input.forEach(System.out::println);
	
	System.out.println("--------");
	input.stream().sorted().forEach(System.out::println);
	
	System.out.println("--------");
	input.stream().map(str ->str.toUpperCase()).forEach(System.out::println);
	
	System.out.println("--------");
	input.stream().findFirst().ifPresent(System.out::println);
	
	System.out.println("--------");
	input.stream().filter(str->str.startsWith("P")).forEach(System.out::println);
	
	System.out.println("--------");
	input.stream().filter(str->str.startsWith("ple")).forEach(System.out::println);
	
	System.out.println("--------");
	Stream.of("Anna","Sean","James","Bret").sorted().forEach(System.out::println);
	
	System.out.println("--------");
	System.out.println(Arrays.stream(star).map(s ->s.contains("p")).count());
	int c = (int) Arrays.stream(star).map(s ->s.contains("A")).count();
	System.out.println(c);
}
}
