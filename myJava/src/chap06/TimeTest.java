package chap06;

//�Ʒ��� �ڵ带 �迭�� �̿��Ͽ� �����ϴ� �ڵ�� ��ȯ�Ͽ� �����ϼ���. 
public class TimeTest {

	public static void main(String[] args) {
		
		Time [] t = new Time[3];
			
		t[0] = new Time();
		t[1] = new Time();
		t[2] = new Time();
		
		for(int i=0; i<t.length;i++ ) {
			System.out.println(t[i].toString());
		}
		
		t[0].setTime(11, 25, 37);
		t[1].setTime(15, 40, 20);
		t[2].setTime(21, 35, 19);

		for(Time text : t) {
			System.out.println(text);
		}

	}

}
