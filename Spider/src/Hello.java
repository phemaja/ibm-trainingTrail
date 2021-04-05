
public interface Hello {
	String sayHello();
	
	//we define only one abstract method in interface
	//only default methods can be called within the interfaces with object references
	default void sayHola() {
		System.out.println("Hello Monde");
	}
	
	//static method can be called directly without object
	static void sayBonjour() {
		System.out.println("Bonjour le Monde");
	}
}

class HelloDemo{
	public static void main(String[] args) {
		Hello h = ()-> "Hello world!";
		System.out.println(h.sayHello());
		
		//seconds way of implementing it if more code exists
		Hello h2 =() ->{
			String msg = "Hello again!";
			return msg;
		};
		System.out.println(h2.sayHello());
		
		h2.sayHola();
		Hello.sayBonjour();
	}
}