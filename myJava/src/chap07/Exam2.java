package chap07;
import java.util.*;

public class Exam2 {
/*
    [요일 계산 프로그램 ver2.0]
    
    사용자에게 년, 월, 일을 입력받아 사용 예와 같이 입력받은 날짜의 요일을 반환하는 코드를 작성하세요.
    던, 외부 라이브러리를 사용하지 않고 	객체지향적으로 구현합니다.
    < 실행 예 >
    날짜를 입력하세요 : 2023 1 18
    입력하신 2023년 1월 18일은 수요일 입니다. 
    
    [힌트!!!]
    서기 1년 1월 1일은 월요일 입니다. > 서기 1년 2월 1일, 서기 2년 1년 1일 
    윤년 계산과 각 월의 마지막 일자 계산을 참고해서 한다.
    
 */

	public static void main(String[] args) {
		int year, month, day;
		
		Scanner sc = new Scanner(System.in);
		System.out.print("날짜를 입력하세요 : ");
		year = sc.nextInt(); 
		month = sc.nextInt();
		day = sc.nextInt(); 
		
		Daycheck dc = new Daycheck(year,month,day);
		
		dc.DaySum();
		System.out.println(dc.toString());		
	}

}
