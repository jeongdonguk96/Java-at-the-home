package generic;

class Product<T, M>{
	private T kind;
	private M model;
	
	public T getKind() {
		return kind;
	}
	
	public M getModel() {
		return model;
	}
	
	public void setKind(T kind) {
		this.kind = kind;
	}
	
	public void setModel(M model) {
		this.model = model;
	}	
}

class Tv{
	
}

class Car{
	
}

public class Generic_ex2 {

	public static void main(String[] args) {
		Product<Tv, String> product1 = new Product<Tv, String>();
		product1.setKind(new Tv());
		product1.setModel("스마트TV");

		Tv tv =  product1.getKind();
		String model = product1.getModel();
	}

}
