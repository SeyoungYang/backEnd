package chap02;
import java.util.*;    // Scanner�� ����ϱ� ���� �߰�

class ScannerEx { 
	public static void main(String[] args) { 
		Scanner scanner = new Scanner(System.in);

		System.out.print("ù ��° ������ �Է����ּ���: ");
		int num1 = scanner.nextInt();
		
		System.out.print("�� ��° ������ �Է����ּ���:");
		int num2 = scanner.nextInt();
		
		System.out.print("�� ���� ������ �Է����ּ���:");
		int num3 = scanner.nextInt();
		int num4 = scanner.nextInt();
 
		System.out.printf("num1: "+ num1 +", num2: " + num2+", num3: " + num3+", num4: " + num4);
		
		scanner.close();	
	} 
}
