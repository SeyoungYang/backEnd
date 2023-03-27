package chap03;

public class OperatorEx33 {

	public static void main(String[] args) {
		boolean b1 = false, b2 = true;
		int i = 10;
		
		System.out.println(b1 & 10 == i++);
		System.out.println("i = "+i);
		System.out.println();
		
		i=10;
		System.out.println(b2 | 10 == i++ );
		System.out.println("i ="+i);
		System.out.println();
		
		i=10;
		System.out.println(b1 && 10 == i++ ); //&&나 ||일때 처음 피연산자에서 결정이 나면 뒤에 피연산자를 실행시키지 않고 값을 출력함 
		System.out.println("i ="+i);
		System.out.println();
		
		i=10;
		System.out.println(b2 || 10 == i++ );
		System.out.println("i ="+i);
		System.out.println();
	}

}
