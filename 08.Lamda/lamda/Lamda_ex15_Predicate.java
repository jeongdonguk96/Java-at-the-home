package lamda;

import java.util.*;
import java.util.function.Predicate;

class Student3 {
	private String name;
	private String gender;
	private int score;
	
	public Student3(String name, String gender, int score) {
		this.name = name;
		this.gender = gender;
		this.score = score;
	}

	public String getGender() {
		return gender;
	}

	public int getScore() {
		return score;
	}
}

public class Lamda_ex15_Predicate {

	private static List<Student3> list = Arrays.asList(
			new Student3("홍길동", "남성", 90),
			new Student3("김순희", "여성", 90),
			new Student3("감자바", "남성", 95),
			new Student3("박한나", "여성", 92)
			);
	
	public static double avrg( Predicate<Student3> predicate ) {
		int count = 0, sum = 0;
		for(Student3 student : list) {
			if( predicate.test(student) ) {
				count++;
				sum += student.getScore();
			}
		}
		return (double) sum / count;
	}	
	
	public static void main(String[] args) {
		double maleAvrg = avrg( t -> t.getGender().equals("남성") );
		System.out.println("남성 평균점수 = " + maleAvrg);
		
		double femaleAvrg = avrg( t -> t.getGender().equals("여성") );
		System.out.println("여성 평균점수 = " + femaleAvrg);
	}

}
