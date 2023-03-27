package chap11;

import java.util.ArrayList;

import java.util.ArrayList;

public class ArrayListEx {

	public static void main(String[] args) {
		ArrayList<String> list = new ArrayList<>();
				//타입 파라미터 
		
		list.add("111");
		list.add("222");
		list.add("333");
		list.add("222");
		list.add("444");
		
		System.out.println(list);
		//타입 파라미터가 이전에는 없었는데 그러면 여러 종류의 값이 섞여 있어서 사용하기 어려웠음
		
		list.add(0,"000");
		System.out.println(list);
		
		System.out.println("index= "+list.indexOf("333"));
		
		list.remove("333");
		System.out.println(list);
		
		System.out.println(list.remove("333"));
		System.out.println("index= "+list.indexOf("333"));
		
		for(int i =0; i<list.size(); i++) {
			list.set(i, i+"");
		}
		System.out.println(list);
		
		System.out.print("{");
		for(int i =0; i<list.size(); i++) {
			System.out.print(list.get(i)+", ");
		}
		System.out.println("}");
		
		for(int i =0; i<list.size(); i++) {
			System.out.println(list);
			list.remove(i);
		}
		System.out.println(list);
	}

}
