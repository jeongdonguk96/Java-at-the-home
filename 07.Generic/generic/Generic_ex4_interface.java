package generic;

import java.util.Arrays;

interface Storage<T>{ // 인터페이스 생성
	public void add(T item, int index);
	public T get(int index);
}

class Inventory<T> implements Storage<T>{ // 인터페이스를 상속받았고 T가 배열로 밝혀짐
	private T[] array;
	
	public Inventory(int capacity) {      // 생성자에 정수를 입력하면 그 정수대로 배열의 길이가 정해짐
		this.array = (T[]) (new Object[capacity]);
	}
	
	@Override
	public void add(T item, int index) { // 참조변수 T와 정수를 입력하면 정수가 배열의 인덱스를 지정하고, T가 그 인덱스의 내용이 되는 add() 매서드
		array[index] = item;
	}
	
	@Override
	public T get(int index) { // 정수를 입력하면 입력한 정수에 해당하는 배열을 반환하는 get() 매서드
		return array[index];
	}

	@Override
	public String toString() {
		return "Inventory [array=" + Arrays.toString(array) + "]";
	}
}

public class Generic_ex4_interface {

	public static void main(String[] args) {
		Storage<Tv> storage = new Inventory<>(100);
		storage.add(new Tv(), 0);
		Tv tv = storage.get(0);
		System.out.println(tv);
	}

}
