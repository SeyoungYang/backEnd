package chap04;
import java.util.*;
/*
 문제 2
[윤년 계산 프로그램 작성하기]

사용자에게 년도를 입력받아 윤년 여부를 판단하여 결과를 출력하는 코드를 작성하세요.

[실행 예1]					[실행 예2]
 년도를 입력하세요 : 2023	 	년도를 입력하세요 : 2020		
 2023년은 평년입니다.			2020년은 윤년입니다.

[윤년 판단 알고리즘]
 1. 4의 배수인 해는 윤년입니다.
 2. 100의 배수인 해는 평년입니다.
 3. 400의 배수인 해는 윤년입니다.
 
  2020 : 윤년, 2100 : 평년, 2000 : 윤년, 2023 평년
  
  
  [코드 구현 방식]
  1. if ... else if ... else 구문을 사용하여 문제를 해결
  2. if ... else 구문을 사용하여 문제를 해결(중첩if 사용안함)
   
*/

public class Exam2 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		
		//구현방식 1
		System.out.print("년도를 입력하세요 : ");
		int year = sc.nextInt();
		String result = "";
	
		
		if(year%400==0) {
			result = "윤년";
		}
		else if(year%100==0) {
			result = "평년";
		}
		else if(year%4==0) {
			result = "윤년";
		}
		else {
			result = "평년";
		}
		
		System.out.printf("%d년은 %s입니다.\n",year, result);
		
		//구현방식 2
		System.out.print("년도를 입력하세요 : ");
		year = sc.nextInt();
		sc.close();
		
		if( year%4==0 & year%100!=0 | year%400==0 ) {
			result = "윤년";
		}
		else {
			result = "평년";
		}
		
		System.out.printf("%d년은 %s입니다.",year, result);		

	}

}
