package chap07;

public class SingletonTest {

	public static void main(String[] args) {
		Singleton s1, s2, s3;
		
		// s1 = new SingletonTest;
		s1 = Singleton.getInstance();
		s2 = Singleton.getInstance();
		s3 = Singleton.getInstance();
		//������ �ּҰ��� �ް� ��
		
		if(s1 == s2) {
			System.out.println("s1�� s2�� �ϳ��� �ν��Ͻ��� ����Ű�� �ֽ��ϴ�.");
		}

	}

}
