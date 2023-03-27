package ojdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

/*
 
 	EMP 테이블에서 사원번호 7698(BLAKE) 사원과 BLAKE 사원의 모든 부하 직원들을 하나의 트랜젝션 안에서 함께 삭제하는 코드를 작성하세요 
 
 	1) EMP, MGR 컬럼에 FK 제약 조건 추가 
 	
 	alter table emp add constraint emp_empno_pk primary key (empno); 	
 	alter table emp add constraint emp_mgr_fk foreign key (mgr) references emp (empno);
 	
 	2) 사원 번호 7698(BLAKE) 사원과 BLAKE 사원의 모든 부하 직원들을 제
 	
 	delete from emp where mgr = 7698;
 	delete from emp where empno = 7698;
 	
 	
 	
 */
public class TransactionTest {
	Connection conn;
	Statement stmt;
	PreparedStatement pstmt;
	ResultSet rs;
	String sql, sql2;
	
	public TransactionTest() {
		String jdbc_driver = "oracle.jdbc.driver.OracleDriver";
		String jdbc_url = "jdbc:oracle:thin:@localhost:1521:XE";
		String user = "scott";
		String pwd = "tiger";
		
		try {
			Class.forName(jdbc_driver);
			this.conn = DriverManager.getConnection(jdbc_url, user, pwd);
			this.conn.setAutoCommit(false);
			}
		catch (ClassNotFoundException e) {
			e.printStackTrace();
		}
		catch (SQLException e) {
			e.printStackTrace();
		}
	}
	
	//강사님 코드 아님 
	public int dynamicDelete(int empno) {
		int rowCount = 0;
		this.sql = "delete from emp where mgr = ?";
		this.sql2 = "delete from emp where empno = ?";

		try {
			this.pstmt = conn.prepareStatement(this.sql);
			pstmt.setInt(1, empno);
			rowCount = pstmt.executeUpdate();
			
			this.pstmt = conn.prepareStatement(this.sql2);
			pstmt.setInt(1, empno);
			rowCount += pstmt.executeUpdate();
			
			if(rowCount == 2) {
				this.conn.commit();
			}
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
	
	public int getWorkerCount(int mgr) {
		int workerCount =0;
		this.sql = "select count(*) count from emp where mgr = ?";
		
		try {
			this.pstmt = this.conn.prepareStatement(sql);
			this.pstmt.setInt(1, mgr);
			this.rs = this.pstmt.executeQuery();
		}
		catch (SQLException e) {
			e.printStackTrace();
		}
		
		return workerCount;
	}
		
	public int deleteEmp(boolean deleteWorker,int empno) {
		int rowCount = 0;
		this.sql = "delete from emp where empno = ?";
		
		if(deleteWorker) {
			this.sql = "delet from emp where mgr = ?";
		}
		try {
			this.pstmt = this.conn.prepareStatement(sql);
			this.pstmt.setInt(1, empno);
			rowCount = this.pstmt.executeUpdate();
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
	
	public boolean deleteManager(int empno) {
		boolean result = false;
		
		try {
			if(this.getWorkerCount(empno) > 0) {
				this.deleteEmp(true, empno);
			}
			if(this.deleteEmp(false,empno) == 1) {
				result = true;
			}
			
			this.conn.commit();
		}
		catch(SQLException e) {
			try {
				this.conn.rollback();
			}
			catch(SQLException se){
				se.printStackTrace();
			}
			
		}
		return result;	
		
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
		TransactionTest tt = new TransactionTest();
		int mgr = 7698;
		
		if(tt.deleteManager(mgr)) {
			System.out.println("관리자 " + mgr +" 사원 및 그 부하 직원 모두를 삭제하였습니다.");
		}
		
		//int rowCount = 0;
		//rowCount = tt.dynamicDelete(7902);
		
		tt.closeConnection();
		

	}

}
