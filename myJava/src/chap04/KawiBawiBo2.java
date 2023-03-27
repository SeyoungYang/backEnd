package chap04;
import java.util.*;

public class KawiBawiBo2 {

	public static void main(String[] args) {
		int user, com;
		String result = "";
		boolean isWin = true;
		String [] kbb = {"가위", "바위", "보"};
		Scanner sc = new Scanner(System.in);
		String intro = "\n\t[ 가위바위보 게임 ] \n\n" +
						"\t 1. 가위 \n" +
						"\t 2. 바위 \n " +
						"\t 3. 보 \n " +
						"\t >>> ";
		do {
			System.out.print(intro);
			user = sc.nextInt()-1;
			com = (int)(Math.random()*3);
			
			System.out.printf("\n\t 사용자 %s, 컴퓨터 %s %n", kbb[user], kbb[com]);	
			
			switch(user-com) {
			case 2: case -1: result = "졌습니다."; break;
			case 1: case -2: result = "이겼습니다."; isWin = false; break;
			case 0: result = "비겼습니다."; break;		
			}	
			System.out.printf("\t 가위바위보 결과 => %s%n ", result);
			
		}while(isWin);
		System.out.println("\n\t우승을 축하합니다!, 게임이 종료되었습니다.");
		sc.close();

	}

}
