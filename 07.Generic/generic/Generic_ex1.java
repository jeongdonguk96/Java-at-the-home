package generic;

class Box<T> {
	private T t;
	
	public T get() {
		return t;
	}
	
	public void set(T t) {
		this.t = t;
	}
}

public class Generic_ex1 {

	public static void main(String[] args) {
		Box<String> box = new Box<>();
		box.set("Hello");
		String str = box.get();
		System.out.println(str);		
	}

}
