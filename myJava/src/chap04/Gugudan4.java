package chap04;

//중첩 반복문 사용 

public class Gugudan4 {

	public static void main(String[] args) {

		for(int dan = 2; dan < 10; dan++) {
			for(int num = 1; num < 10; num++) {
					System.out.printf("%d * %d = %2d \n", dan, num, dan*num);
			}
		}
	}
}
