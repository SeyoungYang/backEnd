package chap03;
class OperatorEx8 {
	public static void main(String args[]) { 
		int a = 1000000;    // 1,000,000   1백만 
		int b = 2000000;    // 2,000,000   2백만 

		long c = a * b;     // a * b = 2,000,000,000,000 ? int*int는 int이기 때문에 순환된 숫자가 출력
		
		System.out.println(c);
		
		long c1 = (long)a * b; //하나만 형변환해도 나머지 하나가 암묵적인 형변환이 
		
		System.out.println(c1);
	}
}
