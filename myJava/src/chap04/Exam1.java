package chap04;
import java.util.*;
/* ����ڿ��� ����� ���� ������ �Է� �޾� ������ ����� ����ϴ� �ڵ带 �ۼ��ϼ���.
 	1) ����� �������� ��� 80�� �̻��̸� �հ�
 	2) ����� �������� �� �� �����̶� 60�� �̸��̸� ����
 	3) ����� �������� ��� 80�� �̻��̸� �հ� ��, �� AND ������ ���Ұ�   */
public class Exam1 {

	public static void main(String[] args) {
		int math, eng;
		String result;
		Scanner sc = new Scanner(System.in);
		
		System.out.print("����, ���� ������ �Է��ϼ��� >>>> ");
		eng = sc.nextInt();
		math = sc.nextInt(); 
		
		sc.close();
		
		//1)
		if(math>=80 & eng>=80) {
			result = "�հ�";
		}
		else {
			result = "���հ�";
		}
		System.out.println(result);
		
		//2)
		if(eng < 60 | math < 60){
			result = "������ �ֽ��ϴ�.";
		}
		else {
			result = "������ �����ϴ�.";
		}
		System.out.println(result);
		
		//3)
		if(!(math < 80 | eng < 80)) {
			result = "�հ�";
		}
		else {
			result = "���հ�";
		}
		System.out.println(result);
		
	}

}
