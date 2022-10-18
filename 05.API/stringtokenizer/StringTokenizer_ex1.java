package stringtokenizer;

import java.util.*;

public class StringTokenizer_ex1 {

	public static void main(String[] args) {
		String next = "홍길동/이수홍/박연수";

		//전체 토큰 수를 얻어 for문으로 루핑
		StringTokenizer st = new StringTokenizer(next, "/");
		int countTokens = st.countTokens();
		for(int i=1; i<=countTokens; i++) {
			String token = st.nextToken();
			System.out.println(token);
		}
		
		// hasmore을 이용 while문으로 루핑
		st = new StringTokenizer(next, "/");
		while(st.hasMoreTokens()) {
			String token = st.nextToken();
			System.out.println(token);
		}
	}

}
