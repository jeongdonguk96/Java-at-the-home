package interface_;

interface DataAccessObject {
	void select();
	void insert();
	void update();
	void delete();
}

class Oracle implements DataAccessObject {
	public void select() {
		System.out.println("Oracle에서 검색");
	}
	public void insert() {
		System.out.println("Oracle에서 삽입");
	}
	public void update() {
		System.out.println("Oracle에서 수정");
	}
	public void delete() {
		System.out.println("Oracle에서 삭제");
	}
}

class MySQL implements DataAccessObject {
	public void select() {
		System.out.println("MySQL에서 검색");
	}
	public void insert() {
		System.out.println("MySQL에서 삽입");
	}
	public void update() {
		System.out.println("MySQL에서 수정");
	}
	public void delete() {
		System.out.println("MySQL에서 삭제");
	}
}

public class Interface_test2 {

	static void dbWork(DataAccessObject dao) {
		dao.select();
		dao.insert();
		dao.update();
		dao.delete();
	}
	
	public static void main(String[] args) {
		dbWork(new Oracle());
		dbWork(new MySQL());
	}

}
