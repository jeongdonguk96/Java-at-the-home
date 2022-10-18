package conditional;

public class Nested_if {

	public static void main(String[] args) {
		int score = (int)(Math.random()*20+1)+80;
		System.out.printf("%d점입니다!", score);

		if(score>90) {
			if(score>95) {
				System.out.println("A+입니다");
			} else {
				System.out.println("A입니다");
			}
		} else {
				if(score>85) {
					System.out.println("B+입니다");	
				} else {
					System.out.println("B입니다");
				}
			}
	}

}
