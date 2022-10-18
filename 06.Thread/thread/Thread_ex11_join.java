package thread;

class SumThread implements Runnable {
	private long sum;

	public long getSum() {
		return sum;
	}
	
	public void setSum(long sum) {
		this.sum = sum;
	}
	
	public void run() {
		for(int i=1; i<=100; i++) {
			sum += i;
		}
	}
}

public class Thread_ex11_join {

	public static void main(String[] args) {
		SumThread st = new SumThread();
		Thread thread = new Thread(st);
		
		thread.start();
		
		try {
			thread.join();
		} catch (InterruptedException e) {
		}
		
		System.out.println("1~100의 합 = " + st.getSum());
	}

}
