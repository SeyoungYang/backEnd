package chap07;
import java.util.*;
/*
    [요일 계산 프로그램 ver1.0]
    
    사용자에게 년, 월, 일을 입력받아 사용 예와 같이 입력받은 날짜의 요일을 반환하는 코드를 작성하세요.
    던, 외부 라이브러리를 사용하지 않고 모든 기능은 main() 메서드 안에서 직접 구현합니다.
    < 실행 예 >
    날짜를 입력하세요 : 2023 1 18
    입력하신 2023년 1월 18일은 수요일 입니다. 
    
    [힌트!!!]
    서기 1년 1월 1일은 월요일 입니다. > 서기 1년 2월 1일, 서기 2년 1년 1일 
    윤년 계산과 각 월의 마지막 일자 계산을 참고해서 한다.303
    
 */
public class Exam1 {

	public static void main(String[] args) {
		
		//사용자에게 입력받을 년,월,일 변수를 선언한다.
		int year, month, day, daySum;
		//요일 배열을 선언한다.
		String [] week = {"일요일", "월요일","화요일", "수요일", "목요일", "금요일", "토요일"};
		
		//사용자에게 안내메세지를 출력한 뒤 입력받는다.
		Scanner sc = new Scanner(System.in);
		System.out.print("날짜를 입력하세요 : ");
		year = sc.nextInt(); 
		month = sc.nextInt();
		day = sc.nextInt(); 
		daySum = day;
		sc.close();
		
		//먼저 년부터 일수로 변환해보자.
		
		for(int i = year-1; i>0; i--) {
			
			if( i%4==0 & i%100!=0 | i%400==0 ) {
				//윤년인 경우 366일
				daySum+=366;
			}
			else {
				//평년인 경우 365일 
				daySum+=365;
			}
		}
				
		//다음은 월이다. 월에 따라 31일 또는 30일을 더해주고 2월은 윤년 여부를 확인하고 29 또는 28을 더해준다.
		for(int i = 1; i<month ; i++) {
			switch(i) {
				case 4 : case 6: case 9: case 11:
				 daySum+=30; break;
				case 2:
					if( (year%4==0 & year%100!=0 | year%400==0) & month-1 >=2 ) {
						daySum+=29; break;
					}else {
						daySum+=28; break;
					}
				default:
					daySum+=31;
			}
		}
		System.out.printf("입력하신 %d년 %d월 %d일은 %s입니다.",year,month,day,week[daySum%7]);

	}

}
