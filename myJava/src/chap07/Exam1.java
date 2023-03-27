package chap07;
import java.util.*;
/*
    [���� ��� ���α׷� ver1.0]
    
    ����ڿ��� ��, ��, ���� �Է¹޾� ��� ���� ���� �Է¹��� ��¥�� ������ ��ȯ�ϴ� �ڵ带 �ۼ��ϼ���.
    ��, �ܺ� ���̺귯���� ������� �ʰ� ��� ����� main() �޼��� �ȿ��� ���� �����մϴ�.
    < ���� �� >
    ��¥�� �Է��ϼ��� : 2023 1 18
    �Է��Ͻ� 2023�� 1�� 18���� ������ �Դϴ�. 
    
    [��Ʈ!!!]
    ���� 1�� 1�� 1���� ������ �Դϴ�. > ���� 1�� 2�� 1��, ���� 2�� 1�� 1�� 
    ���� ���� �� ���� ������ ���� ����� �����ؼ� �Ѵ�.303
    
 */
public class Exam1 {

	public static void main(String[] args) {
		
		//����ڿ��� �Է¹��� ��,��,�� ������ �����Ѵ�.
		int year, month, day, daySum;
		//���� �迭�� �����Ѵ�.
		String [] week = {"�Ͽ���", "������","ȭ����", "������", "�����", "�ݿ���", "�����"};
		
		//����ڿ��� �ȳ��޼����� ����� �� �Է¹޴´�.
		Scanner sc = new Scanner(System.in);
		System.out.print("��¥�� �Է��ϼ��� : ");
		year = sc.nextInt(); 
		month = sc.nextInt();
		day = sc.nextInt(); 
		daySum = day;
		sc.close();
		
		//���� ����� �ϼ��� ��ȯ�غ���.
		
		for(int i = year-1; i>0; i--) {
			
			if( i%4==0 & i%100!=0 | i%400==0 ) {
				//������ ��� 366��
				daySum+=366;
			}
			else {
				//����� ��� 365�� 
				daySum+=365;
			}
		}
				
		//������ ���̴�. ���� ���� 31�� �Ǵ� 30���� �����ְ� 2���� ���� ���θ� Ȯ���ϰ� 29 �Ǵ� 28�� �����ش�.
		for(int i = 1; i<month ; i++) {
			switch(i) {
				case 4 : case 6: case 9: case 11:
				 daySum+=30; break;
				case 2:
					if( (year%4==0 & year%100!=0 | year%400==0) & month-1 >=2 ) {
						daySum+=29; break;
					}else {
						daySum+=28; break;
					}
				default:
					daySum+=31;
			}
		}
		System.out.printf("�Է��Ͻ� %d�� %d�� %d���� %s�Դϴ�.",year,month,day,week[daySum%7]);

	}

}
