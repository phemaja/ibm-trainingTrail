
public interface Event {
	void doSomething();
}

class EventImpl implements Event{

	@Override
	public void doSomething() {
		System.out.println("First Task");
		
	}
	
	class InnerEventImpl implements Event{

		@Override
		public void doSomething() {
			System.out.println("Second Task");
			
		}
	}
	
	public void oneMoreImpl() {
		class NestedEventImpl implements Event{

			@Override
			public void doSomething() {
				System.out.println("Third Task");
				
			}
		}
		new NestedEventImpl().doSomething();
	}
	
	public void oneLatImpl() {
		Event e = new Event() {//Annonymous Inner Class

			@Override
			public void doSomething() {
				System.out.println("Fourth Task");		
			} 
			
		};
		e.doSomething();
	}
	
	public void lastLastImpl() {
		Event e = () -> System.out.println("Fifth Task"); //Lambda Expression 
		// above line does the work of all the five lines in onelastImpl
		e.doSomething();
	}
	
	
	public static void main(String[] args)
	{
		EventImpl ei = new EventImpl();
		ei.doSomething();
		
		InnerEventImpl inner = ei.new InnerEventImpl(); // used for non static inner
		//EventImpl.InnerEventImpl inner = ei.new EventImpl.InnerEventImpl();  //  for static inner classes
		inner.doSomething();
		
		ei.oneMoreImpl();
		ei.oneLatImpl();
		ei.lastLastImpl();
	}
}
