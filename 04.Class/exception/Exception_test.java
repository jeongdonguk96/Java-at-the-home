package exception;

class NotExistIdException extends Exception {
	public NotExistIdException() {}
	public NotExistIdException(String message) {
		super(message);
	}
}

class WrongPassException extends Exception {
	public WrongPassException() {}
	public WrongPassException(String message) {
		super(message);
	}
}

public class Exception_test {

	static void login(String id, String pass) throws NotExistIdException, WrongPassException {
		if(!id.equals("blue")) {
			throw new NotExistIdException("id가 존재하지 않습니다.");
		}
		
		if(!pass.equals("12345")) {
			throw new WrongPassException("pass가 존재하지 않습니다.");
		}
	}
	
	
	public static void main(String[] args) {
		try {
			login("white", "12345");
		} catch(Exception e) {
			System.out.println(e.getMessage());
		}
		
		try {
			login("blue", "1222345");
		} catch(Exception e) {
			System.out.println(e.getMessage());
		}
	}

}
