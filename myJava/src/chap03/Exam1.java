package chap03;
import java.util.Scanner;

//����ڿ��� �ϳ��� �Ǽ��� �Է� �޾� ������ ����� ����ϴ� �ڵ带 �ۼ��Ͻÿ�.
//��,Math.round�� ������� �ʽ��ϴ�.
//		[������ 1]   				[������ 2]
//		�ϳ��� �Ǽ��� �Է��ϼ��� : 3.64   �ϳ��� �Ǽ��� �Է��ϼ��� : 3.27
//		
//		���� : 3						���� : 3
//		�ݿø� : 4 					�ݿø� : 3 			

public class Exam1 {

	public static void main(String[] args) {
			Scanner sc = new Scanner(System.in);
			
			System.out.print("�ϳ��� �Ǽ��� �Է��ϼ��� : ");
			float num1 = sc.nextFloat();
			sc.close();
			
			int num2 = (int)(num1);
			
			System.out.println("���� : "+ num2);
			num2 += 1;
			num1 = num2 - num1 <= 0.5? num2 : (int)num1;  
			System.out.println("�ݿø� : "+ (int)(num1));
			
	}

}
