import java.util.Comparator;
import java.util.TreeSet;

public class SortedPerson {
	public static void main(String[] args) {
//		PersonAgeComparator pac = new PersonAgeComparator();
//		
		//Comparator<Person> pnc =(p1,p2) -> p1.getName()- p2.getName(); //not possible so to compare them we do next step
		Comparator<Person> pnc =(p1,p2) -> p2.getName().compareTo(p1.getName());
		TreeSet<Person> persons = new TreeSet<Person>(pnc);
		persons.add(new Person("Polo", 21));
		persons.add(new Person("Lili", 19));
		persons.add(new Person("Mili", 17));
		
		for(Person p : persons) 
			System.out.println(p);
		 
	}
}

class PersonAgeComparator implements Comparator<Person>{

	@Override
	public int compare(Person p1, Person p2) {
		return p1.getAge()-p2.getAge();
	}	
}