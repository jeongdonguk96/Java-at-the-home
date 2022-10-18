package class_method;

class Mb {
	String id;
	String pass;
	
	public Mb() {
	}
	
	boolean login(String id, String pass) {
		if(id.equals("hong") && pass.equals("12345")) {
			return true;
		} else {
			return false;
		}
	}
	
	void logout(String id) {
		System.out.println("로그아웃 되었습니다.");
	}
}


public class Class_test1 {

	public static void main(String[] args) {
		Mb mb = new Mb();
		boolean result = mb.login("hong", "12345");
		if(result) {
			System.out.println("로그인 되었습니다.");
			mb.logout("hong");
		} else {
			System.out.println("id 또는 pass가 틀렸습니다.");
		}

	}

}
