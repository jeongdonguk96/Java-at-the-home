package Loop;

public class while_ex2 {

	public static void main(String[] args) {
		int sum = 0;
		int i=1;
		while(i<=100) {
			sum += i;
			i++;
		}
		System.out.printf("1부터 100까지의 합은 %d입니다.", sum);
	}

}
