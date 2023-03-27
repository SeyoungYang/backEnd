package chap04;
class FlowEx26 {
	public static void main(String[] args) { 
		
		int sum = 0;
		int i   = 0;
		
		
		while(sum <= 100) {	
			i++;
			sum += i;
			System.out.printf("%d - %d%n", i, sum);	
			if(sum>100) {
				break;
			}
		}
		
		
//		while((sum += ++i) <= 100) {
//			System.out.printf("%d - %d%n", i, sum);
//		}

	
		
//		/*
//		 1부터 100까지의 합은 5050입니다. 
//		 그렇다면 1부터 몇까지의 합이 최초로 1000을 초과하는 값일까요?
//		 */
//		int sum = 0;
//		int i   = 0;
//
//		while(sum <= 1000) { 
//			i++;
//			sum+=i;
//			System.out.printf("%d - %d%n", i, sum);
//			
//		}
//		System.out.printf("1부터 %d까지의 합은 %d 입니다.",i,sum);
		
	} 
}
