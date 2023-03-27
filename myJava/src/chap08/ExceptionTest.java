package chap08;

public class ExceptionTest {
	
	void methodA() throws Exception  {
		throw new Exception("methodA 예외발생!");
	}

	void methodB() throws Exception {
		
		methodA();				
	}
	
	void methodC(){
		throw new RuntimeException("methodC 예외발생!");				
	}
	
	void methodD(){
		
		methodC();				
	}
	
	//아래에 methodB를 호출하여 프로그램을 실행하는 코드를 추가하세요
	public static void main(String[] args) {
		ExceptionTest et = new ExceptionTest();
		et.methodD();
		try{
			et.methodB();
		}
		catch(Exception e) {
			System.out.println("main() 메서드에서 예외처리");
			System.out.println(e.getMessage());
			e.printStackTrace(); //오류가 발생한 위치를 추적해서 보여줌 
		}
	}
	
}
