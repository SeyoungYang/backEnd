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
		System.out.println(b1 && 10 == i++ ); //&&�� ||�϶� ó�� �ǿ����ڿ��� ������ ���� �ڿ� �ǿ����ڸ� �����Ű�� �ʰ� ���� ����� 
		System.out.println("i ="+i);
		System.out.println();
		
		i=10;
		System.out.println(b2 || 10 == i++ );
		System.out.println("i ="+i);
		System.out.println();
	}

}
