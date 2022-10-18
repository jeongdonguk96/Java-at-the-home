package conditional;

public class Math_random {

	public static void main(String[] args) {
		int num = (int)(Math.random()*6+1);
		System.out.println(num);
		if(num==1) {
			System.out.println("주사위를 던져 1이 나왔습니다.");
		} else if(num==2) {
			System.out.println("주사위를 던져 2이 나왔습니다.");
		} else if(num==3) {
			System.out.println("주사위를 던져 3이 나왔습니다.");
		} else if(num==4) {
			System.out.println("주사위를 던져 4이 나왔습니다.");
		} else if(num==5) {
			System.out.println("주사위를 던져 5이 나왔습니다.");
		} else {
			System.out.println("주사위를 던져 6이 나왔습니다.");
		}
		
		
	}

}
