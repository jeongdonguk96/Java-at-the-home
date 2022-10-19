package lamda;

interface MyFinal {
	void method();
}

class UsingLocalVariable {
	void method(int arg) { // arg는 final의 특성을 가짐
	int localVar = 40; // localVar은 final의 특성을 가짐
	
	// localVar = 20; localVar이 final특성을 가지기 때문에 수정 불가
	
	MyFinal f = () -> {
		System.out.println("arg = " + arg);
		System.out.println("localVar = " + localVar);
	};
	f.method();
	}
}

public class Lamda_ex8_final {

	public static void main(String[] args) {
		UsingLocalVariable ulv = new UsingLocalVariable();
		ulv.method(30);
	}

}
