import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class BinaryReadDemo {

	public static void main(String[] args) {
		String path ="C://Users/ibmjavafsdmr13/training/hello.txt";
		
		FileInputStream istream=null;
		try {
			istream = new FileInputStream(path);
//			int ch =0;
//			istream = new FileInputStream(path);
//			while(true) {
//				ch = istream.read();
//				if(ch==-1)
//					break;
//				System.out.println((char)ch);
//			}
			
			byte[] content = new byte[istream.available()];  // returns count of availabe bytes in stream
			istream.read(content); //reading bytes from stream into array
			System.out.println(new String(content)); // converting byte array to string
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}finally {
		try {
			istream.close();
		} catch (IOException e) {
			e.printStackTrace();
		}
		}
	}
	

}
