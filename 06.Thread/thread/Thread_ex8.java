package thread;

class StatePrintThread extends Thread {
	private Thread targetThread;
	
	public StatePrintThread(Thread targetThread) {
		this.targetThread=targetThread;
	}
	
	public void run() {
		while(true) {
			Thread.State state = targetThread.getState();
			System.out.println("타겟 스레드 상태 = " + state);
		
		if(state == Thread.State.NEW) {
			targetThread.start();
		}
		
		if(state == Thread.State.TERMINATED) {
			break;
		}
		try {
			Thread.sleep(500);
		} catch (Exception e) {}
		}
	}
}

class TargetThread extends Thread {
	public void run() {
		for(int i=0; i<10000000; i++) {}
		
		try {
			Thread.sleep(1500);
		} catch (Exception e) {}
		
		for(int i=0; i<10000000; i++) {}
	}
}

public class Thread_ex8 {

	public static void main(String[] args) {
		StatePrintThread spt = new StatePrintThread(new TargetThread());
		spt.start();

	}

}
