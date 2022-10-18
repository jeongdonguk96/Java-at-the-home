package exception;

class BalanceInsufficientException extends Exception {
	public BalanceInsufficientException() {}
	public BalanceInsufficientException(String message) {
		super(message);
	}
}

class Account {
	private long balance;

	public Account() {
	}

	public long getBalance() {
		return balance;
	}
	
	public void deposit(int money) {
		balance += money;
	}
	
	public void withdraw(int money) throws BalanceInsufficientException {
		if(balance<money) {
			throw new BalanceInsufficientException("잔고부족 " + (money-balance) + "원 모자람"); 
		} else {
			balance -= money;
			System.out.printf("%d원이 출금됐습니다.", money);
		}
	}
}

public class Exception_ex3 {

	public static void main(String[] args) {
		Account a = new Account();
		
		a.deposit(10000);
		System.out.printf("예금액 : %d\n", a.getBalance());
		
		try {
			a.withdraw(30000);
		} catch(BalanceInsufficientException e) {
			String message = e.getMessage();
			System.out.println(message);
		}
		
	}

}
