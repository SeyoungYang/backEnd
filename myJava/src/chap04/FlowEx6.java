package chap04;
import java.util.*;

class FlowEx6 {
	public static void main(String[] args) { 
		int month = 0;
		String result="";

		System.out.print("현재 월을 입력하세요.>");

		Scanner scanner = new Scanner(System.in);
		month = scanner.nextInt(); // 
		scanner.close();

		switch(month) {
			case 3: case 4: case 5:
				result = "봄";
				break;
			case 6: case 7: case 8:
				result = "여름";
				break;
			case 9: case 10: case 11:
				result = "가을";
				break;
			case 12: case 1: case 2:
				result = "겨울";
				break;
			default:
			System.out.println("올바른 월을 입력하세요");;
				
		}
			System.out.printf("현재의 계절은 %s입니다.",result);
	} // main의 끝
}
