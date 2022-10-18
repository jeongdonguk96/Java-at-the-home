package Loop;

public class for_outter_break {

	public static void main(String[] args) {
		int num = (int)(Math.random()*50+1);
		Outter: for(int i=1; i<=50; i++) {
			for(int j=1; j<=num; j++) {
				System.out.printf("%d-%d\n", i, j);
				if(j==num) break Outter;
			}
		}
		System.out.printf("j가 난수 %d에 도달했기 때문에 프로그램을 종료합니다.",num);
	}

}
