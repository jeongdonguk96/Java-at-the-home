package thread;

class WorkObject {
	public synchronized void methodA() {
		System.out.println("ThreadA의 method() 작업 실행");
		
		notify();
		try {
			wait();
		} catch (InterruptedException e) {
		}	
	}
	
	public synchronized void methodB() {
		System.out.println("ThreadB의 method() 작업 실행");
		
		notify();
		try {
			wait();
		} catch (InterruptedException e) {
		}	
	}
}

class ThreadAAA implements Runnable {
	private WorkObject workObject;
	
	public ThreadAAA() {}
	
	public ThreadAAA(WorkObject workObject) {
		this.workObject = workObject;
	}
	
	@Override
	public void run() {
		for(int i=0; i<10; i++) {
			workObject.methodA();
		}
	}
}

class ThreadBBB implements Runnable {
	private WorkObject workObject;
	
	public ThreadBBB() {}
	
	public ThreadBBB(WorkObject workObject) {
		this.workObject = workObject;
	}
	
	@Override
	public void run() {
		for(int i=0; i<10; i++) {
			workObject.methodB();
		}
	}
}


public class Thread_ex12_notify {

	public static void main(String[] args) {
		WorkObject sharedObject = new WorkObject();
		
		ThreadAAA t1 = new ThreadAAA(sharedObject);
		ThreadBBB t2 = new ThreadBBB(sharedObject);
		Thread threadA = new Thread(t1);
		Thread threadB = new Thread(t2);
		
		threadA.start();
		threadB.start();
	}

}
