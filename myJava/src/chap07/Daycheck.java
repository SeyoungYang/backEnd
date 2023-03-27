package chap07;

public class Daycheck {
	int year, month, day, daySum, y, p;
	String [] week;
	
	Daycheck(int year,int month,int day){
		this.year = year;
		this.month = month;
		this.day = day;
		this.daySum = day;
		this.week = new String[]{"일요일", "월요일","화요일", "수요일", "목요일", "금요일", "토요일"};
	}
	
	void DaySum() {
		for(int i = year-1; i>0; i--) {
					
					if( i%4==0 & i%100!=0 | i%400==0 ) {
						//윤년인 경우 count
						y++;
					}
					else {
						//평년인 경우 count
						p++;
					}
				}
		daySum += y*366 + p*365;
		
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
	}
	public String toString() {
		return "입력하신 "+year+"년 "+month+"월 "+day+ "일은 "+week[daySum%7]+"입니다.";
	}	
	
}
