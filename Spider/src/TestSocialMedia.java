import java.time.LocalDate;

import com.ibm.assess.*;

public class TestSocialMedia {

	public static void main(String[] args) {
		
		User u1 = new User("hemaja");
		User u2 = new User("sai");
		
		Comment comment[] = new Comment[2];
		Comment c1 = new Comment(u1, "yes");
		comment[0] = c1;
		Comment c2 = new Comment(u2, "no");
		comment[1] = c2;
		
		
		Post posts[] = new Post[2];
		Post p1 = new Post(u1, "i am a good girl", LocalDate.now(), 500, 1, comment);
		posts[0] = p1;
		Post p2 = new Post(u2, "i am beautuful", LocalDate.now(),1000,0,comment);
		posts[1]=p2;
		
		Dashboard d1 = new Dashboard(posts);
		d1.displayDashboard(u1);
		
		d1.displayDashboard(u2);
		
		
	}

}
