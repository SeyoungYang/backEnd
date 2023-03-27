package YangSeYoung;

import java.util.Comparator;

public class IdOrderComparator implements Comparator<studentData> {
	 public int compare(studentData d1, studentData d2) {
         return (d1.getid() > d2.getid()) ?  1 :
                (d1.getid() < d2.getid()) ? -1 : 0;
     }

}
