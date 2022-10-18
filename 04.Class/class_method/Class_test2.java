package class_method;

class Printer {
	String a;
	int b;
	boolean c;
	double d;
	
	void println(String a) {
		System.out.println(a);
	}
	void println(int b) {
		System.out.println(b);
	}
	void println(boolean c) {
		System.out.println(c);
	}
	void println(double d) {
		System.out.println(d);
	}
	
}

public class Class_test2 {

	public static void main(String[] args) {
		Printer p = new Printer();
		p.println(10);
		p.println(true);
		p.println(5.7);
		p.println("홍길동");
	}

}
