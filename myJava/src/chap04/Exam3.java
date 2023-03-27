package chap04;
import java.util.*;


/*
 ����3
[���� ������ ���� ��� ���α׷� �ۼ��ϱ�]

����ڿ��� �⵵�� ���� �Է¹޾� �ش� ���� ������ ���ڸ� ����ϴ� �ڵ带 �ۼ��ϼ���.

 [���� ��1]					
 �⵵�� ���� �Է��ϼ��� : 2023 1	 	
 2023�� 1���� ������ ���ڴ� 31�� �Դϴ�.	
 
 [���� ��2]					
 �⵵�� ���� �Է��ϼ��� : 2020 2	 	
 2020�� 2���� ������ ���ڴ� 29�� �Դϴ�.	

[ �� ���� ������ ���� ]
 1. ū�� : 1, 3, 5, 7, 8, 10, 12 => 31
 2. ���� �� : 4, 6, 9, 11 =>30
 3. 2�� : ���� => 29��, ��� => 28�� 
     
*/


public class Exam3 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.print("�⵵�� ���� �Է��ϼ��� : ");
		int year = sc.nextInt(); 
		int month = sc.nextInt();
		int result;
		sc.close();
		
		if(month == 1 | month == 3 | month == 5 | month == 7 | month == 8 | month == 10 | month == 12) {
				result = 31;
		}
		else if(month == 2) {
			if(year%4==0 & year%100!=0 | year%400==0 ) {
				result = 29;
			}
			else {
				result = 28;
			}
		}
		else {
			result = 30;
		}
		
		System.out.printf("%d�� %d���� ������ ���ڴ� %d�� �Դϴ�.",year, month, result);
		
	}

}
