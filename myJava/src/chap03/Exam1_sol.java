package chap03;
import java.util.Scanner;

public class Exam1_sol {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.print("하나의 실수를 입력하세요 : ");
		float num1 = sc.nextFloat();
		sc.close();
		
		System.out.println("버림 : "+ (int)(num1));
		System.out.println("반올림 : "+(int)(num1+0.5));
	}
}
