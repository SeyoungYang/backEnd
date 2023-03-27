package chap04;
import java.util.*;


/*
 문제3
[월의 마지막 일자 계산 프로그램 작성하기]

사용자에게 년도를 월을 입력받아 해당 월의 마지막 일자를 출력하는 코드를 작성하세요.

 [실행 예1]					
 년도와 월을 입력하세요 : 2023 1	 	
 2023년 1월의 마지막 일자는 31일 입니다.	
 
 [실행 예2]					
 년도와 월을 입력하세요 : 2020 2	 	
 2020년 2월의 마지막 일자는 29일 입니다.	

[ 각 월의 마지막 일자 ]
 1. 큰달 : 1, 3, 5, 7, 8, 10, 12 => 31
 2. 작은 달 : 4, 6, 9, 11 =>30
 3. 2월 : 윤년 => 29일, 평년 => 28일 
     
*/


public class Exam3 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.print("년도와 월을 입력하세요 : ");
		int year = sc.nextInt(); 
		int month = sc.nextInt();
		int result;
		sc.close();
		
		if(month == 1 | month == 3 | month == 5 | month == 7 | month == 8 | month == 10 | month == 12) {
				result = 31;
		}
		else if(month == 2) {
			if(year%4==0 & year%100!=0 | year%400==0 ) {
				result = 29;
			}
			else {
				result = 28;
			}
		}
		else {
			result = 30;
		}
		
		System.out.printf("%d년 %d월의 마지막 일자는 %d일 입니다.",year, month, result);
		
	}

}
