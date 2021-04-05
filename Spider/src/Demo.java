
public class Demo {
	private Object data;
	
	public Demo(Object data){
		this.data=data;
	}
	
	public Object getData() {
		return data;
	}
	
	public void setData(Object data) {
		this.data = data;
	}
	
	public static void main(String[] args) {
		Demo d1 =  new Demo(100);
		d1.setData("Hey");
		System.out.println(d1.getData());
		
		Demo d2 =  new Demo("Hello");
		d2.setData(12.345);
		d2.setData(new Car("Venue","AC","ABS"));
		System.out.println(d2.getData());
		
		//Demo d3 =  new Demo(150);
		//Demo d4 =  new Demo(100);
		//System.out.println(d3.getData()+d4.getData());//Not posible coz cant add objects.
		
	}
}
