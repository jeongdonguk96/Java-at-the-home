package Loop;

public class while_break {

	public static void main(String[] args) {
		while(true) {
			int num = (int)(Math.random()*6+1);
			System.out.println(num);
			if(num==6) {
				break;
			}
		}
		System.out.println("주사위 번호가 6이 나왔기 때문에 프로그램을 종료합니다.");
	}

}
