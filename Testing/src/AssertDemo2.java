
public class AssertDemo2 {

	public static void main(String[] args) {
		assert args.length==3:"mandatory to pass 3 arguments";
		for(String a :args)
			System.out.println(a);
	}

}
