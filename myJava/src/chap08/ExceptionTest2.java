package chap08;

public class ExceptionTest2 {

	public static void main(String[] args) {
		int [] arr = { 1,2,3,4,5};
		
		try {
		System.out.println(arr[5]); //ArrayIndexOutOfBoundsException �߻� 
		}
		catch(ArrayIndexOutOfBoundsException ae) {
			System.out.println("�ε��� ���� ������ϴ�.");
		}
		catch(Exception e) {
			System.out.println("�ٸ� ���ܰ� �߻��߽��ϴ�.");
		}
	}

}
