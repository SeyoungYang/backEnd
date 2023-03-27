package chap07;

import java.util.*;

public class Exam1Sol {

	public static void main(String[] args) {
		int year, month, day, totalDays = 0;
		int [] monthLastDays = {-1,31,28,31,30,31,30,31,31,30,31,30,31};
		String [] weekDays = {"일요일", "월요일","화요일", "수요일", "목요일", "금요일", "토요일"};
		
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("날짜를 입력하세요(ex. 2023 12 25): ");
		year = sc.nextInt();
		month = sc.nextInt();
		day = sc.nextInt();
		sc.close();
		
		//1. 서기 1년 부터 사용자가 입력한 년도의 전년도 까지의 총 일수 계산 
		for(int i = 1; i < year; i++) {
			if(i%4==0 && i%100!= 0 || i%400==0) {
				totalDays+=366;
			}
			else {
				totalDays+= 365;
			}
		}
		
		//2. 사용자가 입력한 년도의 1월부터 사용자가 입력한 월의 전월까지의 총 일수 계산 
		if(year%4==0 && year%100!= 0 || year%400==0) {
			monthLastDays[2]=29;
		}
		
		for(int i = 1; i<month; i++) {
			totalDays+=monthLastDays[i];
		}
		
		totalDays += day;
		
		System.out.printf("입력하신 %d년 %d월 %d일은 %s입니다.",year,month,day,weekDays[totalDays%7]);
		
	}

}
