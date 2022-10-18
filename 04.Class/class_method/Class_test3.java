package class_method;

class Printerr {
	String a;
	int b;
	boolean c;
	double d;
	
	static void println(String a) {
		System.out.println(a);
	}
	static void println(int b) {
		System.out.println(b);
	}
	static void println(boolean c) {
		System.out.println(c);
	}
	static void println(double d) {
		System.out.println(d);
	}
	
}

public class Class_test3 {

	public static void main(String[] args) {
		Printerr.println(10);
		Printerr.println(true);
		Printerr.println(5.7);
		Printerr.println("홍길동");
	}

}
