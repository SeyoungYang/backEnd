package chap02;

public class findMax {
	public static void main(String[] args) {
		int[] a = {22,57,11,91,32};
		int max;
		max = a[0];
		
		for(int i = 0; i < a.length; i++) {
			if(a[i]>max) max=a[i];
		}
		System.out.println("가장 큰 수는 "+max+"입니다.");
	}
}