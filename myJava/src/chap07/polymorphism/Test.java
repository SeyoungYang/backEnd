package chap07.polymorphism;

public class Test {

	public static void main(String[] args) {
		

/*		
 		Parent p = new Child();
		p.methodA();
		// p.methodB(); ==> ��� �Ұ� 
		
		//Child �ν��Ͻ��� ���������� methodB�� ����ϵ��� �� �� ������??
		Child c = (Child)p;
		c.methodB(); 
		
		Parent p = new Parent();
		Child c = (Child)p;
		c.methodA(); 
		// compile(OK), runtime( X, ClassCastException)
		// ���������δ� ������ ������ ������ �Ұ��� 
		//c�� ChildŸ������ methodA�� methodB�� �˰��ִ� Ŭ������ ���ԵǾ���ϴµ� 
		//�ش� �ڵ�� methodA�� �˰� �ִ� Parent Ÿ���� ���ԵǾ� ������ �߻��Ѵ�.
		//�ڽ� Ŭ���� Ÿ���� ���۷����� �θ� Ŭ���� Ÿ���� �ν��Ͻ��� ����ų �� ����. 
		
		Other o = new Other();
		Parent p = (Parent)o; 
		//��Ӱ��谡 �ƴ� �ٸ� Ŭ������ Ŭ���� ����ȯ�� ����� �ƴϴ�. */
		
		Parent p = new Parent();
		Child c = new Child();
		Other o = new Other();
		
		/*Object obj;
		obj = p;
		obj.methodA();
		
		obj = c;
		obj.methodB();
		
		obj = o;
		obj.methodC();
		//Object Ŭ���� Ÿ���� ���۷����� ��� �ڹ� Ŭ������ �ν��Ͻ��� ����ų �� �ִ�!
		//������ ������ �ִ�. �����ϱ�? ���� ����.
		//��� ������ �ذ��� �� ������? */
		
		Object obj;
		obj = p;
		((Parent)obj).methodA();
		
		obj = c;
		((Child)obj).methodB();
		
		obj = o;
		((Other)obj).methodC();
		//����� ����ȯ�� �ϸ�ȴ�.
				
	}

}
