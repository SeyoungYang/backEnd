package chap06;

public class ArrayTest {

	public static void main(String[] args) {
		int [] arr;
		arr = new int[3];
		arr[0] = 11;
		arr[1] = 22;
		arr[2] = 33;
		
		for(int num : arr) {
			System.out.println(num);
		}
		

	}

}
