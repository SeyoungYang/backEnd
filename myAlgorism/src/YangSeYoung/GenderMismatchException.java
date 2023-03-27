package YangSeYoung;

public class GenderMismatchException extends RuntimeException {
    private static final long serialVersionUID = 1L;

	public GenderMismatchException() { 
    	super("잘못된 성별입니다.");
    }
}