package lamda;

interface MyFunctioalInterface2 {
	void method(int x);
}

public class Lamda_ex3_parameter {

	public static void main(String[] args) {
		MyFunctioalInterface2 f;
		
		f = (x) -> {
			int result = x * 5;
			System.out.println(result);
		};
		f.method(5);
		
		// 위 코드를 제일 간단한 람다식으로 바꾸면
		f = (x) -> System.out.println(x*5);
		f.method(5);
	}

}
