import java.util.Locale;
import java.util.ResourceBundle;

public class LocaleDemo {
	
	public static void main(String[] args) {
		
		Locale french = Locale.FRENCH;
		Locale german = Locale.GERMAN;
		Locale desi = new Locale("hi");
		ResourceBundle bundle = ResourceBundle.getBundle("msgs", german);
	
		System.out.println(bundle.getString("greeting"));
		System.out.println(bundle.getString("message"));
	
	}
}
