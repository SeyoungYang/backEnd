package chap04;
import java.util.*;

class FlowEx5 {
	public static void main(String[] args) { 

		int score;
		String grade;
		Scanner scanner = new Scanner(System.in);
		
		System.out.print("������ �Է����ּ���: ");
		score = scanner.nextInt();
		scanner.close();
		
		if(score>=0 & score <= 100) {
			if(score >=98) {
				grade = "A+";
			}
			else if(score >=94) {
				grade = "A";
			}
			else if(score >=90) {
				grade = "-A";
			}
			else if(score >=88) {
				grade = "B+";
			}
			else if(score >=84) {
				grade = "B";
			}
			else if(score >=80) {
				grade = "B-";
			}
			else{
				grade = "c";
			}
			System.out.println(grade);
		}
		else {
			System.out.println("�ùٸ� ���������� �Է��ϼ���");
		}
		
		
//		int  score = 0;
//		char grade = ' ';
//		char opt   = '0';
//
//		System.out.print("������ �Է����ּ���.>");
//
//		Scanner scanner = new Scanner(System.in);
//		String tmp = scanner.nextLine(); // ȭ���� ���� �Է¹��� ������ tmp�� ����
//		score = Integer.parseInt(tmp);   // �Է¹��� ���ڿ�(tmp)�� ���ڷ� ��ȯ
//		scanner.close();
//		
//		System.out.printf("����� ������ %d�Դϴ�.", score);
//
//		if (score >= 90) {		      // score�� 90�� ���� ���ų� ũ�� A����(grade)
//			grade = 'A';
//			if (score >= 98) { 	      // 90�� �̻� �߿����� 98�� �̻��� A+
//				opt = '+';	
//			} else if (score < 94) {  // 90�� �̻� 94�� �̸��� A-
//				opt = '-';
//			}
//		} else if (score >= 80){	  // score�� 80�� ���� ���ų� ũ�� B����(grade)
//			grade = 'B';
//			if (score >= 88) {
//				opt = '+';
//			} else if (score < 84)	{
//				opt = '-';
//			}
//		} else {				      // �������� C����(grade)
//			grade = 'C';
//		}
//			
//		System.out.printf("����� ������ %c%c�Դϴ�.%n", grade, opt);
		
	}
}
