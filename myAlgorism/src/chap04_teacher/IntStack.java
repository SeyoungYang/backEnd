package chap04_teacher;
// int형 고정 길이 스택

public class IntStack {
    private int[] stk;           // 스택용 배열
    private int capacity;        // 스택의 크기
    private int ptr;             // 스택 포인터

   

    //--- 생성자(constructor) ---//
    public IntStack(int capacity) {
        ptr = 0;
        this.capacity = capacity;
        try {
            stk = new int[capacity];          // 스택 본체용 배열을 생성
        } catch (OutOfMemoryError e) {        // 생성할 수 없음
            capacity = 0;
        }
    }

    
    //--- 스택에 x를 푸시 ---//
    public int push(int x){
        if (ptr >= capacity) {
        	throw new OverflowIntStackException("스택이 가득 찼습니다.");
        }      
        return stk[ptr++] = x;
    }

    //--- 스택에서 데이터를 팝(정상에 있는 데이터를 꺼냄) ---//
    public int pop() {
        if (ptr <= 0){                                         // 스택이 빔
            throw new EmptyIntStackException();
        }
        return stk[--ptr];
    }

    //--- 스택에서 데이터를 피크(peek, 정상에 있는 데이터를 들여다봄) ---//
    public int peek(){
        if (ptr <= 0) {                                        // 스택이 빔
            throw new EmptyIntStackException();
        }
        return stk[ptr - 1];
    }

    //--- 스택을 비움 ---//
    public void clear() {
        ptr = 0;
    }
    //--- 스택에서 x를 찾아 인덱스(없으면 –1)를 반환 ---//
    public int indexOf(int x) {
    	
    	int result = -1;
    	
        for (int i = ptr - 1; i >= 0; i--) {
        	 if (stk[i] == x) {
                 result = i;   
        	 }
        }   
        return result;                // 검색 실패
    }

    //--- 스택의 크기를 반환 ---//
    public int getCapacity() {
        return capacity;
    }

    //--- 스택에 쌓여있는 데이터 갯수를 반환 ---//
    public int size() {
        return ptr;
    }

    //--- 스택이 비어있는가? ---//
    public boolean isEmpty() {
        return ptr <= 0;
    }

    //--- 스택이 가득 찼는가? ---//
    public boolean isFull() {
        return ptr >= capacity;
    }

    //--- 스택 안의 모든 데이터를 바닥 → 정상 순서로 표시 ---//
    public String dump() {
    	String result ="";
    	
        if (ptr <= 0) {
        	result = "스택이 비어있습니다.";
        }        	
        else {
            for (int i = 0; i < ptr; i++) {
                result += stk[i] + " ";
            }
            result += "\n";
        }
        return result;
    }
}