package chap04;

public class Gugudan7 {

	public static void main(String[] args) {
		
		int num = 0;
		
		while(num < 10) {
			int dan = 2;
			while(dan < 10) {
				
				if(num==0) {
					System.out.printf(" [ %d ´Ü ] \t", dan);
				}
				else {
				System.out.printf("%d * %d = %2d \t", dan, num, dan*num);
				}
				
				dan++;
			}	
			
			System.out.println();
			num++;	
			
		}
			
		
		
//		for(int num = 0; num < 10; num++) {
//			for(int dan = 2; dan < 10; dan++) {
//				if(num==0) {
//					System.out.printf(" [ %d ´Ü ] \t", dan);
//				}
//				else {
//				System.out.printf("%d * %d = %2d \t", dan, num, dan*num);
//				}
//			}
//			System.out.println();	
//		}
	}

}
