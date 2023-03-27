package chap07.pacA;

public class Test {

	public static void main(String[] args) {
		Child c = new Child();
		
//		System.out.println(c.num1); 
// 접근제어자가 private인 num1은 자식 클래스에 상속되지 않기 때문에 오류가 남 
		System.out.println(c.num2);

	}

}
