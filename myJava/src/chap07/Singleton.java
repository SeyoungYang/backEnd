package chap07;

public final class Singleton {
	//	final : �ڽ�Ŭ������ ���� �� ���� Ŭ����
	static private Singleton s = new Singleton();
	
	private Singleton() {
		//������ ������ ������ private�̱� ������ �ܺο��� ����� �Ұ�
	}
	public static Singleton getInstance() {
		if(s==null) {
			s = new Singleton();
		}
		
		return s;
		//�̹� ������� �̱��� ��ü�� �ּҰ��� ��ȯ 
	}
	
	
}
