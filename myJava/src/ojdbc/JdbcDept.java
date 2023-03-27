package ojdbc;

import java.sql.*;
/*
  
 DEPT 테이블에 대한 insert, update, delete 작업을 수행하고 
 전체와 단일 행을 질의(select)하는 쿼리를 수행하여 그 결과를 출력하는 코드를 작성하세요.
 각 작업에서 정적 또는 동적의 적절한 방식을 선택하여 작업을 수행한다. 
    
 */
public class JdbcDept {
	Connection conn;
	Statement stmt;
	PreparedStatement pstmt;
	ResultSet rs;
	String sql;
	
	//생성자를 통해 실행 시 바로 연결 
	public JdbcDept() {
		String jdbc_driver = "oracle.jdbc.driver.OracleDriver";
		String jdbc_url = "jdbc:oracle:thin:@localhost:1521:XE";
		String user = "scott";
		String pwd = "tiger";
		
		try {
			Class.forName(jdbc_driver);
			this.conn = DriverManager.getConnection(jdbc_url, user, pwd);
		}
		catch (ClassNotFoundException e) {
			e.printStackTrace();
		}
		catch (SQLException e) {
			e.printStackTrace();
		}
	}
	
	public int staticInsert(int deptno, String dname, String loc) {
		int rowCount = 0;
		
		try {
			this.stmt = conn.createStatement();
			this.sql = "insert into dept values (" + deptno + ",'" + dname + "', '" + loc + "')";
			rowCount = stmt.executeUpdate(this.sql);
		}
		catch (SQLException e) {
			e.printStackTrace();
		}
		finally {
			try {
				if(!this.stmt.isClosed()) {
					this.stmt.close();
				}
			}
			catch (SQLException e) {
				e.printStackTrace();
			}
		}
		return rowCount;
	}

	public int dynamicInsert(int deptno, String dname, String loc) {
		int rowCount = 0;
		this.sql = "insert into dept values (?,?,?)";
		
		try {
			this.pstmt = conn.prepareStatement(this.sql);
			pstmt.setInt(1, deptno);
			pstmt.setString(2, dname);
			pstmt.setString(3, loc);
			
			
			rowCount = pstmt.executeUpdate();
		}
		catch (SQLException e) {
			e.printStackTrace();
		}
		finally {
			try {
				if(!this.pstmt.isClosed()) {
					this.pstmt.close();
				}
			}
			catch (SQLException e) {
				e.printStackTrace();
			}
		}
		return rowCount;
	}
	
	public int staticUpdate(int deptno, String dname, String loc) {
		int rowCount = 0;
		
		try {
			this.stmt = conn.createStatement();
			this.sql = "UPDATE dept SET dname = '" + dname + "', loc = '" + loc 
					+ "' WHERE deptno = " + Integer.toString(deptno);
			
			
			rowCount = stmt.executeUpdate(this.sql);
		}
		catch (SQLException e) {
			e.printStackTrace();
		}
		finally {
			try {
				if(!this.pstmt.isClosed()) {
					this.pstmt.close();
				}
			}
			catch (SQLException e) {
				e.printStackTrace();
			}
		}
		return rowCount;
	}
	
	
	public void closeConnection() {
		try {
			if(!this.conn.isClosed()) {
				this.conn.close();
			}
		}
		catch (SQLException e) {
			e.printStackTrace();
		}
	}
	
	public static void main(String[] args) {
		JdbcDept jd = new JdbcDept();
		//int rowCount = 0;
		
		//rowCount = jd.staticInsert(12,"PARTY","SEOUL");
		//rowCount = jd.dynamicInsert(13,"FUNNY","YONGIN");
			
		//System.out.println(rowCount + "개의 행이 입력되었습니다.");
		
		jd.closeConnection();

	}

}
