package chap07.pacA;

public class IH {
	//Information Hiding
	private int score;
	
	IH(int score){
		if(score >=0 & score <= 100) {
			this.score = score;
		}
		else {
			this.score = 0;
		}
	}
	
	void setScore(int score) {
		if(score >=0 & score <= 100) {
			this.score = score;
		}
		else {
			this.score = 0;
		}
	}
	
	int getScore() {
		return this.score;
	}

}
