package array;

import java.util.Arrays;

public class Array_ex1 {

	public static void main(String[] args) {
		int[] scores = {99, 97, 98};
		
		Arrays.sort(scores);
		
		System.out.println(scores[1]);
		
		// 기본 for문
		for(int i=0; i<scores.length; i++) {
			System.out.printf("scores[%d] = %d\n", i, scores[i]);
		}
		
		// 향상된 for문
		for(int s : scores) {
			System.out.println(s);
		}

	}

}
