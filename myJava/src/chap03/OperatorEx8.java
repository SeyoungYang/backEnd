package chap03;
class OperatorEx8 {
	public static void main(String args[]) { 
		int a = 1000000;    // 1,000,000   1�鸸 
		int b = 2000000;    // 2,000,000   2�鸸 

		long c = a * b;     // a * b = 2,000,000,000,000 ? int*int�� int�̱� ������ ��ȯ�� ���ڰ� ���
		
		System.out.println(c);
		
		long c1 = (long)a * b; //�ϳ��� ����ȯ�ص� ������ �ϳ��� �Ϲ����� ����ȯ�� 
		
		System.out.println(c1);
	}
}
