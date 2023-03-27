package physical;

import java.util.Scanner;

public class Euclidean {
	
	int euclidean(int a, int b){
		if(a%b==0) {
			return b;
		}else {
			return euclidean(b,a%b);
		}
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		Euclidean ed = new Euclidean();
		int a, b;
		
		System.out.println("두개의 정수를 입력하세요 : ");
		a = sc.nextInt();
		b = sc.nextInt();
		
		ed.euclidean(a, b);
		sc.close();
	}

}
