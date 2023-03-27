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
			System.out.print("��¥�� �Է��ϼ���(ex. 2023 12 25): ");
			
			
			try {
				year = sc.nextInt();
				month = sc.nextInt();
				day = sc.nextInt();
				}
			catch(Exception e) {
				isLoop = true;
				sc.nextLine(); // ���ۿ� �����ִ� ���� ���� ���� Ŭ���� �ϴ� ������ ����(������ ������)
				System.out.println("\n�ùٸ� \"�� �� ��\" ���� �Է��ϼ���. \n");
			}
			
		}while(isLoop);
		
		sc.close();

		mydate = new MyDate(year,month,day);
		System.out.printf("�Է��Ͻ� %d�� %d�� %d���� %s���� �Դϴ�.",year,month,day,mydate.getTotalDay());		
	}

}
