package chap07_weekDayCheck;

class MyDate {
	int year, month, day;
	
	MyDate(int year, int month, int day){
		this.year = year;
		this.month = month;
		this.day = day;
	}
	
	//윤년 판단 기능
	boolean isLeapYear(int year) {
		boolean result = false;
		if(year%4==0 && year%100!=0 || year%400==0) {
			result = true;
		}
		return result;
	}
	
	boolean isLeapYear() {
		return this.isLeapYear(this.year);
	}
	
	int monthLastDay(int month) {
		int []monthLastDay = {-1,31,28,31,30,31,30,31,31,30,31,30,31};
		
		if(isLeapYear()) {
			monthLastDay[2] = 29;
		}		
		return monthLastDay[month];
	}
	
	int totalDays() {
		int totalDay = this.day;
		
		for(int i = 1; i<year; i++) {
			if(this.isLeapYear(i)) {
				totalDay+=366;
			}else {
				totalDay+=365;
			}
		}
		
		for(int i = 1; i<month; i++) {
			totalDay+=this.monthLastDay(i);
		}	
		return totalDay;
	}
	
	String getTotalDay() {
		String []weekDay = {"일", "월","화", "수", "목", "금", "토"};
		
		return weekDay[totalDays()%7];
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
}
