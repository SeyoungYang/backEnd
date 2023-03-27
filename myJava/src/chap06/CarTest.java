package chap06;

public class CarTest {

	public static void main(String[] args) {
		Car c1,c2;
		
		c1 = new Car();
		c2 = new Car("초록","자동", 2);
		
		System.out.println(c1.toString());
		System.out.println(c2.toString());
	}

}
