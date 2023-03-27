package chap07;

import chap07.pacA.InterfaceA;

public interface InterfaceB extends InterfaceA{
	int num = 1234;
	
	void methodB();
	
	default void defaultMethod() {
		System.out.println("InterfaceB.defaultMethod() 호출!");
		System.out.println("num: "+num);
	}
	
	static void staticMethod() {
		System.out.println("InterfaceB.staticMethod() 호출!");
		System.out.println("num: "+num); //interface에서만 접근이 되는 것
	}

}
