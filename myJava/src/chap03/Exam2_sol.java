package chap03;

import java.util.Scanner;

public class Exam2_sol {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.print("계산하실 금액을 입력하세요 : ");
		int num1 = sc.nextInt();
		
		System.out.print("구매하신 금액을 입력하세요 : ");
		num1 -= sc.nextInt();
		
		sc.close();
		System.out.println("거스름 돈 : " + num1+"원");
		System.out.println("500원 짜리 동전 : " + num1/500 +"개");
		num1%=500;
		System.out.printf("100원 짜리 동전 : " + num1/100+"개");
		num1%=100;
		System.out.println("50원 짜리 동전 : " + num1/50+"개");
		num1%=50;
		System.out.println("10원 짜리 동전 : " + num1%500%100%50/10+"개");
		num1%=10;
		System.out.println("나머지 거스름돈 : " + num1%500%100%50%10 +"원");
	}

}
