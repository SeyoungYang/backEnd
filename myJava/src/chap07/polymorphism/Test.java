package chap07.polymorphism;

public class Test {

	public static void main(String[] args) {
		

/*		
 		Parent p = new Child();
		p.methodA();
		// p.methodB(); ==> 사용 불가 
		
		//Child 인스턴스를 생성했으니 methodB를 사용하도록 할 수 없을까??
		Child c = (Child)p;
		c.methodB(); 
		
		Parent p = new Parent();
		Child c = (Child)p;
		c.methodA(); 
		// compile(OK), runtime( X, ClassCastException)
		// 문법적으로는 오류가 없으나 시행이 불가함 
		//c는 Child타입으로 methodA와 methodB를 알고있는 클래스가 대입되어야하는데 
		//해당 코드는 methodA만 알고 있는 Parent 타입이 대입되어 오류가 발생한다.
		//자식 클래스 타입의 레퍼런스는 부모 클래스 타입의 인스턴스를 가리킬 수 없다. 
		
		Other o = new Other();
		Parent p = (Parent)o; 
		//상속관계가 아닌 다른 클래스는 클래스 형변환의 대상이 아니다. */
		
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
		//Object 클래스 타입의 레퍼런스는 모든 자바 클래스의 인스턴스를 가리킬 수 있다!
		//하지만 문제가 있다. 무엇일까? 쓸모가 없다.
		//어떻게 문제를 해결할 수 있을까? */
		
		Object obj;
		obj = p;
		((Parent)obj).methodA();
		
		obj = c;
		((Child)obj).methodB();
		
		obj = o;
		((Other)obj).methodC();
		//명시적 형변환을 하면된다.
				
	}

}
