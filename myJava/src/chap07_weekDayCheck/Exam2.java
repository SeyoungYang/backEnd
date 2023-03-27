package chap07_weekDayCheck;


import java.util.*;

public class Exam2 {

	public static void main(String[] args) {
		int year=0 , month=0, day=0;
		boolean isLoop;
		MyDate mydate;
		Scanner sc = new Scanner(System.in);
		
		do{
			isLoop = false;
			System.out.print("날짜를 입력하세요(ex. 2023 12 25): ");
			
			
			try {
				year = sc.nextInt();
				month = sc.nextInt();
				day = sc.nextInt();
				}
			catch(Exception e) {
				isLoop = true;
				sc.nextLine(); // 버퍼에 남아있는 공백 등의 값을 클리어 하는 역할을 수행(없으면 오류남)
				System.out.println("\n올바른 \"년 월 일\" 값을 입력하세요. \n");
			}
			
		}while(isLoop);
		
		sc.close();

		mydate = new MyDate(year,month,day);
		System.out.printf("입력하신 %d년 %d월 %d일은 %s요일 입니다.",year,month,day,mydate.getTotalDay());		
	}

}
