package chap04;
/*
2�� ���� 9�� ������ ������ ����� ���� ���ÿ� ���� ����ϴ� �ڵ带 �ۼ��ϼ���
��, ��ø �ݺ����� ����� �� ���� �ϳ��� for �ݺ����� ����մϴ�.
 [���� ��]
   [ 2�� ]
 2 * 1 =  2
 2 * 2 =  4
  ...
 2 * 9 = 18
  
  [ 3�� ]
  3 * 1 = 3
    ...
     
 */
public class Gugudan3 {

	public static void main(String[] args) {
		int dan = 2, num= 1;
		System.out.printf(" [ %d �� ] \n", dan);
		for(int i=0; i<72; i++) {
			System.out.printf("%d * %d = %2d \n", dan, num, dan*num);
			num++;
			if(num == 10) {
				System.out.println();
				num =1;
				dan++;
				if(dan!=10) {
					System.out.printf(" [ %d �� ] \n", dan);
				}
			}
		}
	}

}