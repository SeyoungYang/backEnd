package chap07;

import chap07.pacA.InterfaceA;

public interface InterfaceB extends InterfaceA{
	int num = 1234;
	
	void methodB();
	
	default void defaultMethod() {
		System.out.println("InterfaceB.defaultMethod() ȣ��!");
		System.out.println("num: "+num);
	}
	
	static void staticMethod() {
		System.out.println("InterfaceB.staticMethod() ȣ��!");
		System.out.println("num: "+num); //interface������ ������ �Ǵ� ��
	}

}
