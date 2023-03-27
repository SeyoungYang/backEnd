package chap04;

public class RandomTest {

	public static void main(String[] args) {
		double randNum = Math.random();
		int rangeNum = (int)(randNum*10)+1;
		System.out.println("randNum :" + randNum);
		System.out.println("rangeNum :" + rangeNum);
		
	}

}
