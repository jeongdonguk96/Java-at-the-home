package thread;

class interrupt implements Runnable {
	public void run() {
		try {
		while(true) {
			System.out.println("Running");
			Thread.sleep(20);
		}
		} catch(InterruptedException e) {}
	
		System.out.println("CLOSING");
		System.out.println("DONE");
	}
}

public class Thread_ex17_interrupt {

	public static void main(String[] args) {
		Thread thread = new Thread(new interrupt());
		thread.start();
		
		try {
			Thread.sleep(1000);
		} catch(InterruptedException e) {}
		
		thread.interrupt();
	}

}
