
public class SyncDemo implements Runnable {

	@Override
	public void run() {
		String name = Thread.currentThread().getName();
		print(name);
	}

	Object dummy = new Object();
	
	private synchronized void print(String name) {	// synchronised method - locks current object by default
//		System.out.println(name + " has entered the print method");
		
//		synchronized (dummy) {	// synchronised block - locking dummy object
//		synchronized (this) {	// synchronised block - locking this object
			try {
				System.out.print("[");
				Thread.sleep(1000);
				System.out.print(name);
				Thread.sleep(1000);
				System.out.println("]");
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
//		}
	}

	public static void main(String[] args) {
		SyncDemo sd = new SyncDemo();

		Thread t1 = new Thread(sd, "Alfa");
		Thread t2 = new Thread(sd, "Beta");
		Thread t3 = new Thread(sd, "Gama");

		t1.start();
		t2.start();
		t3.start();
	}
}
