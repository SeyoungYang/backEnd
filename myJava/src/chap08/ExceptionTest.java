package chap08;

public class ExceptionTest {
	
	void methodA() throws Exception  {
		throw new Exception("methodA ���ܹ߻�!");
	}

	void methodB() throws Exception {
		
		methodA();				
	}
	
	void methodC(){
		throw new RuntimeException("methodC ���ܹ߻�!");				
	}
	
	void methodD(){
		
		methodC();				
	}
	
	//�Ʒ��� methodB�� ȣ���Ͽ� ���α׷��� �����ϴ� �ڵ带 �߰��ϼ���
	public static void main(String[] args) {
		ExceptionTest et = new ExceptionTest();
		et.methodD();
		try{
			et.methodB();
		}
		catch(Exception e) {
			System.out.println("main() �޼��忡�� ����ó��");
			System.out.println(e.getMessage());
			e.printStackTrace(); //������ �߻��� ��ġ�� �����ؼ� ������ 
		}
	}
	
}
