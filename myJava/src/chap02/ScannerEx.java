package chap02;
import java.util.*;    // Scanner를 사용하기 위해 추가

class ScannerEx { 
	public static void main(String[] args) { 
		Scanner scanner = new Scanner(System.in);

		System.out.print("첫 번째 정수를 입력해주세요: ");
		int num1 = scanner.nextInt();
		
		System.out.print("두 번째 정수를 입력해주세요:");
		int num2 = scanner.nextInt();
		
		System.out.print("두 개의 정수를 입력해주세요:");
		int num3 = scanner.nextInt();
		int num4 = scanner.nextInt();
 
		System.out.printf("num1: "+ num1 +", num2: " + num2+", num3: " + num3+", num4: " + num4);
		
		scanner.close();	
	} 
}
