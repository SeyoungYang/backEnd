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
//		 1���� 100������ ���� 5050�Դϴ�. 
//		 �׷��ٸ� 1���� ������� ���� ���ʷ� 1000�� �ʰ��ϴ� ���ϱ��?
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
//		System.out.printf("1���� %d������ ���� %d �Դϴ�.",i,sum);
		
	} 
}
