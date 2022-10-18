package exception;

public class Exception_ex2 {
	
	static void findClass() throws ClassNotFoundException{
		Class clazz = Class.forName("java.lang.String2");
	}
	
	public static void main(String[] args) {
		try {
			findClass();
		} catch(ClassNotFoundException e) {
			System.out.println("클래스가존재하지않습니다.");
		}
		
	}

}
