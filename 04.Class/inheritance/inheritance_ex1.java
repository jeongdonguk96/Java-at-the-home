package inheritance;

class People {
	String name;
	String ssn;
	public People(String name, String ssn) {
		this.name = name;
		this.ssn = ssn;
	}
}

class Student extends People {
	int stuNo;

	public Student(String name, String ssn, int stuNo) {
		super(name, ssn);
		this.stuNo = stuNo;
	}
}

public class inheritance_ex1 {

	public static void main(String[] args) {
		Student a = new Student("홍", "123123", 01);
		System.out.printf("name = %s\n", a.name);
		System.out.printf("ssn = %s\n", a.ssn);
		System.out.printf("stuNo = %d\n", a.stuNo);

	}

}
