package Loop;

import java.util.Scanner;

public class do_while_ex1 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		String inputString;
		
		System.out.println("메세지를 입력하세요.");
		System.out.println("프로그램을 종료하려면 0을 입력하세요");
		
		do {
			System.out.print(">");
			inputString = scan.nextLine();
			System.out.println(inputString);
		} while(!inputString.equals("0")); 
			System.out.println();
			System.out.println("프로그램을 종료합니다.");
	}

}
