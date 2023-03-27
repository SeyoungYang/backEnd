package chap03;
class OperatorEx6 { 
      public static void main(String[] args) { 
            byte a = 10; 
            byte b = 20; 
            byte c = (byte)(a + b); //int 프로모션 발생해서 (int)b1 + (int)b2 한 것이 되어서 byte에 넣으면 오류남

            System.out.println(c); 
      } 
} 
