package chap11;

import java.util.*;

class ArrayListEx1{
	public static void main(String[] args) {
		Integer [] arr = {5,4,2,0,1,3};
 		ArrayList<Integer> list1 = new ArrayList<Integer>(Arrays.asList(arr));
 		//arr 리스트를 만들고 넣어도 되고 바로 값을 	Arrays.asList()안에 써줘도 
 		// size : 실제 저장된 갯수 , capacity: 해당 ArrayList가 최대 저장할 수 있는 용량(다른 데이터가 차지하지 못하도록 초기에 선언해 두는 것)
 		//공간이 모자르게 되면 ArrayList자체가 다른 공간으로 이동해야 하고 이떄 발생하는 부하가 크기 때문에 미리 지정해 두는 것이 좋음(하지만 자바는 용량이 자동 저장되기 때문에 별로 안씀)
 		System.out.println("list1:"+ list1);
 		
 		
 		
 		/*
		list1.add(5);
		list1.add(4);
		list1.add(2);
		list1.add(0);
		list1.add(1);
		list1.add(3);
		*/
 		
 		/*
 		 List<Integer> list2 = (List<Integer>)list1.subList(1,4);   
 		 */
 		
 		ArrayList<Integer> list2 = new ArrayList<Integer>(list1.subList(1,4)); //1인덱스 부터 4인덱스가 될 때 까지(4 포함 안됨) 1~3 인덱스  
		
		print(list1, list2);
		
		//Collections.sort(list1);	// list1과 list2를 정렬한다.
		Collections.sort(list1,Collections.reverseOrder());
		//Collections.sort(list2);	// Collections.sort(List l)
		Collections.sort(list2,Collections.reverseOrder());
		print(list1, list2);

		System.out.println("list1.containsAll(list2):" + list1.containsAll(list2));
		
		// list1에서 list2와 겹치는 부분만 남기고 나머지는 삭제한다.
		System.out.println("list1.retainAll(list2):" + list1.retainAll(list2));	
		print(list1, list2);
		
		//  list2에서 list1에 포함된 객체들을 삭제한다.
		for(int i= list2.size()-1; i >= 0; i--) {
			if(list1.contains(list2.get(i)))
				list2.remove(i);
		}
		print(list1, list2); 
	
	} // main의 끝

	static void print(List<Integer> list1, List<Integer> list2) {
		System.out.println("list1:"+list1);
		System.out.println("list2:"+list2);
		System.out.println();		
	}
} // class
