package lamda;

import java.util.*;
import java.util.function.Function;
import java.util.function.ToIntFunction;

class Student {
	private String name;
	private int engScore;
	private int mathScore;
	
	public Student(String name, int engScore, int mathScore) {
		this.name = name;
		this.engScore = engScore;
		this.mathScore = mathScore;
	}

	public String getName() {
		return name;
	}

	public int getEngScore() {
		return engScore;
	}

	public int getMathScore() {
		return mathScore;
	}
}

public class Lamda_ex12_function {
	
	private static List<Student> list = Arrays.asList(
			new Student("홍길동", 90, 96),
			new Student("신용권", 95, 93)
		);
				
	public static void printString( Function<Student, String> function) {
		for(Student student : list) {
			System.out.println(function.apply(student) + " ");
	}
	System.out.println();
	}

	public static void printInt( ToIntFunction<Student> function) {
		for(Student student : list) {
			System.out.println(function.applyAsInt(student) + " ");
	}
	System.out.println();
	}
	
	public static void main(String[] args) {
		System.out.println("[학생 이름]");
		printString(t -> t.getName());

		System.out.println("[영어 점수]");
		printInt(t -> t.getEngScore());
		
		System.out.println("[수학 점수]");
		printInt(t -> t.getMathScore());
	}

}
