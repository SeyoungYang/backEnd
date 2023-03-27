package YangSeYoung;

public class IdMismatchException extends RuntimeException {
    private static final long serialVersionUID = 1L;

	public IdMismatchException() { 
    	super("중복된학번 입니다.");
    }
}