package chap07;

public class Marine extends Unit {
	
	Marine(int x, int y){
		super(x, y);
		System.out.println("Marine 인스턴스 생성!");
	}
	
	void move(int x, int y) {
		System.out.println("Marine 이동!");
	
	}
}
