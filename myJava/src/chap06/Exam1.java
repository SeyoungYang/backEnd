package chap06;

import java.util.Arrays;

/*
 
  ũ�Ⱑ 6�� ������ �迭�� ���� �� 
  1���� 45 ������ �ߺ����� �ʴ� �ζ� ��ȣ�� �����Ͽ�
  ũ�� ������� ������ �� ����ϴ� �ڵ带 �ۼ��ϼ���. 
  
  ��,Lotto Ŭ������ �����ϰ� ��ü���������� ������ �ذ��ϴ� �ڵ带 �ۼ��ϼ�
   
   [���� ��]
   �ζ� ��ȣ : 3 14 21 29 33 42
   
 */

public class Exam1 {

	public static void main(String[] args) {
		int []num = {0,0,0,0,0,0};
		Lotto lotto = new Lotto();
		
		lotto.lotto(num);
		System.out.println(lotto.toString());
		
		lotto.sort(num);
		System.out.println(lotto.toString());
		
				
	}

}
