package lamda;

// 람다식은 단 하나의 추상매서드를 가진 인터페이스이다.
// 다르게 보면 단 하나의 추상매서드를 가진 인터페이스는 모두 람다식을 이용해서 익명구현객체로 표현이 가능하다.
// run()이란 추상매서드 하나만 가진 Runnable인터페이스를 람다식으로 표현하기

public class Lamda_ex9_API {

	public static void main(String[] args) throws InterruptedException {
		Runnable runnable = () -> {
			for(int i=0; i<10; i++) {
				System.out.println(i);
			}
		};
		
		Thread thread = new Thread(runnable);
		thread.start();
		Thread.sleep(1000);
		System.out.println("\n1초 쉬고 2번째 스레드\n");
		// 위의 코드와 제일 간단한 방식으로 표현
		Thread thread2 = new Thread(() -> {
			for(int i=0; i<10; i++) {
				System.out.println(i);
			}
		});
		
		thread2.start();
	}

}
