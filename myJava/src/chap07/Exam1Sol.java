package chap07;

import java.util.*;

public class Exam1Sol {

	public static void main(String[] args) {
		int year, month, day, totalDays = 0;
		int [] monthLastDays = {-1,31,28,31,30,31,30,31,31,30,31,30,31};
		String [] weekDays = {"�Ͽ���", "������","ȭ����", "������", "�����", "�ݿ���", "�����"};
		
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("��¥�� �Է��ϼ���(ex. 2023 12 25): ");
		year = sc.nextInt();
		month = sc.nextInt();
		day = sc.nextInt();
		sc.close();
		
		//1. ���� 1�� ���� ����ڰ� �Է��� �⵵�� ���⵵ ������ �� �ϼ� ��� 
		for(int i = 1; i < year; i++) {
			if(i%4==0 && i%100!= 0 || i%400==0) {
				totalDays+=366;
			}
			else {
				totalDays+= 365;
			}
		}
		
		//2. ����ڰ� �Է��� �⵵�� 1������ ����ڰ� �Է��� ���� ���������� �� �ϼ� ��� 
		if(year%4==0 && year%100!= 0 || year%400==0) {
			monthLastDays[2]=29;
		}
		
		for(int i = 1; i<month; i++) {
			totalDays+=monthLastDays[i];
		}
		
		totalDays += day;
		
		System.out.printf("�Է��Ͻ� %d�� %d�� %d���� %s�Դϴ�.",year,month,day,weekDays[totalDays%7]);
		
	}

}
