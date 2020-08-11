package Threads;

public class Main {

	public static void main(String[] args) {
		
		System.out.println("Hello from the main thread");
		Thread anotherThread = new AnotherThread();
		anotherThread.start();
		
		//anonymous class
		new Thread() {
			public void run() {
				System.out.println("Hello from anonymous class");
			}
		}.start();
		
		System.out.println("Hello from the main thread again");
	}
	

}
