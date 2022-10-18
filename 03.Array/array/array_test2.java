package array;

public class array_test2 {

	public static void main(String[] args) {
		// 중첩 for문을 이용해 주어진 배열의 전체 항목의 합과 평균값을 구하시오.
		int[][] array = {
				{95, 86},
				{83, 92, 96},
				{78, 83, 93, 87, 88}
		};
		
		int sum = 0;
		double avrg = 0;
		int count = 0;
		
		for(int i=0; i<array.length; i++) {
			for(int j=0; j<array[i].length; j++) {
				sum += array[i][j];
				count++;
			}
		}
		avrg = (double)sum/count;
		
		System.out.println(sum);
		System.out.println(avrg);
	}

}
