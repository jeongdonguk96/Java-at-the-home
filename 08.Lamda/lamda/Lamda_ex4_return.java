package lamda;

interface MyFunctioalInterface3 {
	int method(int a, int b);
}

public class Lamda_ex4_return {

	public static void main(String[] args) {
		MyFunctioalInterface3 f;
		
		f = (a, b) -> {
			int result = a + b;
			return result;
		};
		System.out.println(f.method(2, 5));
		
		f = (a, b) -> {
			return a + b;
		};
		System.out.println(f.method(2, 5));
		
		f = (a, b) -> a + b;
		System.out.println(f.method(2, 5));		
	}

}
