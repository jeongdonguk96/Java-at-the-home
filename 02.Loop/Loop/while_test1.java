package Loop;

public class while_test1 {
	
	public static void main(String[] args) {
		// while과 Math.random()을 이용해 두 개의 주사위를 던졌을 때 나오는 눈을 (눈1, 눈2)형태로 출력,
		// 눈의 합이 5가 아니면 주사위를 계속 던지고 합이 5면 실행을 멈추는 코드를 작성하시오.
		int num3=0;
		
		while(num3!=5) {
			int num1 = (int)(Math.random()*6+1);
			int num2 = (int)(Math.random()*6+1);
			num3 = num1+num2;
			System.out.printf("%d, %d\n",num1, num2);
		}
		System.out.println("주사위 눈의 합이 5가 나와서 프로그램을 종료합니다.");
	}
}
