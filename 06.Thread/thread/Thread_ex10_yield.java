package thread;

class ThreadAA extends Thread {
	boolean stop = false;
	boolean work = true;
	
	public void run() {
		while(!stop) {
			if(work) {
				System.out.println("ThreadAA 작업내용");
			} else {
				Thread.yield();
			}
		}
		System.out.println("ThreadAA 종료");
	}
}

class ThreadBB extends Thread {
	boolean stop = false;
	boolean work = true;
	
	public void run() {
		while(!stop) {
			if(work) {
				System.out.println("ThreadBB 작업내용");
			} else {
				Thread.yield();
			}
		}
		System.out.println("ThreadBB 종료");
	}
}

public class Thread_ex10_yield {

	public static void main(String[] args) {
		ThreadAA threadAA = new ThreadAA();
		ThreadBB threadBB = new ThreadBB();
		
		threadAA.start();
		threadBB.start();

		try {
			Thread.sleep(3000);
		} catch (InterruptedException e) {
		}
		threadAA.work = false;
		
		try {
			Thread.sleep(3000);
		} catch (InterruptedException e) {
		}
		threadAA.work = true;
		
		try {
			Thread.sleep(3000);
		} catch (InterruptedException e) {
		}
		threadAA.stop = true;
		threadBB.stop = true;
	}

}
