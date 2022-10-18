package class_method;

class Account {
	private int balance;
	final int minBalance = 0;
	final int maxBalance = 1000000;
	
	public int getBalance() {
		return balance;
	}
	
	public void setBalance(int balance) {
		if(balance>maxBalance || balance<0) {
			System.out.printf("%d원은 한도 외 입금입니다.\n", balance);
			return;
		}
		this.balance = balance;
	}
}

public class Class_test5 {

	public static void main(String[] args) {
		Account a = new Account();
		
		a.setBalance(10000);
		System.out.printf("현재 잔고 : %d\n", a.getBalance());
		a.setBalance(-100);
		System.out.printf("현재 잔고 : %d\n", a.getBalance());
		a.setBalance(2000000);
		System.out.printf("현재 잔고 : %d\n", a.getBalance());
		a.setBalance(30000);
		System.out.printf("현재 잔고 : %d\n", a.getBalance());
	}

}
