package thread;

class Auto extends Thread{
	public void save() {
		System.out.println("작업내용 저장");
	}
	
	public void run() {
		while(true) {
			try {
				Thread.sleep(1000);
			} catch (Exception e) {
				break;
			}
		save();
		}
	}
	
}

public class Thread_16_daemon {

	public static void main(String[] args) {
		Auto thread = new Auto();
		thread.setDaemon(true);
		thread.start();
		
		try {
			Thread.sleep(3000);
		} catch (Exception e) {}

		System.out.println("종료");
	}

}
