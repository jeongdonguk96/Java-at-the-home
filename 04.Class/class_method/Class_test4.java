package class_method;

class ShopService {
	private static ShopService singleton = new ShopService();
	
	private ShopService() {}
	
	static ShopService getInstance() {
		return singleton;
	}
}

public class Class_test4 {

	public static void main(String[] args) {
		ShopService s1 = ShopService.getInstance();
		ShopService s2 = ShopService.getInstance();
		
		if(s1==s2) {
			System.out.println("같은 주소");
		} else {
			System.out.println("다른 주손");
		}
	}

}
