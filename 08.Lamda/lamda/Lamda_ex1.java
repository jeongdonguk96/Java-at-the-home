package lamda;

@FunctionalInterface // 함수형 인터페이스는 단 하나의 추상매서드만 가질 수 있다.
interface MyFunction {
	public abstract int max(int a, int b);
}

public class Lamda_ex1 {

	public static void main(String[] args) {
		// MyFunction f = new MyFunction() {
		// 	public int max(int a, int b) {
		// 		return a>b ? a : b;
		// 	}
		// };
		// 위의 여러 줄의 코드를 한줄의 코드로 바꾸는것이 람다식
		MyFunction f = (a, b) -> a>b ? a : b;
		
		int value = f.max(3, 5);
		System.out.println(value);	
	}

}
