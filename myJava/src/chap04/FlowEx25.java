package chap04;
import java.util.*;

class FlowEx25 {
	public static void main(String[] args) { 
		int num = 0; 
		int sum = 0;

		System.out.print("���ڸ� �Է��ϼ���.(��:12345)>");
		Scanner scanner = new Scanner(System.in);
		num = scanner.nextInt(); // ȭ���� ���� �Է¹��� ������ tmp�� ����
		scanner.close();
		
		while(num!=0) {    
			// num�� 10���� ���� �������� sum�� ����
			sum += num%10; 	// sum = sum + num%10;
			System.out.printf("sum=%3d num=%d%n", sum, num);
			num /= 10;  // num = num / 10;  num�� 10���� ���� ���� �ٽ� num�� ����
		}
		
		System.out.println("�� �ڸ����� ��:"+ sum);
	}
}
