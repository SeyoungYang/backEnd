package chap04;
import java.util.*;

/*
 ����ڿ��� 2�� ���� 9�� ������ �������� ���� �Է� �޾� �ش� �������� ����� ����ϴ� �ڵ带 �ۼ��ϼ���
 
  [���� ��]
  [7��]
  7*1 = 7
  .
  .
  .
  7*9 = 63
  */

public class Gugudan1 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("�������� ���� �Է��ϼ���: ");
		int gu = sc.nextInt();
		sc.close();
		
		System.out.printf("[ %d�� ]\n", gu);
		
		for(int j=1;j<10;j++) {
			System.out.printf("%d * %d = %2d \n", gu, j, gu*j);
		}
			

	}

}
