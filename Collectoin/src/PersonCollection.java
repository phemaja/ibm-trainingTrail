import java.util.Hashtable;
import java.util.Vector;

public class PersonCollection {

	public static void main(String[] args) {
		Vector<Person> persons = new Vector<Person>();
		persons.add(new Person("Polo", 21));
		persons.add(new Person("Lili", 19));
		persons.add(new Person("Mili", 17));
		
		for(Person p : persons)
			System.out.println(p);
		
		Hashtable<Integer, Person> people = new Hashtable<Integer, Person>();
		people.put(1,  new Person("Polo", 21));
		people.put(2,  new Person("Lili", 19)); 
		people.put(3,  new Person("Mili", 20));
		
		for(int k = 0; k<=3;k++) {
			System.out.println(people.get(k));
		}
	}

}
