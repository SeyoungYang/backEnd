package chap08;

public class ExceptionTest2 {

	public static void main(String[] args) {
		int [] arr = { 1,2,3,4,5};
		
		try {
		System.out.println(arr[5]); //ArrayIndexOutOfBoundsException 발생 
		}
		catch(ArrayIndexOutOfBoundsException ae) {
			System.out.println("인덱스 범위 벗어났습니다.");
		}
		catch(Exception e) {
			System.out.println("다른 예외가 발생했습니다.");
		}
	}

}
