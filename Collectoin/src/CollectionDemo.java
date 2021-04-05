import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.TreeSet;

public class CollectionDemo {
	
	public static void main(String[] args) {
		ArrayList<String> list = new ArrayList<String>();
		list.add("Apple");
		list.add("Google");
		list.add("Oracle");
		list.add("Microsoft");
		list.add("IBM");
 
		System.out.println("--Travesinng over Arraylist using for.. loop");
		for(int i=0;i<list.size();i++)
			System.out.println(list.get(i));
	
		System.out.println("--Travesinng over Arraylist using for Iterator");
		Iterator<String> itr = list.iterator();
		while(itr.hasNext())
			System.out.println(itr.next());
			
		System.out.println("--Travesinng over Arraylist using for-each.. loop");
		for(String s: list)
			System.out.println(s);
		
		LinkedList<String> link = new LinkedList<String>();
		link.add("Apache");
		link.add("spark");
		link.addFirst("Oracle of linked list");
		link.addLast("Eclipse");
	
		list.addAll(link);   //merge linkedlist into arraylist
		list.remove(1);  //eg
		
		
		System.out.println("--Travesinng over Arraylist using for-each.. loop");
		for(String s: list)
			System.out.println(s);
		
		//convert arraylist into hashset
		HashSet<String> set = new HashSet<String>(list);
		System.out.println("--Travesinng over HashSet using for-each.. loop");
		for(String s: list)
			System.out.println(s);
		
		TreeSet<String> tree =  new TreeSet<String>(set);
		System.out.println("--Travesinng over TreeSet using for-each.. loop");
		for(String s: list)
			System.out.println(s);
		
	}
}
