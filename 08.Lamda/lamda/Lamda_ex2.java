package lamda;

@FunctionalInterface
interface MyFunctioalInterface {
	void method();
}

public class Lamda_ex2 {

	public static void main(String[] args) {
		MyFunctioalInterface f;
		
		f = ()-> {
			String str = "method call1";
			System.out.println(str);
		};
		f.method();
		
		f = () -> {
			System.out.println("method call2");
		};
		f.method();
		
		f = () -> System.out.println("method call3"); // 이 방식이 가장 간단한 방식
		f.method();
	}

}
