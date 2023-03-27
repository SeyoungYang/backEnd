package chap11;

import java.util.*;

public class StackNQueue {

	public static void main(String[] args) {
		LinkedList<Integer> list = new LinkedList<Integer>(); //stack ���� 
		
		list.push(1);
		list.push(2);
		list.push(3);
		
		System.out.println(list.pop());
		System.out.println(list.pop());
		System.out.println(list.pop());
		
		System.out.println("---------------------------------------");
		LinkedList<Integer> listQueue = new LinkedList<Integer>(); //Queue ���� 
		
		listQueue.offer(1);
		listQueue.offer(2);
		listQueue.offer(3);
		
		System.out.println(listQueue.pop());
		System.out.println(listQueue.pop());
		System.out.println(listQueue.pop());
		System.out.println("---------------------------------------");
		
		LinkedList<Integer> list3 = new LinkedList<Integer>(Arrays.asList(6,7,8,9)); //iterator ���� 
		
		ListIterator<Integer> iter = list3.listIterator();
		
		while(iter.hasNext()) {
			System.out.println(iter.next());
		}//���������� �ѹ� �о�� ������ ���� 
		
		System.out.println("---------------------------------------");
		
		while(iter.hasPrevious()) {
			System.out.println(iter.previous());
		}
		
		
		

	}

}
