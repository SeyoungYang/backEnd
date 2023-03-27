package chap06;

public class FactorialTest {
	
	static long factorial(int num) {
		long result = 0;
		
		if(num==1) {
			result = 1;
		}
		else {
			result = num * factorial(num-1);
		}
		
		return result;
	}
	public static void main(String[] args) {
		
		System.out.println(FactorialTest.factorial(5));

	}

}
