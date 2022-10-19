package lamda;

interface MyFunctioalInterface4 {
	void method();
}

interface MyFunctioalInterface5 {
	void method(int x);
}

interface MyFunctioalInterface6 {
	int method(int a, int b);
}

public class Lamda_ex5_easiest {

	public static void main(String[] args) {
		MyFunctioalInterface4 f4 = () -> System.out.println("method call");
			f4.method();
				
		MyFunctioalInterface5 f5 = x -> System.out.println(x * 5);
			f5.method(3);
		
		MyFunctioalInterface6 f6 = (a, b) -> a + b;
			System.out.println(f6.method(2, 5));
	}

}
