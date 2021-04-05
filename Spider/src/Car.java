
public class Car {
	private String model;
	private String[] features;
	
	public Car(String model, String...features) {   //VarArgs
		this.model=model;
		this.features=features;
	}
	
	public void specs() {
		System.out.println("features of mode: "+model);
		for(String f: features) {
			System.out.println(">"+f);
		}
	}

	public static void main(String[] args) {
		String[] falto = {"Keyless", "Power Steering", "AC"};
		Car alto = new Car("Suzuki Alto", falto);
		
		String[] fhect = {"ABS", "Monn Roof", "Climate Control", "Cruise","Air bags","Keyless Start"};
		Car hector = new Car("MG Hector",fhect);

		alto.specs();
		hector.specs();
	}
	
}
