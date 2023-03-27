package YangSeYoung;

import java.util.Arrays;
import java.util.Comparator;
import java.util.LinkedList;
import java.util.ListIterator;


import java.util.Collections;

public class studentSearch {
	
	final Comparator<studentData> ID_ORDER = new IdOrderComparator();
	
	void all(LinkedList<studentData> a) {
		
		if(a.isEmpty()) {
			System.out.println("저장된 학생 정보가 없습니다.");
		}else {
			Collections.sort(a, ID_ORDER);
			ListIterator<studentData> iter = a.listIterator();
			while(iter.hasNext()) {
				System.out.println(iter.next());
				}
			}
		}
		
	
	int IdSearch(LinkedList<studentData> a, int id) {
		int idx = -1;
		
		if(a.isEmpty()) {
			return idx;
		}else {
			Collections.sort(a, ID_ORDER);
			studentData[] s = new studentData[a.size()]; 
			for(int i = 0; i<s.length; i++) {
				s[i] = a.get(i);
				}
			idx = Arrays.binarySearch(s, new studentData(id),ID_ORDER); 		
			return idx;
		}
		
		
		}
}
