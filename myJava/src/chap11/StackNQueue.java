package chap11;

import java.util.*;

public class StackNQueue {

	public static void main(String[] args) {
		LinkedList<Integer> list = new LinkedList<Integer>(); //stack 구현 
		
		list.push(1);
		list.push(2);
		list.push(3);
		
		System.out.println(list.pop());
		System.out.println(list.pop());
		System.out.println(list.pop());
		
		System.out.println("---------------------------------------");
		LinkedList<Integer> listQueue = new LinkedList<Integer>(); //Queue 구현 
		
		listQueue.offer(1);
		listQueue.offer(2);
		listQueue.offer(3);
		
		System.out.println(listQueue.pop());
		System.out.println(listQueue.pop());
		System.out.println(listQueue.pop());
		System.out.println("---------------------------------------");
		
		LinkedList<Integer> list3 = new LinkedList<Integer>(Arrays.asList(6,7,8,9)); //iterator 구현 
		
		ListIterator<Integer> iter = list3.listIterator();
		
		while(iter.hasNext()) {
			System.out.println(iter.next());
		}//정방향으로 한번 읽어야 역방향 가능 
		
		System.out.println("---------------------------------------");
		
		while(iter.hasPrevious()) {
			System.out.println(iter.previous());
		}
		
		
		

	}

}
