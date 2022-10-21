package lamda;

import java.util.function.*;

 // Supplier인터페이스는 get~()라는 단 하나의 추상매서드만 가진다. 
public class Lamda_ex11_supplier {

	public static void main(String[] args) {
		
		// 정수형 Supplier인터페이스
		IntSupplier intSup = () -> {
			int num = (int)(Math.random()*6)+1;
			return num;
		};
		
		int num = intSup.getAsInt();
		System.out.println("주사위의 값 = " + num);
		
		// 제네릭형
		Supplier<String> strSup = () -> {
			String str = "홍스";
			return str;
		};
		
		String str = strSup.get();
		System.out.println(str);	
	}

}
