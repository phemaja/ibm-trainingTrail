import com.ibm.lib.*;

public class TestLibrary {
	
	public static void main(String[] args) {
		Book bk = new Book(1234, "The alchemist");
		Member mbr = new Member(99,"polo");
	//	Member mbr2 = new Member(11,"lili");
			
		try {
			
		//bk.returnBook(mbr);
		bk.status();
		mbr.status();
		
		bk.issueBook(mbr);
		//bk.issueBook(mbr);
		
		//bk.returnBook(mbr2);
		
		bk.status();
		mbr.status();
		
		bk.returnBook(mbr);
			
		bk.status();
		mbr.status();
		} catch(LibraryException e) {
			e.printStackTrace();
			System.out.println(e.getMessage());
			System.out.println(e);
		}
	}
	
}
