
public class NewDemo<H> {

	private H data;

	public NewDemo(H data) {
		super();
		this.data = data;
	}
	
	public H getData() {
		return data;
	}

	public void setData(H data) {
		this.data = data;
	}

	public static void main(String[] args) {
		NewDemo<String> d1 = new NewDemo<String>("Hello");
		//d1.setData(1000);
		System.out.println(d1.getData());
		
		NewDemo<Integer> d2 = new NewDemo<Integer>(1000);
		//d1.setData(1000);
		System.out.println(d2.getData());
		
	}
	
}
