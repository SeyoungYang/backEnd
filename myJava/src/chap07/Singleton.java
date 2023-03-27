package chap07;

public final class Singleton {
	//	final : 자식클래스를 가질 수 없는 클래스
	static private Singleton s = new Singleton();
	
	private Singleton() {
		//유일한 생성자 이지만 private이기 때문에 외부에서 사용이 불가
	}
	public static Singleton getInstance() {
		if(s==null) {
			s = new Singleton();
		}
		
		return s;
		//이미 만들어진 싱글톤 객체의 주소값을 반환 
	}
	
	
}
