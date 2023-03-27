package chap04_teacher;

public class OverflowIntStackException extends RuntimeException {
    public OverflowIntStackException(String msg) {
    	super(msg);
    }
}