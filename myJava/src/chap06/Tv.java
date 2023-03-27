package chap06;

class Tv {
	String color;
	boolean power;
	int channel;
	
	void setPower() {
		power = !power;
	}
	
	void channelUp() {
		channel++;
	}
	
	void channelDown() {
		channel--;
	}	
	public String toString() {
		String retStr = "이 TV의 색상"+color+"이고 현재 켜짐 상태는 " + power+ "이며, 채널은 "+channel+"입니다.";	
		return retStr;
	}
}
