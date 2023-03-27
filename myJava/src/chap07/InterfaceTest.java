package chap07;

public class InterfaceTest {

	public static void main(String[] args) {
		
		InterfaceB b = new InterfaceImpl();
		
		System.out.println(InterfaceB.num);
		System.out.println(b.num);
		
//		InterfaceB.methodB(); 추상 및 디폴트 메서드는 인터페이스 이름을 이용해서 접근할 수 없다.
		b.methodB();
		
		// InterfaceB.defaultMethod();
		b.defaultMethod();
		
		InterfaceB.staticMethod();
//		b.staticMethod(); static메서드는 참조변수로 접근불가  
		
	}

}
