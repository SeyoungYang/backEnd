package chap06;

public class TvTest2 {

	public static void main(String[] args) {
		Tv tv1, tv2;
		
		tv1 = new Tv();
		tv2 = new Tv();
		
		System.out.println(tv1);
		System.out.println(tv2.toString());
		System.out.println();
		
		tv1.color = "red";
		tv1.power = false;
		tv1.channel = 3;
		
		tv2.color = "blue";
		tv2.power = true;
		tv2.channel = 11;
		
		System.out.println(tv1);
		System.out.println(tv2.toString());
		System.out.println();
		
		tv2 = tv1;
		
		System.out.println(tv1);
		System.out.println(tv2.toString());		
	
	}

}
