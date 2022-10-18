package interface_;

interface Action {
	void work();
}

public class Interface_test3 {

	public static void main(String[] args) {
		Action a = new Action() {
			public void work() {System.out.println("복사합니다.");}			
		};
		a.work();
	}

}
