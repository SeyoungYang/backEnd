package chap04_teacher;

public class EmptyIntStackException extends RuntimeException {
    public EmptyIntStackException() { 
    	super("스택이 비었습니다.");
    }
}