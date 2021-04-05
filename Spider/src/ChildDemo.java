
public class ChildDemo<H, P> extends NewDemo<H> {

	private P temp;
	
	public ChildDemo(H data, P temp) {
		super(data);
		this.temp = temp;
	}

	public P getTemp() {
		return temp;
	}

	public void setTemp(P temp) {
		this.temp = temp;
	}

	public static void main(String[] args) {
		ChildDemo<String, Integer> d1 = new ChildDemo<String, Integer>("Hello",1000);
		//d1.setData(1000);
		System.out.println(d1.getTemp() + d1.getData());
		
	}
}
