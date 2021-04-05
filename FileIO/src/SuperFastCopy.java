import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.nio.ByteBuffer;
import java.nio.channels.FileChannel;

//took 325 ms

public class SuperFastCopy {

	public static void main(String[] args) {
		FileInputStream inFile =null;
		FileOutputStream outFile = null;
		FileChannel inChannel = null;
		FileChannel outChannel = null;
		
		try {
			inFile = new FileInputStream("D:/ibm_java/movie_file.mp4");	//2mb approx
			outFile = new FileOutputStream("D:/ibm_java/mo_file.mp4");
			inChannel = inFile.getChannel();
			outChannel = outFile.getChannel();
			ByteBuffer buffer = ByteBuffer.allocate(1024*16);	//creating 16kb common buffer
		
			long ms1 = System.currentTimeMillis();
			
			while(true) {
				int count = inChannel.read(buffer);
				if(count==-1) break;
				buffer.flip();	//placing cursor back to the start of the buffer
				outChannel.write(buffer);
				buffer.clear();
			}
			long ms2 = System.currentTimeMillis();
			System.out.println("Filed copied successfully in "+(ms2-ms1) + "ms");
		}
		
		catch(IOException e) {
			e.printStackTrace();
		}finally {
			try {
				inChannel.close();
				outChannel.close();
				inFile.close();
				outFile.close();
			}catch(Exception e) {
				e.printStackTrace();
			}
		}
	}

}
