package lamda;

interface MyFunc {
	void method();
}

class UsingThis {
	int outterField = 10;
	
	class Inner {
		int innerField = 20;
		
		void method() {
			MyFunc f = () -> {
				System.out.println("outterField = " + outterField);
				System.out.println("outterField = " + UsingThis.this.outterField + "\n");  // 내부에서 외부클래스의 변수를 나타낼 때
			
				System.out.println("innerField = " + innerField);
				System.out.println("innerField = " + this.innerField + "\n"); // 내부에서 내부클래스의 변수를 나타낼 때
			};
			f.method();
		}
	}
}

public class Lamda_ex7_this {

	public static void main(String[] args) {
		UsingThis ut = new UsingThis();
		UsingThis.Inner inner = ut.new Inner();
		inner.method();
	}

}
