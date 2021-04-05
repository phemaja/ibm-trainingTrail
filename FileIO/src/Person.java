import java.io.Serializable;

public class Person implements Serializable {
	private static final long serialVersionUID =1L;
	
	private String name;
	private transient int age;	//transient are non serializable
	
	public Person() {
		this("Anonymous",-1);
	}
	
	public void print() {
		System.out.println("Name: " + name +"\tAge :" +age);
	}
	
	public Person(String name, int age) {
		super();
		this.name = name;
		this.age = age;
	}
	
	@Override
	public String toString() {
		return "Name: " + name +"\tAge :" +age;
	}

	@Override
	public boolean equals(Object obj) {
		if(obj instanceof Person) {
			Person p = (Person) obj;
			if(p.name.equals(this.name) && p.age == this.age)
				return true;
		}
		return false;
	}
	
	

	@Override
	protected void finalize() throws Throwable {
		System.out.println("Person is no more!");
	}

	public static void main(String[] args) {
		
		Person p = null;
		
		for(int c=1;c<=5;c++)
			p= new Person();
		
		System.gc();
		
		/*Person p1 = new Person("Polo", 21);

		System.out.println(p1.hashCode());
		System.out.println(p1.hashCode());
		
		Person p2 = new Person("Polo", 201);
		System.out.println(p1.equals(p2));
		*/
	}
}
