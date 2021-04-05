import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

//took 79805ms

public class Copy {

	public static void main(String[] args) {
		
		FileInputStream inFile =null;
		FileOutputStream outFile = null;
		try {
			inFile = new FileInputStream("D:/ibm_java/movie_file.mp4");
			outFile = new FileOutputStream("D:/ibm_java/movi_file.mp4");
			System.out.println("Copying file...");
			
			int ch=0;
			long ms1 = System.currentTimeMillis();
			
			while(true) {
				ch = inFile.read();
				if(ch==-1) break;
				outFile.write(ch);
			}
			long ms2 = System.currentTimeMillis();
			System.out.println("Filed copied successfully in "+(ms2-ms1) + "ms");
		}
		
		catch(IOException e) {
			e.printStackTrace();
		}finally {
			try {
				inFile.close();
				outFile.close();
			}catch(Exception e) {
				e.printStackTrace();
			}
		}

	}
}

		