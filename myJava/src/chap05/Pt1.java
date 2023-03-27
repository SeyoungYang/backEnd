package chap05;

public class Pt1 {

	public static void main(String[] args) {
		int[] lotto = {1,2,3,4,5,6};
		
		for(int i = 0 ; i<lotto.length; i++) {
			if(lotto[i] == 4) {
				System.out.println( i+1 + "번째 배열과 값이 같음");
			}else {
				continue;
			}
		}
		

	}

}
