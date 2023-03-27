package chap04;
class FlowEx31 {
	public static void main(String[] args) {
		//1부터 100사이의 값 중 3의 배수인 값들의 합을 구하여 출력하는 코드를 작성하세요. 
		int sum = 0;
		int i = 1;
		
		while(i <= 100) {
			if (i % 3!=0) {
				i++;
				continue;
			}
			sum += i;
			i++;		
		}
//		for(int i = 1;i <= 100; i++) {
//			if (i % 3!=0) {
//				continue;
//			}
//			sum += i;
//		}
		
		System.out.println("1부터 100사이의 값 중 3의 배수인 값들의 합은 "+sum+"입니다.");
	}
}
