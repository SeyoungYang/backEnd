package chap02;

public class PhysicalDataManager {
	
	static final int VMAX = 21;
	PhysicalData[] x;
	int[] vdist;
	
	PhysicalDataManager(PhysicalData [] x){
		this.x = x;
		this.vdist = new int[PhysicalDataManager.VMAX];
		this.distVision();
	}
	
	
	
	double averageHeight() {
        double sum = 0;

        for (int i = 0; i < this.x.length; i++) {
        	 sum += this.x[i].height;
        }
          
        return sum / this.x.length;
    }
	
	void distVision() {
        for (int i = 0; i < this.x.length; i++) {
        	 if (this.x[i].vision >= 0.0 && this.x[i].vision <= PhysicalDataManager.VMAX / 10.0) {
        		 this.vdist[(int)(this.x[i].vision * 10)]++;
        	 }
                
        }
           
    }
	
}
