package chap07;

import java.util.*;

public class Exam1SolSelf {
	
	public static void main(String[] args) {
	int year, month, day, totalDays;
	Scanner sc = new Scanner(System.in);
	int [] monthLastDay = { -1, 31,28,31,30,31,30,31,31,30,31,30,31};
	String [] weekDay = {"��","��","ȭ","��","��","��","��"};
	
	System.out.println("��¥�� �Է��ϼ��� : ");
	year = sc.nextInt();
	month= sc.nextInt();
	day = sc.nextInt();
	totalDays = day;
	sc.close();
	
	
	for(int i = 1; i < year; i++) {
		if( i%4 == 0 && i%100 !=0 || i%400 == 0) {
			totalDays+=366;
		}else {
			totalDays+=365;
		}
	}
	
	if( year%4 == 0 && year%100 !=0 || year%400 == 0) {
			monthLastDay[2] = 29;
		}
		
	for(int i = 1; i<month; i++) {
			totalDays+=monthLastDay[i];
		}
		
	System.out.printf("�Է��Ͻ� %d�� %d�� %d���� %s���� �Դϴ�.",year,month,day,weekDay[totalDays%7]);
	
	}
}
