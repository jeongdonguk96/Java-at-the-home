package lamda;

interface MyFunction2 {
	void run();
}

public class Lamda_ex6 {

	static void execute(MyFunction2 f) {
		f.run();
	}
	
	static MyFunction2 getMyFunction2() {
		MyFunction2 f = () -> System.out.println("f3.run()");
		return f;
	}
	
	public static void main(String[] args) {		
		MyFunction2 f1 = new MyFunction2() {
			public void run() {
				System.out.println("f1.run()");
			}
		};
		
		MyFunction2 f2 = () -> System.out.println("f2.run()");
		
		MyFunction2 f3 = getMyFunction2();
		
		f1.run();
		f2.run();
		f3.run();
		
		execute(f1);
		execute( () -> System.out.println("run()"));
	}

}
