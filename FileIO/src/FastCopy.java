import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

//took 761 ms

public class FastCopy {

	public static void main(String[] args) {
		
		FileInputStream inFile =null;
		FileOutputStream outFile = null;
		try {
			inFile = new FileInputStream("D:/ibm_java/movie_file.mp4");
			outFile = new FileOutputStream("D:/ibm_java/mov_file.mp4");
			BufferedInputStream inBuffer = new BufferedInputStream(inFile, 1024*16);
			BufferedOutputStream outBuffer = new BufferedOutputStream(outFile, 1024*16);
			
			System.out.println("Copying file...");
			
			int ch=0;
			long ms1 = System.currentTimeMillis();
			
			while(true) {
				ch = inBuffer.read();
				if(ch==-1) break;
				outBuffer.write(ch);
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
