package thread;

class PrintThread1 implements Runnable {
	private boolean stop;
	
	public void setStop(boolean stop) {
		this.stop=stop;
	}
	
	public void run() {
		while(!stop) {
			System.out.println("실행중");
		}
		System.out.println("자원정리");
		System.out.println("실행종료");
	}
}

public class Thread_ex15_stop {

	public static void main(String[] args) {
		PrintThread1 t = new PrintThread1();
		Thread printThread = new Thread(t);
		printThread.start();
		
		try {
			Thread.sleep(3000);
		} catch (InterruptedException e) {}
		
		t.setStop(true);
	}

}
