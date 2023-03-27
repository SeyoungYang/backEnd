package chap07;

public class Daycheck {
	int year, month, day, daySum, y, p;
	String [] week;
	
	Daycheck(int year,int month,int day){
		this.year = year;
		this.month = month;
		this.day = day;
		this.daySum = day;
		this.week = new String[]{"�Ͽ���", "������","ȭ����", "������", "�����", "�ݿ���", "�����"};
	}
	
	void DaySum() {
		for(int i = year-1; i>0; i--) {
					
					if( i%4==0 & i%100!=0 | i%400==0 ) {
						//������ ��� count
						y++;
					}
					else {
						//����� ��� count
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
		return "�Է��Ͻ� "+year+"�� "+month+"�� "+day+ "���� "+week[daySum%7]+"�Դϴ�.";
	}	
	
}
