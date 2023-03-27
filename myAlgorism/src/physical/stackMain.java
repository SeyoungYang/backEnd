package physical;

import java.util.Scanner;

public class stackMain {

	public static void main(String[] args) {
		// 스택을 직접 구현해보자
		// 사용자에게 용량을 입력받고 값을 push 또는 pop 하며, peek와 clear 기능도 있다.  
		int [] stack;
		int capacity, ptr = 0, choose = 0;
					
		Scanner sc = new Scanner(System.in);
		
		System.out.println("스택의 용량을 입력하세요 : ");
		capacity = sc.nextInt();
		stack = new int[capacity];
		
		stackMethod sm = new stackMethod(stack, ptr, capacity);	
		
		do {
			System.out.println("어떤 작업을 수행할까요? ");
			System.out.println("1.데이터 입력    2. 데이터 꺼내기  ");
			System.out.println("3.데이터 확인하기 4. 데이터 전체삭제 ");
			choose = sc.nextInt();
			
			switch(choose) {
			case 1:
			case 2:
			case 3:
			case 4:
			}
			
			
			
			
			
			
		}while(choose!=5);
		
		
		
		

	}

}
