package chap07;

public class PointTest {

	public static void main(String[] args) {
		Point3DHasA p3d1 = new Point3DHasA();
		Point3DIsA p3d2 = new Point3DIsA();
		
		p3d1.p.x = 10;
		p3d1.p.y = 20;
		p3d1.z = 30;
		System.out.println(p3d1.p.x + ":" + p3d1.p.y + ":"+ p3d1.z);
		
		p3d2.x = 11;
		p3d2.y = 22;
		p3d2.z = 33;
		System.out.println(p3d2.x + ":" + p3d2.y + ":"+ p3d2.z);
		

	}

}
