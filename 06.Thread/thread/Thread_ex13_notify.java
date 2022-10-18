package thread;

class Account {
	int balance = 10000;
	
	public synchronized void withdraw(int money) {
		if(balance<money) {
			try {
				wait();
			} catch (InterruptedException e) {}
		} else {
			balance -= money;
		}	
	}
	
	public synchronized void deposit(int money) {
		balance += money;
		notify();
	}
}

public class Thread_ex13_notify {

	public static void main(String[] args) {


	}

}
