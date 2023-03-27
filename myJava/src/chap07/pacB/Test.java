package chap07.pacB;

public class Test {

	public static void main(String[] args) {
		Child c = new Child();
		
//		System.out.println(c.num1);
//		System.out.println(c.num2);
		
/*		System.out.println(c.methodA());
		메서드 A는 protected임으로 다른 패키지에 있는 부모의 자식만이 
		접근 가능함  */
		
		System.out.println(c.methodB());
		System.out.println(c.methodC());
	
	}

}
