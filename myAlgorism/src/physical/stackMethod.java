package physical;

public class stackMethod {
	int[] stack;
	int ptr, capacity;
	
	stackMethod( int[]stack , int ptr, int capacity) {
		this.stack = stack;
		this.ptr = ptr;
		this.capacity = capacity;
	}
	
	int push(int a) {
		
		if(ptr >= capacity) {
			System.out.println("스택이 가득찼습니다.");
		}
		
		return stack[ptr++] = a;
	 }
	
	int pop(){
		
		return stack[ptr--];
	 }

	void peek(){
		System.out.println(stack[ptr-1]);
 }

	void clear(){
		ptr = 0;
 }
	
}
