import java.util.LinkedList;
import java.util.Queue;

public class QueueDemo {

	public static void main(String[] args) {
		
		Queue<String> que = new LinkedList<String>();
		que.add("hemaja");
		que.offer("sailu");
		que.offer("sai");
		
		
		System.out.println("1" +que.peek());
		
		while(!que.isEmpty())
			System.out.println("2" +que.poll());

	}
}