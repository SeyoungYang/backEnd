package chap04;

public class Gugudan5 {

	public static void main(String[] args) {
		
		for(int dan = 2; dan < 10; dan++) {
			System.out.printf("\n [ %d ´Ü ] \n", dan);
			for(int num = 1; num < 10; num++) {
					System.out.printf("%d * %d = %2d \n", dan, num, dan*num);
			}
		}
	}
}
