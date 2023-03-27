package YangSeYoung;


public class studentData {
	private int id;
	private String name;
	private int gender; //1.남, 2. 여
	private int [] score;
	
	public studentData(int id) {
        this(id,null,0,null);
    }
	
	 public studentData(int id, String name, int gender, int [] score) {
		 	
		 	this.id = id;
		 	this.name = name;  
	        this.gender = gender;  
	        this.score = score;
	    }
	 
	 void setScore(int [] score){
		 for(int i = 0; i<4; i++) {
				if( score[i]<0 || 100<score[i]) {
					throw new ScoreOutOfBoundaryException();
				}
			} 
		 this.score = score;
	 }

	 public String toString() {
		return "학번 : "+id + ", 이름 : " + name + ", 성별 : " + (gender==1?"남":"여") +", 성적[국어 : "+score[0]+", 영어 : "+score[1]+", 수학 : "+score[2]+", 과학 : "+score[3]+" ]"; 
     }

	 int getid() {
		 return this.id;
	 }
	 
	 String getName() {
		 return this.name;
	 }
	 
	 
	 
	 
	 
	 

}
