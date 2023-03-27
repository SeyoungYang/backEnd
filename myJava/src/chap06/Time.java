package chap06;

public class Time {
	int hour;
	int minute;
	int second;
	
	public void setTime(int h, int m, int s) {
		hour = h;
		minute = m;
		second = s;
	}
	
	public String toString() {
		String retStr = hour + "Ω√" + minute + "∫–" +second + "√ ";
		
		return retStr;
	}

}
