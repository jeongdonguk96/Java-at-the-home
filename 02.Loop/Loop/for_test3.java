package Loop;

public class for_test3 {

	public static void main(String[] args) {
		// for문을 이용해 1개부터 5개까지의 별을 찍으시오
		for(int i=1; i<=5; i++) {
			for(int j=1; j<=i; j++) {
				System.out.print("*");
			}
			System.out.println();
		}
	}

}
