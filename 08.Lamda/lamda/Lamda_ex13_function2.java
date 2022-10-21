package lamda;

import java.util.*;
import java.util.function.ToIntFunction;

public class Lamda_ex13_function2 {
	
	private static List<Student> list = Arrays.asList(
			new Student("홍길동", 90, 96),
			new Student("신용권", 95, 93)
		);
	
	public static double avrg( ToIntFunction<Student>function) {
		int sum = 0;
		for(Student student : list) {
			sum += function.applyAsInt(student);
		}
		double avrg = (double) sum / list.size();
		return avrg;
	}

	public static void main(String[] args) {
		double engAvrg = avrg( s -> s.getEngScore());
		System.out.println("영어 평균 점수 = " + engAvrg);
		
		double mathAvrg = avrg( s -> s.getMathScore());
		System.out.println("수학 평균 점수 = " + mathAvrg);
	}
}
