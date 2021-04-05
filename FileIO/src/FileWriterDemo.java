import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;

public class FileWriterDemo {

	public static void main(String[] args) {
		String path = "src/amazing.txt";
		BufferedWriter writer = null;
		
		try {
			writer = new BufferedWriter(new FileWriter(path));
			writer.write("When I see your face");
			writer.newLine();
			writer.write("I am good");
			writer.newLine();
			writer.write("Thanks");
			System.out.println("Completed writing the file");
			
		}catch(IOException e){
			e.printStackTrace();
		}finally {
			try {
				if(writer!=null)
					writer.close();
			}catch(IOException e) {
				e.printStackTrace();
			}
		}
		
	}
}
