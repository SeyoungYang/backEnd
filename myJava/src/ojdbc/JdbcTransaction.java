package ojdbc;

import java.sql.*;
import java.util.ArrayList;
import java.util.Calendar;


public class JdbcTransaction {
	Connection conn;
	PreparedStatement pstmt;
	ResultSet rs;
	String sql;
	
	public JdbcTransaction() {
		String jdbc_driver = "oracle.jdbc.driver.OracleDriver";
		String jdbc_url = "jdbc:oracle:thin:@localhost:1521:XE";
		String user = "scott";
		String pwd = "tiger";
		
		try {
			Class.forName(jdbc_driver);
			this.conn = DriverManager.getConnection(jdbc_url, user, pwd);
			conn.setAutoCommit(false);
		}
		catch (ClassNotFoundException e) {
			e.printStackTrace();
		}
		catch (SQLException e) {
			e.printStackTrace();
		}
	}	
	
	public int dynamicInsert(String username, String email) {
		int rowCount = 0;
		this.sql = "insert into jdbc_test values(?, ?)";
		
		try {
			this.pstmt = conn.prepareStatement(this.sql);
			pstmt.setString(1, username);
			pstmt.setString(2, email);
			
			rowCount = pstmt.executeUpdate();
			
			/* 
			  if(rowCount == 1 ) {
			  
				//this.conn.commit();
				this.conn.rollback();
			}
		    */
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
		JdbcTransaction jt = new JdbcTransaction();
		Savepoint s1 = null;
		Savepoint s2 = null;
		Savepoint s3 = null;
		int rowCount = 0;
		
		rowCount = jt.dynamicInsert("박찬호", "park@naver.com");
		System.out.println(rowCount + "개의 행이 입력되었습니다.");
		try {
			s1 = jt.conn.setSavepoint("s1");
		}
		catch(SQLException e) {
			e.printStackTrace();
		}
		
		rowCount = jt.dynamicInsert("손흥민", "son@daum.net");
		System.out.println(rowCount + "개의 행이 입력되었습니다.");
		try {
			s2 = jt.conn.setSavepoint("s2");
		}
		catch(SQLException e) {
			e.printStackTrace();
		}
		
		rowCount = jt.dynamicInsert("김연경", "kim_yk@naver.com");
		System.out.println(rowCount + "개의 행이 입력되었습니다.");
		try {
			s3 = jt.conn.setSavepoint("s3");
		}
		catch(SQLException e) {
			e.printStackTrace();
		}
		
		try {
			jt.conn.rollback(s2);
			jt.conn.commit();
		}
		catch(SQLException e) {
			e.printStackTrace();
		}
		
		jt.closeConnection();

	}

}
