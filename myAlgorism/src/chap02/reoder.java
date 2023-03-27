package chap02;

import java.util.Arrays;

public class reoder {

	public static void main(String[] args) {
		int[]a = {2,5,1,3,9,6,7};
		int temp = 0 ;
		
		for(int i =0; i < a.length/2; i++) {
			temp = a[i];
			a[i] = a[6-i]; 
			a[6-i] = temp;
		}
		System.out.println(Arrays.toString(a));

	}

}
