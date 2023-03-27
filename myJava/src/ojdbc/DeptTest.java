package ojdbc;

public class DeptTest {
	
	private int deptno;
	private String dname;
	private String loc;
	
	public DeptTest(int deptno,String dname, String loc) {
		this.deptno = deptno;
		this.dname = dname;
		this.loc = loc;
	}
	
	public int getDeptno() {
		return this.deptno;
	}
	
	public String getDname() {
		return this.dname;
	}
	
	public String getLoc() {
		return this.loc;
	}
}
