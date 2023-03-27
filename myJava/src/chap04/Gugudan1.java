package chap04;
import java.util.*;

/*
 사용자에게 2단 부터 9단 사이의 구구단의 단을 입력 받아 해당 구구단의 결과를 출력하는 코드를 작성하세요
 
  [실행 예]
  [7단]
  7*1 = 7
  .
  .
  .
  7*9 = 63
  */

public class Gugudan1 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("구구단의 단을 입력하세요: ");
		int gu = sc.nextInt();
		sc.close();
		
		System.out.printf("[ %d단 ]\n", gu);
		
		for(int j=1;j<10;j++) {
			System.out.printf("%d * %d = %2d \n", gu, j, gu*j);
		}
			

	}

}
