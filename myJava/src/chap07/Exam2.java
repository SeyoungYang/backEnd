package chap07;
import java.util.*;

public class Exam2 {
/*
    [���� ��� ���α׷� ver2.0]
    
    ����ڿ��� ��, ��, ���� �Է¹޾� ��� ���� ���� �Է¹��� ��¥�� ������ ��ȯ�ϴ� �ڵ带 �ۼ��ϼ���.
    ��, �ܺ� ���̺귯���� ������� �ʰ� 	��ü���������� �����մϴ�.
    < ���� �� >
    ��¥�� �Է��ϼ��� : 2023 1 18
    �Է��Ͻ� 2023�� 1�� 18���� ������ �Դϴ�. 
    
    [��Ʈ!!!]
    ���� 1�� 1�� 1���� ������ �Դϴ�. > ���� 1�� 2�� 1��, ���� 2�� 1�� 1�� 
    ���� ���� �� ���� ������ ���� ����� �����ؼ� �Ѵ�.
    
 */

	public static void main(String[] args) {
		int year, month, day;
		
		Scanner sc = new Scanner(System.in);
		System.out.print("��¥�� �Է��ϼ��� : ");
		year = sc.nextInt(); 
		month = sc.nextInt();
		day = sc.nextInt(); 
		
		Daycheck dc = new Daycheck(year,month,day);
		
		dc.DaySum();
		System.out.println(dc.toString());		
	}

}
