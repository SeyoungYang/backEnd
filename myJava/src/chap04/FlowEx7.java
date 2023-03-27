package chap04;
import java.util.*;

class FlowEx7 {
	public static void main(String[] args) { 
		int user, com;
		Scanner scanner = new Scanner(System.in);
		String intro = "\n\t[ 가위바위보 게임 ] \n\n" +
						"\t 1. 가위 \n" +
						"\t 2. 바위 \n " +
						"\t 3. 보 \n " +
						"\t >>> ";
		
		System.out.print(intro);
		user = scanner.nextInt();
		com = (int)(Math.random()*3)+1;
		scanner.close();

		System.out.println("\n\t당신은 "+ user +"입니다.");
		System.out.println("\t컴은  "+ com +"입니다.");
		
		switch(user-com) {
		case 2: case -1:
			System.out.println("\t 당신이 졌습니다.");
			break;
		case 1: case -2:
			System.out.println("\t 당신이 이겼습니다.");
			break;
		case 0:
			System.out.println("\t 비겼습니다.");
			break;		
		}
		

		
//		String tmp = scanner.nextLine(); // 화면을 통해 입력받은 내용을 tmp에 저장
//		user = Integer.parseInt(tmp);    // 입력받은 문자열(tmp)를 숫자로 변환
//		scanner.close();
//		
//		com = (int)(Math.random() * 3) + 1;  // 1,2,3중 하나가 com에 저장됨
//
//		System.out.println("당신은 "+ user +"입니다.");
//		System.out.println("컴은  "+ com +"입니다.");
//
//		switch(user-com) {
//			case 2: case -1:
//				System.out.println("당신이 졌습니다.");
//				break;
//			case 1: case -2:
//				System.out.println("당신이 이겼습니다.");
//				break;
//			case 0:
//				System.out.println("비겼습니다.");
//				break;		
//		}
	} // main의 끝
}
