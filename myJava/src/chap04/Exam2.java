package chap04;
import java.util.*;
/*
 ���� 2
[���� ��� ���α׷� �ۼ��ϱ�]

����ڿ��� �⵵�� �Է¹޾� ���� ���θ� �Ǵ��Ͽ� ����� ����ϴ� �ڵ带 �ۼ��ϼ���.

[���� ��1]					[���� ��2]
 �⵵�� �Է��ϼ��� : 2023	 	�⵵�� �Է��ϼ��� : 2020		
 2023���� ����Դϴ�.			2020���� �����Դϴ�.

[���� �Ǵ� �˰���]
 1. 4�� ����� �ش� �����Դϴ�.
 2. 100�� ����� �ش� ����Դϴ�.
 3. 400�� ����� �ش� �����Դϴ�.
 
  2020 : ����, 2100 : ���, 2000 : ����, 2023 ���
  
  
  [�ڵ� ���� ���]
  1. if ... else if ... else ������ ����Ͽ� ������ �ذ�
  2. if ... else ������ ����Ͽ� ������ �ذ�(��øif ������)
   
*/

public class Exam2 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		
		//������� 1
		System.out.print("�⵵�� �Է��ϼ��� : ");
		int year = sc.nextInt();
		String result = "";
	
		
		if(year%400==0) {
			result = "����";
		}
		else if(year%100==0) {
			result = "���";
		}
		else if(year%4==0) {
			result = "����";
		}
		else {
			result = "���";
		}
		
		System.out.printf("%d���� %s�Դϴ�.\n",year, result);
		
		//������� 2
		System.out.print("�⵵�� �Է��ϼ��� : ");
		year = sc.nextInt();
		sc.close();
		
		if( year%4==0 & year%100!=0 | year%400==0 ) {
			result = "����";
		}
		else {
			result = "���";
		}
		
		System.out.printf("%d���� %s�Դϴ�.",year, result);		

	}

}
