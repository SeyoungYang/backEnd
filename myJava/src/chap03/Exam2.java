package chap03;
import java.util.Scanner;

/* �Ž����� ��ȯ ���α׷��� ������ ���� �����ϼ���.
 	��, ������ ū ������ �켱���� ��ȯ�ϰ�, �����ϸ� �ϳ��� ������ ����մϴ�. 
 	[���� ���] 
 	
 	����Ͻ� �ݾ��� �Է��ϼ��� : 10000 
 	�����Ͻ� �ݾ��� �Է��ϼ��� : 6234 
 	
 	�Ž��� �� : 3766�� 
 	500�� ¥�� ���� : 13��  
 	100�� ¥�� ���� : 2�� 
 	50�� ¥�� ���� : 1�� 
 	10�� ¥�� ���� : 1�� 
 	������ �Ž����� : 6�� 
 	*/
public class Exam2 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.print("����Ͻ� �ݾ��� �Է��ϼ��� : ");
		int num1 = sc.nextInt();
		
		System.out.print("�����Ͻ� �ݾ��� �Է��ϼ��� : ");
		num1 -= sc.nextInt();
		
		sc.close();
		System.out.println("�Ž��� �� : " + num1+"��");
		System.out.println("500�� ¥�� ���� : " + num1/500 +"��");
		System.out.println("100�� ¥�� ���� : " + num1%500/100+"��");
		System.out.println("50�� ¥�� ���� : " + num1%500%100/50+"��");
		System.out.println("10�� ¥�� ���� : " + num1%500%100%50/10+"��");
		System.out.println("������ �Ž����� : " + num1%500%100%50%10 +"��");
	}

}
