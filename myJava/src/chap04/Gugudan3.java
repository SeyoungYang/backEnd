package chap04;
/*
2단 부터 9단 까지의 구구단 결과를 실행 예시와 같이 출력하는 코드를 작성하세요
단, 중첩 반복문은 사용할 수 없고 하나의 for 반복문만 사용합니다.
 [실행 예]
   [ 2단 ]
 2 * 1 =  2
 2 * 2 =  4
  ...
 2 * 9 = 18
  
  [ 3단 ]
  3 * 1 = 3
    ...
     
 */
public class Gugudan3 {

	public static void main(String[] args) {
		int dan = 2, num= 1;
		System.out.printf(" [ %d 단 ] \n", dan);
		for(int i=0; i<72; i++) {
			System.out.printf("%d * %d = %2d \n", dan, num, dan*num);
			num++;
			if(num == 10) {
				System.out.println();
				num =1;
				dan++;
				if(dan!=10) {
					System.out.printf(" [ %d 단 ] \n", dan);
				}
			}
		}
	}

}
