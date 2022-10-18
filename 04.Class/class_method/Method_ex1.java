package class_method;

class Calculator {
	int plus(int x, int y) {
		int result = x+y;
		return result;
	}
	
	double avrg(int x, int y) {
		double sum = plus(x, y);
		double result = sum/2;
		return result;
	}
	
	void execute() {
		double result = avrg(7, 10);
		println("실행결과 = " + result);
	}

	void println(String message) {
		System.out.println(message);
	}
	
}

public class Method_ex1 { // 객체 내부에서 매서드 호출

	public static void main(String[] args) {
		Calculator c = new Calculator();
		
		c.execute();
}
}
