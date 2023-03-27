package chap06;

public class CircleTest {

	public static void main(String[] args) {
		Circle c1, c2;
		Circle.pi = 3.141592;
		
		c1 = new Circle(5);
		
		System.out.println(c1.getCircleArea());
		
		c2 = new Circle(6);
		
		System.out.println(c2.getCircleArea());

	}
}
