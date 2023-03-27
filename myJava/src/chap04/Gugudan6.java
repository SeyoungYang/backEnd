package chap04;

//수평 구구단

public class Gugudan6 {

	public static void main(String[] args) {
		for(int num = 1; num < 10; num++) {
			for(int dan = 2; dan < 10; dan++) {
					System.out.printf("%d * %d = %2d \t", dan, num, dan*num);
			}
			System.out.println();
		}
		

	}

}
