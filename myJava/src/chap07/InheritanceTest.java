package chap07;

public class InheritanceTest {

	public static void main(String[] args) {
		Parent p = new Child();
		Child c = new Child();
		
		p.methodA();
		System.out.println(p.a);
		
		c.methodA();
		System.out.println(c.a);
		

	}

}
