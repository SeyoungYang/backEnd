package chap07;

public class InterfaceTest {

	public static void main(String[] args) {
		
		InterfaceB b = new InterfaceImpl();
		
		System.out.println(InterfaceB.num);
		System.out.println(b.num);
		
//		InterfaceB.methodB(); �߻� �� ����Ʈ �޼���� �������̽� �̸��� �̿��ؼ� ������ �� ����.
		b.methodB();
		
		// InterfaceB.defaultMethod();
		b.defaultMethod();
		
		InterfaceB.staticMethod();
//		b.staticMethod(); static�޼���� ���������� ���ٺҰ�  
		
	}

}
