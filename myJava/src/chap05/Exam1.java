package chap05;

import java.util.Arrays;

/*
 
  크기가 6인 정수형 배열을 만든 후 
  1부터 45 사이의 중복되지 않는 로또 번호를 생성하여
  크기 순서대로 저장한 후 출력하는 코드를 작성하세요. 
  
  단,Lotto 클래스를 생성하고 객체지향적으로 문제를 해결하는 코드를 작성하세
   
   [실행 예]
   로또 번호 : 3 14 21 29 33 42
   
 */

public class Exam1 {

	public static void main(String[] args) {
		int[] lotto = new int[6];
		int i = 0;
		int j;
		
		
		//중복 제거 
		while(lotto[lotto.length-1]==0) {
			int random = (int)(Math.random()*44)+1;
			for(i=0;i<lotto.length;i++) {
				if(lotto[i]==random) {
					break;
				}
				else if(lotto[i]==0) {
					lotto[i]=random;
					break;
				}			
			}
		}
		
		//결과 출력 
		System.out.println("로또번호 정렬 전 :" + Arrays.toString(lotto));
		
			//오름차순 정렬 
			for (i=0; i < lotto.length; i++ ) {
				for(j=0; j < lotto.length-i-1; j++)
					if(lotto[j] < lotto[j+1]) {
						int tmp = lotto[j];
						lotto[j] = lotto[j+1];
						lotto[j+1] = tmp;
				}
			}			
			
			//결과 출력 
			System.out.println("로또 번호 :" + Arrays.toString(lotto));
	}

}
