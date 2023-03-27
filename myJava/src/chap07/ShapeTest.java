package chap07;

public class ShapeTest {

	public static void main(String[] args) {
		Circle c1 = new Circle(); 
		/*Circle클래스 생성자로 인해 Point클래스의 인수를 넘겨주지 
		  않고 r이 100으로 초기화되는 인스턴스가 생성된다. */
		Circle c2 = new Circle(new Point(150,150), 50);
		/* Circle클래스의 생성자로 인해 Circle클래스에 있는 Point클래스 타입 변수 center 에서  */
		Point p1,p2,p3;
		Point [] pArr;
		p1 = new Point(100,100);
		p2 = new Point(140,50);
		p3 = new Point(200,100);
		pArr = new Point[] {p1,p2,p3};
		
		Triangle t1 = new Triangle(pArr);
		Triangle t2 = new Triangle(p1, p2, p3);
		
		System.out.println( c1.color +":"+ c1.center.x + ":" + 
		                    c1.center.y + ":" + c1.r );
		System.out.println(c1.draw());
		System.out.println("------------------------------");
		
		System.out.println( c2.color +":"+ c2.center.x + ":" + 
                c2.center.y + ":" + c2.r );
		System.out.println(c2.draw());
		System.out.println("------------------------------");
		
		System.out.println( t1.color +":("+ t1.p[0].x + "," + 
                t1.p[0].y + "),"+"("+ t1.p[1].x + "," + 
                t1.p[1].y + "),"+"("+ t1.p[2].x + "," + 
                t1.p[2].y + ")"			
				);
		System.out.println(t1.draw());
		System.out.println("------------------------------");
		
		System.out.println( t2.color +":("+ t2.p[0].x + "," + 
                t2.p[0].y + "),"+"("+ t2.p[1].x + "," + 
                t2.p[1].y + "),"+"("+ t2.p[2].x + "," + 
                t2.p[2].y + ")"			
				);
		System.out.println(t2.draw());
		System.out.println("------------------------------");
	}

}
