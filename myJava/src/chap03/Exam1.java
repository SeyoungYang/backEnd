package chap03;
import java.util.Scanner;

//사용자에게 하나의 실수를 입력 받아 다음의 결과를 출력하는 코드를 작성하시오.
//단,Math.round는 사용하지 않습니다.
//		[실행결과 1]   				[실행결과 2]
//		하나의 실수를 입력하세요 : 3.64   하나의 실수를 입력하세요 : 3.27
//		
//		버림 : 3						버림 : 3
//		반올림 : 4 					반올림 : 3 			

public class Exam1 {

	public static void main(String[] args) {
			Scanner sc = new Scanner(System.in);
			
			System.out.print("하나의 실수를 입력하세요 : ");
			float num1 = sc.nextFloat();
			sc.close();
			
			int num2 = (int)(num1);
			
			System.out.println("버림 : "+ num2);
			num2 += 1;
			num1 = num2 - num1 <= 0.5? num2 : (int)num1;  
			System.out.println("반올림 : "+ (int)(num1));
			
	}

}
