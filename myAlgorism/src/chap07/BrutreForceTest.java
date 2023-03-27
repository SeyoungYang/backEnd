package chap07;

public class BrutreForceTest {

	public static void main(String[] args) {
		String text = "ABABCDEFGHA";
		String pattern = "ABCff";
		
		int tx=0, pt = 0;
		
		
		while(tx != text.length() && pt != pattern.length()) {
			if(text.charAt(tx)==pattern.charAt(pt)) {
				tx++;
				pt++;
			}else {
				tx = tx-pt+1;
				pt = 0; 
			}
				
		}
		if(pt == pattern.length()) {
			System.out.println((tx-pt+1)+"번째 문자부터 "+tx+"번째 문자까지 일치합니다.");
		}else {
			System.out.println("검색 실패");
		}
		
	for(int i = 0; i<text.length()-pattern.length();i++) {
		boolean isEqual = true;
		for(int j=i; j<i+pattern.length();j++) {
			if(text.charAt(j) != pattern.charAt(j-i)) {
				isEqual = false;
				break;
			}
		}
		if(isEqual) {
			System.out.println((i+1)+"번째 문자부터 "+(i+pattern.length())+"번째 문자까지 일치합니다.");
			break;
		}
	}
		
		
		
		
		

	}

}
