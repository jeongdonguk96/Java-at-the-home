package exception;

class FileInputStream implements AutoCloseable{
	private String file;

	public FileInputStream(String file) {
		this.file = file;
	}
	
	void read() {
		System.out.printf("%s을 읽습니다.\n", file);
	}
	
	public void close() throws Exception {
		System.out.printf("%s을 읽습니다.\n", file);
	}
}

public class Exception_ex1 {

	public static void main(String[] args) {
		
		try (FileInputStream fs = new FileInputStream("file.txt")){
			fs.read();
			throw new Exception();
		} catch(Exception e) {
			System.out.println("예외처리코드 실행");
		}
	}

}
