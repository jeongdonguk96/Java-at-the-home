package Loop;

public class for_test1 {

	public static void main(String[] args) {
		// 1~100까지 정수 중 3의 배수의 총합을 구하시오.
		int num = 0;
		for(int i=1; i<=100; i++) {
			if(i%3==0) num += i;
		}
		System.out.println(num);
	}

}
