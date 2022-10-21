package lamda;

import java.util.function.BiConsumer;
import java.util.function.Consumer;
import java.util.function.IntConsumer;

 // Consumer인터페이스는 accept()라는 단 하나의 추상매서드만 가진다. 
public class Lamda_ex10_consumer {

	public static void main(String[] args) {
		
		// 앞에 변수형이 붙지 않은 제일 기본적인 Consumer는 어느 객체든 받을 수 있기 때문에 제네릭형을 사용한 것
		Consumer<String> con = t -> System.out.println(t + "8");
		con.accept("java");
		
		BiConsumer<String, String> biCon = (t, u) -> System.out.println(t + u);
		biCon.accept("Java", "8");
		
		IntConsumer intCon = t -> System.out.println(t + "java");
		intCon.accept(8);
	}

}
