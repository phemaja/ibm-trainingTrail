import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

public class SerializationDemo {

	public static void main(String[] args) throws IOException, ClassNotFoundException {
		Person p = new Person("Polo", 21);
		System.out.println(p);
		
		String path = "src/pers.dat";
		ObjectOutputStream ostream = null;
		ObjectInputStream istream = null;
		
		//Serialization code
		ostream = new ObjectOutputStream(new FileOutputStream(path));
		ostream.writeObject(p);//serializing object
		ostream.close();
		System.out.println("Object serialized....");
		
		//Deserialization code
		istream = new ObjectInputStream(new FileInputStream(path));
		Object obj = istream.readObject();     //deserializing object
		System.out.println(obj);
		istream.close();
	}
}
