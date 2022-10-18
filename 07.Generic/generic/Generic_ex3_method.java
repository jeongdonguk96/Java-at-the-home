package generic;

class Util {
	public static <K, V> boolean compare(Pair<K, V> p1, Pair<K, V> p2) {
		boolean keyCompare = p1.getKey().equals(p2.getKey());
		boolean valueCompare = p1.getValue().equals(p2.getValue());
		return keyCompare && valueCompare;
	}
}

class Pair<K, V> {
	private K key;
	private V value;
	
	public Pair(K key, V value) {
		this.key = key;
		this.value = value;
	}

	public K getKey() {
		return key;
	}

	public V getValue() {
		return value;
	}

	public void setKey(K key) {
		this.key = key;
	}

	public void setValue(V value) {
		this.value = value;
	}	
}

public class Generic_ex3_method {

	public static void main(String[] args) {
		Pair <Integer, String> p1 = new Pair<>(1, "사과");
		Pair <Integer, String> p2 = new Pair<>(1, "사과");
		
		boolean result1 = Util.compare(p1, p1);
		
		if(result1) {
			System.out.println("주소가 동등한 객체입니다.");
		} else {
			System.out.println("주소가 동등하지 않은 객체입니다.");
		}
		
		if(p1==p2)  {
			System.out.println("내용이 동등한 객체입니다.");
		} else {
			System.out.println("내용이 동등하지 않은 객체입니다.");
		}
	}

}
