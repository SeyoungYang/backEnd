package chap03_teacher;

public class PhysicalData {
	  String name;         
      int    height;       
      double vision;        


      public PhysicalData(int height) {
          this(null,height,0.0);
      }
      
      public PhysicalData(String name, int height, double vision) {
          this.name = name;  
          this.height = height;  
          this.vision = vision;
          
      }
     
      public String toString() {
          return name + " " + height + " " + vision;
      }


}
