package ojdbc;

import java.util.ArrayList;

public class ArrayListTest {

	public static void main(String[] args) {
		ArrayList<JdbcTest> rows = new ArrayList<JdbcTest>();
		rows.add(new JdbcTest("양세영","tpdud07@naver.com"));
		rows.add(new JdbcTest("홍길동","park@nate.com"));
		rows.add(new JdbcTest("박찬호","hong@naver.com"));

	// rows에 저장된 모든 회원 정보를 출력하는 코드를 작성하세요.	
		for(JdbcTest i : rows) {
			System.out.println(i.getUsername()+"\t"+ i.getEmail());
		}	
	}
}
