package chap11;

import java.util.*;

class ArrayListEx1{
	public static void main(String[] args) {
		Integer [] arr = {5,4,2,0,1,3};
 		ArrayList<Integer> list1 = new ArrayList<Integer>(Arrays.asList(arr));
 		//arr ����Ʈ�� ����� �־ �ǰ� �ٷ� ���� 	Arrays.asList()�ȿ� ���൵ 
 		// size : ���� ����� ���� , capacity: �ش� ArrayList�� �ִ� ������ �� �ִ� �뷮(�ٸ� �����Ͱ� �������� ���ϵ��� �ʱ⿡ ������ �δ� ��)
 		//������ ���ڸ��� �Ǹ� ArrayList��ü�� �ٸ� �������� �̵��ؾ� �ϰ� �̋� �߻��ϴ� ���ϰ� ũ�� ������ �̸� ������ �δ� ���� ����(������ �ڹٴ� �뷮�� �ڵ� ����Ǳ� ������ ���� �Ⱦ�)
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
 		
 		ArrayList<Integer> list2 = new ArrayList<Integer>(list1.subList(1,4)); //1�ε��� ���� 4�ε����� �� �� ����(4 ���� �ȵ�) 1~3 �ε���  
		
		print(list1, list2);
		
		//Collections.sort(list1);	// list1�� list2�� �����Ѵ�.
		Collections.sort(list1,Collections.reverseOrder());
		//Collections.sort(list2);	// Collections.sort(List l)
		Collections.sort(list2,Collections.reverseOrder());
		print(list1, list2);

		System.out.println("list1.containsAll(list2):" + list1.containsAll(list2));
		
		// list1���� list2�� ��ġ�� �κи� ����� �������� �����Ѵ�.
		System.out.println("list1.retainAll(list2):" + list1.retainAll(list2));	
		print(list1, list2);
		
		//  list2���� list1�� ���Ե� ��ü���� �����Ѵ�.
		for(int i= list2.size()-1; i >= 0; i--) {
			if(list1.contains(list2.get(i)))
				list2.remove(i);
		}
		print(list1, list2); 
	
	} // main�� ��

	static void print(List<Integer> list1, List<Integer> list2) {
		System.out.println("list1:"+list1);
		System.out.println("list2:"+list2);
		System.out.println();		
	}
} // class