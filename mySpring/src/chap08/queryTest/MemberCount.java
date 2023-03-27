package chap08.queryTest;

import java.sql.*;

import org.apache.tomcat.jdbc.pool.DataSource;

public class MemberCount {
	
	private DataSource ds;
	
	public MemberCount() {
		ds = new DataSource();
		ds.setDriverClassName("oracle.jdbc.driver.OracleDriver");
		ds.setUrl("jdbc:oracle:thin:@localhost:1521:XE");
		ds.setUsername("scott");
		ds.setPassword("tiger");
		ds.setInitialSize(2);
		ds.setMinIdle(2);
		ds.setMaxActive(5);
	}
	
	private int getMemberCount() {
		int rowCount = 0;
		Connection conn = null;
		Statement stmt = null;
		ResultSet rs = null;
		String sql = "select count(*) count from member";
		
		try {
			conn = ds.getConnection();
			stmt = conn.createStatement();
			rs = stmt.executeQuery(sql);
			
			if(rs.next()) {
				rowCount = rs.getInt("count");
			}
			
		}catch(Exception e){
			e.printStackTrace();
		}
		
		return rowCount;
	}
	
	public static void main(String[] args) {
		MemberCount mc = new MemberCount();
		System.out.println("전체 회원 수 :" + mc.getMemberCount());

	}

}
