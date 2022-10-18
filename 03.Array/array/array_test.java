package array;

public class array_test {

	public static void main(String[] args) {
		// for문을 활용해 주어진 배열의 항목에서 최댓값을 구하시오
		int max = 0;
		int[] array = {1, 5, 3, 8, 2};
		
		for(int i : array) {
			if(i>max) max = i;
		}
		System.out.println(max);
	}

}
