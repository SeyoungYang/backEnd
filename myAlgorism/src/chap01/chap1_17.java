package chap01;

import java.util.*;

public class chap1_17 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		System.out.print("변의 길이를 입력하세요 : ");
		int n = sc.nextInt();
		
		for(int i = 1; i<=n; i++) {
			for(int j = 1; j<=i; j++) {
				System.out.print('*');
			}
			System.out.println();
		}
	}

}
