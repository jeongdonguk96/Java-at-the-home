package thread;

import java.awt.Toolkit;

public class Thread_ex9_sleep {

	public static void main(String[] args) {
		Toolkit toolkit = Toolkit.getDefaultToolkit();
		for(int i=0; i<5.; i++) {
			toolkit.beep();
			try {
				Thread.sleep(1000);
			} catch(InterruptedException e) {
			}
		}
	}

}
