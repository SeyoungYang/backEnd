package chap04;

import java.util.Scanner;

public class KawiBawiBo {
	
	public static void main(String[] args) {
			int user, com;
			String [] kbb = {"가위","바위"," 보"};
			String result="";
			Scanner scanner = new Scanner(System.in);
			String intro = "\n\t[ 가위바위보 게임 ] \n\n" +
							"\t 1. 가위 \n" +
							"\t 2. 바위 \n " +
							"\t 3. 보 \n " +
							"\t >>> ";
			
			
			System.out.print(intro);
			com = (int)(Math.random()*3);
			user = scanner.nextInt()-1;
			scanner.close();
			
			System.out.printf("\n\t 사용자 %s, 컴퓨터 %s %n", kbb[user], kbb[com]);	
			
			switch(user-com) {
				case 2: case -1: result = "졌습니다. "; break;
				case 1: case -2: result = "이겼습니다. "; break;
				case 0: result = "비겼습니다. "; break;		
			}		
			System.out.printf("\t 가위바위보 결과 => %s%n ", result);
	}

}
