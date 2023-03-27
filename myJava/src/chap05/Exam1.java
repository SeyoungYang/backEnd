package chap05;

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
		int[] lotto = new int[6];
		int i = 0;
		int j;
		
		
		//�ߺ� ���� 
		while(lotto[lotto.length-1]==0) {
			int random = (int)(Math.random()*44)+1;
			for(i=0;i<lotto.length;i++) {
				if(lotto[i]==random) {
					break;
				}
				else if(lotto[i]==0) {
					lotto[i]=random;
					break;
				}			
			}
		}
		
		//��� ��� 
		System.out.println("�ζǹ�ȣ ���� �� :" + Arrays.toString(lotto));
		
			//�������� ���� 
			for (i=0; i < lotto.length; i++ ) {
				for(j=0; j < lotto.length-i-1; j++)
					if(lotto[j] < lotto[j+1]) {
						int tmp = lotto[j];
						lotto[j] = lotto[j+1];
						lotto[j+1] = tmp;
				}
			}			
			
			//��� ��� 
			System.out.println("�ζ� ��ȣ :" + Arrays.toString(lotto));
	}

}
