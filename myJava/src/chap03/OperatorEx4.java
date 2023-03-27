package chap03;
class OperatorEx4 {
	public static void main(String[] args) {
		
		int i = -10;
		i = +i;
		System.out.println(i);

		i=-10;
		i = -i;
		System.out.println(i);
		
		int num1 = 7, num2 = 4; //num2 : 0100, 1의 보수(비트 반전) = ~num2 : 1011, 2의 보수 = 1의 보수 + 1
		int result1 = num1 - num2;
		int result2 = num1 + (~num2+1); //~비트전환 연산자 
		
		System.out.println("result = "+ result1 );
		System.out.println("result = "+ result2 );
		
		boolean b = true;
		
		System.out.println("b = "+ !b);
		
		
	}
}
