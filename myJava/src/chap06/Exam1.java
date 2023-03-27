package chap06;

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
		int []num = {0,0,0,0,0,0};
		Lotto lotto = new Lotto();
		
		lotto.lotto(num);
		System.out.println(lotto.toString());
		
		lotto.sort(num);
		System.out.println(lotto.toString());
		
				
	}

}
