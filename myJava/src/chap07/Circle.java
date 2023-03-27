package chap07;

public class Circle extends Shape {
	
	Point center;
	int r;
	
	Circle(){
		this(new Point(), 100);
	}
	
	Circle(Point center, int r){
		this.center = center;
		this.r = r;
	}
	
}
