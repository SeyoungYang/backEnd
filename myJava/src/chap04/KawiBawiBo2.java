package chap04;
import java.util.*;

public class KawiBawiBo2 {

	public static void main(String[] args) {
		int user, com;
		String result = "";
		boolean isWin = true;
		String [] kbb = {"����", "����", "��"};
		Scanner sc = new Scanner(System.in);
		String intro = "\n\t[ ���������� ���� ] \n\n" +
						"\t 1. ���� \n" +
						"\t 2. ���� \n " +
						"\t 3. �� \n " +
						"\t >>> ";
		do {
			System.out.print(intro);
			user = sc.nextInt()-1;
			com = (int)(Math.random()*3);
			
			System.out.printf("\n\t ����� %s, ��ǻ�� %s %n", kbb[user], kbb[com]);	
			
			switch(user-com) {
			case 2: case -1: result = "�����ϴ�."; break;
			case 1: case -2: result = "�̰���ϴ�."; isWin = false; break;
			case 0: result = "�����ϴ�."; break;		
			}	
			System.out.printf("\t ���������� ��� => %s%n ", result);
			
		}while(isWin);
		System.out.println("\n\t����� �����մϴ�!, ������ ����Ǿ����ϴ�.");
		sc.close();

	}

}
