package chap05;
class ArrayEx3{
	public static void main(String[] args) {
		int[] arr = new int[5];

		// �迭 arr�� 1~5�� �����Ѵ�.
		for(int i=0; i < arr.length;i++) 
			arr[i] = i + 1;

		System.out.println("������ - arr.length:"+arr.length);	
		for(int i=0; i < arr.length;i++) 
			System.out.println("arr["+i+"]:"+arr[i]);	

		int[] tmp = new int[arr.length*2];

		// �迭 arr�� ����� ������ �迭 tmp�� �����Ѵ�.
		for(int i=0; i < arr.length;i++) 
			tmp[i] = arr[i];

		arr = tmp;  // tmp �迭 ������ ����� �� ���� arr �迡 �����Ѵ�.

		System.out.println("������ - arr.length:"+arr.length);	
		for(int i=0; i < arr.length;i++) 
			System.out.println("arr["+i+"]:"+arr[i]);	
		
		System.out.println("tmp - tmp.length:"+tmp.length);	
		for(int i=0; i < tmp.length;i++) 
			System.out.println("tmp["+i+"]:"+tmp[i]);
		
		if(tmp==arr) {
			System.out.println("�� �迭������ ������ �迭 ��ü�� �ּҸ� ������ �ֽ��ϴ�. ");	
		}
	}
}