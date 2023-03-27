package chap02;

import java.util.*;

class Change{
	int change(int num, int hope, char[] b) {
		int bLength = 0;
		
		String dchar = "0123456789ABCDEFGHIJKLMNOPQRSTUVWXYZ";
		
		do {
			b[bLength++] = dchar.charAt(num%hope);
			num /= hope;
		}while(num!=0);
		//배열 뒤집기
		for(int i = 0; i<bLength/2; i++) {
			char c = b[i];
			b[i] = b[bLength-1-i];
			b[bLength-1-i] = c;
		}
		return bLength;
	}
	
}






public class changeNumber {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int num, hope, ag, blength;
		boolean again = true;
		char [] cn = new char[32];
		
		do {
			do {
				System.out.print("변환할 정수를 입력하세요 : ");
				num = sc.nextInt();
			}while(num<0); 
			do{
				System.out.print("몇 진수로 변환할까요? (2~32) ");
				hope = sc.nextInt();
				
			}while(2>hope || hope>32);
			
			Change ch = new Change();
			blength = ch.change(num, hope, cn);
			
			System.out.print(hope+"진수로 변환한 결과 입니다 : ");
			for(int i = 0 ; i< blength; i++) {
				System.out.print(cn[i]);
			}
			
			System.out.println("\n계속하시겠습니까? 1또는 2를 입력하세요 (1.예 2.아니요) ");
			ag = sc.nextInt();
			if(ag==2) again = false;
			
		}while(again);
		
			

	}

}
