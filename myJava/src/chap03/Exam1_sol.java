package chap03;
import java.util.Scanner;

public class Exam1_sol {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.print("�ϳ��� �Ǽ��� �Է��ϼ��� : ");
		float num1 = sc.nextFloat();
		sc.close();
		
		System.out.println("���� : "+ (int)(num1));
		System.out.println("�ݿø� : "+(int)(num1+0.5));
	}
}
