package thread;

class Task implements Runnable {
	public void run() {
		
	}
}

public class Thread_ex1 {

	public static void main(String[] args) {
		// Thread t = new Thread(new Runnable() {
		//   public void run() {		
		//	 }
		// });
		Thread t = new Thread(()-> {  // 람다식
		});
		
		t.start();
		
	}

}
