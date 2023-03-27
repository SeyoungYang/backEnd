package chap06;

public class TvTest {
	Tv tv; 
	
	public static void main(String[] args) {
		
		TvTest tvtest = new TvTest();
		tvtest.tv = new Tv();
		
		tvtest.tv.color = "black";
		tvtest.tv.power = true;
		tvtest.tv.channel = 9;
		
		System.out.println("tv.color: " + tvtest.tv.color);
		System.out.println("tv.power: " + tvtest.tv.power);
		System.out.println("tv.channel: " + tvtest.tv.channel);
		
		tvtest.tv.channelDown();
		tvtest.tv.channelDown();
		
		tvtest.tv.setPower();
		
		System.out.println("tv.color: " + tvtest.tv.color);
		System.out.println("tv.power: " + tvtest.tv.power);
		System.out.println("tv.channel: " + tvtest.tv.channel);
		
	}

}
