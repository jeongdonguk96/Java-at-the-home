package conditional;

public class if_else {

	public static void main(String[] args) {
		int score = 81;
		
		if(score>=90) {
			System.out.printf("점수는 %d, A등급입니다.", score);
		} else if(score>=80) {
			System.out.printf("점수는 %d, B등급입니다.", score);
		} else if(score>=70) {
			System.out.printf("점수는 %d, C등급입니다.", score);
		} else {
			System.out.printf("점수는 %d, D등급입니다.", score);
		}

	}

}
