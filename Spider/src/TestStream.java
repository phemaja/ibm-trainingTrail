
import com.ibm.stream.AgeRestrictionException;
import com.ibm.stream.Movie;
import com.ibm.stream.Series;
import com.ibm.stream.Subscription;
import com.ibm.stream.SubscriptionException;
import com.ibm.stream.User;

public class TestStream {

	public static void main(String[] args)  {
		Subscription sub = new Subscription();
		User u4 =new User("Polo",20,"male",2500);
		User u1 = new User("Poli",22,"female",2150);
		User u2 =new User("Molo",45,"male",300);
		User u3 = new User("Moli",44,"female",1000);
		
		Movie m1= new Movie("Kamsutra","Erotic",false);
		Movie m2= new Movie("Conjuring","Horror",true);
		Movie m3= new Movie("Avengers","Action",false);
		
		Series s1 = new Series("Entangled", "Erotic", false, 7, 10);
		Series s2 = new Series("The mist", "Horror", false, 5, 12);
		Series s3 = new Series("Titans", "Action", false, 4, 22);
		
		try {
			sub.subscription("Montly", u3);
			s1.play(u3);
			
			sub.subscription("Annually", u1);
			s2.play(u1);
			
			sub.subscription("Annually", u1);
			m1.play(u1);
		}
		catch (AgeRestrictionException e) {
			e.printStackTrace();
			//System.out.println(e.getMessage());
		}
		catch(SubscriptionException se) {
			se.printStackTrace();
		//	System.out.println(se.getMessage());
			
		}
	
		}
	}
