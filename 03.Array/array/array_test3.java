package array;

import java.util.Scanner;

public class array_test3 {

	public static void main(String[] args) {
		// 키보드로부터 학생 수와 점수를 입력받아 최고점수와 평균점수를 구하시오.
		boolean run = true;
		int[] score = null;
		Scanner scan = new Scanner(System.in);
		int stuNum = 0;		
		int tmp_score = 0;
		int[] tmp_scorearray = null;
		int sum = 0;
		double avrg = 0;
		
		while(run) {
			System.out.println("-------------------------------------------------");
			System.out.println("1. 학생수 | 2. 점수입력 | 3. 점수리스트 | 4. 분석 | 5. 종료");
			System.out.println("-------------------------------------------------");
			System.out.print("선택> ");			
		int selNo = scan.nextInt();
		
		if(selNo == 1) {
			System.out.print("학생수> ");
			stuNum = scan.nextInt();
			score = new int[stuNum];
		} else if(selNo == 2) {
			for(int i=0; i<stuNum; i++) {
				System.out.printf("score[%d]> ",i);
				score[i] = scan.nextInt();
				sum += score[i];
			}
		} else if(selNo == 3) {
			for(int i=0; i<stuNum; i++)
			System.out.printf("score[%d]: %d\n", i, score[i]);
		} else if(selNo == 4) {
			avrg = (double)sum/stuNum;
			System.out.printf("최고 점수: %d\n", sum);
			System.out.printf("평균 점수: %s\n", avrg);
		} else if(selNo == 5) {
			run = false;
		}
		}
		System.out.println("프로그램 종료");
	}

}
