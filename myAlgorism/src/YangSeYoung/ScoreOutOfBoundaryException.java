package YangSeYoung;

public class ScoreOutOfBoundaryException extends RuntimeException {
    private static final long serialVersionUID = 1L;

    
	public ScoreOutOfBoundaryException() {		
		super("성적이 범위를 벗어났습니다.");	
	}
	
	

}
