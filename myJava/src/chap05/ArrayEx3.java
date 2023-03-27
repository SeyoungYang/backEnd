package chap05;
class ArrayEx3{
	public static void main(String[] args) {
		int[] arr = new int[5];

		// 배열 arr에 1~5를 저장한다.
		for(int i=0; i < arr.length;i++) 
			arr[i] = i + 1;

		System.out.println("변경전 - arr.length:"+arr.length);	
		for(int i=0; i < arr.length;i++) 
			System.out.println("arr["+i+"]:"+arr[i]);	

		int[] tmp = new int[arr.length*2];

		// 배열 arr에 저장된 값들을 배열 tmp에 복사한다.
		for(int i=0; i < arr.length;i++) 
			tmp[i] = arr[i];

		arr = tmp;  // tmp 배열 변수에 저장된 주 값을 arr 배에 저장한다.

		System.out.println("변경후 - arr.length:"+arr.length);	
		for(int i=0; i < arr.length;i++) 
			System.out.println("arr["+i+"]:"+arr[i]);	
		
		System.out.println("tmp - tmp.length:"+tmp.length);	
		for(int i=0; i < tmp.length;i++) 
			System.out.println("tmp["+i+"]:"+tmp[i]);
		
		if(tmp==arr) {
			System.out.println("두 배열변수는 동일한 배열 객체의 주소를 가지고 있습니다. ");	
		}
	}
}
