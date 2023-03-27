package chap06;

public class Circle {
	static double pi = 3.141592;
	int radius;
	
	static {
		Circle.pi = 3.141592;
	}
	Circle(int radius){
		this.radius = radius;
	}
	
	public double getCircleArea() {
		return radius * radius * pi;
	}
	
	static void setPi(double pi) {
		Circle.pi = pi;
	}

}
