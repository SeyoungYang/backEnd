package chap03;

import java.util.Scanner;

public class Exam2_sol {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.print("����Ͻ� �ݾ��� �Է��ϼ��� : ");
		int num1 = sc.nextInt();
		
		System.out.print("�����Ͻ� �ݾ��� �Է��ϼ��� : ");
		num1 -= sc.nextInt();
		
		sc.close();
		System.out.println("�Ž��� �� : " + num1+"��");
		System.out.println("500�� ¥�� ���� : " + num1/500 +"��");
		num1%=500;
		System.out.printf("100�� ¥�� ���� : " + num1/100+"��");
		num1%=100;
		System.out.println("50�� ¥�� ���� : " + num1/50+"��");
		num1%=50;
		System.out.println("10�� ¥�� ���� : " + num1%500%100%50/10+"��");
		num1%=10;
		System.out.println("������ �Ž����� : " + num1%500%100%50%10 +"��");
	}

}
